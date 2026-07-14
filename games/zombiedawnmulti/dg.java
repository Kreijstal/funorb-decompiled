/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends se implements in {
    static th field_K;
    private gn field_N;
    private gn field_H;
    static int field_M;
    private gn field_P;
    static boolean field_J;
    static String field_L;
    static String[] field_G;
    static String field_O;
    static String field_I;

    final static void i(int param0) {
        ra.field_o = rg.g(-18799);
        nb.field_a = new vk();
        if (param0 != 4) {
          dg.h(-109);
          io.a(-21113, true, true);
          return;
        } else {
          io.a(-21113, true, true);
          return;
        }
    }

    final static vp a(int param0) {
        if (param0 != 30) {
            field_I = null;
            return bh.field_a;
        }
        return bh.field_a;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((dg) this).field_N != param2) {
          if (param2 != ((dg) this).field_P) {
            if (param2 != ((dg) this).field_H) {
              if (param3 >= -83) {
                field_G = null;
                return;
              } else {
                return;
              }
            } else {
              bo.b(4);
              if (param3 >= -83) {
                field_G = null;
                return;
              } else {
                return;
              }
            }
          } else {
            hb.a(0);
            if (param3 < -83) {
              return;
            } else {
              field_G = null;
              return;
            }
          }
        } else {
          qe.c((byte) 106);
          if (param3 < -83) {
            return;
          } else {
            field_G = null;
            return;
          }
        }
    }

    final static void a(eh param0, int param1) {
        r.field_a = param0;
        if (param1 != -40) {
            field_J = false;
        }
    }

    public static void a(byte param0) {
        field_K = null;
        field_O = null;
        field_I = null;
        field_G = null;
        int var1 = 18 / ((31 - param0) / 43);
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((dg) this).field_y - -param3;
        int var6 = ((dg) this).field_i + param1;
        int discarded$0 = ke.field_h.a(ti.field_H, 20 + var5, var6 - -20, ((dg) this).field_n + -40, ((dg) this).field_w + -50, 16777215, -1, 1, 0, ke.field_h.field_C);
        super.a(param0, param1, param2, param3);
    }

    final static void h(int param0) {
        if (!(rm.field_b == null)) {
            rm.field_b.h();
        }
        if (!(ga.field_u == null)) {
            ga.field_u.h();
        }
        if (param0 > -50) {
            dg.i(87);
            return;
        }
    }

    public dg() {
        super(0, 0, 476, 225, (nl) null);
        ((dg) this).field_P = new gn(en.field_a, (bj) null);
        ((dg) this).field_N = new gn(oq.field_v, (bj) null);
        ((dg) this).field_H = new gn(gf.field_a, (bj) null);
        oq var1 = new oq();
        ((dg) this).field_P.field_h = (nl) (Object) var1;
        ((dg) this).field_N.field_h = (nl) (Object) var1;
        ((dg) this).field_H.field_h = (nl) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 66999905;
        ((dg) this).field_N.b(-var3 + ((dg) this).field_n >> -388906975, -var2 + (-48 + ((dg) this).field_w), 28972, var4, 30);
        ((dg) this).field_H.b((((dg) this).field_n + -var3 >> 280078721) + (var4 - -var2), -48 + (((dg) this).field_w - var2), 28972, var4, 30);
        ((dg) this).field_P.b(((dg) this).field_n + -var3 >> -205126591, -(var2 * 2) + (-78 + ((dg) this).field_w), 28972, var3, 30);
        ((dg) this).field_N.field_A = (bj) this;
        ((dg) this).field_P.field_A = (bj) this;
        ((dg) this).field_P.field_x = qm.field_I;
        ((dg) this).field_H.field_A = (bj) this;
        ((dg) this).field_H.field_x = de.field_a;
        ((dg) this).b((byte) 45, (cf) (Object) ((dg) this).field_N);
        ((dg) this).b((byte) 70, (cf) (Object) ((dg) this).field_P);
        ((dg) this).b((byte) 60, (cf) (Object) ((dg) this).field_H);
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          if (98 != param0) {
            if ((param0 ^ -1) != -100) {
              return false;
            } else {
              return ((dg) this).a(78, param2);
            }
          } else {
            return ((dg) this).a((byte) -1, param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new th();
        field_L = "The '<%0>' setting needs to be changed.";
        field_G = new String[]{"Pupil", "Neophyte", "Battle Master", "Conqueror", "Single-minded", "Bare Limbs", "Human-lover", "Gene Therapy", "Magic Fingers", "Lord of the Castle", "My Precious...", "Gotcha!", "Skin and Bones", "Mutant Strain", "Unattached", "Sire of the Realm", "Pumpkin Studies", "Slaughterer", "Unforgiving", "Behind Enemy Lines", "Barren Ally", "Laborious Student", "Gas Mask", "Journeyman"};
        field_J = false;
        field_O = "Determined";
        field_I = "Remove friend";
    }
}
