/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends jc {
    private int field_X;
    static cc field_eb;
    private td field_Y;
    private int field_gb;
    private int field_ab;
    private int field_cb;
    private n field_W;
    private int field_bb;
    static String field_fb;
    static qj field_hb;
    private lk field_db;
    static double field_Z;
    static String[] field_ib;

    final static int a(int param0, CharSequence param1) {
        int var5 = 0;
        int var6 = Main.field_T;
        int var2 = ((CharSequence) param1).length();
        int var3 = 105 / ((param0 - 12) / 45);
        int var4 = 0;
        for (var5 = 0; var5 < var2; var5++) {
            var4 = ec.a((byte) -123, ((CharSequence) param1).charAt(var5)) + (var4 << -1097858139) + -var4;
        }
        return var4;
    }

    boolean a(boolean param0) {
        int var3 = 0;
        var3 = Main.field_T;
        if (param0) {
          L0: {
            if (null != ((ta) this).field_Y) {
              if (rb.field_h != ((ta) this).field_Y) {
                if (((ta) this).field_Y != jk.field_b) {
                  break L0;
                } else {
                  ((ta) this).field_ab = ((ta) this).field_ab + 1;
                  if (((ta) this).field_X == ((ta) this).field_ab + 1) {
                    ((ta) this).field_W.field_A = 256;
                    ((ta) this).field_Y = null;
                    break L0;
                  } else {
                    ((ta) this).field_W.field_A = (((ta) this).field_ab << -1075429240) / ((ta) this).field_X;
                    break L0;
                  }
                }
              } else {
                ((ta) this).field_ab = ((ta) this).field_ab + 1;
                if (((ta) this).field_ab + 1 == ((ta) this).field_bb) {
                  ((ta) this).field_Y = aj.field_q;
                  ((ta) this).a((byte) -36, 12 + ((ta) this).field_db.field_h, ((ta) this).field_cb + 12 + ((ta) this).field_db.field_q, ((ta) this).field_gb);
                  ((ta) this).field_ab = 0;
                  ((ta) this).field_W.field_A = 0;
                  break L0;
                } else {
                  ((ta) this).field_W.field_A = -((((ta) this).field_ab << -1728140152) / ((ta) this).field_bb) + 256;
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          return this.a(true);
        } else {
          return true;
        }
    }

    private final void c(int param0, lk param1) {
        if (!(null == ((ta) this).field_W)) {
            ((ta) this).field_W.c(90);
        }
        if (param0 != 0) {
            return;
        }
        if (param1 == null) {
            ((ta) this).field_W = new n();
        } else {
            param1.a(((lk) param1).field_q, ((ta) this).field_cb + 6, ((lk) param1).field_h, 6, true);
            ((ta) this).field_W = new n(param1);
        }
        ((ta) this).b((lk) (Object) ((ta) this).field_W, (byte) 118);
        ((ta) this).field_db = null;
    }

    final boolean o(int param0) {
        ((ta) this).q(0);
        if (param0 != 928516712) {
            return true;
        }
        return this.o(928516712);
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        if (!(!this.a(param0, (byte) -114, param2, param3))) {
            return true;
        }
        if (param1 > -99) {
            ((ta) this).field_W = (n) null;
        }
        if (null != ((ta) this).field_W) {
            if ((param2 ^ -1) == -99) {
                boolean discarded$0 = ((ta) this).field_W.a(123, param3);
            }
            if (99 != param2) {
                return false;
            }
            boolean discarded$1 = ((ta) this).field_W.a(117, param3);
        }
        return false;
    }

    final void d(byte param0) {
        if (((ta) this).field_Y == rb.field_h) {
            return;
        }
        ((ta) this).field_Y = jk.field_b;
        if (param0 > -29) {
            return;
        }
        ((ta) this).field_ab = 0;
        this.c(0, ((ta) this).field_db);
        ((ta) this).field_db = null;
        ((ta) this).field_W.field_A = 0;
    }

    final static void c(boolean param0) {
        dg.field_H.field_b = 0;
        if (!param0) {
            return;
        }
        dg.field_H.field_l = 0;
    }

    public static void e(byte param0) {
        field_fb = null;
        int var1 = -62 % ((param0 - 58) / 50);
        field_ib = null;
        field_hb = null;
        field_eb = null;
    }

    ta(j param0, lk param1, int param2, int param3, int param4) {
        super(param0, ((lk) param1).field_h + 12, ((lk) param1).field_q + (12 + param2));
        ((ta) this).field_X = param3;
        ((ta) this).field_bb = param3;
        ((ta) this).field_gb = param4;
        ((ta) this).field_cb = param2;
        this.c(0, param1);
    }

    final void q(int param0) {
        if (!(null == ((ta) this).field_Y)) {
            if (!(jk.field_b == ((ta) this).field_Y)) {
                ((ta) this).a(((ta) this).field_cb + (12 - -((ta) this).field_db.field_q), ((ta) this).field_db.field_h + 12, param0 ^ -1);
                this.c(0, ((ta) this).field_db);
            }
            ((ta) this).field_Y = null;
            ((ta) this).field_W.field_A = 256;
        }
        this.q(param0);
    }

    void c(lk param0, byte param1) {
        if (param1 < 28) {
            return;
        }
        ((ta) this).field_db = param0;
        if (((ta) this).field_Y == aj.field_q) {
            ((ta) this).a((byte) -86, ((ta) this).field_db.field_h + 12, 12 - -((ta) this).field_cb - -((ta) this).field_db.field_q, ((ta) this).field_gb);
            ((ta) this).field_ab = 0;
        } else {
            if (!(rb.field_h == ((ta) this).field_Y)) {
                ((ta) this).field_Y = rb.field_h;
                ((ta) this).field_ab = 0;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "This password contains repeated characters, and would be easy to guess";
        field_eb = new cc();
        field_Z = Math.atan2(1.0, 0.0);
        field_ib = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
