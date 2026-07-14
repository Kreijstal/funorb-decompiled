/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb implements cg {
    private int field_h;
    private int field_e;
    private int field_l;
    private int field_i;
    static int field_g;
    private int field_p;
    static nh field_a;
    private int field_c;
    private int field_d;
    private int field_o;
    private int field_k;
    static String field_b;
    private int field_n;
    static String field_m;
    private rf field_f;
    static int field_q;
    private int field_j;

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nc var11 = null;
        vg stackIn_3_0 = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param2 instanceof nc) {
            stackOut_2_0 = (vg) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (nc) (Object) stackIn_3_0;
          if (var11 != null) {
            param0 = param0 & var11.field_E;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (!param0) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          wj.f(param2.field_o + param4, param3 - -param2.field_m, param2.field_w, param2.field_k, ((hb) this).field_p);
          var8 = ((hb) this).field_h + (param4 - -param2.field_o);
          var9 = ((hb) this).field_o + (param2.field_m + param3);
          wj.b(var8, var9, ((hb) this).field_e, ((hb) this).field_k, 5592405);
          wj.f(var8, var9, ((hb) this).field_e, ((hb) this).field_k, var7);
          if (var11.field_A) {
            wj.g(var8, var9, var8 + ((hb) this).field_e, var9 - -((hb) this).field_k, 1);
            wj.g(var8 - -((hb) this).field_e, var9, var8, var9 - -((hb) this).field_k, 1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null != ((hb) this).field_f) {
            var10 = ((hb) this).field_l + (((hb) this).field_e - -((hb) this).field_h);
            int discarded$1 = ((hb) this).field_f.a(param2.field_p, var10 + (param4 - -param2.field_o), ((hb) this).field_n + param3 - -param2.field_m, param2.field_w + -((hb) this).field_l + -var10, param2.field_k + -(((hb) this).field_l << -1477459871), ((hb) this).field_i, ((hb) this).field_c, ((hb) this).field_j, ((hb) this).field_d, 0);
            break L4;
          } else {
            break L4;
          }
        }
        if (param1 <= 94) {
          ((hb) this).field_i = -108;
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        int var1 = -27 / ((-26 - param0) / 63);
        field_m = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte[] param0, java.math.BigInteger param1, java.math.BigInteger param2, byte param3, int param4, int param5, od param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var7 = eg.a(-17077, param4);
          if (null != wb.field_c) {
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            break L0;
          } else {
            wb.field_c = new java.security.SecureRandom();
            var14 = new int[4];
            var13 = var14;
            var8 = var13;
            var9 = 0;
            break L0;
          }
        }
        L1: while (true) {
          if (4 <= var9) {
            if (null == li.field_h) {
              L2: {
                li.field_h = new od(var7);
                li.field_h.field_j = 0;
                li.field_h.a(param4, param5, 29211, param0);
                li.field_h.a((byte) -39, var7);
                if (param3 <= -25) {
                  break L2;
                } else {
                  var11 = null;
                  hb.a(120, (java.awt.Canvas) null);
                  break L2;
                }
              }
              li.field_h.a(var14, 7221);
              if (null == hm.field_e) {
                hm.field_e = new od(100);
                hm.field_e.field_j = 0;
                hm.field_e.c(10, (byte) -86);
                var12 = 0;
                var9 = var12;
                L3: while (true) {
                  if (-5 >= (var12 ^ -1)) {
                    hm.field_e.c(param4, -17402);
                    hm.field_e.a(param2, param1, 0);
                    param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                    param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                    return;
                  } else {
                    hm.field_e.a(var14[var12], (byte) -8);
                    var12++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if ((hm.field_e.field_h.length ^ -1) <= -101) {
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    break L4;
                  } else {
                    hm.field_e = new od(100);
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    break L4;
                  }
                }
                L5: while (true) {
                  if (-5 >= (var12 ^ -1)) {
                    hm.field_e.c(param4, -17402);
                    hm.field_e.a(param2, param1, 0);
                    param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                    param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                    return;
                  } else {
                    hm.field_e.a(var14[var12], (byte) -8);
                    var12++;
                    continue L5;
                  }
                }
              }
            } else {
              if (var7 > li.field_h.field_h.length) {
                li.field_h = new od(var7);
                li.field_h.field_j = 0;
                li.field_h.a(param4, param5, 29211, param0);
                li.field_h.a((byte) -39, var7);
                if (param3 > -25) {
                  L6: {
                    var11 = null;
                    hb.a(120, (java.awt.Canvas) null);
                    li.field_h.a(var14, 7221);
                    if (null == hm.field_e) {
                      break L6;
                    } else {
                      if ((hm.field_e.field_h.length ^ -1) <= -101) {
                        hm.field_e.field_j = 0;
                        hm.field_e.c(10, (byte) -86);
                        var12 = 0;
                        var9 = var12;
                        L7: while (true) {
                          if (-5 >= (var12 ^ -1)) {
                            hm.field_e.c(param4, -17402);
                            hm.field_e.a(param2, param1, 0);
                            param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                            param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                            return;
                          } else {
                            hm.field_e.a(var14[var12], (byte) -8);
                            var12++;
                            continue L7;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  hm.field_e = new od(100);
                  hm.field_e.field_j = 0;
                  hm.field_e.c(10, (byte) -86);
                  var12 = 0;
                  var9 = var12;
                  L8: while (true) {
                    if (-5 >= (var12 ^ -1)) {
                      hm.field_e.c(param4, -17402);
                      hm.field_e.a(param2, param1, 0);
                      param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                      param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                      return;
                    } else {
                      hm.field_e.a(var14[var12], (byte) -8);
                      var12++;
                      continue L8;
                    }
                  }
                } else {
                  L9: {
                    L10: {
                      li.field_h.a(var14, 7221);
                      if (null == hm.field_e) {
                        break L10;
                      } else {
                        if ((hm.field_e.field_h.length ^ -1) <= -101) {
                          hm.field_e.field_j = 0;
                          hm.field_e.c(10, (byte) -86);
                          var12 = 0;
                          var9 = var12;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    hm.field_e = new od(100);
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    break L9;
                  }
                  L11: while (true) {
                    if (-5 >= (var12 ^ -1)) {
                      hm.field_e.c(param4, -17402);
                      hm.field_e.a(param2, param1, 0);
                      param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                      param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                      return;
                    } else {
                      hm.field_e.a(var14[var12], (byte) -8);
                      var12++;
                      continue L11;
                    }
                  }
                }
              } else {
                li.field_h.field_j = 0;
                li.field_h.a(param4, param5, 29211, param0);
                li.field_h.a((byte) -39, var7);
                if (param3 <= -25) {
                  li.field_h.a(var14, 7221);
                  if (null == hm.field_e) {
                    hm.field_e = new od(100);
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    L12: while (true) {
                      if (-5 >= (var12 ^ -1)) {
                        hm.field_e.c(param4, -17402);
                        hm.field_e.a(param2, param1, 0);
                        param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                        param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                        return;
                      } else {
                        hm.field_e.a(var14[var12], (byte) -8);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    L13: {
                      if ((hm.field_e.field_h.length ^ -1) <= -101) {
                        break L13;
                      } else {
                        hm.field_e = new od(100);
                        break L13;
                      }
                    }
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    L14: while (true) {
                      if (-5 >= (var12 ^ -1)) {
                        hm.field_e.c(param4, -17402);
                        hm.field_e.a(param2, param1, 0);
                        param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                        param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                        return;
                      } else {
                        hm.field_e.a(var14[var12], (byte) -8);
                        var12++;
                        continue L14;
                      }
                    }
                  }
                } else {
                  var11 = null;
                  hb.a(120, (java.awt.Canvas) null);
                  li.field_h.a(var14, 7221);
                  if (null == hm.field_e) {
                    hm.field_e = new od(100);
                    hm.field_e.field_j = 0;
                    hm.field_e.c(10, (byte) -86);
                    var12 = 0;
                    var9 = var12;
                    L15: while (true) {
                      if (-5 >= (var12 ^ -1)) {
                        hm.field_e.c(param4, -17402);
                        hm.field_e.a(param2, param1, 0);
                        param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                        param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                        return;
                      } else {
                        hm.field_e.a(var14[var12], (byte) -8);
                        var12++;
                        continue L15;
                      }
                    }
                  } else {
                    if (hm.field_e.field_h.length > -101) {
                      hm.field_e = new od(100);
                      hm.field_e.field_j = 0;
                      hm.field_e.c(10, (byte) -86);
                      var12 = 0;
                      var9 = var12;
                      L16: while (true) {
                        if (-5 >= (var12 ^ -1)) {
                          hm.field_e.c(param4, -17402);
                          hm.field_e.a(param2, param1, 0);
                          param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                          param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                          return;
                        } else {
                          hm.field_e.a(var14[var12], (byte) -8);
                          var12++;
                          continue L16;
                        }
                      }
                    } else {
                      hm.field_e.field_j = 0;
                      hm.field_e.c(10, (byte) -86);
                      var12 = 0;
                      var9 = var12;
                      L17: while (true) {
                        if (-5 <= var12) {
                          hm.field_e.c(param4, -17402);
                          hm.field_e.a(param2, param1, 0);
                          param6.a(hm.field_e.field_j, 0, 29211, hm.field_e.field_h);
                          param6.a(li.field_h.field_j, 0, 29211, li.field_h.field_h);
                          return;
                        } else {
                          hm.field_e.a(var14[var12], (byte) -8);
                          var12++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            var8[var9] = wb.field_c.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        tb.a(param0 ^ 4, (java.awt.Component) (Object) param1);
        pi.a((java.awt.Component) (Object) param1, 1);
        if (param0 != -5) {
          return;
        } else {
          L0: {
            if (sc.field_e == null) {
              break L0;
            } else {
              sc.field_e.a((java.awt.Component) (Object) param1, (byte) 12);
              break L0;
            }
          }
          return;
        }
    }

    final static int a(int param0, String param1, int param2, String param3, int param4, String param5, boolean param6) {
        int var8 = 85 % ((param0 - 53) / 54);
        a var7 = new a(param5);
        a var9 = new a(param3);
        return pj.a(param1, param4, var9, var7, 0, param2, param6);
    }

    hb(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((hb) this).field_d = 1;
        ((hb) this).field_j = 1;
        ((hb) this).field_e = param8;
        ((hb) this).field_l = param1;
        ((hb) this).field_h = param5;
        ((hb) this).field_n = param2;
        ((hb) this).field_i = param3;
        ((hb) this).field_o = param6;
        ((hb) this).field_f = param0;
        ((hb) this).field_c = param4;
        ((hb) this).field_k = param7;
        ((hb) this).field_p = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Hard";
    }
}
