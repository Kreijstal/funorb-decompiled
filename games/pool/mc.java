/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc extends sq {
    static int[] field_h;
    static int field_l;
    static kf[] field_j;
    static dd field_k;
    static kl field_e;
    static String field_i;
    static int field_g;
    static uo[][] field_f;

    final static void c(byte param0) {
        int var1 = 0;
        kh.field_Vb.field_Db = 240;
        if (param0 >= -68) {
          return;
        } else {
          kh.field_Vb.field_Fb = 3;
          kh.field_Vb.field_ob = kh.field_Vb.field_F[1].field_A;
          kh.field_Vb.field_eb = 120;
          kh.field_Vb.field_qb = 160;
          kh.field_Vb.field_cb = 0;
          kh.field_Vb.field_gb = 320;
          kh.field_Vb.field_V = kh.field_Vb.field_F[3].field_z;
          var1 = kh.field_Vb.field_I.b(kh.field_Vb.field_nb, -kh.field_Vb.field_F[3].field_z + (kh.field_Vb.field_gb - kh.field_Vb.field_F[5].field_z), 2 + kh.field_Vb.field_I.field_G);
          hk.field_t.field_gb = hk.field_t.field_I.b(hk.field_t.field_nb) + hk.field_t.field_F[3].field_z + hk.field_t.field_F[5].field_z;
          hk.field_t.field_qb = kh.field_Vb.field_F[3].field_z;
          hk.field_t.field_Db = 20;
          hk.field_t.field_eb = var1 + kh.field_Vb.field_F[1].field_A - -3;
          rl.field_b.field_gb = rl.field_b.field_I.b(rl.field_b.field_nb) - (-rl.field_b.field_F[3].field_z - rl.field_b.field_F[5].field_z);
          rl.field_b.field_Db = hk.field_t.field_Db;
          rl.field_b.field_eb = 3 + var1 + kh.field_Vb.field_F[1].field_A;
          rl.field_b.field_qb = -kh.field_Vb.field_F[5].field_z + (kh.field_Vb.field_gb + -rl.field_b.field_gb);
          kh.field_Vb.field_Db = 3 + var1 + (kh.field_Vb.field_F[1].field_A + (hk.field_t.field_Db - -kh.field_Vb.field_F[7].field_A));
          return;
        }
    }

    final boolean a(int param0, byte param1, qe param2) {
        if (param1 != 9) {
            return true;
        }
        return true;
    }

    mc(al param0) {
        super(param0);
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 < 122) {
            boolean discarded$0 = ((mc) this).a(-87, (byte) -91, -37);
            return true;
        }
        return true;
    }

    final boolean f(int param0) {
        if (param0 < 113) {
            ((mc) this).c(55);
            return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = 101 % ((param0 - -79) / 38);
        return 1;
    }

    final int a(qe param0, int param1) {
        int var3 = 118 / ((-32 - param1) / 40);
        return -1;
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            Object var4 = null;
            boolean discarded$0 = ((mc) this).a(-52, (byte) -33, (qe) null);
            return dp.field_k;
        }
        return dp.field_k;
    }

    final boolean c(qe param0, int param1) {
        if (param1 >= -33) {
            field_l = -63;
            return true;
        }
        return true;
    }

    final int a(byte param0) {
        int var2 = -96 / ((param0 - -37) / 60);
        int var3 = ll.field_f;
        if (((mc) this).field_d.d((byte) 85)) {
            var3 = var3 | um.field_c;
        }
        return var3;
    }

    public static void d(byte param0) {
        field_j = null;
        field_k = null;
        field_f = null;
        field_i = null;
        if (param0 > -94) {
            return;
        }
        field_h = null;
        field_e = null;
    }

    final int a(boolean param0) {
        if (param0) {
            return 62;
        }
        return 1;
    }

    final byte b(int param0, int param1) {
        if (-1 == (param0 & 7 ^ -1)) {
          return (byte) -1;
        } else {
          if (param1 != 30554) {
            return (byte) -84;
          } else {
            return (byte)((9 & param0) >> -2023959837);
          }
        }
    }

    final int h(int param0) {
        ((mc) this).field_d.j(96).field_t = true;
        if (param0 != -1) {
            return 77;
        }
        return ll.field_f;
    }

    final int a(int param0) {
        if (param0 != -1) {
            return 98;
        }
        return -1;
    }

    final void c(int param0) {
        if (param0 > -25) {
            boolean discarded$0 = ((mc) this).a(41, 107);
        }
    }

    final dd b(qe param0, int param1) {
        if (param1 != 1) {
            return null;
        }
        return mf.field_n;
    }

    final int i(int param0) {
        if (param0 != 26840) {
            int discarded$0 = ((mc) this).a((byte) 16);
            return 16;
        }
        return 16;
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
            boolean discarded$0 = ((mc) this).f(-106);
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new kf[5];
        field_i = "Only show private chat from my friends and opponents";
    }
}
