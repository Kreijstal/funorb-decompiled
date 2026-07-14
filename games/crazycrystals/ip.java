/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip implements wo {
    static String field_b;
    private int field_c;
    private int field_a;
    private vc field_f;
    private int field_h;
    private int field_e;
    private int field_g;
    private int field_d;

    public static void a(byte param0) {
        if (param0 >= -81) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dq var12 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          var11 = CrazyCrystals.field_B;
          if (!(param3 instanceof dq)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var12 = (dq) (Object) stackIn_3_0;
        if (!param1) {
          L1: {
            if (var12 == null) {
              break L1;
            } else {
              break L1;
            }
          }
          kh.f(param3.field_r + param2, param0 + param3.field_j, param3.field_g, param3.field_f, ((ip) this).field_g);
          var7 = -(2 * var12.field_E) + param3.field_g;
          var8 = param2 - (-param3.field_r + -var12.field_E);
          var9 = param0 + (param3.field_j - -var12.field_J);
          kh.e(var8, var9, var7 + var8, var9, ((ip) this).field_a);
          var10 = var12.e((byte) -49) + -1;
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((ip) this).field_f != null) {
                ((ip) this).field_f.c(var12.field_o, var8 - -(var7 / 2), ((ip) this).field_f.field_y + var9 + var12.field_J, ((ip) this).field_h, ((ip) this).field_e);
                return;
              } else {
                return;
              }
            } else {
              kh.b(var12.a(var10, 6) * var7 / var12.h(-1) + var8, var9, ((ip) this).field_c, ((ip) this).field_d);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        hl.field_g = 0;
        mb.field_f = h.field_b;
        ue.field_a = 0;
        wn.field_b = 0;
        bc.field_f = new jh(2);
        bc.field_f.a((byte) 41, param1, og.a(param0, bm.field_h, qh.field_i), -1);
    }

    final static void a(int param0, dl[] param1, int param2, int param3, int param4, int param5, int param6) {
        qc.a(param0, param6, param3, param1, param5, param2, param4);
    }

    ip(vc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ip) this).field_a = param3;
        ((ip) this).field_g = param4;
        ((ip) this).field_f = param0;
        ((ip) this).field_d = param6;
        ((ip) this).field_h = param1;
        ((ip) this).field_c = param5;
        ((ip) this).field_e = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Just play";
    }
}
