/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bra extends ofa implements tsa {
    static String[] field_M;
    private rj field_N;
    private rj field_L;
    static iu field_O;

    private final void f(int param0) {
        if (param0 != -25050) {
            ((bra) this).field_N = null;
            if (!(((bra) this).field_B)) {
                return;
            }
            ((bra) this).field_B = false;
            return;
        }
        if (!(((bra) this).field_B)) {
            return;
        }
        ((bra) this).field_B = false;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if ((param2 ^ -1) == -99) {
          if (((bra) this).field_L == null) {
            boolean discarded$6 = ((bra) this).field_N.a((ae) this, false);
            return true;
          } else {
            boolean discarded$7 = ((bra) this).field_L.a((ae) this, false);
            return true;
          }
        } else {
          if ((param2 ^ -1) == -100) {
            boolean discarded$8 = ((bra) this).field_N.a((ae) this, false);
            return true;
          } else {
            if (!param3) {
              this.f(-100);
              return super.a(param0, param1, param2, true);
            } else {
              return super.a(param0, param1, param2, true);
            }
          }
        }
    }

    public static void i(byte param0) {
        field_O = null;
        field_M = null;
        if (param0 != 86) {
            bra.i((byte) -117);
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        if (param4 >= 44) {
          if (param2 != ((bra) this).field_L) {
            if (param2 != ((bra) this).field_N) {
              return;
            } else {
              this.f(-25050);
              return;
            }
          } else {
            pg.b(false);
            this.f(-25050);
            return;
          }
        } else {
          field_M = null;
          if (param2 != ((bra) this).field_L) {
            if (param2 != ((bra) this).field_N) {
              return;
            } else {
              this.f(-25050);
              return;
            }
          } else {
            pg.b(false);
            this.f(-25050);
            return;
          }
        }
    }

    bra(jta param0) {
        super(param0, 200, 130);
        ae var2 = new ae(jba.field_l, (qc) null);
        var2.field_m = ((bra) this).field_m;
        var2.field_i = 0;
        var2.field_p = 80;
        var2.field_n = 50;
        var2.field_r = (isa) (Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((bra) this).a(var2, -1);
        if (vpa.a(94)) {
            ((bra) this).field_L = this.a(ae.field_k, (byte) 91, (qc) this);
        }
        ((bra) this).field_N = this.a(kh.field_j, (byte) 54, (qc) this);
    }

    private final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        int var5 = 0;
        var4 = new rj(param0, param2);
        var4.field_r = (isa) (Object) new td();
        var5 = ((bra) this).field_p + -6;
        ((bra) this).field_p = ((bra) this).field_p + 38;
        var4.a((byte) -31, -30 + ((bra) this).field_m, 30, 15, var5);
        ((bra) this).a((ae) (Object) var4, -1);
        ((bra) this).c((byte) -72);
        if (param1 <= 25) {
          return null;
        } else {
          return var4;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new String[255];
    }
}
