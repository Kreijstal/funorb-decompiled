/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gv extends kj {
    private int field_f;

    final static void a(int param0, ht param1, java.awt.Frame param2) {
        eh var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        L0: while (true) {
          var3 = param1.a(param2, false);
          L1: while (true) {
            if (var3.field_f != 0) {
              if ((var3.field_f ^ -1) == -2) {
                if (param0 >= -84) {
                  return;
                } else {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                }
              } else {
                gda.a(false, 100L);
                continue L0;
              }
            } else {
              gda.a(false, 10L);
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((gv) this).a(-85, true, -42);
        }
    }

    gv(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        ((gv) this).field_f = ((gv) this).field_f + 1;
        if ((((gv) this).field_f + 1 ^ -1) <= -61) {
          return true;
        } else {
          if (param0 <= 21) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (((gv) this).field_f >= 10) {
          if (30 >= ((gv) this).field_f) {
            gha.field_h.a(-128 + param2, param0 - 64);
            if (!param1) {
              boolean discarded$8 = ((gv) this).b(-37);
              return;
            } else {
              return;
            }
          } else {
            if ((2 & ((gv) this).field_f) != 0) {
              if (!param1) {
                boolean discarded$9 = ((gv) this).b(-37);
                return;
              } else {
                return;
              }
            } else {
              gha.field_h.a(-128 + param2, -64 + param0, 128);
              if (param1) {
                return;
              } else {
                boolean discarded$10 = ((gv) this).b(-37);
                return;
              }
            }
          }
        } else {
          var4 = (int)((double)param0 / 10.0) * ((gv) this).field_f;
          gha.field_h.a(-128 + param2, var4 + -64);
          if (param1) {
            return;
          } else {
            boolean discarded$11 = ((gv) this).b(-37);
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
    }
}
