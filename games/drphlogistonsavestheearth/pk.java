/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends ei {
    static int field_s;
    static int field_q;
    private String field_r;
    private boolean field_p;

    pk(kl param0) {
        super(param0);
        ((pk) this).field_p = false;
    }

    final static void e(int param0) {
        int var1 = 0;
        var1 = -27 / ((param0 - -25) / 53);
        if (-71 < (oa.field_b ^ -1)) {
          wk.a(80, 10 + oa.field_b);
          return;
        } else {
          wk.a(80, 80);
          return;
        }
    }

    final vh a(int param0, String param1) {
        og var3 = null;
        CharSequence var4 = null;
        vh stackIn_11_0 = null;
        vh stackIn_17_0 = null;
        vh stackIn_26_0 = null;
        vh stackIn_32_0 = null;
        vh stackOut_25_0 = null;
        vh stackOut_24_0 = null;
        vh stackOut_31_0 = null;
        vh stackOut_30_0 = null;
        vh stackOut_10_0 = null;
        vh stackOut_9_0 = null;
        vh stackOut_16_0 = null;
        vh stackOut_15_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (d.a(-18254, var4)) {
          if (param0 == 8192) {
            if (!param1.equals((Object) (Object) ((pk) this).field_r)) {
              var3 = ng.a(param1, param0 ^ 11774);
              if (var3 != null) {
                if (null != var3.field_g) {
                  return nd.field_P;
                } else {
                  L0: {
                    ((pk) this).field_p = var3.field_b;
                    ((pk) this).field_r = param1;
                    if (!((pk) this).field_p) {
                      stackOut_25_0 = u.field_b;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      stackOut_24_0 = ce.field_e;
                      stackIn_26_0 = stackOut_24_0;
                      break L0;
                    }
                  }
                  return stackIn_26_0;
                }
              } else {
                return nd.field_P;
              }
            } else {
              L1: {
                if (!((pk) this).field_p) {
                  stackOut_31_0 = u.field_b;
                  stackIn_32_0 = stackOut_31_0;
                  break L1;
                } else {
                  stackOut_30_0 = ce.field_e;
                  stackIn_32_0 = stackOut_30_0;
                  break L1;
                }
              }
              return stackIn_32_0;
            }
          } else {
            pk.e(69);
            if (!param1.equals((Object) (Object) ((pk) this).field_r)) {
              var3 = ng.a(param1, param0 ^ 11774);
              if (var3 != null) {
                if (null != var3.field_g) {
                  return nd.field_P;
                } else {
                  L2: {
                    ((pk) this).field_p = var3.field_b;
                    ((pk) this).field_r = param1;
                    if (!((pk) this).field_p) {
                      stackOut_10_0 = u.field_b;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = ce.field_e;
                      stackIn_11_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  return stackIn_11_0;
                }
              } else {
                return nd.field_P;
              }
            } else {
              L3: {
                if (!((pk) this).field_p) {
                  stackOut_16_0 = u.field_b;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = ce.field_e;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              return stackIn_17_0;
            }
          }
        } else {
          return u.field_b;
        }
    }

    final static int d(byte param0) {
        if (param0 != 9) {
            return -67;
        }
        return (int)(1000000000L / ma.field_vb);
    }

    final String a(byte param0, String param1) {
        CharSequence var5 = null;
        String var3 = null;
        og var4 = null;
        if (param0 <= 47) {
            int discarded$0 = pk.d((byte) -100);
            var5 = (CharSequence) (Object) param1;
            var3 = vj.a(true, var5);
            if (var3 != null) {
                return var3;
            }
            if (!(param1.equals((Object) (Object) ((pk) this).field_r))) {
                var4 = ng.a(param1, 3582);
                if (var4 == null) {
                    return null;
                }
                if (var4.field_g != null) {
                    return null;
                }
                ((pk) this).field_r = param1;
                ((pk) this).field_p = var4.field_b;
            }
            if (!(((pk) this).field_p)) {
                return q.field_g;
            }
            return fk.field_r;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        var3 = vj.a(true, var6);
        if (var3 != null) {
            return var3;
        }
        if (!(param1.equals((Object) (Object) ((pk) this).field_r))) {
            var4 = ng.a(param1, 3582);
            if (var4 == null) {
                return null;
            }
            if (var4.field_g != null) {
                return null;
            }
            ((pk) this).field_r = param1;
            ((pk) this).field_p = var4.field_b;
        }
        if (!(((pk) this).field_p)) {
            return q.field_g;
        }
        return fk.field_r;
    }

    final void e(byte param0) {
        ((pk) this).field_r = null;
        if (param0 != -27) {
            ((pk) this).field_p = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
    }
}
