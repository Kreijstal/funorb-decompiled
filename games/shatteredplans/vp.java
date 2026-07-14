/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vp extends df {
    static int[] field_s;
    static String field_t;
    static int field_r;
    static ar field_o;
    vp field_p;
    vp field_q;

    final static void c(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        wa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -20677) {
            break L0;
          } else {
            var13 = null;
            byte[] discarded$1 = vp.a((String) null, 69);
            break L0;
          }
        }
        var2 = 16711935 & param1;
        lk.a(param0 ^ 27840);
        var3 = param1 & 65280;
        L1: while (true) {
          var4 = tf.a((byte) -92);
          if (tf.a((byte) -92) == null) {
            L2: {
              if (bd.field_A) {
                System.out.println(ms.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var5 = gf.field_b * ui.field_p + var4.field_g;
            if (gf.field_b <= var4.field_g) {
              continue L1;
            } else {
              L3: {
                var6 = 511 & var4.field_e;
                if ((var6 ^ -1) < -257) {
                  var6 = 512 + -var6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var7 = 256 - var6;
                var8 = var4.field_h;
                var9 = var4.field_f;
                if (0 > var4.field_g) {
                  var11 = -var4.field_g - 1;
                  var8 = var8 - var11;
                  var5 = var5 - var4.field_g;
                  var9 = var9 - var11 * var4.field_a;
                  var4.field_g = 0;
                  break L4;
                } else {
                  var10 = gf.field_h[var5];
                  var10 = ((var7 * (16711935 & var10) & -16711936) + (-16711936 & var2 * var6) | (var7 * (var10 & 65280) & 16711680) - -(16711680 & var3 * var6)) >>> 809446280;
                  var5++;
                  gf.field_h[var5] = var10;
                  break L4;
                }
              }
              L5: {
                if (1000 >= var8) {
                  break L5;
                } else {
                  var8 = 1000;
                  break L5;
                }
              }
              L6: {
                if (var8 + var4.field_g <= gf.field_b) {
                  break L6;
                } else {
                  var8 = -var4.field_g + gf.field_b;
                  break L6;
                }
              }
              L7: while (true) {
                var8--;
                if (var8 <= 0) {
                  continue L1;
                } else {
                  L8: {
                    var6 = 511 & var9;
                    if (-257 <= (var6 ^ -1)) {
                      break L8;
                    } else {
                      var6 = 512 + -var6;
                      break L8;
                    }
                  }
                  var10 = gf.field_h[var5];
                  var7 = -var6 + 256;
                  var10 = ((16711680 & var6 * var3) + (var7 * (65280 & var10) & 16711680) | (var2 * var6 & -16711936) + (-16711936 & (16711935 & var10) * var7)) >>> -1813981240;
                  var5++;
                  gf.field_h[var5] = var10;
                  var9 = var9 + var4.field_a;
                  continue L7;
                }
              }
            }
          }
        }
    }

    final void d(boolean param0) {
        if (((vp) this).field_p == null) {
            return;
        }
        ((vp) this).field_p.field_q = ((vp) this).field_q;
        if (!param0) {
            ((vp) this).field_q = null;
        }
        ((vp) this).field_q.field_p = ((vp) this).field_p;
        ((vp) this).field_p = null;
        ((vp) this).field_q = null;
    }

    final static eg a(byte param0, ln param1) {
        oh var2 = null;
        eg var3 = null;
        fs[] var4 = null;
        int var5 = 0;
        fs var6 = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == -69) {
          if (oq.field_a.field_Q != null) {
            var2 = oq.field_a.field_Q.field_a.d(param0 ^ -69);
            L0: while (true) {
              if (var2 != null) {
                L1: {
                  if (!(var2 instanceof eg)) {
                    break L1;
                  } else {
                    var3 = (eg) (Object) var2;
                    if (param1 == var3.field_p) {
                      var4 = var3.field_h;
                      var5 = 0;
                      L2: while (true) {
                        if (var5 < var4.length) {
                          var6 = var4[var5];
                          if (var6 == ho.field_d) {
                            return var3;
                          } else {
                            var5++;
                            continue L2;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var2 = oq.field_a.field_Q.field_a.a((byte) -71);
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void e(byte param0) {
        if (param0 != -21) {
            vp.e((byte) -56);
        }
        field_o = null;
        field_s = null;
        field_t = null;
    }

    final static byte[] a(String param0, int param1) {
        if (param1 != 511) {
            return null;
        }
        return bc.field_d.a(true, param0, "");
    }

    vp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "<%0> HAS WON!";
        field_s = new int[4];
    }
}
