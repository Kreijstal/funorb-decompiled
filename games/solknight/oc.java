/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        ba var3 = null;
        byte[] var4 = null;
        ba var5 = null;
        var3 = (ba) ((oc) this).field_d.a(0, (long)param1);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 >= 32768) {
              var4 = ((oc) this).field_b.b(1, 12257, param1 & 32767);
              break L0;
            } else {
              var4 = ((oc) this).field_c.b(1, param0 + 12366, param1);
              break L0;
            }
          }
          var5 = new ba();
          if (param0 == -109) {
            if (var4 == null) {
              if (32768 <= param1) {
                var5.g(39);
                ((oc) this).field_d.a(87, (Object) (Object) var5, (long)param1);
                return var5;
              } else {
                ((oc) this).field_d.a(87, (Object) (Object) var5, (long)param1);
                return var5;
              }
            } else {
              var5.a(new gb(var4), false);
              if (32768 > param1) {
                ((oc) this).field_d.a(87, (Object) (Object) var5, (long)param1);
                return var5;
              } else {
                var5.g(39);
                ((oc) this).field_d.a(87, (Object) (Object) var5, (long)param1);
                return var5;
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        var6 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
        if (te.field_O <= 0) {
          return var6;
        } else {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (te.field_O <= var2) {
              return var1;
            } else {
              L1: {
                var7 = var1 + 32;
                var3 = te.field_N.field_l[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (10 <= var4) {
                  var4 += 55;
                  break L1;
                } else {
                  var4 += 48;
                  break L1;
                }
              }
              L2: {
                var8 = var7 + (char)var4;
                if (var3 >= 10) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            }
          }
        }
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
