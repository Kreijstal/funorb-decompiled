/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends mk {
    static nc field_n;
    private String field_k;
    static String field_m;
    static boolean field_l;
    static wk[] field_o;
    private di field_q;
    static int field_p;
    private boolean field_j;

    final gu a(int param0, String param1) {
        fo var3 = null;
        gu stackIn_11_0 = null;
        gu stackIn_15_0 = null;
        gu stackOut_14_0 = null;
        gu stackOut_13_0 = null;
        gu stackOut_10_0 = null;
        gu stackOut_9_0 = null;
        if (((kt) this).field_q.a(param0 ^ 0, param1) != rn.field_e) {
          L0: {
            if (!param1.equals((Object) (Object) ((kt) this).field_k)) {
              var3 = dh.a(param1, (byte) 67);
              if (var3.a((byte) -74)) {
                ((kt) this).field_k = param1;
                ((kt) this).field_j = var3.a(17);
                break L0;
              } else {
                return so.field_e;
              }
            } else {
              break L0;
            }
          }
          if (param0 != -3137) {
            L1: {
              ((kt) this).field_q = null;
              if (((kt) this).field_j) {
                stackOut_14_0 = oo.field_g;
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = rn.field_e;
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return (gu) (Object) stackIn_15_0;
          } else {
            L2: {
              if (((kt) this).field_j) {
                stackOut_10_0 = oo.field_g;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                stackOut_9_0 = rn.field_e;
                stackIn_11_0 = stackOut_9_0;
                break L2;
              }
            }
            return (gu) (Object) stackIn_11_0;
          }
        } else {
          return rn.field_e;
        }
    }

    final String a(byte param0, String param1) {
        if (param0 > 89) {
          if (((kt) this).field_q.a(-3137, param1) == rn.field_e) {
            return ((kt) this).field_q.a((byte) 126, param1);
          } else {
            if (((kt) this).a(-3137, param1) == rn.field_e) {
              return hk.field_Ib;
            } else {
              return fu.field_a;
            }
          }
        } else {
          field_n = null;
          if (((kt) this).field_q.a(-3137, param1) == rn.field_e) {
            return ((kt) this).field_q.a((byte) 126, param1);
          } else {
            if (((kt) this).a(-3137, param1) == rn.field_e) {
              return hk.field_Ib;
            } else {
              return fu.field_a;
            }
          }
        }
    }

    public static void g(int param0) {
        field_n = null;
        if (param0 < 91) {
            field_n = null;
            field_o = null;
            field_m = null;
            return;
        }
        field_o = null;
        field_m = null;
    }

    kt(fn param0, fn param1) {
        super(param0);
        ((kt) this).field_k = "";
        ((kt) this).field_j = false;
        ((kt) this).field_q = new di(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Auto-respond to <%0>";
        field_l = false;
    }
}
