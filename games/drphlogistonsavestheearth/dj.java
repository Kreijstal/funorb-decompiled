/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends pj implements ke {
    private int field_J;
    private hf[] field_Q;
    static int field_N;
    private int[] field_M;
    private String field_L;
    static int field_K;
    private ma field_P;
    private rf field_O;

    dj(ma param0, rf param1, String param2) {
        super(0, 0, 288, 0, (cg) null);
        ((dj) this).field_J = 0;
        ((dj) this).field_P = param0;
        ((dj) this).field_O = param1;
        ((dj) this).field_L = param2;
        int var4 = null == ((dj) this).field_L ? 0 : ((dj) this).field_O.a(((dj) this).field_L, 260, ((dj) this).field_O.field_x);
        ((dj) this).a(0, var4 + 22, 0, 16535, 288);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(((dj) this).field_J < param0)) {
            return;
        }
        if (param1 != -38) {
            ((dj) this).field_Q = null;
        }
        hf[] var7 = new hf[param0];
        hf[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < ((dj) this).field_J; var5++) {
            var7[var5] = ((dj) this).field_Q[var5];
            var4[var5] = ((dj) this).field_M[var5];
        }
        ((dj) this).field_M = var4;
        ((dj) this).field_Q = var3;
        ((dj) this).field_J = param0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((dj) this).field_O.a(((dj) this).field_L, param0 - (-((dj) this).field_o + -14), ((dj) this).field_m + (param3 - -10), ((dj) this).field_w - 28, ((dj) this).field_k, 16777215, -1, 0, 0, ((dj) this).field_O.field_x);
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        L0: {
          var5 = param2 * 5;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        if (!param3) {
          L1: {
            if (param0 < var5) {
              var5 = param0;
              break L1;
            } else {
              break L1;
            }
          }
          wj.f(-var5 + 311, param4, 18 + 2 * var5, param1, 13875857, 15987691);
          wj.e(-var5 + 311, param4, 2 * (var5 + 9), 0, 25);
          wj.e(-var5 + 311, param4 + param1, var5 * 2 - -18, 0, 25);
          ek.field_m.a(0, -10 + param4, -var5 + 253, ek.field_m.field_c);
          ek.field_m.a(388 + var5, param4 - 10, 253, ek.field_m.field_c);
          ek.field_m.a(0, -70 + (param1 + param4), 253 + -var5, ek.field_m.field_c);
          ek.field_m.a(388 + var5, -70 + (param4 + param1), 261, ek.field_m.field_c);
          t.field_a.a(253 - var5, -10 + param4);
          bb.field_b.a(var5 + 388 - la.field_a.field_h, -10 + param4);
          la.field_a.a(-var5 + 253, -51 + param4 - -param1);
          ri.field_o.a(-ri.field_o.field_h + var5 + 388, -51 + param4 + param1);
          cl.field_t.a(-var5 + 253, 54 + param4, cl.field_t.field_h, param1 - 105);
          tb.field_d.a(-la.field_a.field_h + 388 - -var5, 54 + param4, cl.field_t.field_h, param1 + -105);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        nl var4 = (nl) (Object) gf.field_A.h(-11151);
        if (param0) {
            field_N = -49;
        }
        while (var4 != null) {
            fc.a(-105, var4, param1);
            var4 = (nl) (Object) gf.field_A.e(0);
        }
        h var5 = (h) (Object) eg.field_c.h(-11151);
        while (var5 != null) {
            bj.a(param1, -81, var5);
            var5 = (h) (Object) eg.field_c.e(0);
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param2) {
            this.a(37, (byte) -128);
        }
        for (var6 = 0; ((dj) this).field_J > var6; var6++) {
            if (param3 == ((dj) this).field_Q[var6]) {
                var7 = ((dj) this).field_M[var6];
                if (0 == (var7 ^ -1)) {
                    ((dj) this).field_P.d(true);
                    break;
                }
                sf.a(((dj) this).field_M[var6], 11649);
                break;
            }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4 = ((dj) this).field_J;
        if (param0) {
            ((dj) this).a(-94, -80, (byte) -32, 127);
        }
        this.a(var4 + 1, (byte) -38);
        ((dj) this).field_Q[var4] = ((dj) this).a(param1, param0, (fd) this);
        ((dj) this).field_M[var4] = param2;
    }

    final hf a(String param0, boolean param1, fd param2) {
        hf var4 = new hf(param0, param2);
        var4.field_l = (cg) (Object) new ie();
        if (param1) {
            return null;
        }
        int var5 = -2 + ((dj) this).field_k;
        ((dj) this).a(0, 34 + ((dj) this).field_k, 0, 16535, ((dj) this).field_w);
        var4.a(var5, 30, 7, 16535, -14 + ((dj) this).field_w);
        ((dj) this).b((vg) (Object) var4, (byte) 102);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = -1;
    }
}
