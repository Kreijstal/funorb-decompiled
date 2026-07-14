/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ipa extends ra {
    static kta field_P;
    static String field_N;
    static String field_O;
    static int[] field_M;
    private int field_Q;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            boolean discarded$0 = ((ipa) this).v(-100);
            return true;
        }
        return true;
    }

    final void q(byte param0) {
        super.q(param0);
        ((ipa) this).b(104, 2097152, 2097152);
        ((ipa) this).a((byte) 125, new mka[1]);
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_N = null;
            return true;
        }
        return true;
    }

    final static void s(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        so.n(-16310);
        int var1 = -106 / ((-7 - param0) / 37);
        fla var2 = (fla) (Object) nl.field_f.f(-80);
        while (var2 != null) {
            var2.c(-97);
            if (-1 <= (var2.field_h ^ -1)) {
                bca.a(var2.field_i, (byte) -42);
                var2.p(25);
            }
            var2 = (fla) (Object) nl.field_f.e(107);
        }
    }

    final boolean C(int param0) {
        if (param0 != 1760) {
            return false;
        }
        return true;
    }

    final static boolean a(kea param0, boolean param1, kia param2) {
        if (param1) {
          if (param2 == ska.field_r) {
            if (param0 != baa.field_e) {
              if (tia.field_d == param0) {
                return paa.field_z.field_c;
              } else {
                return laa.field_x.field_c;
              }
            } else {
              return kra.field_a.field_c;
            }
          } else {
            if (param0 == baa.field_e) {
              return nj.field_t.field_c;
            } else {
              if (tia.field_d == param0) {
                return vea.field_c.field_c;
              } else {
                return daa.field_d.field_c;
              }
            }
          }
        } else {
          ipa.D(8);
          if (param2 == ska.field_r) {
            if (param0 != baa.field_e) {
              if (tia.field_d == param0) {
                return paa.field_z.field_c;
              } else {
                return laa.field_x.field_c;
              }
            } else {
              return kra.field_a.field_c;
            }
          } else {
            if (param0 == baa.field_e) {
              return nj.field_t.field_c;
            } else {
              if (tia.field_d == param0) {
                return vea.field_c.field_c;
              } else {
                return daa.field_d.field_c;
              }
            }
          }
        }
    }

    ipa(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((ipa) this).field_Q = 4;
        ((ipa) this).field_Q = param2.b((byte) 44, 4);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((ipa) this).C(8);
            return false;
        }
        return false;
    }

    public static void D(int param0) {
        field_P = null;
        field_M = null;
        field_O = null;
        field_N = null;
        if (param0 != 4) {
            field_O = null;
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var8 = new fsa(param2, param0);
        var8.b((byte) -11, ((ipa) this).field_k, ((ipa) this).field_l);
        var8.h(param1, 0);
        var8.a(1, (byte) -12, true);
        var8.a((byte) -3, 6);
        var8.b((byte) 17, false);
        var8.g(126, 2);
        var8.a((byte) 83, (nv) (Object) new eq(param2, param0));
        ro var5 = ((ipa) this).a((byte) -41, param2, param0);
        var5.a(true, -606738686);
        var5.b(4, true);
        var5.c(((ipa) this).field_Q * 8, -60);
        var8.a((wda) (Object) var5, 0);
        mfa var6 = rm.field_a;
        nq var7 = (nq) (Object) var6.a(16, param1 + 71);
        var7.b(8022, 0);
        var8.a((gr) null, (byte) 124, (dg) (Object) var7);
        return var8;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) -19, ((ipa) this).field_Q, 4);
    }

    final int t(int param0) {
        if (param0 != 8) {
            ((ipa) this).field_Q = 41;
            return 7;
        }
        return 7;
    }

    ipa(la param0, int param1) {
        super(param0, param1);
        ((ipa) this).field_Q = 4;
    }

    final boolean A(int param0) {
        int var2 = 21 / ((0 - param0) / 60);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Tips";
        field_M = new int[8192];
        field_N = "You have declined the invitation.";
    }
}
