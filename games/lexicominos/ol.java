/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends tj {
    static bi field_l;
    private boolean field_o;
    static String field_n;
    private String field_m;
    static String field_p;

    ol(rl param0) {
        super(param0);
        ((ol) this).field_o = false;
    }

    final sc a(int param0, String param1) {
        mb var3 = null;
        CharSequence var4 = null;
        sc stackIn_12_0 = null;
        sc stackIn_16_0 = null;
        sc stackOut_15_0 = null;
        sc stackOut_14_0 = null;
        sc stackOut_11_0 = null;
        sc stackOut_10_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (bd.a(var4, 3)) {
          L0: {
            if (param1.equals((Object) (Object) ((ol) this).field_m)) {
              break L0;
            } else {
              var3 = ta.a(250, param1);
              if (var3 != null) {
                if (null == var3.field_e) {
                  ((ol) this).field_m = param1;
                  ((ol) this).field_o = var3.field_c;
                  break L0;
                } else {
                  return be.field_q;
                }
              } else {
                return be.field_q;
              }
            }
          }
          if (param0 != 0) {
            L1: {
              ((ol) this).field_o = false;
              if (((ol) this).field_o) {
                stackOut_15_0 = rh.field_p;
                stackIn_16_0 = stackOut_15_0;
                break L1;
              } else {
                stackOut_14_0 = ni.field_b;
                stackIn_16_0 = stackOut_14_0;
                break L1;
              }
            }
            return stackIn_16_0;
          } else {
            L2: {
              if (((ol) this).field_o) {
                stackOut_11_0 = rh.field_p;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              } else {
                stackOut_10_0 = ni.field_b;
                stackIn_12_0 = stackOut_10_0;
                break L2;
              }
            }
            return stackIn_12_0;
          }
        } else {
          return ni.field_b;
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        mb var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        var3 = ea.a(var6, param0 ^ 125);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (!param1.equals((Object) (Object) ((ol) this).field_m)) {
              var4 = ta.a(250, param1);
              if (var4 != null) {
                if (var4.field_e == null) {
                  ((ol) this).field_m = param1;
                  ((ol) this).field_o = var4.field_c;
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
          if (!((ol) this).field_o) {
            return nh.field_b;
          } else {
            if (param0 != -126) {
              var5 = null;
              sc discarded$2 = ((ol) this).a(9, (String) null);
              return mh.field_D;
            } else {
              return mh.field_D;
            }
          }
        }
    }

    final void e(int param0) {
        ((ol) this).field_m = null;
        if (param0 <= 79) {
            ol.c(false);
        }
    }

    public static void c(boolean param0) {
        field_l = null;
        if (param0) {
            return;
        }
        field_p = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bi();
        field_p = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
