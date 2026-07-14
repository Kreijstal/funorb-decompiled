/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends i {
    static kc[] field_L;
    pt field_J;
    static String field_K;
    private boolean field_G;
    static int field_I;
    static r field_H;
    static String field_F;

    bm(pt param0, boolean param1) {
        super(21, (lv) (Object) (!param0.e(-73).c(-2) ? param0.e(-128) : null));
        ((bm) this).field_G = param1 ? true : false;
        ((bm) this).field_J = param0;
        String var6 = qp.a(((bm) this).field_J.f((byte) 37), false, ((bm) this).field_J.b(6));
        ((bm) this).a(var6, ((bm) this).field_t, ((bm) this).field_D, -87, ((bm) this).field_u);
        ((bm) this).field_i[0].field_s = ((bm) this).field_i[0].field_s - 30;
        String var4 = pg.a(false, 21)[1];
        int var5 = 20 + un.field_d.a(var4);
        ((bm) this).field_i[1] = eo.a(var4, 7126504, (hu) (Object) un.field_d, var5, false);
        ((bm) this).field_i[1].field_J = ((bm) this).field_i[0].field_J;
        ((bm) this).field_i[1].field_s = ((bm) this).field_i[0].field_s + (((bm) this).field_i[0].field_q - -20);
    }

    final void a(int param0, int param1) {
        if (param0 >= 60) {
          super.a(62, param1);
          if (!la.a(100)) {
            if (!((bm) this).field_G) {
              L0: {
                ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
                ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
                if (param1 == 1) {
                  jm.a(16, true, -2);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                or.field_d.b(60, (byte) 104);
                ((bm) this).field_J.a((iw) (Object) or.field_d, 5);
                ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
                ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
                if (param1 == 1) {
                  jm.a(16, true, -2);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              ce.field_K.a((gn) (Object) ((bm) this).field_J, 3);
              ((wf) (Object) rn.a(-104, 16)).field_H = -1L;
              if (param1 == 1) {
                jm.a(16, true, -2);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            bm.d(true);
            return 400;
        }
        return 400;
    }

    public static void d(boolean param0) {
        if (param0) {
          bm.d(false);
          field_F = null;
          field_H = null;
          field_L = null;
          field_K = null;
          return;
        } else {
          field_F = null;
          field_H = null;
          field_L = null;
          field_K = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_L = new kc[7];
        for (var0 = 0; -8 < (var0 ^ -1); var0++) {
            field_L[var0] = new kc(256);
        }
        field_K = "Waiting to receive the game state...";
        field_H = new r();
        field_F = "Find opponents";
    }
}
