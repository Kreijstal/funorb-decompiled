/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static pk field_e;
    static pk field_a;
    static int field_b;
    private tc field_d;
    static String field_g;
    static int field_i;
    static dj[] field_l;
    private ce field_c;
    static String field_k;
    static String field_f;
    private int field_h;
    private int field_j;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_e = null;
        if (param0 != 1) {
          qk.a(60);
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_g = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        be var6 = null;
        wc var7 = null;
        var7 = (wc) (Object) ((qk) this).field_c.a(param0, (byte) -21);
        if (var7 != null) {
          var5 = var7.d((byte) -125);
          if (var5 == null) {
            var7.b((byte) 12);
            var7.c((byte) 13);
            ((qk) this).field_h = ((qk) this).field_h + var7.field_q;
            return null;
          } else {
            if (param1 != -24469) {
              L0: {
                ((qk) this).field_h = -10;
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  ((qk) this).field_c.a((uf) (Object) var6, (byte) -118, var7.field_g);
                  ((qk) this).field_d.a((vh) (Object) var6, (byte) 17);
                  ((wc) (Object) var6).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L0;
                } else {
                  ((qk) this).field_d.a((vh) (Object) var7, (byte) -3);
                  var7.field_m = 0L;
                  break L0;
                }
              }
              return var5;
            } else {
              L1: {
                if (var7.d(123)) {
                  var6 = new be(var5, var7.field_q);
                  ((qk) this).field_c.a((uf) (Object) var6, (byte) -118, var7.field_g);
                  ((qk) this).field_d.a((vh) (Object) var6, (byte) 17);
                  ((wc) (Object) var6).field_m = 0L;
                  var7.b((byte) 12);
                  var7.c((byte) 13);
                  break L1;
                } else {
                  ((qk) this).field_d.a((vh) (Object) var7, (byte) -3);
                  var7.field_m = 0L;
                  break L1;
                }
              }
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, Object param1, long param2) {
        this.a(param1, param2, 1, (byte) -107);
        if (param0 != -3) {
            Object discarded$0 = ((qk) this).a(19L, 96);
        }
    }

    private final void a(byte param0, long param1) {
        wc var4 = (wc) (Object) ((qk) this).field_c.a(param1, (byte) -21);
        this.a(var4, 1);
        if (param0 >= -54) {
            qk.a(-85);
            return;
        }
    }

    private final void a(wc param0, int param1) {
        if (param1 != 1) {
          L0: {
            field_g = null;
            if (param0 != null) {
              param0.b((byte) 12);
              param0.c((byte) 13);
              ((qk) this).field_h = ((qk) this).field_h + param0.field_q;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != null) {
              param0.b((byte) 12);
              param0.c((byte) 13);
              ((qk) this).field_h = ((qk) this).field_h + param0.field_q;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static el a(Throwable param0, String param1) {
        el var2_ref = null;
        el var2 = null;
        if (param0 instanceof el) {
            var2 = (el) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        } else {
            var2_ref = new el(param0, param1);
        }
        return var2_ref;
    }

    private final void a(Object param0, long param1, int param2, byte param3) {
        be var6 = null;
        int var7 = 0;
        wc var8 = null;
        wc var9 = null;
        var7 = Terraphoenix.field_V;
        if (param3 < -97) {
          if (((qk) this).field_j < param2) {
            throw new IllegalStateException();
          } else {
            this.a((byte) -102, param1);
            ((qk) this).field_h = ((qk) this).field_h - param2;
            L0: while (true) {
              if (-1 >= (((qk) this).field_h ^ -1)) {
                var6 = new be(param0, param2);
                ((qk) this).field_c.a((uf) (Object) var6, (byte) -50, param1);
                ((qk) this).field_d.a((vh) (Object) var6, (byte) 78);
                ((wc) (Object) var6).field_m = 0L;
                return;
              } else {
                var8 = (wc) (Object) ((qk) this).field_d.c(0);
                this.a(var8, 1);
                continue L0;
              }
            }
          }
        } else {
          ((qk) this).field_c = null;
          if (((qk) this).field_j < param2) {
            throw new IllegalStateException();
          } else {
            this.a((byte) -102, param1);
            ((qk) this).field_h = ((qk) this).field_h - param2;
            L1: while (true) {
              if (-1 >= (((qk) this).field_h ^ -1)) {
                var6 = new be(param0, param2);
                ((qk) this).field_c.a((uf) (Object) var6, (byte) -50, param1);
                ((qk) this).field_d.a((vh) (Object) var6, (byte) 78);
                ((wc) (Object) var6).field_m = 0L;
                return;
              } else {
                var9 = (wc) (Object) ((qk) this).field_d.c(0);
                this.a(var9, 1);
                continue L1;
              }
            }
          }
        }
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_g = "Turret";
        field_f = "Connection timed out. Please try using a different server.";
        field_k = "Aim TQ: ";
    }
}
