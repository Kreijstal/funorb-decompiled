/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ib field_e;
    private long field_f;
    private bf[] field_c;
    static int[] field_a;
    private bf field_d;
    private int field_b;

    final void a(bf param0, long param1, int param2) {
        bf var5 = null;
        if (param0.field_e != null) {
            param0.a(7847);
            var5 = ((vd) this).field_c[(int)(param1 & (long)(-1 + ((vd) this).field_b))];
            param0.field_g = var5;
            if (param2 >= -55) {
                return;
            }
            param0.field_e = var5.field_e;
            param0.field_e.field_g = param0;
            param0.field_f = param1;
            param0.field_g.field_e = param0;
            return;
        }
        var5 = ((vd) this).field_c[(int)(param1 & (long)(-1 + ((vd) this).field_b))];
        param0.field_g = var5;
        if (param2 >= -55) {
            return;
        }
        param0.field_e = var5.field_e;
        param0.field_e.field_g = param0;
        param0.field_f = param1;
        param0.field_g.field_e = param0;
    }

    final bf b(int param0) {
        bf var3 = null;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((vd) this).field_d == null) {
            return null;
        }
        bf var2 = ((vd) this).field_c[(int)(((vd) this).field_f & (long)(((vd) this).field_b + -1))];
        while (var2 != ((vd) this).field_d) {
            if (!((((vd) this).field_f ^ -1L) != (((vd) this).field_d.field_f ^ -1L))) {
                var3 = ((vd) this).field_d;
                ((vd) this).field_d = ((vd) this).field_d.field_g;
                return var3;
            }
            ((vd) this).field_d = ((vd) this).field_d.field_g;
        }
        ((vd) this).field_d = null;
        if (param0 < -28) {
            return null;
        }
        mj discarded$0 = vd.a(true);
        return null;
    }

    final static String a(CharSequence[] param0, byte param1) {
        if (param1 >= -115) {
            field_e = null;
            return k.a(0, param0.length, 0, param0);
        }
        return k.a(0, param0.length, 0, param0);
    }

    final bf a(long param0, boolean param1) {
        bf var4 = null;
        bf var5 = null;
        int var6 = 0;
        bf var7 = null;
        bf var8 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param1) {
          ((vd) this).field_f = param0;
          var7 = ((vd) this).field_c[(int)((long)(-1 + ((vd) this).field_b) & param0)];
          var4 = var7;
          ((vd) this).field_d = var7.field_g;
          L0: while (true) {
            if (var4 == ((vd) this).field_d) {
              ((vd) this).field_d = null;
              return null;
            } else {
              if ((param0 ^ -1L) != (((vd) this).field_d.field_f ^ -1L)) {
                ((vd) this).field_d = ((vd) this).field_d.field_g;
                continue L0;
              } else {
                var5 = ((vd) this).field_d;
                ((vd) this).field_d = ((vd) this).field_d.field_g;
                return var5;
              }
            }
          }
        } else {
          ((vd) this).field_d = null;
          ((vd) this).field_f = param0;
          var8 = ((vd) this).field_c[(int)((long)(-1 + ((vd) this).field_b) & param0)];
          var4 = var8;
          ((vd) this).field_d = var8.field_g;
          L1: while (true) {
            if (var4 == ((vd) this).field_d) {
              ((vd) this).field_d = null;
              return null;
            } else {
              if ((param0 ^ -1L) != (((vd) this).field_d.field_f ^ -1L)) {
                ((vd) this).field_d = ((vd) this).field_d.field_g;
                continue L1;
              } else {
                var5 = ((vd) this).field_d;
                ((vd) this).field_d = ((vd) this).field_d.field_g;
                return var5;
              }
            }
          }
        }
    }

    final static mj a(boolean param0) {
        if (param0) {
            field_e = null;
            return k.field_f;
        }
        return k.field_f;
    }

    final static vk a(boolean param0, String param1, ad param2, ad param3, String param4) {
        int var5 = param3.c(param1, (byte) -105);
        if (!param0) {
            return null;
        }
        int var6 = param3.a(param4, var5, -28459);
        return n.a(param3, param2, (byte) 125, var5, var6);
    }

    vd(int param0) {
        int var2 = 0;
        bf var3 = null;
        ((vd) this).field_c = new bf[param0];
        ((vd) this).field_b = param0;
        for (var2 = 0; var2 < param0; var2++) {
            var3 = new bf();
            ((vd) this).field_c[var2] = new bf();
            var3.field_e = var3;
            var3.field_g = var3;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 <= 106) {
            vd.a(-53);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_e = new ib();
    }
}
