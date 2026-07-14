/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tma extends ana {
    private l field_y;
    static lo field_x;
    static ws field_w;
    static int field_v;

    private final void b(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((tma) this).c((byte) 26);
        }
    }

    tma(gj param0, l param1) {
        super(param0, (bca) (Object) param1);
        ((tma) this).field_y = param1;
    }

    private final void d(int param0) {
        int var5 = BachelorFridge.field_y;
        aga var2 = ((tma) this).field_y.field_l.a(116, ((tma) this).field_q.field_h);
        if (!(!var2.i(105))) {
            return;
        }
        ad discarded$0 = ((tma) this).field_q.a(21915, ((tma) this).field_q.b(var2, -23990));
        pp var3 = (pp) (Object) ((tma) this).field_y.field_o.b((byte) 90);
        oha discarded$1 = al.a(88, ((tma) this).field_y.field_k);
        int var4 = 96 / ((param0 - -68) / 50);
        while (var3 != null) {
            var3.a(var2, ((tma) this).field_q.field_h, 12);
            var3 = (pp) (Object) ((tma) this).field_y.field_o.c(0);
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        if (param0) {
            field_v = -47;
            field_x = null;
            return;
        }
        field_x = null;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        if (!((tma) this).field_y.field_p) {
          ((tma) this).field_l = ((tma) this).field_l - 1;
          if (0 <= ((tma) this).field_l - 1) {
            if (-26 != (((tma) this).field_l ^ -1)) {
              return false;
            } else {
              jja.a(256, -1, 70);
              this.d(-18);
              return false;
            }
          } else {
            var2 = 97 / ((param0 - 71) / 47);
            this.b(false);
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int[][] param0, int param1) {
        if (param1 != -5) {
            field_x = null;
            tj.field_b = param0;
            return;
        }
        tj.field_b = param0;
    }

    final static cj a(lu param0, byte param1) {
        int var2 = 0;
        var2 = param0.b(16711935);
        if (255 != var2) {
          if ((var2 ^ -1) == -3) {
            return ih.a(param0, param1 ^ -276);
          } else {
            if (var2 == 1) {
              return ig.a(param0, 104);
            } else {
              if (-5 == var2) {
                return ba.a(param0, (byte) 119);
              } else {
                if (param1 == -50) {
                  if (-6 != var2) {
                    if ((var2 ^ -1) != -7) {
                      if ((var2 ^ -1) == -8) {
                        return gla.a(param0, (byte) -19);
                      } else {
                        throw new IllegalStateException("Invalid move category");
                      }
                    } else {
                      return hj.a((byte) -121, param0);
                    }
                  } else {
                    return rfa.a(29428, param0);
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new lo();
        field_w = new ws();
    }
}
