/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uv extends k {
    static String field_k;

    final int[] a(int param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return jq.field_k;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          var5 = param0 + param3;
          var6 = param1 - -param2;
          if (param3 > dg.field_f) {
            stackOut_2_0 = param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = dg.field_f;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param1 <= dg.field_j) {
            stackOut_5_0 = dg.field_j;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= dg.field_h) {
            stackOut_8_0 = dg.field_h;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (dg.field_k <= var6) {
            stackOut_11_0 = dg.field_k;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (dg.field_f > param3) {
            break L4;
          } else {
            if (param3 >= dg.field_h) {
              break L4;
            } else {
              var11 = dg.field_i * var8 + param3;
              var12 = -var8 + var10 + 1 >> 956563329;
              L5: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L4;
                } else {
                  dg.field_e[var11] = 16777215;
                  var11 = var11 + dg.field_i * 2;
                  continue L5;
                }
              }
            }
          }
        }
        L6: {
          if (param1 < dg.field_j) {
            break L6;
          } else {
            if (dg.field_k <= var6) {
              break L6;
            } else {
              var11 = dg.field_i * param1 - -var7;
              var12 = 1 + (var9 + -var7) >> 482286305;
              L7: while (true) {
                var12--;
                if (var12 < 0) {
                  break L6;
                } else {
                  dg.field_e[var11] = 16777215;
                  var11 += 2;
                  continue L7;
                }
              }
            }
          }
        }
        L8: {
          if (var5 < dg.field_f) {
            break L8;
          } else {
            if (var5 >= dg.field_h) {
              break L8;
            } else {
              var11 = dg.field_i * ((var5 + -param3 & 1) + var8) - -var5;
              var12 = -var8 + 1 - -var10 >> -552818719;
              L9: while (true) {
                var12--;
                if (0 > var12) {
                  break L8;
                } else {
                  dg.field_e[var11] = 16777215;
                  var11 = var11 + dg.field_i * 2;
                  continue L9;
                }
              }
            }
          }
        }
        L10: {
          if (!param4) {
            break L10;
          } else {
            field_k = null;
            break L10;
          }
        }
        L11: {
          if (dg.field_j > param1) {
            break L11;
          } else {
            if (var6 < dg.field_k) {
              var11 = var6 * dg.field_i + var7 - -(-param1 + var6 & 1);
              var12 = 1 + var9 - var7 >> -1104331263;
              L12: while (true) {
                var12--;
                if (var12 < 0) {
                  break L11;
                } else {
                  dg.field_e[var11] = 16777215;
                  var11 += 2;
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
        }
    }

    public uv() {
        super(0, true);
    }

    final static boolean a(byte param0, int[] param1) {
        long var2 = 0L;
        bs var4_ref_bs = null;
        int var4 = 0;
        int var5_int = 0;
        bs var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        if (uca.field_a != eia.field_a) {
          return false;
        } else {
          var2 = f.b((byte) 73);
          if (param0 >= 113) {
            L0: {
              if (lca.field_s == 0) {
                break L0;
              } else {
                if (0 > hd.field_m) {
                  var4_ref_bs = (bs) (Object) mba.field_c.b((byte) 90);
                  if (var4_ref_bs == null) {
                    break L0;
                  } else {
                    if (var2 > var4_ref_bs.field_f) {
                      var4_ref_bs.a(false);
                      dw.field_f = var4_ref_bs.field_h.length;
                      ig.field_m.field_g = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= dw.field_f) {
                          f.field_b = ef.field_l;
                          ef.field_l = bd.field_j;
                          bd.field_j = ri.field_a;
                          ri.field_a = var4_ref_bs.field_i;
                          return true;
                        } else {
                          ig.field_m.field_h[var5_int] = var4_ref_bs.field_h[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (-1 >= (hd.field_m ^ -1)) {
                  break L3;
                } else {
                  ig.field_m.field_g = 0;
                  if (ii.b(1, 0)) {
                    hd.field_m = ig.field_m.k(694);
                    ig.field_m.field_g = 0;
                    dw.field_f = param1[hd.field_m];
                    break L3;
                  } else {
                    return false;
                  }
                }
              }
              if (!u.d((byte) -67)) {
                return false;
              } else {
                if (0 != lca.field_s) {
                  L4: {
                    var4 = lca.field_s;
                    if (0.0 != nla.field_d) {
                      var4 = (int)((double)var4 + ia.field_k.nextGaussian() * nla.field_d);
                      if ((var4 ^ -1) > -1) {
                        var4 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = new bs(var2 - -(long)var4, hd.field_m, new byte[dw.field_f]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= dw.field_f) {
                      mba.field_c.a((bw) (Object) var5, true);
                      hd.field_m = -1;
                      continue L2;
                    } else {
                      var5.field_h[var6] = ig.field_m.field_h[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  f.field_b = ef.field_l;
                  ef.field_l = bd.field_j;
                  bd.field_j = ri.field_a;
                  ri.field_a = hd.field_m;
                  hd.field_m = -1;
                  return true;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0, String param1, boolean param2) {
        sna.field_s = param2 ? true : false;
        eea.field_b = true;
        if (param0) {
            field_k = null;
        }
        oq.field_b = new mf(gja.field_m, qia.field_a, param1, gfa.field_i, sna.field_s);
        gja.field_m.a((wj) (Object) oq.field_b, (byte) 73);
    }

    public static void e(byte param0) {
        if (param0 != -12) {
            field_k = null;
        }
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "This password contains repeated characters, and would be easy to guess";
    }
}
