/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tib extends eca {
    private String field_f;
    private boolean field_g;
    static mma field_h;
    static byte[] field_i;

    tib(uf param0) {
        super(param0);
        ((tib) this).field_g = false;
    }

    final qrb a(String param0, int param1) {
        tpa var3 = null;
        CharSequence var4 = null;
        qrb stackIn_12_0 = null;
        qrb stackIn_18_0 = null;
        qrb stackIn_27_0 = null;
        qrb stackIn_33_0 = null;
        qrb stackOut_26_0 = null;
        qrb stackOut_25_0 = null;
        qrb stackOut_32_0 = null;
        qrb stackOut_31_0 = null;
        qrb stackOut_11_0 = null;
        qrb stackOut_10_0 = null;
        qrb stackOut_17_0 = null;
        qrb stackOut_16_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (!oc.a(var4, 0)) {
          return cca.field_o;
        } else {
          if (param1 == 16384) {
            if (!param0.equals((Object) (Object) ((tib) this).field_f)) {
              var3 = qua.a(false, param0);
              if (var3 != null) {
                if (null != var3.field_f) {
                  return dsa.field_q;
                } else {
                  L0: {
                    ((tib) this).field_f = param0;
                    ((tib) this).field_g = var3.field_g;
                    if (((tib) this).field_g) {
                      stackOut_26_0 = lea.field_o;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      stackOut_25_0 = cca.field_o;
                      stackIn_27_0 = stackOut_25_0;
                      break L0;
                    }
                  }
                  return stackIn_27_0;
                }
              } else {
                return dsa.field_q;
              }
            } else {
              L1: {
                if (((tib) this).field_g) {
                  stackOut_32_0 = lea.field_o;
                  stackIn_33_0 = stackOut_32_0;
                  break L1;
                } else {
                  stackOut_31_0 = cca.field_o;
                  stackIn_33_0 = stackOut_31_0;
                  break L1;
                }
              }
              return stackIn_33_0;
            }
          } else {
            field_i = null;
            if (!param0.equals((Object) (Object) ((tib) this).field_f)) {
              var3 = qua.a(false, param0);
              if (var3 != null) {
                if (null != var3.field_f) {
                  return dsa.field_q;
                } else {
                  L2: {
                    ((tib) this).field_f = param0;
                    ((tib) this).field_g = var3.field_g;
                    if (((tib) this).field_g) {
                      stackOut_11_0 = lea.field_o;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = cca.field_o;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return dsa.field_q;
              }
            } else {
              L3: {
                if (((tib) this).field_g) {
                  stackOut_17_0 = lea.field_o;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = cca.field_o;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    final void d(byte param0) {
        ((tib) this).field_f = null;
        if (param0 < 7) {
            field_h = null;
        }
    }

    final String b(String param0, int param1) {
        String var3 = null;
        tpa var4 = null;
        CharSequence var5 = null;
        if (param1 == -1) {
          var5 = (CharSequence) (Object) param0;
          var3 = igb.a(var5, (byte) 119);
          if (var3 != null) {
            return var3;
          } else {
            L0: {
              if (!param0.equals((Object) (Object) ((tib) this).field_f)) {
                var4 = qua.a(false, param0);
                if (var4 != null) {
                  if (null == var4.field_f) {
                    ((tib) this).field_g = var4.field_g;
                    ((tib) this).field_f = param0;
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
            if (!((tib) this).field_g) {
              return ks.field_p;
            } else {
              return uc.field_a;
            }
          }
        } else {
          return null;
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
          if (li.field_i) {
            return de.a(param1, 300).field_c;
          } else {
            return ita.a(param1, 7988).field_k;
          }
        } else {
          field_h = null;
          if (li.field_i) {
            return de.a(param1, 300).field_c;
          } else {
            return ita.a(param1, 7988).field_k;
          }
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param0 != -596) {
            field_h = null;
            return ua.a(true, param1, true, param2);
        }
        return ua.a(true, param1, true, param2);
    }

    public static void f(int param0) {
        Object var2 = null;
        if (param0 != 6312) {
          var2 = null;
          int discarded$2 = tib.a(46, (CharSequence) null, 2);
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new mma();
    }
}
