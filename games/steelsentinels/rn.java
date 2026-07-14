/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends ck {
    static rf field_v;
    static String field_s;
    static String field_t;
    static int field_u;
    static int[] field_D;
    static String field_B;
    static String[] field_r;
    int field_p;
    static int field_q;
    static String field_A;
    int field_x;
    static int[] field_w;
    static gh field_C;
    static kg field_y;
    static int[] field_o;
    static String field_z;

    final static String a(String param0, int param1, String param2, boolean param3) {
        CharSequence var8 = (CharSequence) (Object) param2;
        if (!(fa.a(param3, var8))) {
            return en.field_a;
        }
        if (2 != qc.field_P) {
            return ql.field_Zb;
        }
        ah var7 = da.a(param0, (byte) -41);
        if (!(var7 != null)) {
            return db.a(ui.field_W, -42, new String[1]);
        }
        var7.b(4);
        var7.e(480);
        cc.field_gc = cc.field_gc - 1;
        kj var5 = mm.field_g;
        var5.a(param1, (byte) -117);
        var5.field_p = var5.field_p + 1;
        int var6 = var5.field_p;
        var5.a((byte) 124, 3);
        var5.a(param2, -121);
        var5.b((byte) 116, var5.field_p + -var6);
        return null;
    }

    public static void d(int param0) {
        field_D = null;
        field_t = null;
        field_w = null;
        field_o = null;
        field_A = null;
        field_C = null;
        field_r = null;
        field_s = null;
        field_y = null;
        field_v = null;
        field_B = null;
        if (param0 != 3) {
          rn.d(-70);
          field_z = null;
          return;
        } else {
          field_z = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 == -14) {
          if (rb.field_h != null) {
            if (!field_v.b(122)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = null;
          if (rb.field_h != null) {
            if (!field_v.b(122)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var1 = 0;
        L0: while (true) {
          if (!dl.f(22759)) {
            se.field_c.a(127, se.a((byte) 32, oh.field_f, pi.field_c), se.a((byte) 32, oa.field_S, rj.field_j));
            if (param0 == 90) {
              L1: {
                if (se.field_c.c(0)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var2 = 0;
              if (var1 != 0) {
                if (se.field_c.field_e >= 0) {
                  var2 = cb.field_c[se.field_c.field_e];
                  if (2 == var2) {
                    gf.c(-95);
                    return var2;
                  } else {
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return -55;
            }
          } else {
            se.field_c.a(true);
            if (se.field_c.c(0)) {
              var1 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    private rn() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to SteelSentinelsText.text_benefits."};
        field_B = "Discard Progress";
        field_A = "Join";
        field_D = new int[4];
        field_w = new int[8192];
        field_t = "Loading sound effects";
        field_o = new int[]{108, -1, 34, 4, 14, 9, 16, -1, -1, -1, -1};
        field_z = "OVER <%0>";
        field_s = "To Customer Support";
    }
}
