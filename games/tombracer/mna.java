/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mna {
    static jpa[] field_c;
    static String field_b;
    static int[] field_a;
    static int field_d;

    final static gqa a(byte param0, int param1, int param2, int param3) {
        gqa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        gqa var15 = null;
        gqa var16 = null;
        int stackIn_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        ne.field_d.field_tb.field_J.d(8);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = -1 + ara.field_xb;
        var8 = 116 / ((-27 - param0) / 50);
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= ara.field_xb) {
                L2: {
                  var8 = ne.field_d.field_tb.field_t + (ne.field_d.field_tb.field_O + (-var7 + var6));
                  ne.field_d.field_tb.field_t = ne.field_d.field_tb.field_t - var8;
                  ne.field_d.field_tb.field_T = ne.field_d.field_tb.field_T + var8;
                  if (ce.field_B) {
                    ne.field_d.field_tb.field_t = var7;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!ce.field_B) {
                    break L3;
                  } else {
                    voa.field_v = true;
                    ne.field_d.field_tb.field_T = -ne.field_d.field_tb.field_t + ne.field_d.field_vb.field_t;
                    ne.field_d.field_tb.field_K = 0;
                    ce.field_B = false;
                    break L3;
                  }
                }
                L4: {
                  ne.field_d.field_tb.field_O = var7 - ne.field_d.field_tb.field_t;
                  if (!ni.field_c) {
                    break L4;
                  } else {
                    if (null != wi.field_s) {
                      voa.field_v = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var9 = -ne.field_d.field_tb.field_O - (ne.field_d.field_tb.field_t - ne.field_d.field_vb.field_t);
                  if (!voa.field_v) {
                    break L5;
                  } else {
                    ne.field_d.field_tb.field_K = -ne.field_d.field_tb.field_T + var9;
                    break L5;
                  }
                }
                L6: {
                  ne.field_d.b(true, 0, param1 * param2 * 2, param2);
                  if (var9 != ne.field_d.field_tb.field_K + ne.field_d.field_tb.field_T) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L6;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    break L6;
                  }
                }
                voa.field_v = stackIn_40_0 != 0;
                return var4;
              } else {
                var16 = wea.field_d[var8];
                if (null != var16.field_l) {
                  L7: {
                    ne.field_d.field_tb.b(-125, var16.field_l);
                    var16.field_l.a(var16.field_l.b((byte) 69), param2, -23776, var7, param3);
                    if (-1 == (var16.field_l.field_y ^ -1)) {
                      break L7;
                    } else {
                      var4 = var16;
                      break L7;
                    }
                  }
                  var7 = var7 + param2;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L8: {
              var15 = wea.field_d[var7];
              var10 = 0;
              if (fua.field_g) {
                break L8;
              } else {
                if (var5 >= sd.field_K) {
                  break L8;
                } else {
                  var11_int = gda.a(var15.field_d, -20011);
                  if (var15.a(false) < var11_int) {
                    break L8;
                  } else {
                    L9: {
                      if (var15.field_m) {
                        break L9;
                      } else {
                        if (!qaa.a(2180, var15.field_j)) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var10 = 1;
                    break L8;
                  }
                }
              }
            }
            if (var10 == 0) {
              var15.field_l = null;
              var7--;
              continue L0;
            } else {
              L10: {
                if (var15.field_l == null) {
                  break L10;
                } else {
                  if (ce.field_B) {
                    break L10;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L11: {
                if (var15.field_l == null) {
                  break L11;
                } else {
                  break L11;
                }
              }
              var11 = moa.a(var15, 94);
              var12 = var11 + il.c(var15.field_f);
              var13 = uaa.a((byte) -116, var15);
              var15.field_l = new jea(0L, bn.field_t, var12);
              var6 = var6 + param2;
              var15.field_l.field_ab = ((bn.field_t.field_ab & 16711422) >> -1620649535) + var13 - (8355711 & var13 >> 558816673);
              var15.field_l.field_H = lpa.field_s;
              var15.field_l.field_ib = var13;
              var15.field_l.field_N = -(var13 >> -483807679 & 8355711) + var13 + ((16711422 & bn.field_t.field_N) >> -2007580191);
              var5++;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static g a(int param0, int param1) {
        g[] var2 = null;
        int var3 = 0;
        g var4 = null;
        int var5 = 0;
        g[] var6 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var6 = sja.field_i;
        var2 = var6;
        var3 = param0;
        L0: while (true) {
          if (var6.length > var3) {
            var4 = var6[var3];
            if (var4.field_f != param1) {
              var3++;
              continue L0;
            } else {
              return var4;
            }
          } else {
            return null;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
            mna.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Join <%0>'s game";
        field_a = new int[]{0, 28, 21};
    }
}
