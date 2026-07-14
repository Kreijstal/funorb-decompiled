/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends gn implements dm {
    private String field_K;
    static String field_M;
    static int[] field_N;
    static hl field_L;
    private jb field_R;
    private int[] field_U;
    static boolean[][] field_S;
    private int field_V;
    private ae[] field_O;
    private lk field_T;
    static String field_P;
    static int field_Q;

    public static void h(int param0) {
        if (param0 != 22) {
            ba.a(34);
        }
        field_P = null;
        field_M = null;
        field_N = null;
        field_L = null;
        field_S = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        L0: {
          var2 = TetraLink.field_J;
          if (aa.field_bc.field_c) {
            if ((aa.field_bc.field_a.field_n & 1 << aa.field_bc.field_i) != 0) {
              cd.field_c[18] = wk.field_a;
              break L0;
            } else {
              if (aa.field_bc.field_a.field_n == 0) {
                if ((aa.field_bc.field_m | 1 << aa.field_bc.field_i) == 3) {
                  cd.field_c[18] = fn.field_M;
                  break L0;
                } else {
                  cd.field_c[18] = lh.field_r;
                  break L0;
                }
              } else {
                cd.field_c[18] = ce.field_c;
                break L0;
              }
            }
          } else {
            if ((aa.field_bc.field_a.field_n & 1 << aa.field_bc.field_i) == 0) {
              if (aa.field_bc.field_a.field_n != -1) {
                cd.field_c[18] = tc.field_q;
                break L0;
              } else {
                if (-4 != (aa.field_bc.field_m | 1 << aa.field_bc.field_i)) {
                  cd.field_c[18] = ej.field_w;
                  break L0;
                } else {
                  cd.field_c[18] = qn.field_v;
                  break L0;
                }
              }
            } else {
              cd.field_c[18] = co.field_s;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 1) {
            break L1;
          } else {
            ba.h(20);
            break L1;
          }
        }
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = TetraLink.field_J;
        if (param0 >= 0) {
            ((ba) this).field_K = null;
        }
        for (var6 = 0; var6 < ((ba) this).field_V; var6++) {
            if (param1 == ((ba) this).field_O[var6]) {
                var7 = ((ba) this).field_U[var6];
                if (var7 == -1) {
                    ((ba) this).field_T.r(-128);
                    break;
                }
                t.a(((ba) this).field_U[var6], 0);
                break;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(0, param1, param2, param3);
        int discarded$0 = ((ba) this).field_R.a(((ba) this).field_K, 14 + (param1 + ((ba) this).field_t), ((ba) this).field_w + param2 - -10, ((ba) this).field_F - 28, ((ba) this).field_u, 16777215, -1, param0, 0, ((ba) this).field_R.field_N);
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        if (((ba) this).field_V >= param0) {
            return;
        }
        ae[] var7 = new ae[param0];
        ae[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; ((ba) this).field_V > var5; var5++) {
            var7[var5] = ((ba) this).field_O[var5];
            var4[var5] = ((ba) this).field_U[var5];
        }
        ((ba) this).field_U = var4;
        ((ba) this).field_V = param0;
        ((ba) this).field_O = var3;
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((ba) this).field_V;
        this.b(var4 - -1, 0);
        int var5 = 80 / ((21 - param2) / 48);
        ((ba) this).field_O[var4] = ((ba) this).a((dn) this, -67, param0);
        ((ba) this).field_U[var4] = param1;
    }

    final ae a(dn param0, int param1, String param2) {
        ae var4 = new ae(param2, param0);
        var4.field_H = (kg) (Object) new uj();
        int var5 = -2 + ((ba) this).field_u;
        ((ba) this).a(((ba) this).field_u - -34, 0, 110, 0, ((ba) this).field_F);
        int var6 = 73 / ((param1 - -10) / 32);
        var4.a(30, var5, 122, 7, -14 + ((ba) this).field_F);
        ((ba) this).c((na) (Object) var4, 10);
        return var4;
    }

    final static void a(le param0, int param1) {
        ck.field_bb.a((byte) 63, (hl) (Object) param0);
        if (param1 < 54) {
            field_P = null;
        }
    }

    ba(lk param0, jb param1, String param2) {
        super(0, 0, 288, 0, (kg) null);
        ((ba) this).field_V = 0;
        ((ba) this).field_R = param1;
        ((ba) this).field_K = param2;
        ((ba) this).field_T = param0;
        int var4 = null == ((ba) this).field_K ? 0 : ((ba) this).field_R.b(((ba) this).field_K, 260, ((ba) this).field_R.field_N);
        ((ba) this).a(var4 + 22, 0, 69, 0, 288);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "This game option is not available in rated games.";
        field_P = "Age:";
    }
}
