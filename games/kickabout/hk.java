/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends i {
    static int field_F;
    static hd field_I;
    private int field_N;
    private int field_J;
    static int field_L;
    static int[][] field_K;
    static boolean field_G;
    private long field_M;

    public static void g(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          String discarded$2 = hk.a((CharSequence) null, false);
          field_I = null;
          field_K = null;
          return;
        } else {
          field_I = null;
          field_K = null;
          return;
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        if (param1) {
            return null;
        }
        return ma.a((byte) -119, param0, false);
    }

    hk(vc param0, int param1) {
        super(param1, (lv) (Object) param0.field_m);
        String var3 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        L0: {
          L1: {
            ((hk) this).field_M = -1L;
            ((hk) this).field_M = param0.field_a;
            if (!jd.f(-1)) {
              break L1;
            } else {
              if (param0.field_m.field_h.length < -1) {
                stackOut_3_0 = "<br><br>" + mp.field_n;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_2_0 = "";
          stackIn_4_0 = stackOut_2_0;
          break L0;
        }
        var5 = stackIn_4_0;
        var3 = var5;
        if (-20 == param1) {
          ((hk) this).field_N = param0.field_i;
          ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[2]);
          ((hk) this).field_J = 52;
          ((hk) this).a(((hk) this).field_v, ((hk) this).field_t, ((hk) this).field_D, -90, ((hk) this).field_u);
        } else {
          if (param1 == 32) {
            ((hk) this).field_N = param0.field_t;
            ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[2]);
            ((hk) this).field_J = 66;
            ((hk) this).a(((hk) this).field_v, ((hk) this).field_t, ((hk) this).field_D, -90, ((hk) this).field_u);
          } else {
            if (-38 != (param1 ^ -1)) {
              ((hk) this).a(((hk) this).field_v, ((hk) this).field_t, ((hk) this).field_D, -90, ((hk) this).field_u);
            } else {
              ((hk) this).field_N = param0.field_t;
              ((hk) this).field_v = vo.a((byte) -18, ((hk) this).field_v, new String[3]);
              ((hk) this).field_J = 66;
              ((hk) this).a(((hk) this).field_v, ((hk) this).field_t, ((hk) this).field_D, -90, ((hk) this).field_u);
            }
          }
        }
    }

    final void a(int param0, int param1) {
        super.a(82, param1);
        if (!la.a(100)) {
          if (!dg.field_e) {
            if (ds.field_g) {
              return;
            } else {
              if (0 != param1) {
                if (param0 < 60) {
                  field_L = -50;
                  return;
                } else {
                  return;
                }
              } else {
                or.field_d.b(((hk) this).field_J, (byte) 124);
                or.field_d.a(((hk) this).field_M, -1781890008);
                or.field_d.b(-74, ((hk) this).field_N);
                wh discarded$2 = gt.a(true, 128, (byte) 118, 49);
                ((hk) this).field_M = -1L;
                ((wf) (Object) rn.a(-108, 16)).field_H = -1L;
                if (param0 < 60) {
                  field_L = -50;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 2;
        field_K = new int[4][];
        field_K[3] = new int[1];
        field_K[3][0] = 29129;
        field_K[2] = new int[1];
        field_K[0] = new int[1];
        field_K[2][0] = 5356;
        field_K[0][0] = 21033;
        field_K[1] = new int[1];
        field_K[1][0] = 5542;
    }
}
