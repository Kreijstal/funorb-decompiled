/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt extends rqa {
    static asb field_o;

    dt(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        if (!(es.field_b == null)) {
            es.field_b.a(0, qd.field_a);
            vob.field_o = sab.a(vob.field_o, -31567, qd.field_a);
        }
        if (param0 >= -64) {
            Object var2 = null;
            Object[] discarded$0 = dt.a((dja) null, -6, 116, (Object[]) null);
        }
    }

    public static void e(int param0) {
        if (param0 <= 39) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            dt.a(-54);
        }
        return new nc((Object) (Object) frb.a(29, 74));
    }

    final static Object[] a(dja param0, int param1, int param2, Object[] param3) {
        tv[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param2 == 15667) {
          if (param3 != null) {
            L0: {
              if (param1 < 0) {
                break L0;
              } else {
                if (param1 < param3.length) {
                  var4 = param0.a(param2 + -3672, -1 + param3.length);
                  var4 = var4;
                  var5 = 0;
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= param3.length) {
                      return (Object[]) (Object) var4;
                    } else {
                      if (var6 != param1) {
                        var4[var5] = (tv) param3[var6];
                        var5++;
                        var6++;
                        continue L1;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            return param3;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
