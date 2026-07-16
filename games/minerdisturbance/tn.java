/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tn extends hc {
    private lb field_N;
    static boolean field_M;
    static ea[] field_K;
    static boolean field_J;
    private String[] field_L;
    private ta field_I;

    final static boolean a(int param0, int param1) {
        if (param1 != -3236) {
            field_K = null;
        }
        return param0 == (-param0 & param0) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param1 + -((tn) this).field_u;
        int var6 = param2 + -((tn) this).field_t;
        lb var7 = this.b(var6, -2, var5);
        if (var7 != null) {
            if (((tn) this).field_y != null) {
                ((be) (Object) ((tn) this).field_y).a((tn) this, param3, 12278, var7.field_n);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            field_M = false;
        }
        field_K = null;
    }

    String h(int param0) {
        if (((tn) this).field_N == null) {
            return null;
        }
        if (((tn) this).field_L == null) {
            return null;
        }
        if (param0 != -27867) {
            tn.a(-77);
        }
        if (((tn) this).field_N.field_n >= ((tn) this).field_L.length) {
            return null;
        }
        return ((tn) this).field_L[((tn) this).field_N.field_n];
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        L0: {
          L1: {
            var6 = MinerDisturbance.field_ab;
            if (null == ((tn) this).field_L) {
              break L1;
            } else {
              if (param1 >= ((tn) this).field_L.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var8 = new String[1 + param1];
            var4 = var8;
            if (null == ((tn) this).field_L) {
              break L2;
            } else {
              var5 = 0;
              L3: while (true) {
                if (((tn) this).field_L.length <= var5) {
                  break L2;
                } else {
                  var8[var5] = ((tn) this).field_L[var5];
                  var5++;
                  continue L3;
                }
              }
            }
          }
          ((tn) this).field_L = var4;
          break L0;
        }
        L4: {
          ((tn) this).field_L[param1] = param2;
          if (param0 < -9) {
            break L4;
          } else {
            var7 = null;
            ((tn) this).a(-120, 41, (byte) -117, (fe) null);
            break L4;
          }
        }
    }

    private final lb b(int param0, int param1, int param2) {
        lb var4 = null;
        lb var5 = null;
        int var6 = 0;
        L0: {
          var6 = MinerDisturbance.field_ab;
          if (param1 == -2) {
            break L0;
          } else {
            boolean discarded$2 = tn.a(53, 94);
            break L0;
          }
        }
        var4 = (lb) (Object) ((tn) this).field_I.b(82);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (lb) (Object) ((tn) this).field_I.b((byte) 56);
                continue L1;
              } else {
                L3: {
                  if (param2 < var5.field_s) {
                    break L3;
                  } else {
                    if (param0 < var5.field_u) {
                      break L3;
                    } else {
                      if (var5.field_p + var5.field_s <= param2) {
                        break L3;
                      } else {
                        if (var5.field_u + var5.field_o < param0) {
                          break L3;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_v;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, fe param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, (byte) 105, param3);
        ((tn) this).field_N = null;
        if (param2 < 49) {
            lb discarded$0 = this.b(38, 48, -19);
        }
        if (!(!((tn) this).field_x)) {
            var5 = -((tn) this).field_u + (-param1 + nk.field_w);
            var6 = -((tn) this).field_t + -param0 + gb.field_e;
            ((tn) this).field_N = this.b(var6, -2, var5);
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        cf var5 = (cf) (Object) ((tn) this).field_A;
        lb var6 = ((tn) this).field_N;
        if (var6 == null) {
        } else {
            var7 = var5.a(28793, (fe) this, param1);
            var8 = var5.b(100, (fe) this, param2);
            do {
                se.c(var6.field_s + var7 + -2, 2, -2 + var6.field_u + var8, var6.field_p - -2, 2 + var6.field_o);
                var6 = var6.field_v;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        cf var3 = null;
        nf var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        mg var12 = null;
        int var13 = 0;
        int var14 = 0;
        lb var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var16 = MinerDisturbance.field_ab;
        ((tn) this).field_I = new ta();
        var2 = 0;
        var3 = (cf) (Object) ((tn) this).field_A;
        var4 = var3.c(0, (fe) this);
        L0: while (true) {
          var5 = ((tn) this).field_s.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((tn) this).field_s.indexOf(">", var5);
            var6 = ((tn) this).field_s.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((tn) this).field_s.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 39, var5);
            var9 = var4.a((byte) 39, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_f[var11];
                  if (var11 == var8) {
                    stackOut_7_0 = var4.a(var5, (byte) -125);
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = var12.field_d[0];
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var11 == var9) {
                    stackOut_12_0 = var4.a(var2, (byte) -125);
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    if (var12 != null) {
                      stackOut_11_0 = var12.field_d[-1 + var12.field_d.length];
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_13_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new lb(var7, var13, var12.field_h, -var13 + var14, Math.max(var3.a(-89), var12.field_i - var12.field_h));
                  if (var10 == null) {
                    break L4;
                  } else {
                    ((lb) var10).field_v = var15;
                    break L4;
                  }
                }
                var10 = (Object) (Object) var15;
                ((tn) this).field_I.a((byte) 51, (pi) (Object) var15);
                var11++;
                continue L1;
              }
            }
          } else {
            L5: {
              if (param0 <= -52) {
                break L5;
              } else {
                ((tn) this).a((byte) 82);
                break L5;
              }
            }
            return;
          }
        }
    }

    tn(String param0, ad param1) {
        super(param0, (rm) null);
        ((tn) this).field_N = null;
        ((tn) this).field_A = param1;
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((tn) this).a(((cf) (Object) ((tn) this).field_A).b(63, (fe) this), -73, param0, param1, param3);
        if (param2 != 32088) {
            ((tn) this).field_L = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, -97, param2, param3, param4);
        ((tn) this).a((byte) -107);
        if (param1 > -33) {
            lb discarded$0 = this.b(6, -124, -71);
        }
    }

    final static void c(byte param0) {
        int var1 = -9 / ((param0 - 56) / 37);
        ng.a((byte) -99);
        if (!(ef.field_c == null)) {
            ci.a(ef.field_c, 0);
        }
        bf.c(109);
        ll.a(-118);
        bl.a(true);
        if (ob.l(-1)) {
            sn.field_c.d((byte) -75, 1);
            bk.a((byte) 83, 0);
        }
        si.a(-126);
    }

    boolean a(fe param0, int param1) {
        if (param1 < 119) {
            ((tn) this).field_N = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = false;
    }
}
