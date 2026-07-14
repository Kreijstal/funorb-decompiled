/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends ml {
    static bi field_p;
    static bi field_r;
    static String field_q;
    private go field_n;
    static mp field_s;
    static String field_o;
    static va field_t;

    fj(go param0, go param1) {
        super(param0);
        ((fj) this).field_n = param1;
    }

    final static void a(boolean param0, qr param1) {
        qr var2 = null;
        int var3 = 0;
        qr var4 = null;
        qr var5 = null;
        qr var5_ref = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (qr) (Object) param1.field_M.d(0);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (param0) {
              fj.d(-29);
              param1.field_mb = 0;
              param1.field_w = 0;
              param1.field_db = 0;
              param1.field_gb = 0;
              return;
            } else {
              param1.field_mb = 0;
              param1.field_w = 0;
              param1.field_db = 0;
              param1.field_gb = 0;
              return;
            }
          } else {
            var4.field_mb = 0;
            var4.field_gb = 0;
            var4.field_w = 0;
            var4.field_db = 0;
            var5 = (qr) (Object) param1.field_M.a((byte) -71);
            var5_ref = var5;
            continue L0;
          }
        }
    }

    final String a(boolean param0, String param1) {
        gk var3 = null;
        if (!param0) {
          if (((fj) this).field_n instanceof ki) {
            var3 = ((ki) (Object) ((fj) this).field_n).a((byte) 73);
            if (var3 != null) {
              if (var3.c(-126) == p.field_g) {
                if (param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                  return var3.a((byte) -63);
                } else {
                  return mh.field_a;
                }
              } else {
                return var3.a((byte) -63);
              }
            } else {
              if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                return mh.field_a;
              } else {
                return null;
              }
            }
          } else {
            if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
              return mh.field_a;
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final u b(int param0, String param1) {
        gk var3 = null;
        u stackIn_5_0 = null;
        u stackIn_9_0 = null;
        u stackIn_16_0 = null;
        u stackIn_20_0 = null;
        u stackIn_28_0 = null;
        u stackIn_32_0 = null;
        u stackOut_31_0 = null;
        u stackOut_30_0 = null;
        u stackOut_27_0 = null;
        u stackOut_26_0 = null;
        u stackOut_19_0 = null;
        u stackOut_18_0 = null;
        u stackOut_15_0 = null;
        u stackOut_14_0 = null;
        u stackOut_8_0 = null;
        u stackOut_7_0 = null;
        u stackOut_4_0 = null;
        u stackOut_3_0 = null;
        if (((fj) this).field_n instanceof ki) {
          var3 = ((ki) (Object) ((fj) this).field_n).a((byte) 120);
          if (var3 != null) {
            if (var3.c(param0 + 11321) == p.field_g) {
              if (param0 != -11196) {
                L0: {
                  field_r = null;
                  if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                    stackOut_31_0 = tj.field_b;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = p.field_g;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                    stackOut_27_0 = tj.field_b;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = p.field_g;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return tj.field_b;
            }
          } else {
            if (param0 != -11196) {
              L2: {
                field_r = null;
                if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                  stackOut_19_0 = tj.field_b;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = p.field_g;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                  stackOut_15_0 = tj.field_b;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = p.field_g;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param0 != -11196) {
            L4: {
              field_r = null;
              if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                stackOut_8_0 = tj.field_b;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = p.field_g;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              if (!param1.equals((Object) (Object) ((fj) this).field_n.field_s)) {
                stackOut_4_0 = tj.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = p.field_g;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void d(int param0) {
        field_t = null;
        field_s = null;
        field_r = null;
        int var1 = 92 % ((11 - param0) / 59);
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "To <%0>: ";
        field_o = "VICTORY!";
    }
}
