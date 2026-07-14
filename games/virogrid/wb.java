/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wb extends l {
    static String field_l;
    long field_j;
    static String field_n;
    wb field_h;
    static String field_g;
    static String field_i;
    static km field_m;
    wb field_k;

    final void c(int param0) {
        if (((wb) this).field_k != null) {
          if (param0 < 10) {
            return;
          } else {
            ((wb) this).field_k.field_h = ((wb) this).field_h;
            ((wb) this).field_h.field_k = ((wb) this).field_k;
            ((wb) this).field_k = null;
            ((wb) this).field_h = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 1) {
          field_n = null;
          if (((wb) this).field_k != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((wb) this).field_k == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, long param1) {
        if (((wb) this).field_k != null) {
            throw new RuntimeException();
        }
        if (param0 != 0) {
            return;
        }
        ((wb) this).field_j = param1;
    }

    final static void a(int param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param0, 8);
        var2.a(1, param1 + 62);
        var2.a(param1, 80);
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        int var3 = 0;
        if (!param0) {
          df.c();
          ci.b(param0, -126);
          var3 = -121 / ((79 - param1) / 35);
          return;
        } else {
          df.b(0, 0, df.field_e, df.field_f, 0, 192);
          ci.b(param0, -126);
          var3 = -121 / ((79 - param1) / 35);
          return;
        }
    }

    public static void c(boolean param0) {
        field_n = null;
        field_g = null;
        field_m = null;
        if (!param0) {
          field_i = null;
          field_i = null;
          field_l = null;
          return;
        } else {
          field_i = null;
          field_l = null;
          return;
        }
    }

    final long a(byte param0) {
        if (param0 <= 12) {
            ((wb) this).field_j = 6L;
            return ((wb) this).field_j;
        }
        return ((wb) this).field_j;
    }

    protected wb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Show chat";
        field_l = "New Game";
        field_i = "Orb coins: ";
        field_g = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
