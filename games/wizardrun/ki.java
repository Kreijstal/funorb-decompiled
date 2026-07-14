/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pe implements qd {
    static int field_M;
    private pl field_H;
    private pl field_J;
    static wd field_F;
    static int field_I;
    static ui field_E;
    static String field_L;
    private pl field_K;
    static char[] field_G;

    final boolean a(char param0, int param1, byte param2, ub param3) {
        if (!(!super.a(param0, param1, (byte) -105, param3))) {
            return true;
        }
        if (param2 >= -96) {
            ((ki) this).field_J = null;
            if (!(param1 != 98)) {
                return ((ki) this).a((byte) -117, param3);
            }
            if (99 == param1) {
                return ((ki) this).b(param3, 1);
            }
            return false;
        }
        if (!(param1 != 98)) {
            return ((ki) this).a((byte) -117, param3);
        }
        if (!(99 != param1)) {
            return ((ki) this).b(param3, 1);
        }
        return false;
    }

    public ki() {
        super(0, 0, 476, 225, (bf) null);
        ((ki) this).field_K = new pl(qk.field_h, (ce) null);
        ((ki) this).field_H = new pl(v.field_c, (ce) null);
        ((ki) this).field_J = new pl(th.field_b, (ce) null);
        jl var1 = new jl();
        ((ki) this).field_K.field_w = (bf) (Object) var1;
        ((ki) this).field_H.field_w = (bf) (Object) var1;
        ((ki) this).field_J.field_w = (bf) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 66502817;
        ((ki) this).field_H.a(120, -48 + (((ki) this).field_n - var2), 30, var4, ((ki) this).field_r + -var3 >> -1162633919);
        ((ki) this).field_J.a(117, -48 + ((ki) this).field_n - var2, 30, var4, (-var3 + ((ki) this).field_r >> -471601983) - (-var4 - var2));
        ((ki) this).field_K.a(120, ((ki) this).field_n - (78 + 2 * var2), 30, var3, -var3 + ((ki) this).field_r >> -1946047935);
        ((ki) this).field_H.field_s = (ce) this;
        ((ki) this).field_K.field_s = (ce) this;
        ((ki) this).field_J.field_s = (ce) this;
        ((ki) this).field_K.field_p = hb.field_i;
        ((ki) this).field_J.field_p = hf.field_a;
        ((ki) this).a((ub) (Object) ((ki) this).field_H, (byte) 101);
        ((ki) this).a((ub) (Object) ((ki) this).field_K, (byte) 47);
        ((ki) this).a((ub) (Object) ((ki) this).field_J, (byte) 46);
    }

    public static void g(byte param0) {
        field_E = null;
        int var1 = 31 % ((param0 - -23) / 41);
        field_G = null;
        field_F = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((ki) this).field_o - -param0;
        int var6 = ((ki) this).field_l + param3;
        int discarded$0 = gh.field_b.a(ci.field_c, var5 + 20, 20 + var6, ((ki) this).field_r + -40, ((ki) this).field_n + -50, 16777215, -1, 1, 0, gh.field_b.field_M);
        super.a(param0, param1, param2, param3);
    }

    final static void h(byte param0) {
        wi.field_J = false;
        cf.field_i = false;
        jc.a((byte) 79, -1);
        fi.field_y = ej.field_b;
        if (param0 <= 64) {
          ki.g((byte) -56);
          wc.field_j = ej.field_b;
          return;
        } else {
          wc.field_j = ej.field_b;
          return;
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var7 = 0;
        var7 = wizardrun.field_H;
        if (((ki) this).field_H == param1) {
          pc.a(-1);
          if (param0 != -18905) {
            ki.g((byte) 6);
            return;
          } else {
            return;
          }
        } else {
          if (param1 == ((ki) this).field_K) {
            w.b(-1);
            if (param0 == -18905) {
              return;
            } else {
              ki.g((byte) 6);
              return;
            }
          } else {
            if (param1 != ((ki) this).field_J) {
              if (param0 != -18905) {
                ki.g((byte) 6);
                return;
              } else {
                return;
              }
            } else {
              jf.a(55);
              if (param0 == -18905) {
                return;
              } else {
                ki.g((byte) 6);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "This game has been updated! Please reload this page.";
        field_G = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
