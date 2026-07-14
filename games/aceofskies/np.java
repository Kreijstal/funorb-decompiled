/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class np extends hh {
    static String field_e;
    static float[] field_d;

    final static int a(CharSequence param0, int param1, int param2) {
        if (param1 != 4) {
            np.b(49);
            return ro.a(param2, true, -127, param0);
        }
        return ro.a(param2, true, -127, param0);
    }

    final static void b(int param0) {
        if (param0 != 34066) {
            np.b(-127);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 83 % ((param2 - 18) / 54);
        return bs.a(-1, ci.field_i, -param0 + param1) - -param0;
    }

    final boolean a(byte param0) {
        int var2 = -13 / ((param0 - -11) / 63);
        return true;
    }

    final void a(int param0, int param1, rt param2) {
        if (param1 != -1486691000) {
            return;
        }
        ((np) this).field_a.a(param2, 1);
        ((np) this).field_a.a(param0, (byte) -39);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != -65) {
            ((np) this).b((byte) 7);
        }
    }

    final static int a(nf param0, boolean param1) {
        if (param0 != ij.field_g) {
          if (rg.field_A != param0) {
            if (param0 != gk.field_g) {
              if (param1) {
                field_e = (String) null;
                throw new IllegalArgumentException();
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              return 34066;
            }
          } else {
            return 34065;
          }
        } else {
          return 9216;
        }
    }

    final void b(byte param0) {
        if (param0 <= 5) {
            field_e = (String) null;
            ((np) this).field_a.a((byte) -126, false);
            return;
        }
        ((np) this).field_a.a((byte) -126, false);
    }

    final void a(int param0, boolean param1) {
        if (param0 != 4096) {
            field_d = (float[]) null;
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 9216) {
            CharSequence var2 = (CharSequence) null;
            int discarded$0 = np.a((CharSequence) null, 73, 16);
        }
    }

    np(wl param0) {
        super(param0);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            field_d = (float[]) null;
            ((np) this).field_a.a((byte) -126, true);
            return;
        }
        ((np) this).field_a.a((byte) -126, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "menu_mouseover";
        field_d = new float[4];
    }
}
