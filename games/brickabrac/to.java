/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to {
    private int field_m;
    static java.math.BigInteger field_g;
    static int field_a;
    private int field_d;
    static String field_l;
    private ji field_c;
    static jp field_e;
    private gp field_j;
    static int[] field_f;
    static kl field_k;
    static String field_h;
    static int field_b;
    static int field_i;

    final Object a(long param0, boolean param1) {
        sl var4 = null;
        Object var5 = null;
        ej var6 = null;
        var4 = (sl) (Object) ((to) this).field_c.a(param0, 101);
        if (var4 != null) {
          var5 = var4.g(1);
          if (var5 == null) {
            var4.b((byte) 111);
            var4.d(3);
            ((to) this).field_d = ((to) this).field_d + var4.field_u;
            return null;
          } else {
            if (var4.b(param1)) {
              var6 = new ej(var5, var4.field_u);
              ((to) this).field_c.a((byte) 44, var4.field_g, (nm) (Object) var6);
              ((to) this).field_j.a((tk) (Object) var6, (byte) -119);
              ((sl) (Object) var6).field_j = 0L;
              var4.b((byte) 111);
              var4.d(3);
              return var5;
            } else {
              ((to) this).field_j.a((tk) (Object) var4, (byte) -126);
              var4.field_j = 0L;
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    to(int param0) {
        this(param0, param0);
    }

    private final void a(long param0, int param1) {
        int var4 = -89 % ((-26 - param1) / 48);
        sl var5 = (sl) (Object) ((to) this).field_c.a(param0, 121);
        this.a(false, var5);
    }

    private final void a(int param0, long param1, int param2, Object param3) {
        sl var6 = null;
        ej var6_ref = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (param2 > ((to) this).field_m) {
          throw new IllegalStateException();
        } else {
          this.a(param1, 38);
          ((to) this).field_d = ((to) this).field_d - param2;
          L0: while (true) {
            if ((((to) this).field_d ^ -1) <= -1) {
              var6_ref = new ej(param3, param2);
              ((to) this).field_c.a((byte) 79, param1, (nm) (Object) var6_ref);
              ((to) this).field_j.a((tk) (Object) var6_ref, (byte) -123);
              if (param0 != -1) {
                return;
              } else {
                ((sl) (Object) var6_ref).field_j = 0L;
                return;
              }
            } else {
              var6 = (sl) (Object) ((to) this).field_j.a(false);
              this.a(false, var6);
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_k = null;
        int var1 = 77 / ((-29 - param0) / 44);
        field_l = null;
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final void a(int param0, Object param1, long param2) {
        this.a(-1, param2, 1, param1);
        if (param0 < 60) {
            this.a(35L, -69);
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 > -127) {
            field_f = null;
            ma.field_I.a(param0, 20892);
            return;
        }
        ma.field_I.a(param0, 20892);
    }

    private final void a(boolean param0, sl param1) {
        if (!param0) {
          if (param1 != null) {
            param1.b((byte) 111);
            param1.d(3);
            ((to) this).field_d = ((to) this).field_d + param1.field_u;
            return;
          } else {
            return;
          }
        } else {
          field_i = -88;
          if (param1 == null) {
            return;
          } else {
            param1.b((byte) 111);
            param1.d(3);
            ((to) this).field_d = ((to) this).field_d + param1.field_u;
            return;
          }
        }
    }

    private to(int param0, int param1) {
        int var3 = 0;
        ((to) this).field_j = new gp();
        ((to) this).field_m = param0;
        ((to) this).field_d = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((to) this).field_c = new ji(var3);
            }
          } else {
            ((to) this).field_c = new ji(var3);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 2;
        field_g = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_h = "<%0> is not on your ignore list.";
        field_l = "Email is valid";
        field_f = new int[29];
        field_f[3] = 5;
        field_f[15] = 2;
        field_f[22] = -1;
        field_f[27] = -1;
        field_f[14] = 5;
        field_f[26] = -1;
        field_f[20] = -1;
        field_f[0] = -1;
        field_f[28] = -1;
        field_f[13] = 2;
        field_f[1] = -1;
        field_f[21] = -1;
        field_f[8] = 2;
        field_f[7] = 2;
        field_f[6] = 5;
        field_f[23] = -1;
        field_f[4] = 5;
        field_f[18] = 10;
        field_f[2] = -1;
        field_f[9] = 2;
        field_f[24] = -1;
        field_f[25] = -1;
        field_f[16] = 5;
        field_f[12] = 10;
        field_f[17] = 2;
        field_f[10] = 5;
        field_f[19] = -1;
        field_f[11] = 2;
        field_f[5] = 10;
        field_i = 0;
    }
}
