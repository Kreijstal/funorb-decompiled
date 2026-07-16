/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static int field_j;
    private int field_f;
    static ak field_h;
    private pg field_g;
    static int[] field_b;
    static String field_d;
    static String field_i;
    private kl field_e;
    static int field_c;
    private int field_a;

    private final void a(Object param0, boolean param1, long param2, int param3) {
        tj var6 = null;
        ah var6_ref = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        if (((le) this).field_a < param3) {
          throw new IllegalStateException();
        } else {
          this.a(param2, (byte) 11);
          if (!param1) {
            return;
          } else {
            ((le) this).field_f = ((le) this).field_f - param3;
            L0: while (true) {
              if (((le) this).field_f >= 0) {
                var6 = new tj(param0, param3);
                ((le) this).field_e.a((fa) (Object) var6, param2, -1);
                ((le) this).field_g.a((byte) 99, (lm) (Object) var6);
                ((ah) (Object) var6).field_q = 0L;
                return;
              } else {
                var6_ref = (ah) (Object) ((le) this).field_g.a(113);
                this.a(var6_ref, -26133);
                continue L0;
              }
            }
          }
        }
    }

    final void a(long param0, Object param1, byte param2) {
        this.a(param1, true, param0, 1);
        if (param2 <= 75) {
            le.a(false);
        }
    }

    final static void a(boolean param0) {
        jd.field_r = 0;
        if (!param0) {
            le.a(-100);
        }
    }

    private final void a(long param0, byte param1) {
        ah var4 = null;
        var4 = (ah) (Object) ((le) this).field_e.a(1, param0);
        if (param1 != 11) {
          field_j = -95;
          this.a(var4, -26133);
          return;
        } else {
          this.a(var4, -26133);
          return;
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        tj var6 = null;
        ah var7 = null;
        var7 = (ah) (Object) ((le) this).field_e.a(param1 ^ 1, param0);
        if (var7 != null) {
          var5 = var7.a((byte) -55);
          if (param1 == 0) {
            if (var5 == null) {
              var7.c(2779);
              var7.e(17);
              ((le) this).field_f = ((le) this).field_f + var7.field_t;
              return null;
            } else {
              L0: {
                if (var7.b(true)) {
                  var6 = new tj(var5, var7.field_t);
                  ((le) this).field_e.a((fa) (Object) var6, var7.field_e, -1);
                  ((le) this).field_g.a((byte) 83, (lm) (Object) var6);
                  ((ah) (Object) var6).field_q = 0L;
                  var7.c(2779);
                  var7.e(param1 ^ 17);
                  break L0;
                } else {
                  ((le) this).field_g.a((byte) 91, (lm) (Object) var7);
                  var7.field_q = 0L;
                  break L0;
                }
              }
              return var5;
            }
          } else {
            le.a(107);
            if (var5 == null) {
              var7.c(2779);
              var7.e(17);
              ((le) this).field_f = ((le) this).field_f + var7.field_t;
              return null;
            } else {
              L1: {
                if (var7.b(true)) {
                  var6 = new tj(var5, var7.field_t);
                  ((le) this).field_e.a((fa) (Object) var6, var7.field_e, -1);
                  ((le) this).field_g.a((byte) 83, (lm) (Object) var6);
                  ((ah) (Object) var6).field_q = 0L;
                  var7.c(2779);
                  var7.e(param1 ^ 17);
                  break L1;
                } else {
                  ((le) this).field_g.a((byte) 91, (lm) (Object) var7);
                  var7.field_q = 0L;
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

    private final void a(ah param0, int param1) {
        if (param1 != -26133) {
          L0: {
            field_c = -20;
            if (param0 != null) {
              param0.c(2779);
              param0.e(17);
              ((le) this).field_f = ((le) this).field_f + param0.field_t;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != null) {
              param0.c(2779);
              param0.e(17);
              ((le) this).field_f = ((le) this).field_f + param0.field_t;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var6 = Pixelate.field_H ? 1 : 0;
        int var2 = param0.length();
        int var3 = 0;
        int var4 = 0;
        int var5 = -16 / ((-26 - param1) / 59);
        while (var2 > var4) {
            var3 = (var3 << 2129823557) + -var3 - -pf.a((byte) -118, param0.charAt(var4));
            var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != 1) {
          field_d = null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_d = null;
          return;
        }
    }

    le(int param0) {
        this(param0, param0);
    }

    private le(int param0, int param1) {
        int var3 = 0;
        ((le) this).field_g = new pg();
        ((le) this).field_f = param0;
        ((le) this).field_a = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((le) this).field_e = new kl(var3);
              return;
            }
          } else {
            ((le) this).field_e = new kl(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_d = "Unable to add name - system busy";
        field_i = "Try changing the following settings:  ";
        field_c = 0;
    }
}
