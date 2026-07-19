/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static hj[] field_b;
    static int field_c;
    static String field_a;

    final static bl a(int param0) {
        if (param0 != 0) {
          L0: {
            field_a = (String) null;
            if (ed.field_h == null) {
              ed.field_h = new bl();
              ed.field_h.a(lm.field_f, -2699);
              ed.field_h.field_j = pc.field_bb;
              ed.field_h.field_r = 7697781;
              ed.field_h.field_d = 4;
              ed.field_h.field_a = 5;
              ed.field_h.field_o = 0;
              ed.field_h.field_h = 6;
              ed.field_h.field_i = 14;
              ed.field_h.field_k = 2763306;
              break L0;
            } else {
              break L0;
            }
          }
          return ed.field_h;
        } else {
          L1: {
            if (ed.field_h == null) {
              ed.field_h = new bl();
              ed.field_h.a(lm.field_f, -2699);
              ed.field_h.field_j = pc.field_bb;
              ed.field_h.field_r = 7697781;
              ed.field_h.field_d = 4;
              ed.field_h.field_a = 5;
              ed.field_h.field_o = 0;
              ed.field_h.field_h = 6;
              ed.field_h.field_i = 14;
              ed.field_h.field_k = 2763306;
              break L1;
            } else {
              break L1;
            }
          }
          return ed.field_h;
        }
    }

    public static void b(int param0) {
        if (param0 != 24) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (s.field_y != null) {
              try {
                L0: {
                  s.field_y.a(0L, -1);
                  s.field_y.a(false, cd.field_t.field_j, 24, cd.field_t.field_i);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                cd.field_t.field_i = cd.field_t.field_i + 24;
                if (param0 <= 38) {
                  field_b = (hj[]) null;
                  return;
                } else {
                  return;
                }
              }
              L1: {
                cd.field_t.field_i = cd.field_t.field_i + 24;
                if (param0 > 38) {
                  break L1;
                } else {
                  field_b = (hj[]) null;
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                cd.field_t.field_i = cd.field_t.field_i + 24;
                if (param0 > 38) {
                  break L2;
                } else {
                  field_b = (hj[]) null;
                  break L2;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = "CHOMPO";
    }
}
