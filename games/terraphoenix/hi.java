/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ei implements n {
    private eb field_X;
    static int field_ab;
    static String field_Y;
    static String field_Z;
    static bg[] field_W;

    private final void k(int param0) {
        int var2 = 93 % ((68 - param0) / 58);
        if (!(((hi) this).field_J)) {
            return;
        }
        ((hi) this).field_J = false;
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        if (0L < param0) {
          if (-6582952005840035282L < (param0 ^ -1L)) {
            if ((param0 % 37L ^ -1L) != -1L) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param0 ^ -1L) == -1L) {
                      StringBuilder discarded$2 = var6.reverse();
                      if (param1 != -12382) {
                        return null;
                      } else {
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = ed.field_a[(int)(var7 + -(37L * param0))];
                        if (var9 != 95) {
                          break L2;
                        } else {
                          var10 = var6.length() - 1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (((hi) this).field_X == param0) {
          this.k(126);
          var6 = 102 % ((-5 - param4) / 57);
          return;
        } else {
          var6 = 102 % ((-5 - param4) / 57);
          return;
        }
    }

    private final eb a(boolean param0, String param1, sc param2) {
        eb var4 = null;
        int var5 = 0;
        var4 = new eb(param1, param2);
        if (param0) {
          field_W = null;
          var4.field_l = (cj) (Object) new ic();
          var5 = -6 + ((hi) this).field_n;
          ((hi) this).field_n = ((hi) this).field_n + 38;
          var4.a(var5, (byte) 80, -16 + (-14 + ((hi) this).field_p), 15, 30);
          ((hi) this).b((byte) 95, (gl) (Object) var4);
          ((hi) this).c(0);
          return var4;
        } else {
          var4.field_l = (cj) (Object) new ic();
          var5 = -6 + ((hi) this).field_n;
          ((hi) this).field_n = ((hi) this).field_n + 38;
          var4.a(var5, (byte) 80, -16 + (-14 + ((hi) this).field_p), 15, 30);
          ((hi) this).b((byte) 95, (gl) (Object) var4);
          ((hi) this).c(0);
          return var4;
        }
    }

    hi(d param0, qf param1) {
        super(param0, 200, 150);
        String var5 = null;
        gl var6 = null;
        String var7 = null;
        gl var8 = null;
        Object var9 = null;
        gl var10 = null;
        String var11 = null;
        gl var12 = null;
        String var13 = null;
        gl var14 = null;
        var9 = null;
        if (u.field_d == param1) {
          var13 = ra.field_h;
          var14 = new gl(var13, (sc) null);
          var14.field_n = 80;
          var14.field_u = 50;
          var14.field_p = ((hi) this).field_p;
          var14.field_w = 0;
          var14.field_l = (cj) (Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((hi) this).b((byte) 95, var14);
          ((hi) this).field_X = this.a(false, te.field_e, (sc) this);
        } else {
          if (ql.field_e != param1) {
            if (param1 == gi.field_r) {
              ((hi) this).field_n = ((hi) this).field_n + 30;
              var11 = va.field_a;
              var12 = new gl(var11, (sc) null);
              var12.field_n = 80;
              var12.field_u = 50;
              var12.field_p = ((hi) this).field_p;
              var12.field_w = 0;
              var12.field_l = (cj) (Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((hi) this).b((byte) 95, var12);
              ((hi) this).field_X = this.a(false, te.field_e, (sc) this);
            } else {
              var10 = new gl((String) var9, (sc) null);
              var10.field_n = 80;
              var10.field_u = 50;
              var10.field_p = ((hi) this).field_p;
              var10.field_w = 0;
              var10.field_l = (cj) (Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((hi) this).b((byte) 95, var10);
              ((hi) this).field_X = this.a(false, te.field_e, (sc) this);
            }
          } else {
            var5 = tb.field_i;
            ((hi) this).field_n = ((hi) this).field_n + 10;
            if (ea.a(-20512)) {
              var7 = nf.field_a;
              ((hi) this).field_n = ((hi) this).field_n + 20;
              var8 = new gl(var7, (sc) null);
              var8.field_n = 80;
              var8.field_u = 50;
              var8.field_p = ((hi) this).field_p;
              var8.field_w = 0;
              var8.field_l = (cj) (Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((hi) this).b((byte) 95, var8);
              ((hi) this).field_X = this.a(false, te.field_e, (sc) this);
            } else {
              var6 = new gl(var5, (sc) null);
              var6.field_n = 80;
              var6.field_u = 50;
              var6.field_p = ((hi) this).field_p;
              var6.field_w = 0;
              var6.field_l = (cj) (Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((hi) this).b((byte) 95, var6);
              ((hi) this).field_X = this.a(false, te.field_e, (sc) this);
            }
          }
        }
    }

    public static void l(int param0) {
        field_Z = null;
        if (param0 != 0) {
            String discarded$0 = hi.a(-21L, -41);
            field_Y = null;
            field_W = null;
            return;
        }
        field_Y = null;
        field_W = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = " cost: 14tus";
        field_Z = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
