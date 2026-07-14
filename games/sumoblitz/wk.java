/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends na {
    private nq field_g;
    private String field_e;
    static os field_h;
    static String field_f;
    private boolean field_i;

    wk(dh param0, dh param1) {
        super(param0);
        ((wk) this).field_e = "";
        ((wk) this).field_i = false;
        ((wk) this).field_g = new nq(param0, param1);
    }

    final String a(int param0, String param1) {
        Object var4 = null;
        if (param0 == 0) {
          if (((wk) this).field_g.a((byte) 26, param1) != qr.field_e) {
            if (((wk) this).a((byte) 26, param1) == qr.field_e) {
              return oj.field_b;
            } else {
              return nw.field_h;
            }
          } else {
            return ((wk) this).field_g.a(0, param1);
          }
        } else {
          var4 = null;
          String discarded$4 = ((wk) this).a(-5, (String) null);
          if (((wk) this).field_g.a((byte) 26, param1) != qr.field_e) {
            if (((wk) this).a((byte) 26, param1) == qr.field_e) {
              return oj.field_b;
            } else {
              return nw.field_h;
            }
          } else {
            return ((wk) this).field_g.a(0, param1);
          }
        }
    }

    final gf a(byte param0, String param1) {
        bj var3 = null;
        gf stackIn_7_0 = null;
        gf stackIn_12_0 = null;
        gf stackOut_11_0 = null;
        gf stackOut_10_0 = null;
        gf stackOut_6_0 = null;
        gf stackOut_5_0 = null;
        if (((wk) this).field_g.a(param0, param1) == qr.field_e) {
          return qr.field_e;
        } else {
          if (!param1.equals((Object) (Object) ((wk) this).field_e)) {
            var3 = ov.a(param0 ^ 27, param1);
            if (!var3.a(true)) {
              return kt.field_a;
            } else {
              L0: {
                ((wk) this).field_e = param1;
                ((wk) this).field_i = var3.c(-1);
                if (((wk) this).field_i) {
                  stackOut_11_0 = qe.field_a;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = qr.field_e;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            }
          } else {
            L1: {
              if (((wk) this).field_i) {
                stackOut_6_0 = qe.field_a;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = qr.field_e;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
            wk.b(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new os();
    }
}
