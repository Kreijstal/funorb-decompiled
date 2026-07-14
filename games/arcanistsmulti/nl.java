/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends kc {
    static am field_Ib;
    static String field_Bb;
    private kc field_Cb;
    static String field_Hb;
    kc field_Eb;
    static kc field_Db;
    static kc field_Fb;
    static java.math.BigInteger field_Jb;
    static hb field_Gb;

    final static void b(int param0, int param1, int param2) {
        if (param1 != 19129) {
            return;
        }
        gi.field_c = param0;
        mf.field_c = param2;
        if (!(p.field_b == null)) {
            p.field_b.a(-118, param0, param2);
        }
    }

    final static hc f(byte param0) {
        if (param0 != 13) {
          field_Hb = null;
          return new hc(k.a(param0 ^ 13), ga.b(3236));
        } else {
          return new hc(k.a(param0 ^ 13), ga.b(3236));
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((nl) this).a(param3, param4, param5, param2, (byte) -120);
        this.a(param0, param6, false);
        if (param1 != 0) {
            this.a(38, -70, true);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = -36 % ((param2 - 17) / 45);
        int var4 = -param0;
        int var6 = -param0;
        if (null != ((nl) this).field_Cb) {
            var4 = ((nl) this).field_Cb.c(-25921);
        }
        if (!(((nl) this).field_Eb == null)) {
            var6 = ((nl) this).field_Eb.c(-25921);
        }
        return param1 + (var6 + var4 + param1) + param0;
    }

    final static qb[] a(byte param0, eg param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 != 31) {
          field_Hb = null;
          var4 = param1.c(param3, param0 ^ 65);
          var5 = param1.a(param2, (byte) 29, var4);
          return om.a(var5, var4, (byte) -123, param1);
        } else {
          var4 = param1.c(param3, param0 ^ 65);
          var5 = param1.a(param2, (byte) 29, var4);
          return om.a(var5, var4, (byte) -123, param1);
        }
    }

    public static void e(int param0) {
        field_Ib = null;
        field_Bb = null;
        field_Fb = null;
        field_Db = null;
        field_Hb = null;
        field_Gb = null;
        field_Jb = null;
        if (param0 != -10765) {
            field_Jb = null;
        }
    }

    nl(long param0, kc param1, kc param2, kc param3, qb param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((nl) this).field_Cb = new kc(0L, param2);
            ((nl) this).field_Cb.field_W = param4;
            ((nl) this).a(((nl) this).field_Cb, 116);
        }
        if (param5 != null) {
            ((nl) this).field_Eb = new kc(0L, param3, param5);
            ((nl) this).a(((nl) this).field_Eb, 99);
        }
        ((nl) this).e((byte) 20);
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = -param1;
        if (!param2) {
          L0: {
            var5 = -param1;
            if (((nl) this).field_Cb != null) {
              var4 = ((nl) this).field_Cb.c(-25921);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((nl) this).field_Eb == null) {
              break L1;
            } else {
              var5 = ((nl) this).field_Eb.a(-var4 + (-param0 + (((nl) this).field_x + (-param1 - param0))), -123);
              break L1;
            }
          }
          L2: {
            var6 = var5 + (param1 + var4) + param0 - -param0;
            if (var6 <= ((nl) this).field_x) {
              break L2;
            } else {
              var5 = var5 + (((nl) this).field_x - var6);
              var6 = ((nl) this).field_x;
              break L2;
            }
          }
          L3: {
            if (((nl) this).field_X != 1) {
              break L3;
            } else {
              param0 = param0 + (-var6 + ((nl) this).field_x) / 2;
              break L3;
            }
          }
          L4: {
            if (2 != ((nl) this).field_X) {
              break L4;
            } else {
              param0 = param0 + (((nl) this).field_x + -var6);
              break L4;
            }
          }
          L5: {
            if (null != ((nl) this).field_Cb) {
              ((nl) this).field_Cb.a(var4, param0, 0, ((nl) this).field_I, (byte) -120);
              ((nl) this).field_Cb.field_gb = ((nl) this).field_gb;
              break L5;
            } else {
              break L5;
            }
          }
          if (((nl) this).field_Eb != null) {
            ((nl) this).field_Eb.a(var5, param1 + (var4 + param0), 0, ((nl) this).field_I, (byte) -120);
            if (null == ((nl) this).field_Cb) {
              ((nl) this).field_Eb.field_X = ((nl) this).field_X;
              ((nl) this).field_Eb.field_gb = ((nl) this).field_gb;
              return;
            } else {
              ((nl) this).field_Eb.field_X = 0;
              ((nl) this).field_Eb.field_gb = ((nl) this).field_gb;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "Offer unrated rematch";
        field_Hb = "Visit the Account Management section on the main site to view.";
        field_Ib = new am();
        field_Jb = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
