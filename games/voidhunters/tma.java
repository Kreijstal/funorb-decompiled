/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tma extends rqa {
    static ij field_r;
    static slb field_q;
    static String field_o;
    static uja field_p;

    public static void f(byte param0) {
        field_q = null;
        field_r = null;
        field_p = null;
        field_o = null;
        if (param0 != 66) {
            Object var2 = null;
            tpa discarded$0 = tma.a(0, (String) null, (byte) -109);
        }
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dnb var5_ref_dnb = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        kob var9 = null;
        faa var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        var7 = VoidHunters.field_G;
        var10 = qga.field_b;
        var2 = var10.e((byte) -113);
        var3 = 44 % ((-49 - param0) / 63);
        if (var2 == 0) {
          var9 = (kob) (Object) cnb.field_q.d(0);
          if (var9 != null) {
            L0: {
              var5 = var10.e((byte) -93);
              if (var5 != 0) {
                var14 = new byte[var5];
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var8 = var11;
                var6 = var8;
                var10.a(0, var14, (byte) -59, var5);
                break L0;
              } else {
                var6 = null;
                break L0;
              }
            }
            var10.field_e = var10.field_e + 4;
            if (!var10.c(-2780)) {
              ifb.l(-126);
              return;
            } else {
              var9.field_f = var6;
              var9.field_d = true;
              var9.b(-3846);
              return;
            }
          } else {
            ifb.l(-126);
            return;
          }
        } else {
          if ((var2 ^ -1) == -2) {
            var4 = var10.h(100);
            var5_ref_dnb = (dnb) (Object) ahb.field_o.d(0);
            L1: while (true) {
              if (var5_ref_dnb != null) {
                if (var5_ref_dnb.field_d != var4) {
                  var5_ref_dnb = (dnb) (Object) ahb.field_o.a((byte) 78);
                  continue L1;
                } else {
                  if (var5_ref_dnb == null) {
                    ifb.l(-121);
                    return;
                  } else {
                    var5_ref_dnb.b(-3846);
                    return;
                  }
                }
              } else {
                if (var5_ref_dnb == null) {
                  ifb.l(-121);
                  return;
                } else {
                  var5_ref_dnb.b(-3846);
                  return;
                }
              }
            }
          } else {
            gna.a((Throwable) null, "A1: " + hm.e(-13514), 0);
            ifb.l(-126);
            return;
          }
        }
    }

    tma(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static tpa a(int param0, String param1, byte param2) {
        tpa var3 = null;
        var3 = new tpa(false);
        if (param2 != -124) {
          return null;
        } else {
          var3.field_f = param1;
          var3.field_d = param0;
          return var3;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_q = null;
          return new nc((Object) (Object) frb.a(62, 97));
        } else {
          return new nc((Object) (Object) frb.a(62, 97));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ij();
        field_o = "Players: <%0>/<%1>";
        field_q = new slb();
        field_p = new uja();
    }
}
