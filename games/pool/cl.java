/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static vh field_d;
    static dd field_k;
    static int field_h;
    static dd field_m;
    static int field_g;
    static java.awt.Font field_c;
    static String field_i;
    static int field_e;
    static boolean field_f;
    static String field_l;
    static String field_a;
    static String field_b;
    static String field_j;
    static String field_n;

    final static boolean a(int param0, vh param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param1.field_sb;
        if (param0 == 1) {
          var3 = param1.field_ib;
          if (wn.field_i >= var2) {
            if (var2 - -param1.field_gb > wn.field_i) {
              if (var3 <= gg.field_f) {
                if (var3 + param1.field_Db <= gg.field_f) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_n = null;
          var3 = param1.field_ib;
          if (wn.field_i >= var2) {
            if (var2 - -param1.field_gb > wn.field_i) {
              if (var3 <= gg.field_f) {
                if (var3 + param1.field_Db <= gg.field_f) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        field_a = null;
        field_n = null;
        field_l = null;
        if (param0 > -43) {
          return;
        } else {
          field_b = null;
          field_m = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static wl a(byte[] param0, boolean param1) {
        wl var2 = null;
        if (param0 != null) {
          var2 = new wl(param0, el.field_I, ih.field_d, pd.field_a, rc.field_f, ma.field_h, v.field_b);
          sh.h(-1);
          if (!param1) {
            field_j = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0) {
        td.field_c.setLength(0);
        hn.field_b = 0;
        if (param0 != 14851) {
            field_n = null;
        }
    }

    final static void a(int param0, int param1, int[] param2, float[] param3, float[] param4) {
        if (!(am.a((byte) 107, param2, param3))) {
            return;
        }
        if (!(am.a((byte) 127, param2, param4))) {
            return;
        }
        qh.d((int)param3[0], (int)param3[param1], (int)param4[0], (int)param4[1], param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_l = "Public chat is unavailable while setting up a rated game.";
        field_b = "Click";
        field_a = "Only show lobby chat from my friends";
        field_j = "Please wait...";
        field_i = "Friends";
        field_n = "Members only";
    }
}
