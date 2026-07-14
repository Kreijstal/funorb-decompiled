/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends java.awt.Canvas {
    static byte[] field_f;
    static ed field_a;
    static int field_h;
    static int field_c;
    private java.awt.Component field_e;
    static ci[] field_d;
    static rk field_g;
    static String[] field_b;

    final static pm a(byte[] param0, int param1) {
        pm var2 = null;
        if (param1 == 127) {
          if (param0 == null) {
            return null;
          } else {
            var2 = new pm(param0, be.field_a, a.field_c, wm.field_b, b.field_c, uh.field_r, vk.field_d);
            ch.k(param1 + 4210625);
            return var2;
          }
        } else {
          field_a = null;
          if (param0 == null) {
            return null;
          } else {
            var2 = new pm(param0, be.field_a, a.field_c, wm.field_b, b.field_c, uh.field_r, vk.field_d);
            ch.k(param1 + 4210625);
            return var2;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        b.field_d = param4;
        fd.field_n = param2;
        rm.field_S = param1;
        int var5 = -117 % ((param0 - 0) / 54);
        vh.field_c = param3;
    }

    g(java.awt.Component param0) {
        ((g) this).field_e = param0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -20905) {
            return;
        }
        field_b = null;
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static lm a(byte param0, int param1) {
        lm var2 = null;
        double var3 = 0.0;
        byte[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        var2 = new lm(22050, param1);
        var3 = 6.283185307179586 / (double)param1;
        var5 = var2.field_m;
        if (param0 != -34) {
          return null;
        } else {
          var6 = param1 + -1;
          L0: while (true) {
            if ((var6 ^ -1) > -1) {
              return var2;
            } else {
              var5[var6] = (byte)(int)(mn.a((double)var6 * var3, 2278) * 127.0);
              var6--;
              continue L0;
            }
          }
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        if (ah.a(param2, (byte) -29)) {
          return false;
        } else {
          if (!pd.a(param2, (byte) 94)) {
            if (param0 >= 8) {
              if (!gl.a(0, param2)) {
                if (0 != param1.length()) {
                  if (!ml.a(param1, param2, 0)) {
                    if (ma.a(param1, -123, param2)) {
                      return false;
                    } else {
                      L0: {
                        if (oc.a(param2, -122, param1)) {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          break L0;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L0;
                        }
                      }
                      return stackIn_28_0 != 0;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              field_d = null;
              if (!gl.a(0, param2)) {
                if (0 != param1.length()) {
                  if (!ml.a(param1, param2, 0)) {
                    if (!ma.a(param1, -123, param2)) {
                      if (!oc.a(param2, -122, param1)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1) {
          L0: {
            field_d = null;
            if (param1 < 2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 < 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((g) this).field_e.update(param0);
    }

    public final void paint(java.awt.Graphics param0) {
        ((g) this).field_e.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_b = new String[]{"All scores", "My scores", "Best each"};
    }
}
