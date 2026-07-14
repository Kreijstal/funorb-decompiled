/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends mg {
    private String field_k;
    static double[] field_i;
    private String field_j;

    final wh a(int param0) {
        if (param0 != 0) {
            ((bq) this).field_j = null;
            return of.field_C;
        }
        return of.field_C;
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            return;
        }
        field_i = null;
    }

    bq(String param0, String param1) {
        ((bq) this).field_j = param0;
        ((bq) this).field_k = param1;
    }

    final void a(ng param0, byte param1) {
        if (param1 < 94) {
            bq.a((byte) -15);
            param0.a(((bq) this).field_j, (byte) -105);
            param0.a(-16614, ((bq) this).field_k);
            return;
        }
        param0.a(((bq) this).field_j, (byte) -105);
        param0.a(-16614, ((bq) this).field_k);
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        if (param3 != 4) {
            field_i = null;
        }
        try {
            var4 = param0.getGraphics();
            dk.field_o.a(var4, param1, (byte) 126, param2);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final static void a(byte param0) {
        we var1 = null;
        int var2 = 0;
        ca var3 = null;
        var2 = CrazyCrystals.field_B;
        if (lo.field_b != null) {
          ba.a(3, 43, lo.field_b);
          L0: while (true) {
            var3 = (ca) (Object) so.field_h.c(0);
            if (var3 != null) {
              mb.a(var3, 4, 0);
              continue L0;
            } else {
              L1: while (true) {
                var1 = (we) (Object) ec.field_l.c(0);
                if (var1 == null) {
                  if (param0 == -12) {
                    return;
                  } else {
                    field_i = null;
                    return;
                  }
                } else {
                  lj.a(5, var1, param0 ^ 120);
                  continue L1;
                }
              }
            }
          }
        } else {
          L2: while (true) {
            var3 = (ca) (Object) so.field_h.c(0);
            if (var3 != null) {
              mb.a(var3, 4, 0);
              continue L2;
            } else {
              L3: while (true) {
                var1 = (we) (Object) ec.field_l.c(0);
                if (var1 == null) {
                  if (param0 == -12) {
                    return;
                  } else {
                    field_i = null;
                    return;
                  }
                } else {
                  lj.a(5, var1, param0 ^ 120);
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
    }
}
