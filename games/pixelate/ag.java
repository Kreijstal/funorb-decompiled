/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends mg {
    static boolean field_p;
    static String field_n;
    static java.math.BigInteger field_m;
    static String field_o;

    final dj a(String param0, boolean param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (!td.a(-106, var4)) {
          return sk.field_a;
        } else {
          if (param1) {
            var5 = (CharSequence) (Object) param0;
            var3 = na.a(var5, (byte) -33);
            if (-1 > (var3 ^ -1)) {
              if ((var3 ^ -1) < -131) {
                return sk.field_a;
              } else {
                return qk.field_g;
              }
            } else {
              return sk.field_a;
            }
          } else {
            return null;
          }
        }
    }

    ag(c param0) {
        super(param0);
    }

    final String a(int param0, String param1) {
        if (param0 >= -76) {
            return null;
        }
        if (!(((ag) this).a(param1, true) != sk.field_a)) {
            return mc.field_t;
        }
        return null;
    }

    public static void e(int param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        if (param0 == -1) {
            return;
        }
        ag.a((byte) -3, -69);
    }

    final static void a(byte param0, int param1) {
        lc var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = (lc) (Object) rg.field_c.c(1504642273);
        if (param0 >= -112) {
          field_p = true;
          L0: while (true) {
            if (var2 != null) {
              em.a((byte) -7, var2, param1);
              var2 = (lc) (Object) rg.field_c.f(1504642273);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 != null) {
              em.a((byte) -7, var2, param1);
              var2 = (lc) (Object) rg.field_c.f(1504642273);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This password contains repeated characters, and would be easy to guess";
        field_m = new java.math.BigInteger("65537");
        field_o = "Searching for opponents";
    }
}
