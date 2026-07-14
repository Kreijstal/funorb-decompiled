/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc implements Iterable {
    ug[] field_f;
    private ug field_a;
    static int field_e;
    int field_d;
    static String field_b;
    static int field_c;

    final static lg a(int param0, String param1, String param2, ud param3, ad param4) {
        int var5 = 0;
        int var6 = 0;
        if (param0 != 2570) {
          return null;
        } else {
          var5 = param4.c(param2, (byte) -105);
          var6 = param4.a(param1, var5, -28459);
          return ei.a(param4, (byte) 115, param3, var6, var5);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wc((dc) this);
    }

    final static void a(int param0) {
        Object var2 = null;
        nf.field_F = new bg();
        if (param0 != 0) {
          var2 = null;
          lg discarded$2 = dc.a(54, (String) null, (String) null, (ud) null, (ad) null);
          jh.field_C.c((byte) 121, (we) (Object) nf.field_F);
          return;
        } else {
          jh.field_C.c((byte) 121, (we) (Object) nf.field_F);
          return;
        }
    }

    private dc() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var5 = hb.field_l;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        L0: while (true) {
          if (var2 >= var3) {
            if (param0 != 114) {
              field_c = -18;
              return;
            } else {
              return;
            }
          } else {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 < 16) {
            dc.a(24);
        }
    }

    final void a(long param0, boolean param1, ug param2) {
        ug var5 = null;
        ug var6 = null;
        ug var7 = null;
        ug var8 = null;
        ug var9 = null;
        if (param1) {
          if (param2.field_c != null) {
            param2.c(-19822);
            var8 = ((dc) this).field_f[(int)(param0 & (long)(((dc) this).field_d - 1))];
            var5 = var8;
            param2.field_c = var8.field_c;
            param2.field_d = var5;
            param2.field_c.field_d = param2;
            param2.field_d.field_c = param2;
            param2.field_a = param0;
            return;
          } else {
            var9 = ((dc) this).field_f[(int)(param0 & (long)(((dc) this).field_d - 1))];
            var5 = var9;
            param2.field_c = var9.field_c;
            param2.field_d = var5;
            param2.field_c.field_d = param2;
            param2.field_d.field_c = param2;
            param2.field_a = param0;
            return;
          }
        } else {
          dc.a(27);
          if (param2.field_c == null) {
            var6 = ((dc) this).field_f[(int)(param0 & (long)(((dc) this).field_d - 1))];
            var5 = var6;
            param2.field_c = var6.field_c;
            param2.field_d = var5;
            param2.field_c.field_d = param2;
            param2.field_d.field_c = param2;
            param2.field_a = param0;
            return;
          } else {
            param2.c(-19822);
            var7 = ((dc) this).field_f[(int)(param0 & (long)(((dc) this).field_d - 1))];
            var5 = var7;
            param2.field_c = var7.field_c;
            param2.field_d = var5;
            param2.field_c.field_d = param2;
            param2.field_d.field_c = param2;
            param2.field_a = param0;
            return;
          }
        }
    }

    final ug a(byte param0, long param1) {
        ug var4 = null;
        ug var5 = null;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = ((dc) this).field_f[(int)((long)(-1 + ((dc) this).field_d) & param1)];
        if (param0 <= -70) {
          ((dc) this).field_a = var4.field_d;
          L0: while (true) {
            if (((dc) this).field_a != var4) {
              if ((((dc) this).field_a.field_a ^ -1L) != (param1 ^ -1L)) {
                ((dc) this).field_a = ((dc) this).field_a.field_d;
                continue L0;
              } else {
                var5 = ((dc) this).field_a;
                ((dc) this).field_a = ((dc) this).field_a.field_d;
                return var5;
              }
            } else {
              ((dc) this).field_a = null;
              return null;
            }
          }
        } else {
          Iterator discarded$1 = ((dc) this).iterator();
          ((dc) this).field_a = var4.field_d;
          L1: while (true) {
            if (((dc) this).field_a != var4) {
              if ((((dc) this).field_a.field_a ^ -1L) != (param1 ^ -1L)) {
                ((dc) this).field_a = ((dc) this).field_a.field_d;
                continue L1;
              } else {
                var5 = ((dc) this).field_a;
                ((dc) this).field_a = ((dc) this).field_a.field_d;
                return var5;
              }
            } else {
              ((dc) this).field_a = null;
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = 0;
    }
}
