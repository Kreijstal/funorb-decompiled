/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gea {
    static String field_c;
    private int[][] field_b;
    private boolean field_a;

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -4075) {
          L0: {
            L1: {
              if (((gea) this).field_b == null) {
                break L1;
              } else {
                if (((gea) this).field_b.length != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < ((gea) this).field_b.length; var2++) {
            ((gea) this).field_b[var2][0] = -((gea) this).field_b[var2][0];
        }
        if (!param0) {
            field_c = null;
        }
    }

    final static void a(int param0, cn param1, il param2) {
        int var3 = 0;
        br var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        var3 = bg.field_t;
        rua.field_gb = new jea(0L, (jea) null);
        if (param1 != null) {
          param1.field_j = 0;
          param1.field_g = false;
          taa.field_g = new nc(var3, param1, param1);
          qu.field_a = new tr(var3, param1, param1, (pp) (Object) new gha());
          var4 = eka.d((byte) 86);
          if (var4 == null) {
            var11 = null;
            ssa.a("QC2", (byte) 122, (Throwable) null);
            return;
          } else {
            vp.a(-1, var4);
            var12 = null;
            oka.field_w = ow.a(1127256, 1513239, 1513239, 0, (il) null, 2245737, 4020342, 65793, 65793, 5138823, 8947848, 65793, (byte) -78);
            uka.field_M = ow.a(0, 0, 0, 16764006, param2, 0, param0, 0, 0, 0, 0, 0, (byte) -81);
            tg.field_c = ow.a(0, 0, 0, 16777215, param2, 0, 0, 0, 0, 0, 0, 0, (byte) -123);
            var5 = bea.field_g;
            var6 = bea.field_a;
            var16 = bea.field_l;
            gfa.field_j = new iu(10, 14);
            gfa.field_j.c();
            var8 = 2;
            L0: while (true) {
              if (-8 >= (var8 ^ -1)) {
                bea.a(var16, var5, var6);
                cia.field_g = qla.a(true, uka.field_M, oka.field_w, var4, tg.field_c);
                rua.field_gb.field_J = new vna();
                return;
              } else {
                bea.f(var8, var8 - -1, -(var8 << -1418171807) + 14, 16777215);
                var8++;
                continue L0;
              }
            }
          }
        } else {
          var10 = null;
          ssa.a("QC1", (byte) 123, (Throwable) null);
          return;
        }
    }

    public gea() {
        this(new int[0][]);
    }

    final int[][] c(int param0) {
        int var2 = 84 % ((param0 - 85) / 34);
        return ((gea) this).field_b;
    }

    final boolean a(byte param0) {
        if (param0 != 21) {
            ((gea) this).a(false, -22);
        }
        return ((gea) this).field_a;
    }

    final void a(boolean param0, int param1) {
        ((gea) this).field_a = param0 ? true : false;
        if (param1 != 1) {
            ((gea) this).field_a = true;
        }
    }

    gea(int[][] param0) {
        ir discarded$0 = new ir();
        ((gea) this).field_b = param0;
    }

    gea(int param0, kh param1) {
        int var4 = 0;
        ir discarded$0 = new ir();
        int var3 = param1.b((byte) 44, 4);
        ((gea) this).field_b = new int[var3][2];
        for (var4 = 0; var3 > var4; var4++) {
            ((gea) this).field_b[var4][0] = bla.a(true, 12, param1.b((byte) 44, 12)) << -346648048;
            ((gea) this).field_b[var4][1] = bla.a(true, 12, param1.b((byte) 44, 12)) << -1187278480;
        }
        if (11 <= param0) {
            ((gea) this).field_a = -2 == (param1.b((byte) 44, 1) ^ -1) ? true : false;
        }
    }

    final void a(kh param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        param0.a((byte) 20, ((gea) this).field_b.length, 4);
        for (var3 = param1; var3 < ((gea) this).field_b.length; var3++) {
            param0.a((byte) -128, dqa.a(true, ((gea) this).field_b[var3][0] >> -1857086288, 12), 12);
            param0.a((byte) -125, dqa.a(true, ((gea) this).field_b[var3][1] >> 1748467888, 12), 12);
        }
        param0.a((byte) 74, !((gea) this).field_a ? 0 : 1, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Confirm Password: ";
    }
}
