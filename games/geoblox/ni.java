/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends ee implements pl {
    private String field_K;
    private f field_J;
    private hk[] field_F;
    private int[] field_H;
    private m field_G;
    private int field_D;
    static String field_C;
    static int field_I;

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var6 = Geoblox.field_C;
        if (((ni) this).field_D >= param1) {
            return;
        }
        hk[] var7 = new hk[param1];
        hk[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((ni) this).field_D; var5++) {
            var7[var5] = ((ni) this).field_F[var5];
            var4[var5] = ((ni) this).field_H[var5];
        }
        ((ni) this).field_F = var3;
        ((ni) this).field_H = var4;
        ((ni) this).field_D = param1;
        if (param0 != -11272) {
            ((ni) this).field_G = null;
        }
    }

    final static void a(rh param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        nf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pk var8 = null;
        int var9 = 0;
        pk var10 = null;
        var7 = Geoblox.field_C;
        var8 = new pk(param0.a(param1 + param1, "", "logo.fo3d"));
        var10 = var8;
        var3 = var10.c((byte) 34);
        var10.k(param1 + 8);
        l.field_i = jc.a(var10, true);
        bm.field_l = new nf[var3];
        pi.field_R = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var10.i(-16989);
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var3 <= var9) {
                return;
              } else {
                var5 = bm.field_l[var9];
                var5.a(6, 1, (byte) 89, 6, 6);
                var5.a((byte) -99);
                var6 = new int[]{var5.field_Q - -var5.field_I >> -2078108927, var5.field_H + var5.field_s >> -144591135, var5.field_N + var5.field_F >> 484842465};
                pi.field_R[var9] = var6;
                var5.a(-var6[0], -var6[1], -9121, -var6[2]);
                var9++;
                continue L1;
              }
            }
          } else {
            bm.field_l[var4] = uh.a(var8, (byte) 113);
            var4++;
            continue L0;
          }
        }
    }

    final hk a(int param0, String param1, bb param2) {
        hk var4 = new hk(param1, param2);
        var4.field_q = (dh) (Object) new ml();
        int var5 = param0 + ((ni) this).field_h;
        ((ni) this).a(34 + ((ni) this).field_h, ((ni) this).field_r, (byte) -53, 0, 0);
        var4.a(30, ((ni) this).field_r - 14, (byte) -33, var5, 7);
        ((ni) this).b((byte) -73, (el) (Object) var4);
        return var4;
    }

    ni(f param0, m param1, String param2) {
        super(0, 0, 288, 0, (dh) null);
        ((ni) this).field_D = 0;
        ((ni) this).field_G = param1;
        ((ni) this).field_J = param0;
        ((ni) this).field_K = param2;
        int var4 = null == ((ni) this).field_K ? 0 : ((ni) this).field_G.b(((ni) this).field_K, 260, ((ni) this).field_G.field_o);
        ((ni) this).a(var4 + 22, 288, (byte) -119, 0, 0);
    }

    final static void f(int param0) {
        int var2 = Geoblox.field_C;
        if (param0 != 484842465) {
            ni.f(15);
        }
        ja var3 = (ja) (Object) bh.field_c.g(0);
        while (var3 != null) {
            var3.l(1915952803);
            var3 = (ja) (Object) bh.field_c.d(1);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) 54, param3);
        int discarded$0 = ((ni) this).field_G.a(((ni) this).field_K, ((ni) this).field_v + (param0 - -14), 10 + param1 - -((ni) this).field_m, ((ni) this).field_r - 28, ((ni) this).field_h, 16777215, -1, 0, 0, ((ni) this).field_G.field_o);
        int var5 = 35 / ((param2 - 1) / 43);
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Geoblox.field_C;
        for (var6 = 0; var6 < ((ni) this).field_D; var6++) {
            if (!(param4 != ((ni) this).field_F[var6])) {
                var7 = ((ni) this).field_H[var6];
                if ((var7 ^ -1) == 0) {
                    ((ni) this).field_J.h((byte) -104);
                    break;
                }
                pc.a(((ni) this).field_H[var6], false);
                break;
            }
        }
        if (param1 != -20) {
            ni.a((byte) 87);
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((ni) this).field_D;
        this.c(-11272, var4 + param1);
        ((ni) this).field_F[var4] = ((ni) this).a(-2, param0, (bb) this);
        ((ni) this).field_H[var4] = param2;
    }

    public static void a(byte param0) {
        field_C = null;
        if (param0 >= -19) {
            field_C = null;
        }
    }

    final static nc a(byte[] param0, int param1) {
        if (param0 == null) {
            return null;
        }
        nc var2 = new nc(param0, gh.field_m, md.field_e, rc.field_j, hl.field_K, cm.field_j, mj.field_a);
        kj.c(true);
        if (param1 >= -107) {
            field_C = null;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Create a free account to start using this feature";
    }
}
