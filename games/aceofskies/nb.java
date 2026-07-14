/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ka {
    static int[][] field_b;
    static dq field_c;

    final static void a(int param0, wl param1) {
        od var7 = null;
        aj var9 = null;
        cs var18 = null;
        cs var20 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        L0: {
          if (null != wl.field_Kb) {
            break L0;
          } else {
            var7 = new od();
            var22 = var7.a(-959081435, 128, 128, 16);
            wl.field_Kb = sf.a(false, param0 + -145, var22);
            break L0;
          }
        }
        L1: {
          if (mq.field_e != null) {
            break L1;
          } else {
            var9 = new aj();
            var23 = var9.a(param0 + -12, 128, 16, 128);
            mq.field_e = sf.a(false, -137, var23);
            break L1;
          }
        }
        if (param0 != 8) {
          L2: {
            field_c = (dq) null;
            var18 = ((wl) param1).field_cc;
            if (!var18.b(true)) {
              break L2;
            } else {
              if (null != ho.field_a) {
                break L2;
              } else {
                var24 = gg.a(8, -93, 16.0f, (ai) (Object) new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                ho.field_a = sf.a(false, -137, var24);
                break L2;
              }
            }
          }
          return;
        } else {
          L3: {
            var20 = ((wl) param1).field_cc;
            if (!var20.b(true)) {
              break L3;
            } else {
              if (null != ho.field_a) {
                break L3;
              } else {
                var25 = gg.a(8, -93, 16.0f, (ai) (Object) new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
                ho.field_a = sf.a(false, -137, var25);
                break L3;
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 10536) {
            wl var3 = (wl) null;
            nb.a(-6, (wl) null);
        }
    }

    nb(wl param0) {
        hl discarded$0 = new hl((fq) null, 5126, 3, 0);
        hl discarded$1 = new hl((fq) null, 5126, 2, 0);
        hl discarded$2 = new hl((fq) null, 5126, 3, 0);
        hl discarded$3 = new hl((fq) null, 5121, 4, 0);
        nn discarded$4 = new nn();
    }

    public static void b(int param0) {
        field_b = (int[][]) null;
        if (param0 < 66) {
            field_c = (dq) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
    }
}
