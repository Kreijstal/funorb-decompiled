/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends ah {
    static hh field_p;
    private boolean field_n;
    static ee field_q;
    private String field_s;
    static int[] field_o;
    static n field_r;

    kf(ul param0) {
        super(param0);
        ((kf) this).field_n = false;
    }

    final void g(int param0) {
        ((kf) this).field_s = null;
        if (param0 != 22186) {
            Object var3 = null;
            String discarded$0 = ((kf) this).a((byte) -126, (String) null);
        }
    }

    final rf a(int param0, String param1) {
        lm var3 = null;
        CharSequence var4 = null;
        rf stackIn_12_0 = null;
        rf stackIn_18_0 = null;
        rf stackIn_27_0 = null;
        rf stackIn_33_0 = null;
        rf stackOut_26_0 = null;
        rf stackOut_25_0 = null;
        rf stackOut_32_0 = null;
        rf stackOut_31_0 = null;
        rf stackOut_11_0 = null;
        rf stackOut_10_0 = null;
        rf stackOut_17_0 = null;
        rf stackOut_16_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (!tg.a(87, var4)) {
          return ob.field_a;
        } else {
          if (param0 == -1) {
            if (!param1.equals((Object) (Object) ((kf) this).field_s)) {
              var3 = of.a(122, param1);
              if (var3 != null) {
                if (null != var3.field_f) {
                  return ug.field_c;
                } else {
                  L0: {
                    ((kf) this).field_n = var3.field_a;
                    ((kf) this).field_s = param1;
                    if (!((kf) this).field_n) {
                      stackOut_26_0 = ob.field_a;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      stackOut_25_0 = df.field_h;
                      stackIn_27_0 = stackOut_25_0;
                      break L0;
                    }
                  }
                  return stackIn_27_0;
                }
              } else {
                return ug.field_c;
              }
            } else {
              L1: {
                if (!((kf) this).field_n) {
                  stackOut_32_0 = ob.field_a;
                  stackIn_33_0 = stackOut_32_0;
                  break L1;
                } else {
                  stackOut_31_0 = df.field_h;
                  stackIn_33_0 = stackOut_31_0;
                  break L1;
                }
              }
              return stackIn_33_0;
            }
          } else {
            field_p = null;
            if (!param1.equals((Object) (Object) ((kf) this).field_s)) {
              var3 = of.a(122, param1);
              if (var3 != null) {
                if (null != var3.field_f) {
                  return ug.field_c;
                } else {
                  L2: {
                    ((kf) this).field_n = var3.field_a;
                    ((kf) this).field_s = param1;
                    if (!((kf) this).field_n) {
                      stackOut_11_0 = ob.field_a;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = df.field_h;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  return stackIn_12_0;
                }
              } else {
                return ug.field_c;
              }
            } else {
              L3: {
                if (!((kf) this).field_n) {
                  stackOut_17_0 = ob.field_a;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = df.field_h;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              return stackIn_18_0;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (-1 == (param1 ^ -1)) {
          return param2;
        } else {
          if (param1 == 1) {
            return param2;
          } else {
            if (param1 == -3) {
              return 100 * param2;
            } else {
              if (param0 > 5) {
                if (-4 == param1) {
                  return param2 * 100;
                } else {
                  return param2;
                }
              } else {
                return 107;
              }
            }
          }
        }
    }

    final static om a(byte param0, int param1) {
        om[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        om[] var6 = null;
        var5 = EscapeVector.field_A;
        var6 = vh.e(-91);
        var2 = var6;
        var3 = 2 % ((3 - param0) / 49);
        var4 = 0;
        L0: while (true) {
          if (var6.length > var4) {
            if (param1 != var6[var4].field_f) {
              var4++;
              continue L0;
            } else {
              return var6[var4];
            }
          } else {
            return null;
          }
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        int var4 = 0;
        lm var5 = null;
        CharSequence var6 = null;
        var6 = (CharSequence) (Object) param1;
        var3 = ok.a(0, var6);
        var4 = 4 / ((param0 - 10) / 51);
        if (var3 == null) {
          L0: {
            if (!param1.equals((Object) (Object) ((kf) this).field_s)) {
              var5 = of.a(122, param1);
              if (var5 != null) {
                if (var5.field_f == null) {
                  ((kf) this).field_n = var5.field_a;
                  ((kf) this).field_s = param1;
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
          if (!((kf) this).field_n) {
            return vn.field_b;
          } else {
            return fd.field_b;
          }
        } else {
          return var3;
        }
    }

    public static void c(byte param0) {
        field_q = null;
        field_r = null;
        if (param0 != 0) {
          field_q = null;
          field_p = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_o = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
        field_q = new ee("email");
    }
}
