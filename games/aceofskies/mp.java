/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends vo {
    static pa field_h;
    static String field_e;
    private boolean field_f;
    static volatile int field_g;
    private String field_i;

    final pt a(String param0, int param1) {
        fr var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        pt stackIn_12_0 = null;
        pt stackIn_18_0 = null;
        pt stackIn_27_0 = null;
        pt stackIn_33_0 = null;
        pt stackOut_26_0 = null;
        pt stackOut_25_0 = null;
        pt stackOut_32_0 = null;
        pt stackOut_31_0 = null;
        pt stackOut_11_0 = null;
        pt stackOut_10_0 = null;
        pt stackOut_17_0 = null;
        pt stackOut_16_0 = null;
        var5 = (CharSequence) param0;
        if (!qf.a(var5, 0)) {
          return bt.field_a;
        } else {
          if (param1 == 8192) {
            if (!param0.equals((Object) (Object) ((mp) this).field_i)) {
              var3 = hg.a(param1 ^ 2147475455, param0);
              if (var3 != null) {
                if (((fr) var3).field_f != null) {
                  return ce.field_t;
                } else {
                  L0: {
                    ((mp) this).field_f = ((fr) var3).field_b;
                    ((mp) this).field_i = param0;
                    if (!((mp) this).field_f) {
                      stackOut_26_0 = bt.field_a;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      stackOut_25_0 = fd.field_a;
                      stackIn_27_0 = stackOut_25_0;
                      break L0;
                    }
                  }
                  return (pt) (Object) stackIn_27_0;
                }
              } else {
                return ce.field_t;
              }
            } else {
              L1: {
                if (!((mp) this).field_f) {
                  stackOut_32_0 = bt.field_a;
                  stackIn_33_0 = stackOut_32_0;
                  break L1;
                } else {
                  stackOut_31_0 = fd.field_a;
                  stackIn_33_0 = stackOut_31_0;
                  break L1;
                }
              }
              return (pt) (Object) stackIn_33_0;
            }
          } else {
            var4 = (String) null;
            String discarded$1 = ((mp) this).a((String) null, (byte) -114);
            if (!param0.equals((Object) (Object) ((mp) this).field_i)) {
              var3 = hg.a(param1 ^ 2147475455, param0);
              if (var3 != null) {
                if (((fr) var3).field_f != null) {
                  return ce.field_t;
                } else {
                  L2: {
                    ((mp) this).field_f = ((fr) var3).field_b;
                    ((mp) this).field_i = param0;
                    if (!((mp) this).field_f) {
                      stackOut_11_0 = bt.field_a;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = fd.field_a;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  return (pt) (Object) stackIn_12_0;
                }
              } else {
                return ce.field_t;
              }
            } else {
              L3: {
                if (!((mp) this).field_f) {
                  stackOut_17_0 = bt.field_a;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = fd.field_a;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              return (pt) (Object) stackIn_18_0;
            }
          }
        }
    }

    mp(bm param0) {
        super(param0);
        ((mp) this).field_f = false;
    }

    public static void c(byte param0) {
        if (param0 != -11) {
            mp.c((byte) -28);
            field_e = null;
            field_h = null;
            return;
        }
        field_e = null;
        field_h = null;
    }

    final void e(int param0) {
        ((mp) this).field_i = null;
        if (param0 >= -86) {
            mp.c((byte) 34);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        fr var4 = null;
        CharSequence var5 = null;
        if (param1 == 72) {
          var5 = (CharSequence) param0;
          var3 = ee.a(var5, 0);
          if (var3 == null) {
            L0: {
              if (!param0.equals((Object) (Object) ((mp) this).field_i)) {
                var4 = hg.a(2147483647, param0);
                if (var4 != null) {
                  if (((fr) var4).field_f == null) {
                    ((mp) this).field_f = ((fr) var4).field_b;
                    ((mp) this).field_i = param0;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                break L0;
              }
            }
            if (!((mp) this).field_f) {
              return tb.field_e;
            } else {
              return dk.field_k;
            }
          } else {
            return var3;
          }
        } else {
          return (String) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading...";
        field_g = 0;
    }
}
