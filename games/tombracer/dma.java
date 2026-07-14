/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dma extends tfa implements na {
    static int[][] field_k;
    static eb field_l;

    public final void b(byte param0) {
        if (param0 <= 32) {
            return;
        }
        super.b((byte) 121);
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }

    dma(kda param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, gpa.field_a, una.field_g, param1 * (param1 * 6), param2);
        int var5 = 0;
        int var7 = 0;
        L0: {
          ((dma) this).field_j.a(true, (iva) this);
          if (!param2) {
            var7 = 0;
            var5 = var7;
            L1: while (true) {
              if (6 <= var7) {
                break L0;
              } else {
                jaggl.OpenGL.glTexImage2Di(34069 + var7, 0, ((dma) this).d(92), param1, param1, 0, waa.a(((dma) this).field_f, 1383), ((dma) this).field_j.field_od, param3[var7], 0);
                var7++;
                continue L1;
              }
            }
          } else {
            var5 = 0;
            L2: while (true) {
              if ((var5 ^ -1) <= -7) {
                break L0;
              } else {
                ((dma) this).a((byte) 99, var5 + 34069, param1, param3[var5], param1);
                var5++;
                continue L2;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != -31784) {
            field_l = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[][]{new int[2], new int[2], new int[2], new int[2]};
    }
}
