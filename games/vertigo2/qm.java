/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends cj implements ij {
    private d field_F;
    static ba field_G;
    private d field_E;
    private d field_H;

    public qm() {
        super(0, 0, 476, 225, (ur) null);
        ((qm) this).field_F = new d(pk.field_r, (uf) null);
        ((qm) this).field_E = new d(tc.field_a, (uf) null);
        ((qm) this).field_H = new d(fd.field_o, (uf) null);
        vo var1 = new vo();
        ((qm) this).field_F.field_B = (ur) (Object) var1;
        ((qm) this).field_E.field_B = (ur) (Object) var1;
        ((qm) this).field_H.field_B = (ur) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1234022113;
        ((qm) this).field_E.a(false, -var3 + ((qm) this).field_n >> 945809441, -48 + ((qm) this).field_s + -var2, 30, var4);
        ((qm) this).field_H.a(false, var2 + (-var3 + ((qm) this).field_n >> 148084577) + var4, -var2 + (((qm) this).field_s - 48), 30, var4);
        ((qm) this).field_F.a(false, -var3 + ((qm) this).field_n >> 1595309921, -(var2 * 2) + ((qm) this).field_s - 78, 30, var3);
        ((qm) this).field_E.field_v = (uf) this;
        ((qm) this).field_F.field_v = (uf) this;
        ((qm) this).field_H.field_v = (uf) this;
        ((qm) this).field_F.field_q = ni.field_h;
        ((qm) this).field_H.field_q = he.field_z;
        ((qm) this).c((byte) -30, (iq) (Object) ((qm) this).field_E);
        ((qm) this).c((byte) 113, (iq) (Object) ((qm) this).field_F);
        ((qm) this).c((byte) -29, (iq) (Object) ((qm) this).field_H);
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        if (param1 == 13) {
          if (!super.a(param0, param1 + 0, param2, param3)) {
            if (98 == param2) {
              return ((qm) this).a(32345, param3);
            } else {
              if (param2 == 99) {
                return ((qm) this).b((byte) -124, param3);
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (((qm) this).field_E != param1) {
          if (param1 != ((qm) this).field_F) {
            if (param1 == ((qm) this).field_H) {
              wq.i(0);
              var6 = 21 % ((param2 - -63) / 51);
              return;
            } else {
              var6 = 21 % ((param2 - -63) / 51);
              return;
            }
          } else {
            ff.b((byte) -104);
            var6 = 21 % ((param2 - -63) / 51);
            return;
          }
        } else {
          sd.f((byte) -1);
          var6 = 21 % ((param2 - -63) / 51);
          return;
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -104) {
            return 123;
        }
        return (60 & param0) >> -801510430;
    }

    final static boolean a(int[] param0, String param1, byte param2, int param3, long param4) {
        CharSequence var7 = null;
        aa var6 = null;
        if (param2 < 76) {
            field_G = null;
            if (!(lk.a(1, param4, param1, param3, param0))) {
                return false;
            }
            if ((param3 ^ -1) == -2) {
                param3 = 0;
            }
            ui.field_g = param3;
            ea.field_b = param1;
            var7 = (CharSequence) (Object) param1;
            sm.field_Kb = rc.a(var7, 320);
            ie.field_Nb = param4;
            var6 = ag.a(fo.field_c, mp.field_g, 40, param0, va.field_h);
            hh.a(-42, var6);
            return true;
        }
        if (!(lk.a(1, param4, param1, param3, param0))) {
            return false;
        }
        if ((param3 ^ -1) == -2) {
            param3 = 0;
        }
        ui.field_g = param3;
        ea.field_b = param1;
        CharSequence var8 = (CharSequence) (Object) param1;
        sm.field_Kb = rc.a(var8, 320);
        ie.field_Nb = param4;
        var6 = ag.a(fo.field_c, mp.field_g, 40, param0, va.field_h);
        hh.a(-42, var6);
        return true;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = ((qm) this).field_o - -param2;
        int var6 = ((qm) this).field_t + param3;
        int discarded$0 = qc.field_x.a(kl.field_Jb, var5 - -20, var6 + 20, -40 + ((qm) this).field_n, -50 + ((qm) this).field_s, 16777215, -1, 1, 0, qc.field_x.field_z);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 > -80) {
            field_G = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ba();
    }
}
