/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class um implements Iterable {
    int field_d;
    ms[] field_c;
    private ms field_b;
    private ms field_a;
    private int field_e;

    final static void b(int param0) {
        if (!(null == vv.field_b)) {
            vv.field_b.field_g = false;
        }
        jl.a(25, param0);
    }

    final ms c(int param0) {
        ((um) this).field_e = 0;
        if (param0 != -1) {
            ((um) this).field_c = null;
            return ((um) this).a(param0 + 0);
        }
        return ((um) this).a(param0 + 0);
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ia((um) this);
    }

    final ms a(int param0, long param1) {
        ms var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        ms var4 = ((um) this).field_c[(int)(param1 & (long)(-1 + ((um) this).field_d))];
        ((um) this).field_a = var4.field_b;
        while (var4 != ((um) this).field_a) {
            if (!((param1 ^ -1L) != (((um) this).field_a.field_h ^ -1L))) {
                var5 = ((um) this).field_a;
                ((um) this).field_a = ((um) this).field_a.field_b;
                return var5;
            }
            ((um) this).field_a = ((um) this).field_a.field_b;
        }
        ((um) this).field_a = null;
        if (param0 == 575) {
            return null;
        }
        ((um) this).field_d = -69;
        return null;
    }

    final void a(int param0, ms param1, long param2) {
        ms var5 = null;
        if (!(param1.field_g == null)) {
            param1.b(false);
        }
        if (param0 != -20657) {
            ((um) this).field_d = -114;
            var5 = ((um) this).field_c[(int)((long)(((um) this).field_d - 1) & param2)];
            param1.field_g = var5.field_g;
            param1.field_b = var5;
            param1.field_g.field_b = param1;
            param1.field_h = param2;
            param1.field_b.field_g = param1;
            return;
        }
        var5 = ((um) this).field_c[(int)((long)(((um) this).field_d - 1) & param2)];
        param1.field_g = var5.field_g;
        param1.field_b = var5;
        param1.field_g.field_b = param1;
        param1.field_h = param2;
        param1.field_b.field_g = param1;
    }

    final ms a(int param0) {
        int var3 = 0;
        ms var4 = null;
        ms var5 = null;
        ms var6 = null;
        ms var9 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -1) {
          if (((um) this).field_e > 0) {
            if (((um) this).field_b != ((um) this).field_c[-1 + ((um) this).field_e]) {
              var9 = ((um) this).field_b;
              ((um) this).field_b = var9.field_b;
              return var9;
            } else {
              L0: while (true) {
                if (((um) this).field_d > ((um) this).field_e) {
                  ((um) this).field_e = ((um) this).field_e + 1;
                  var4 = ((um) this).field_c[((um) this).field_e].field_b;
                  var6 = var4;
                  if (var4 == ((um) this).field_c[-1 + ((um) this).field_e]) {
                    continue L0;
                  } else {
                    ((um) this).field_b = var6.field_b;
                    return var6;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((um) this).field_d > ((um) this).field_e) {
                ((um) this).field_e = ((um) this).field_e + 1;
                var4 = ((um) this).field_c[((um) this).field_e].field_b;
                var5 = var4;
                if (var4 == ((um) this).field_c[-1 + ((um) this).field_e]) {
                  continue L1;
                } else {
                  ((um) this).field_b = var5.field_b;
                  return var5;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, byte param3) {
        java.awt.Graphics var4 = null;
        if (param3 <= 123) {
            Object var5 = null;
            um.a(-16, -25, (java.awt.Canvas) null, (byte) 50);
        }
        try {
            var4 = param2.getGraphics();
            m.field_R.a(-52, param1, var4, param0);
            var4.dispose();
        } catch (Exception exception) {
            param2.repaint();
        }
    }

    um(int param0) {
        int var2 = 0;
        ms var3 = null;
        ((um) this).field_e = 0;
        ((um) this).field_c = new ms[param0];
        ((um) this).field_d = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new ms();
            ((um) this).field_c[var2] = new ms();
            var3.field_g = var3;
            var3.field_b = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
    }
}
