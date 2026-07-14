/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak extends ela {
    static int[] field_p;
    static Object field_o;

    final bfa a(bfa[] param0, int param1) {
        if (param1 != 0) {
          field_o = null;
          return new bfa((Object) (Object) qla.a(true, (String) param0[0].field_d));
        } else {
          return new bfa((Object) (Object) qla.a(true, (String) param0[0].field_d));
        }
    }

    final static nh[] a(ha param0, jpa[] param1, int param2) {
        nh[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        nh[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != null) {
          var6 = new nh[param1.length];
          var3 = var6;
          if (param2 > -54) {
            field_p = null;
            var4 = 0;
            L0: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var6[var4] = su.a(param1[var4], param0, (byte) 2);
                var4++;
                continue L0;
              }
            }
          } else {
            var4 = 0;
            L1: while (true) {
              if (var6.length <= var4) {
                return var3;
              } else {
                var6[var4] = su.a(param1[var4], param0, (byte) 2);
                var4++;
                continue L1;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 > -19) {
            return;
        }
        field_p = null;
    }

    ak(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        nfa.field_p = false;
        if (param0 == 0) {
          sea.field_o = null;
          if (!jf.field_r) {
            var1 = lsa.field_a;
            if (0 < var1) {
              if ((var1 ^ -1) != -2) {
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[1]);
                sea.field_o = uj.a((byte) 121, new CharSequence[3]);
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              } else {
                sea.field_o = aga.field_a;
                sea.field_o = uj.a((byte) 121, new CharSequence[3]);
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              ci.field_l.i((byte) 101);
              wt.a((byte) -117);
              return;
            }
          } else {
            ci.field_l.f(true);
            return;
          }
        } else {
          field_o = null;
          sea.field_o = null;
          if (!jf.field_r) {
            var1 = lsa.field_a;
            if (0 < var1) {
              if ((var1 ^ -1) != -2) {
                sea.field_o = gl.a((byte) 100, nw.field_s, new String[1]);
                sea.field_o = uj.a((byte) 121, new CharSequence[3]);
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              } else {
                sea.field_o = aga.field_a;
                sea.field_o = uj.a((byte) 121, new CharSequence[3]);
                ci.field_l.i((byte) 101);
                wt.a((byte) -117);
                return;
              }
            } else {
              ci.field_l.i((byte) 101);
              wt.a((byte) -117);
              return;
            }
          } else {
            ci.field_l.f(true);
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        var2 = 113 / ((-14 - param1) / 40);
        if (qg.field_a.length > param0) {
          if (param0 < 0) {
            return -1;
          } else {
            return qg.field_a[param0].field_a;
          }
        } else {
          return -1;
        }
    }

    static {
    }
}
