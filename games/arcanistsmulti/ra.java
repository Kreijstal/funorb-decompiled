/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra {
    static String field_b;
    static String field_g;
    static eh field_k;
    static String field_l;
    static String field_i;
    static ll[] field_j;
    static int field_m;
    static int field_h;
    static String field_n;
    static qb field_a;
    static String field_e;
    static String field_d;
    static ll[] field_c;
    static byte[] field_f;

    final static int a(int param0) {
        int var1 = -69 / ((53 - param0) / 62);
        return new Date().getYear() - -1900;
    }

    public static void b(int param0) {
        Object var2 = null;
        field_k = null;
        field_a = null;
        field_f = null;
        field_n = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_g = null;
        field_c = null;
        field_i = null;
        if (param0 != 64) {
          var2 = null;
          ra.a((kc) null, 47, (kc) null);
          field_e = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_l = null;
          return;
        }
    }

    final static void a(kc param0, int param1, kc param2) {
        L0: {
          if (null == param0.field_G) {
            param0.field_G = new vn();
            break L0;
          } else {
            break L0;
          }
        }
        if (param2.field_G != null) {
          if (ie.field_Qb != null) {
            L1: {
              if (null == uc.field_c) {
                uc.field_c = new mo(64);
                break L1;
              } else {
                break L1;
              }
            }
            vd.field_d = param0.field_G;
            if (param1 == 64) {
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            } else {
              field_e = null;
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            }
          } else {
            L2: {
              ie.field_Qb = new mo(64);
              if (null == uc.field_c) {
                uc.field_c = new mo(64);
                break L2;
              } else {
                break L2;
              }
            }
            vd.field_d = param0.field_G;
            if (param1 == 64) {
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            } else {
              field_e = null;
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            }
          }
        } else {
          param2.field_G = new vn();
          if (ie.field_Qb == null) {
            L3: {
              ie.field_Qb = new mo(64);
              if (null == uc.field_c) {
                uc.field_c = new mo(64);
                break L3;
              } else {
                break L3;
              }
            }
            vd.field_d = param0.field_G;
            if (param1 == 64) {
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            } else {
              field_e = null;
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            }
          } else {
            L4: {
              if (null == uc.field_c) {
                uc.field_c = new mo(64);
                break L4;
              } else {
                break L4;
              }
            }
            vd.field_d = param0.field_G;
            if (param1 == 64) {
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            } else {
              field_e = null;
              oo.field_B = param2.field_G;
              qn.i(65);
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<shad><col=<%0>>STONE</col></shad>";
        field_g = "Only two targets left! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_i = "Spellbook not purchased";
        field_l = "Press F10 to open Quick Chat.";
        field_k = new eh();
        field_e = "<shad><col=<%0>>NATURE</col></shad>";
        field_n = "Offer rematch";
        field_d = "Loading fonts";
    }
}
