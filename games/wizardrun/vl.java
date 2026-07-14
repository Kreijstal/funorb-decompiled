/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements bf {
    private int field_o;
    private int field_i;
    private int field_l;
    private int field_b;
    static int field_d;
    static String field_n;
    private int field_p;
    private int field_k;
    private int field_r;
    static String field_a;
    private vd field_j;
    static int field_h;
    static String field_g;
    private int field_q;
    static String field_f;
    private int field_e;
    private int field_c;
    private int field_m;

    final static String a(int param0) {
        if (param0 >= -29) {
            return null;
        }
        return nk.field_N.d(0);
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ef var11 = null;
        ub stackIn_3_0 = null;
        ub stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param2 instanceof ef) {
            stackOut_2_0 = (ub) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ub) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (ef) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param4 = param4 & var11.field_B;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param4) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        ed.c(param0 - -param2.field_o, param2.field_l + param1, param2.field_r, param2.field_n, ((vl) this).field_c);
        var8 = param0 - -param2.field_o - -((vl) this).field_m;
        var9 = param1 + param2.field_l - -((vl) this).field_b;
        ed.b(var8, var9, ((vl) this).field_l, ((vl) this).field_p, 5592405);
        ed.c(var8, var9, ((vl) this).field_l, ((vl) this).field_p, var7);
        if (!param3) {
          L3: {
            ((vl) this).field_p = 11;
            if (var11.field_z) {
              ed.e(var8, var9, var8 + ((vl) this).field_l, var9 + ((vl) this).field_p, 1);
              ed.e(var8 - -((vl) this).field_l, var9, var8, ((vl) this).field_p + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null != ((vl) this).field_j) {
              var10 = ((vl) this).field_i + ((vl) this).field_l + ((vl) this).field_m;
              int discarded$2 = ((vl) this).field_j.a(param2.field_k, param2.field_o + param0 - -var10, ((vl) this).field_o + param1 + param2.field_l, -((vl) this).field_i - (var10 - param2.field_r), param2.field_n - (((vl) this).field_i << -898435263), ((vl) this).field_r, ((vl) this).field_e, ((vl) this).field_k, ((vl) this).field_q, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          L5: {
            if (var11.field_z) {
              ed.e(var8, var9, var8 + ((vl) this).field_l, var9 + ((vl) this).field_p, 1);
              ed.e(var8 - -((vl) this).field_l, var9, var8, ((vl) this).field_p + var9, 1);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != ((vl) this).field_j) {
              var10 = ((vl) this).field_i + ((vl) this).field_l + ((vl) this).field_m;
              int discarded$3 = ((vl) this).field_j.a(param2.field_k, param2.field_o + param0 - -var10, ((vl) this).field_o + param1 + param2.field_l, -((vl) this).field_i - (var10 - param2.field_r), param2.field_n - (((vl) this).field_i << -898435263), ((vl) this).field_r, ((vl) this).field_e, ((vl) this).field_k, ((vl) this).field_q, 0);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    public static void b(int param0) {
        if (param0 < 42) {
          field_a = null;
          field_a = null;
          field_n = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_n = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 == -5717) {
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          String discarded$5 = vl.a(-107);
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    vl(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vl) this).field_k = 1;
        ((vl) this).field_q = 1;
        ((vl) this).field_r = param3;
        ((vl) this).field_c = param9;
        ((vl) this).field_o = param2;
        ((vl) this).field_m = param5;
        ((vl) this).field_e = param4;
        ((vl) this).field_b = param6;
        ((vl) this).field_i = param1;
        ((vl) this).field_l = param8;
        ((vl) this).field_p = param7;
        ((vl) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Create a free account to start using this feature";
        field_a = "Any crystals that remain on the level grow";
        field_g = "To server list";
    }
}
