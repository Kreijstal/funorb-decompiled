/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oi {
    static Random field_c;
    wl field_a;
    static int[] field_f;
    private wl field_b;
    static String[] field_e;
    static String field_d;

    final void a(wl param0, int param1) {
        L0: {
          if (param0.field_c != null) {
            param0.a(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -5441) {
          field_d = null;
          param0.field_b = ((oi) this).field_a.field_b;
          param0.field_c = ((oi) this).field_a;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
          return;
        } else {
          param0.field_b = ((oi) this).field_a.field_b;
          param0.field_c = ((oi) this).field_a;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
          return;
        }
    }

    final wl b(int param0) {
        wl var2 = null;
        int var3 = 0;
        var2 = ((oi) this).field_a.field_b;
        if (var2 == ((oi) this).field_a) {
          return null;
        } else {
          var3 = -45 % ((param0 - 32) / 56);
          var2.a(false);
          return var2;
        }
    }

    final wl c(int param0) {
        wl var2 = null;
        var2 = ((oi) this).field_a.field_c;
        if (param0 == 8192) {
          if (((oi) this).field_a == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        } else {
          field_f = null;
          if (((oi) this).field_a == var2) {
            return null;
          } else {
            var2.a(false);
            return var2;
          }
        }
    }

    final boolean f(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 8192) {
          L0: {
            ((oi) this).field_b = null;
            if (((oi) this).field_a.field_b != ((oi) this).field_a) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((oi) this).field_a.field_b != ((oi) this).field_a) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0) {
        wl var2 = null;
        int var3 = 0;
        var3 = wizardrun.field_H;
        L0: while (true) {
          var2 = ((oi) this).field_a.field_b;
          if (var2 == ((oi) this).field_a) {
            if (param0) {
              return;
            } else {
              ((oi) this).field_b = null;
              return;
            }
          } else {
            var2.a(false);
            continue L0;
          }
        }
    }

    final void a(wl param0, boolean param1) {
        if (null == param0.field_c) {
          param0.field_b = ((oi) this).field_a;
          param0.field_c = ((oi) this).field_a.field_c;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
          if (param1) {
            field_e = null;
            return;
          } else {
            return;
          }
        } else {
          param0.a(param1);
          param0.field_b = ((oi) this).field_a;
          param0.field_c = ((oi) this).field_a.field_c;
          param0.field_c.field_b = param0;
          param0.field_b.field_c = param0;
          if (!param1) {
            return;
          } else {
            field_e = null;
            return;
          }
        }
    }

    final wl d(int param0) {
        wl var2 = null;
        var2 = ((oi) this).field_b;
        if (var2 == ((oi) this).field_a) {
          ((oi) this).field_b = null;
          return null;
        } else {
          ((oi) this).field_b = var2.field_b;
          if (param0 != 8192) {
            return null;
          } else {
            return var2;
          }
        }
    }

    final wl a(byte param0) {
        wl var2 = null;
        if (param0 != 11) {
            ((oi) this).field_a = null;
            var2 = ((oi) this).field_a.field_c;
            if (!(((oi) this).field_a != var2)) {
                ((oi) this).field_b = null;
                return null;
            }
            ((oi) this).field_b = var2.field_c;
            return var2;
        }
        var2 = ((oi) this).field_a.field_c;
        if (!(((oi) this).field_a != var2)) {
            ((oi) this).field_b = null;
            return null;
        }
        ((oi) this).field_b = var2.field_c;
        return var2;
    }

    public static void e(int param0) {
        field_d = null;
        if (param0 <= 9) {
            return;
        }
        field_e = null;
        field_c = null;
        field_f = null;
    }

    final wl a(int param0) {
        wl var2 = ((oi) this).field_b;
        if (!(((oi) this).field_a != var2)) {
            ((oi) this).field_b = null;
            return null;
        }
        ((oi) this).field_b = var2.field_c;
        int var3 = -110 % ((param0 - 17) / 47);
        return var2;
    }

    public oi() {
        ((oi) this).field_a = new wl();
        ((oi) this).field_a.field_b = ((oi) this).field_a;
        ((oi) this).field_a.field_c = ((oi) this).field_a;
    }

    final wl b(byte param0) {
        wl var2 = null;
        if (param0 >= 45) {
          var2 = ((oi) this).field_a.field_b;
          if (var2 == ((oi) this).field_a) {
            ((oi) this).field_b = null;
            return null;
          } else {
            ((oi) this).field_b = var2.field_b;
            return var2;
          }
        } else {
          field_f = null;
          var2 = ((oi) this).field_a.field_b;
          if (var2 == ((oi) this).field_a) {
            ((oi) this).field_b = null;
            return null;
          } else {
            ((oi) this).field_b = var2.field_b;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_c = new Random();
        field_d = "[Hold to charge]";
        field_e = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
