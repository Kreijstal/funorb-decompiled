/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    int field_l;
    boolean field_m;
    int field_q;
    boolean field_i;
    int field_o;
    int field_j;
    wb[] field_f;
    wd field_c;
    static int field_n;
    int field_g;
    int field_r;
    static String field_b;
    ac field_h;
    static String field_e;
    static String field_k;
    static String field_d;
    int field_p;
    int field_s;
    int field_a;

    final static void a(int param0) {
        int var1 = 0;
        qi.field_b = ne.field_c.b(ll.field_m[13]);
        var1 = ne.field_c.b(ll.field_m[14]);
        if (param0 > -74) {
          return;
        } else {
          L0: {
            if (var1 <= qi.field_b) {
              break L0;
            } else {
              qi.field_b = var1;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != 106) {
          field_d = null;
          field_b = null;
          field_k = null;
          return;
        } else {
          field_b = null;
          field_k = null;
          return;
        }
    }

    final static hb a(ec param0, int param1, int param2, int param3) {
        int var4 = 0;
        hb var5 = null;
        if (param2 == -12) {
          var4 = param0.c(true);
          if (0 != var4) {
            var5 = new hb(param1, var4);
            var5.field_e = param0.c(true);
            var5.field_g = param0.c(true);
            var5.field_f = param0.c(true);
            var5.field_k = param0.c(true);
            if (11 > param3) {
              var5.field_p = 0;
              return var5;
            } else {
              var5.field_p = param0.c(true);
              return var5;
            }
          } else {
            L0: {
              int discarded$16 = param0.h(param2 + -94);
              if (-12 >= (param3 ^ -1)) {
                int discarded$17 = param0.c(true);
                break L0;
              } else {
                break L0;
              }
            }
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, boolean param1, ec param2) {
        param2.a(param0 ^ -14, ((ai) this).field_a);
        param2.a(param0 + 18, ((ai) this).field_p);
        param2.a(6, ((ai) this).field_g);
        param2.a(6, ((ai) this).field_r);
        param2.a(6, ((ai) this).field_q);
        if (param0 != -12) {
          L0: {
            field_n = -63;
            if (!param1) {
              param2.a(6, ((ai) this).field_j);
              param2.a(6, ((ai) this).field_l);
              param2.a(param0 + 18, ((ai) this).field_s);
              param2.a(6, ((ai) this).field_o);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (!param1) {
              param2.a(6, ((ai) this).field_j);
              param2.a(6, ((ai) this).field_l);
              param2.a(param0 + 18, ((ai) this).field_s);
              param2.a(6, ((ai) this).field_o);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(String param0, int param1) {
        pd.field_E = param0;
        if (param1 != 14) {
            Object var3 = null;
            ai.a(38, (vh) null);
        }
    }

    final static void a(int param0, vh param1) {
        boolean discarded$0 = ek.field_b.field_A.a(false, ha.field_k, tl.field_k, param0, param1);
    }

    ai(int param0) {
        ((ai) this).field_a = param0;
        ((ai) this).field_h = gh.field_i[((ai) this).field_a];
        if (null != ((ai) this).field_h) {
            ((ai) this).field_m = ((ai) this).field_h.field_C;
            ((ai) this).field_o = ((ai) this).field_h.field_r;
            ((ai) this).field_q = ((ai) this).field_h.field_r;
            ((ai) this).field_j = ((ai) this).field_h.field_A;
            ((ai) this).field_p = ((ai) this).field_h.field_A;
            ((ai) this).field_s = ((ai) this).field_h.field_y;
            ((ai) this).field_r = ((ai) this).field_h.field_y;
            ((ai) this).field_l = ((ai) this).field_h.field_k;
            ((ai) this).field_g = ((ai) this).field_h.field_k;
            ((ai) this).field_i = ((ai) this).field_h.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=FF0000>Lethal</col>. <%0> gains <%col_attack>+1 Attack</col>, <%col_defence>+1 Defence</col> if it wins in combat.";
        field_e = "Select a dragon from the table and click 'Raid' to start a raid.";
        field_k = "From simple pickpockets and highwaymen and up through a variety of brigands, the human cities of the west are full of thieves. This is one of the more competant examples - he is, after all, still alive.";
        field_d = "Order your raider to disarm the trap. <br><br>The trap may be disarmed, the raider may trigger the trap but avoid its effects, or the raider may become trapped.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
    }
}
