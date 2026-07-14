/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    nr[] field_c;
    nr[] field_h;
    static ej field_e;
    sr field_b;
    boolean field_d;
    sr field_j;
    static int[] field_f;
    sr field_g;
    static float[] field_i;
    static float[] field_a;
    static int field_k;

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_f = null;
        if (param0 != 5575) {
            field_f = (int[]) null;
        }
        field_e = null;
    }

    qe(wl param0) {
        int var2 = 0;
        sr var4 = null;
        cs var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        L0: {
          ((qe) this).field_c = null;
          ((qe) this).field_b = null;
          ((qe) this).field_j = null;
          ((qe) this).field_h = null;
          ((qe) this).field_g = null;
          ((qe) this).field_d = ((wl) param0).field_G;
          nb.a(8, param0);
          if (!((qe) this).field_d) {
            ((qe) this).field_h = new nr[16];
            var2 = 0;
            L1: while (true) {
              if (16 <= var2) {
                ((qe) this).field_c = new nr[16];
                var2 = 0;
                L2: while (true) {
                  if (-17 >= (var2 ^ -1)) {
                    break L0;
                  } else {
                    var24 = cs.a(false, var2 * 32768, 32768, mq.field_e);
                    ((qe) this).field_c[var2] = new nr(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                var23 = cs.a(false, var2 * 32768, 32768, wl.field_Kb);
                ((qe) this).field_h[var2] = new nr(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                var2++;
                continue L1;
              }
            }
          } else {
            var20 = rb.a(false, wl.field_Kb, 50);
            ((qe) this).field_j = new sr(param0, 6410, 128, 128, 16, var20, 6410);
            var21 = rb.a(false, mq.field_e, -77);
            ((qe) this).field_g = new sr(param0, 6410, 128, 128, 16, var21, 6410);
            var10 = ((wl) param0).field_cc;
            if (!var10.b(true)) {
              break L0;
            } else {
              L3: {
                var22 = rb.a(false, ho.field_a, -88);
                ((qe) this).field_b = new sr(param0, 6408, 128, 128, 16);
                var4 = new sr(param0, 6409, 128, 128, 16, var22, 6409);
                if (var10.a((byte) 97, ((qe) this).field_b, var4, 2.0f)) {
                  boolean discarded$1 = ((qe) this).field_b.a(false);
                  break L3;
                } else {
                  ((qe) this).field_b.b((byte) -50);
                  ((qe) this).field_b = null;
                  break L3;
                }
              }
              var4.b((byte) -67);
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_f = new int[]{1, 2, 5, 2, 2, 10, 3, 10, 10};
        field_e = new ej(6, 0, 4, 2);
        field_a = new float[16384];
        field_i = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; (var2 ^ -1) > -16385; var2++) {
            field_i[var2] = (float)Math.sin(var0 * (double)var2);
            field_a[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}
