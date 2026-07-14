/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends mc {
    int field_H;
    ng field_B;
    int field_C;
    int field_n;
    wf field_y;
    int field_D;
    int field_J;
    int field_s;
    ee field_I;
    int field_E;
    int field_G;
    int field_x;
    int field_A;
    static go field_z;
    int field_p;
    int field_r;
    int field_F;
    int field_o;
    lm field_q;
    int field_u;
    int field_v;
    static String field_w;
    int field_t;

    final void a(int param0) {
        ((oc) this).field_B = null;
        ((oc) this).field_q = null;
        ((oc) this).field_I = null;
        ((oc) this).field_y = null;
        int var2 = -115 / ((15 - param0) / 40);
    }

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        if (vd.field_a < 10) {
          L0: {
            var3 = 0;
            if (ja.field_h) {
              ja.field_h = false;
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          rh.a(th.field_e, ai.c((byte) -63), vi.a(-31307), (byte) 84, var3 != 0);
          if (param2 != 32511) {
            oc.b((byte) 26);
            return;
          } else {
            return;
          }
        } else {
          if (!me.a((byte) -99)) {
            ra.a();
            ef.a(320, 240, -109);
            bo.a(0, 0, param0, -2);
            if (param2 != 32511) {
              oc.b((byte) 26);
              return;
            } else {
              return;
            }
          } else {
            if (fn.field_R == 0) {
              lg.a(param1, 1, false);
              bo.a(0, 0, param0, -2);
              if (param2 == 32511) {
                return;
              } else {
                oc.b((byte) 26);
                return;
              }
            } else {
              kf.a(-8129, param0);
              if (param2 == 32511) {
                return;
              } else {
                oc.b((byte) 26);
                return;
              }
            }
          }
        }
    }

    final static oh[] a(String param0, boolean param1, ah param2, String param3) {
        oh[] var4 = null;
        oh[] var5 = null;
        var5 = bf.a((byte) -117, param2, param3, param0);
        var4 = var5;
        var5[3].field_F = var5[3].field_E;
        var5[1].field_t = var5[1].field_u;
        var5[5].field_F = var5[5].field_E;
        var5[7].field_t = var5[7].field_u;
        if (!param1) {
          field_w = null;
          return var4;
        } else {
          return var4;
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_z = null;
            field_z = null;
            field_w = null;
            return;
        }
        field_z = null;
        field_w = null;
    }

    final static void b(byte param0) {
        String var1 = null;
        String var2 = null;
        if (param0 < 61) {
          L0: {
            field_w = null;
            if (null == ll.field_t) {
              break L0;
            } else {
              var2 = ll.field_t;
              var1 = var2;
              go.a((byte) -105, sk.a(new String[1], lc.field_f, 122));
              ll.field_t = null;
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null == ll.field_t) {
              break L1;
            } else {
              var2 = ll.field_t;
              var1 = var2;
              go.a((byte) -105, sk.a(new String[1], lc.field_f, 122));
              ll.field_t = null;
              break L1;
            }
          }
          return;
        }
    }

    oc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new go();
        field_w = "Waiting for sound effects";
    }
}
