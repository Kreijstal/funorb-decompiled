/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vja extends ib {
    private fsa field_c;
    static String field_b;

    final void a(byte param0) {
        if (param0 < 67) {
            return;
        }
        this.field_c.h(true);
    }

    final static void a(int param0, long param1) {
        if ((param1 ^ -1L) >= -1L) {
          return;
        } else {
          if ((param1 % 10L ^ -1L) == -1L) {
            fsa.a(9, param1 + -1L);
            fsa.a(9, 1L);
            if (param0 == 0) {
              return;
            } else {
              field_b = (String) null;
              return;
            }
          } else {
            fsa.a(param0 + 9, param1);
            if (!TombRacer.field_G) {
              if (param0 != 0) {
                field_b = (String) null;
                return;
              } else {
                return;
              }
            } else {
              fsa.a(9, param1 + -1L);
              fsa.a(9, 1L);
              if (param0 == 0) {
                return;
              } else {
                field_b = (String) null;
                return;
              }
            }
          }
        }
    }

    vja(la param0, kh param1) {
        super(param0, param1);
        try {
            this.field_c = new fsa(this.field_a, param1, false);
            this.field_c.c((byte) 50, false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 30000) {
            field_b = (String) null;
        }
    }

    final void a(byte param0, ui param1, boolean param2, ui param3) {
        try {
            int var5_int = -11 % ((param0 - 31) / 61);
            this.field_c.a(true, param2, param3, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vja.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static kia b(int param0) {
        if (param0 != 30000) {
            return (kia) null;
        }
        return la.field_k;
    }

    final int a(boolean param0) {
        if (!param0) {
            this.field_c = (fsa) null;
            return 0;
        }
        return 0;
    }

    final lj a(boolean param0, int param1, int param2) {
        if (param1 > -3) {
            return (lj) null;
        }
        return this.field_c.a(param0, param2, (byte) -26);
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, param1);
            this.field_c.a(param0, 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vja.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        kh var5 = null;
        fsa var6 = null;
        if (!this.field_c.J(96)) {
          if (this.field_c.h(18407)) {
            return;
          } else {
            var5 = new kh(30000);
            var5.i(8);
            this.field_c.a(var5, 97);
            if (param3 != 4) {
              discarded$1 = this.a(false);
              var5.k(-1826190686);
              var6 = this.field_c.a(param3 + -14406, this.field_a, true);
              var6.m(1, param1);
              var6.c(param2, -19879);
              var6.c(false, param0);
              this.field_a.a(var6, (byte) 32);
              return;
            } else {
              var5.k(-1826190686);
              var6 = this.field_c.a(param3 + -14406, this.field_a, true);
              var6.m(1, param1);
              var6.c(param2, -19879);
              var6.c(false, param0);
              this.field_a.a(var6, (byte) 32);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void b(boolean param0) {
        wg.field_l.field_a = 0;
        wg.field_l.field_n = 0;
        if (!param0) {
            vja.a(-52, -43L);
        }
    }

    static {
        field_b = "Loading fonts";
    }
}
