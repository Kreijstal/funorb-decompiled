/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends l {
    static km field_n;
    int field_q;
    int field_l;
    static int[] field_g;
    int field_o;
    static mg field_h;
    static String field_i;
    int field_p;
    int field_m;
    static double[] field_k;
    int field_j;

    public static void a(int param0) {
        field_g = null;
        field_i = null;
        if (param0 != 8355711) {
            field_h = null;
        }
        field_h = null;
        field_n = null;
        field_k = null;
    }

    final static cj a(int param0, int param1, int param2, int param3) {
        cj var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cj var8_ref_cj = null;
        int var9 = 0;
        cj var9_ref_cj = null;
        int var10_int = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          if (param0 == -1403) {
            break L0;
          } else {
            cj discarded$1 = da.a(100, 27, 28, 13);
            break L0;
          }
        }
        var4 = null;
        ne.field_c.field_Jb.field_W.a(false);
        var5 = 0;
        var6 = 0;
        var7 = qh.field_K - 1;
        L1: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L2: while (true) {
              if (var8 >= qh.field_K) {
                L3: {
                  var8 = ne.field_c.field_Jb.field_ub - -ne.field_c.field_Jb.field_kb - -var6 - var7;
                  ne.field_c.field_Jb.field_ub = ne.field_c.field_Jb.field_ub - var8;
                  ne.field_c.field_Jb.field_F = ne.field_c.field_Jb.field_F + var8;
                  if (ad.field_l) {
                    ne.field_c.field_Jb.field_ub = var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ne.field_c.field_Jb.field_kb = -ne.field_c.field_Jb.field_ub + var7;
                  if (ad.field_l) {
                    ne.field_c.field_Jb.field_F = ne.field_c.field_Eb.field_ub - ne.field_c.field_Jb.field_ub;
                    ad.field_l = false;
                    uf.field_i = true;
                    ne.field_c.field_Jb.field_Cb = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!qc.field_h) {
                    break L5;
                  } else {
                    if (qc.field_i != null) {
                      uf.field_i = true;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  var9 = -ne.field_c.field_Jb.field_kb + -ne.field_c.field_Jb.field_ub + ne.field_c.field_Eb.field_ub;
                  if (!uf.field_i) {
                    break L6;
                  } else {
                    ne.field_c.field_Jb.field_Cb = var9 + -ne.field_c.field_Jb.field_F;
                    break L6;
                  }
                }
                L7: {
                  ne.field_c.a(-1, param3, true, param1 * (2 * param3));
                  if (var9 != ne.field_c.field_Jb.field_Cb + ne.field_c.field_Jb.field_F) {
                    stackOut_43_0 = 0;
                    stackIn_44_0 = stackOut_43_0;
                    break L7;
                  } else {
                    stackOut_42_0 = 1;
                    stackIn_44_0 = stackOut_42_0;
                    break L7;
                  }
                }
                uf.field_i = stackIn_44_0 != 0;
                return var4;
              } else {
                var9_ref_cj = el.field_s[var8];
                if (null != var9_ref_cj.field_t) {
                  ne.field_c.field_Jb.a(0, var9_ref_cj.field_t);
                  var9_ref_cj.field_t.a(param2, param3, var9_ref_cj.field_t.c((byte) 81), (byte) -44, var7);
                  var7 = var7 + param3;
                  if (var9_ref_cj.field_t.field_nb != 0) {
                    var4 = var9_ref_cj;
                    var8++;
                    continue L2;
                  } else {
                    var8++;
                    continue L2;
                  }
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            L8: {
              var8_ref_cj = el.field_s[var7];
              var9 = 0;
              if (wg.field_f) {
                break L8;
              } else {
                if (var5 >= nb.field_s) {
                  break L8;
                } else {
                  var10_int = id.a(var8_ref_cj.field_n, (byte) 82);
                  if (var8_ref_cj.b(-6761) >= var10_int) {
                    L9: {
                      if (var8_ref_cj.field_j) {
                        break L9;
                      } else {
                        if (!fm.a(var8_ref_cj.field_i, -1369854352)) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var9 = 1;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            if (var9 == 0) {
              var8_ref_cj.field_t = null;
              var7--;
              continue L1;
            } else {
              L10: {
                if (var8_ref_cj.field_t == null) {
                  break L10;
                } else {
                  if (ad.field_l) {
                    break L10;
                  } else {
                    var5++;
                    var7--;
                    continue L1;
                  }
                }
              }
              L11: {
                if (var8_ref_cj.field_t == null) {
                  wc.field_j = wc.field_j + 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              var10 = re.a((byte) -100, var8_ref_cj);
              var11 = var10 + e.b(var8_ref_cj.field_h);
              var12 = qd.a(param0 ^ -18302, var8_ref_cj);
              var8_ref_cj.field_t = new km(0L, wh.field_d, var11);
              var6 = var6 + param3;
              var8_ref_cj.field_t.field_ab = ((wh.field_d.field_ab & 16711422) >> 266162529) + -(8355711 & var12 >> 918370913) + var12;
              var8_ref_cj.field_t.field_A = -(var12 >> 1495010849 & 8355711) + var12 + (wh.field_d.field_A >> 582344545 & 8355711);
              var8_ref_cj.field_t.field_E = var12;
              var8_ref_cj.field_t.field_C = hk.field_Ob;
              var5++;
              var7--;
              continue L1;
            }
          }
        }
    }

    private da() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[1024];
        field_i = "Type your age in years";
    }
}
