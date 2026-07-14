/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends a {
    private el field_m;
    static int field_k;
    static java.math.BigInteger field_p;
    private boolean field_l;
    static dl field_n;
    private String field_j;
    static String[] field_o;
    static String field_r;
    static ib field_q;

    final static void a(boolean param0, int param1) {
        if (param1 > -88) {
            qa.a(true, -68);
            hl.a(false, 24574, param0);
            return;
        }
        hl.a(false, 24574, param0);
    }

    qa(vg param0, vg param1) {
        super(param0);
        ((qa) this).field_j = "";
        ((qa) this).field_l = false;
        ((qa) this).field_m = new el(param0, param1);
    }

    final String a(String param0, boolean param1) {
        if (((qa) this).field_m.a(param0, (byte) -127) == rg.field_f) {
          return ((qa) this).field_m.a(param0, false);
        } else {
          if (((qa) this).a(param0, (byte) -124) == rg.field_f) {
            return wd.field_b;
          } else {
            if (param1) {
              field_n = null;
              return dc.field_l;
            } else {
              return dc.field_l;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_r = null;
        field_o = null;
        field_n = null;
        field_q = null;
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final qf a(String param0, byte param1) {
        ce var3 = null;
        qf stackIn_8_0 = null;
        qf stackIn_13_0 = null;
        qf stackIn_20_0 = null;
        qf stackIn_25_0 = null;
        qf stackOut_24_0 = null;
        qf stackOut_23_0 = null;
        qf stackOut_19_0 = null;
        qf stackOut_18_0 = null;
        qf stackOut_12_0 = null;
        qf stackOut_11_0 = null;
        qf stackOut_7_0 = null;
        qf stackOut_6_0 = null;
        if (((qa) this).field_m.a(param0, (byte) -110) == rg.field_f) {
          return rg.field_f;
        } else {
          if (param1 < -109) {
            if (!param0.equals((Object) (Object) ((qa) this).field_j)) {
              var3 = tg.a(param0, -44);
              if (!var3.a(false)) {
                return db.field_u;
              } else {
                L0: {
                  ((qa) this).field_j = param0;
                  ((qa) this).field_l = var3.a(-15004);
                  if (!((qa) this).field_l) {
                    stackOut_24_0 = rg.field_f;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    stackOut_23_0 = ph.field_g;
                    stackIn_25_0 = stackOut_23_0;
                    break L0;
                  }
                }
                return stackIn_25_0;
              }
            } else {
              L1: {
                if (!((qa) this).field_l) {
                  stackOut_19_0 = rg.field_f;
                  stackIn_20_0 = stackOut_19_0;
                  break L1;
                } else {
                  stackOut_18_0 = ph.field_g;
                  stackIn_20_0 = stackOut_18_0;
                  break L1;
                }
              }
              return stackIn_20_0;
            }
          } else {
            field_k = -73;
            if (!param0.equals((Object) (Object) ((qa) this).field_j)) {
              var3 = tg.a(param0, -44);
              if (!var3.a(false)) {
                return db.field_u;
              } else {
                L2: {
                  ((qa) this).field_j = param0;
                  ((qa) this).field_l = var3.a(-15004);
                  if (!((qa) this).field_l) {
                    stackOut_12_0 = rg.field_f;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = ph.field_g;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                return stackIn_13_0;
              }
            } else {
              L3: {
                if (!((qa) this).field_l) {
                  stackOut_7_0 = rg.field_f;
                  stackIn_8_0 = stackOut_7_0;
                  break L3;
                } else {
                  stackOut_6_0 = ph.field_g;
                  stackIn_8_0 = stackOut_6_0;
                  break L3;
                }
              }
              return stackIn_8_0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 20;
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
