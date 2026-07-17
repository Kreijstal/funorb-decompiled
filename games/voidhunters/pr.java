/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static oma field_c;
    private fh field_h;
    private int field_e;
    private fh[] field_g;
    private long field_b;
    private fh field_a;
    private int field_f;
    static int field_d;

    final void a(fh param0, byte param1, long param2) {
        fh var5 = null;
        try {
            if (!(null == param0.field_d)) {
                param0.d((byte) -35);
            }
            var5 = ((pr) this).field_g[(int)(param2 & (long)(((pr) this).field_f - 1))];
            param0.field_d = var5.field_d;
            param0.field_e = var5;
            if (param1 > -12) {
                field_d = -43;
            }
            param0.field_d.field_e = param0;
            param0.field_e.field_d = param0;
            param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pr.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final fh e(int param0) {
        fh var4 = null;
        int var5 = VoidHunters.field_G;
        if (null == ((pr) this).field_a) {
            return null;
        }
        int var2 = 40 % ((param0 - -45) / 39);
        fh var3 = ((pr) this).field_g[(int)((long)(((pr) this).field_f + -1) & ((pr) this).field_b)];
        while (var3 != ((pr) this).field_a) {
            if (!(~((pr) this).field_a.field_i != ~((pr) this).field_b)) {
                var4 = ((pr) this).field_a;
                ((pr) this).field_a = ((pr) this).field_a.field_e;
                return var4;
            }
            ((pr) this).field_a = ((pr) this).field_a.field_e;
        }
        ((pr) this).field_a = null;
        return null;
    }

    public static void b(int param0) {
        field_c = null;
    }

    final fh d(int param0) {
        int var3 = 0;
        fh var4 = null;
        fh var8 = null;
        fh var11 = null;
        var3 = VoidHunters.field_G;
        if (param0 > ~((pr) this).field_e) {
          if (((pr) this).field_h != ((pr) this).field_g[-1 + ((pr) this).field_e]) {
            var11 = ((pr) this).field_h;
            ((pr) this).field_h = var11.field_e;
            return var11;
          } else {
            L0: while (true) {
              if (((pr) this).field_f > ((pr) this).field_e) {
                int fieldTemp$2 = ((pr) this).field_e;
                ((pr) this).field_e = ((pr) this).field_e + 1;
                var8 = ((pr) this).field_g[fieldTemp$2].field_e;
                if (((pr) this).field_g[-1 + ((pr) this).field_e] == var8) {
                  continue L0;
                } else {
                  ((pr) this).field_h = var8.field_e;
                  return var8;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (((pr) this).field_f > ((pr) this).field_e) {
              int fieldTemp$3 = ((pr) this).field_e;
              ((pr) this).field_e = ((pr) this).field_e + 1;
              var4 = ((pr) this).field_g[fieldTemp$3].field_e;
              if (((pr) this).field_g[-1 + ((pr) this).field_e] == var4) {
                continue L1;
              } else {
                ((pr) this).field_h = var4.field_e;
                return var4;
              }
            } else {
              return null;
            }
          }
        }
    }

    final fh a(int param0, long param1) {
        fh var5 = null;
        int var6 = VoidHunters.field_G;
        ((pr) this).field_b = param1;
        fh var4 = ((pr) this).field_g[(int)(param1 & (long)(((pr) this).field_f + param0))];
        ((pr) this).field_a = var4.field_e;
        while (((pr) this).field_a != var4) {
            if (((pr) this).field_a.field_i == param1) {
                var5 = ((pr) this).field_a;
                ((pr) this).field_a = ((pr) this).field_a.field_e;
                return var5;
            }
            ((pr) this).field_a = ((pr) this).field_a.field_e;
        }
        ((pr) this).field_a = null;
        return null;
    }

    final static void a(int param0) {
        gib.a((byte) -104);
        if (param0 != 17496) {
            return;
        }
        cea.a(-29, 4);
    }

    final fh c(int param0) {
        ((pr) this).field_e = 0;
        if (param0 >= -18) {
            fh discarded$0 = ((pr) this).d(89);
            return ((pr) this).d(-1);
        }
        return ((pr) this).d(-1);
    }

    pr(int param0) {
        int var2 = 0;
        fh var3 = null;
        ((pr) this).field_e = 0;
        ((pr) this).field_f = param0;
        ((pr) this).field_g = new fh[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            fh dupTemp$2 = new fh();
            var3 = dupTemp$2;
            ((pr) this).field_g[var2] = dupTemp$2;
            var3.field_d = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
