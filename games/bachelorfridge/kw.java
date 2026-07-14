/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kw extends kj {
    private int field_l;
    static hq field_j;
    private int field_h;
    static int field_f;
    static String field_m;
    static String field_g;
    private int field_i;
    static gs[] field_k;
    private boolean field_o;
    static String field_n;

    final static void a(boolean param0) {
        gk.field_d = 0;
        lna.field_q = param0 ? true : false;
    }

    final static eq a(boolean param0, String[] param1) {
        eq var2 = new eq(param0);
        var2.field_a = param1;
        return var2;
    }

    final boolean b(int param0) {
        if ((((kw) this).field_l ^ -1) != -61) {
          if (param0 >= 21) {
            ((kw) this).field_l = ((kw) this).field_l - 1;
            if ((((kw) this).field_l - 1 ^ -1) > -1) {
              L0: {
                if (((kw) this).field_o) {
                  ((kw) this).field_e.field_h.b((byte) -126, 28, ((kw) this).field_d, ((kw) this).field_c);
                  break L0;
                } else {
                  break L0;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            boolean discarded$2 = ((kw) this).b(-88);
            ((kw) this).field_l = ((kw) this).field_l - 1;
            if ((((kw) this).field_l - 1 ^ -1) > -1) {
              L1: {
                if (((kw) this).field_o) {
                  ((kw) this).field_e.field_h.b((byte) -126, 28, ((kw) this).field_d, ((kw) this).field_c);
                  break L1;
                } else {
                  break L1;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          }
        } else {
          jja.a(192, -1, 25);
          if (param0 < 21) {
            boolean discarded$3 = ((kw) this).b(-88);
            ((kw) this).field_l = ((kw) this).field_l - 1;
            if ((((kw) this).field_l - 1 ^ -1) > -1) {
              L2: {
                if (((kw) this).field_o) {
                  ((kw) this).field_e.field_h.b((byte) -126, 28, ((kw) this).field_d, ((kw) this).field_c);
                  break L2;
                } else {
                  break L2;
                }
              }
              jja.a(64, -1, 24);
              return true;
            } else {
              return false;
            }
          } else {
            ((kw) this).field_l = ((kw) this).field_l - 1;
            if ((((kw) this).field_l - 1 ^ -1) <= -1) {
              return false;
            } else {
              L3: {
                if (((kw) this).field_o) {
                  ((kw) this).field_e.field_h.b((byte) -126, 28, ((kw) this).field_d, ((kw) this).field_c);
                  break L3;
                } else {
                  break L3;
                }
              }
              jja.a(64, -1, 24);
              return true;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            boolean discarded$0 = ((kw) this).b(-84);
        }
    }

    kw(gj param0, int param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param2);
        ((kw) this).field_o = param5 ? true : false;
        ((kw) this).field_l = 80;
        ((kw) this).field_i = -64 + kla.a(129, m.field_a, -2147483648) + param3;
        ((kw) this).field_h = kla.a(65, m.field_a, -2147483648) + param4 - 32;
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 < 75) {
          field_m = null;
          field_g = null;
          field_j = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_g = null;
          field_j = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        ee var5 = null;
        int var6 = 0;
        int var7 = 0;
        if (param1 != 0) {
          return;
        } else {
          var4 = ((kw) this).field_l * (((80 + -((kw) this).field_l) * 655360 >> 807673392) + 400) / 80;
          var5 = kka.field_f;
          var6 = param2 - ((kw) this).field_i * ((kw) this).field_l / 80;
          var7 = param0 - var4 + -(((kw) this).field_l * ((kw) this).field_h / 80);
          var5.a(var6, var7 - 64);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 4;
        field_g = "Refreshed!";
        field_m = "All arena achievements must be gained in rated games";
        field_n = "Game drawn";
    }
}
