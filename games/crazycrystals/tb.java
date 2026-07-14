/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static dl[] field_e;
    static int field_g;
    bh[] field_h;
    static wb field_b;
    static tj field_d;
    static String field_f;
    static String field_c;
    static int field_a;

    final int a(byte param0, int param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = CrazyCrystals.field_B;
          var5 = 0;
          if (param0 > 74) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var6 = 0;
        var7 = param2.length();
        var8 = 0;
        L1: while (true) {
          if (var8 >= var7) {
            if (-1 > (var5 ^ -1)) {
              return (param1 + -param3 << 95664328) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param2.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              } else {
                var6 = 0;
                var8++;
                continue L1;
              }
            } else {
              var6 = 1;
              var8++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, ng param1) {
        mc.field_q = param1.c((byte) -7) << 1680553477;
        if (param0 != -31416) {
            field_d = null;
        }
        int var2 = param1.h(255);
        jn.field_q = (7 & var2) << -2110429390;
        mc.field_q = mc.field_q + (var2 >> 44083395);
        jn.field_q = jn.field_q + (param1.c((byte) -7) << -363648894);
        var2 = param1.h(255);
        of.field_D = 2064384 & var2 << -591551121;
        jn.field_q = jn.field_q + (var2 >> 1284655814);
        of.field_D = of.field_D + (param1.h(255) << 1653045831);
        var2 = param1.h(param0 ^ -31305);
        jd.field_I = var2 << -998740464 & 65536;
        of.field_D = of.field_D + (var2 >> -233736991);
        jd.field_I = jd.field_I + param1.c((byte) -7);
    }

    final static void a(int param0, hp param1, byte param2) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param2 > -122) {
            Object var7 = null;
            tb.a(114, true, 91, -82, (String) null);
        }
        md var8 = tp.field_f;
        md var9 = var8;
        var9.d(8, param0);
        var9.field_f = var9.field_f + 1;
        int var4 = var9.field_f;
        var9.a(true, 1);
        var9.c(-161478600, param1.field_n);
        var9.c(-161478600, param1.field_k);
        var9.c(-161478600, param1.field_j);
        var9.a(param1.field_l, -16384);
        var9.a(param1.field_f, -16384);
        var9.a(param1.field_o, -16384);
        var9.a(param1.field_h, -16384);
        var9.a(true, param1.field_p.length);
        for (var5 = 0; var5 < param1.field_p.length; var5++) {
            var8.a(param1.field_p[var5], -16384);
        }
        int discarded$0 = var9.b(var4, (byte) -75);
        var9.c((byte) 68, var9.field_f + -var4);
    }

    final int a(int param0) {
        int var2 = 0;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          var2 = -1;
          if (null == ((tb) this).field_h) {
            break L0;
          } else {
            var3 = ((tb) this).field_h;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-2288);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 >= 78) {
          return var2;
        } else {
          return -8;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, String param4) {
        if (param1) {
            int discarded$0 = tb.a(false);
        }
        an.field_q.a(param4, -1 + param3, param0, 0, -1);
        an.field_q.a(param4, param3 - -1, param0, 0, -1);
        an.field_q.a(param4, param3, param0 + -1, 0, -1);
        an.field_q.a(param4, param3, 1 + param0, 0, -1);
        an.field_q.a(param4, param3, param0, param2, -1);
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        bh var4 = null;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 62) {
            Object var6 = null;
            tb.a(-55, (hp) null, (byte) 111);
        }
        for (var3 = 0; var3 < ((tb) this).field_h.length; var3++) {
            var4 = ((tb) this).field_h[var3];
            if (param0 < var4.field_e.length) {
                return var3;
            }
            param0 = param0 - (var4.field_e.length - 1);
        }
        return ((tb) this).field_h.length;
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 != -2267) {
            field_f = null;
        }
    }

    final int a(int param0, int param1) {
        bh var5 = null;
        int var6 = CrazyCrystals.field_B;
        bh[] var7 = ((tb) this).field_h;
        bh[] var3 = var7;
        int var4 = 0;
        if (param1 != 1) {
            return -125;
        }
        while (var7.length > var4) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_e.length)) {
                return var5.field_e[param0];
            }
            param0 = param0 - (-1 + var5.field_e.length);
            var4++;
        }
        return 0;
    }

    final int a(byte param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -90) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = ((tb) this).a((byte) 90, -21, (String) null, 101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((tb) this).field_h) {
              break L2;
            } else {
              if ((((tb) this).field_h.length ^ -1) < -1) {
                stackOut_6_0 = ((tb) this).field_h[((tb) this).field_h.length - 1].field_b + -((tb) this).field_h[0].field_f;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1, byte param2) {
        bh var6 = null;
        int var7 = 0;
        int var8 = CrazyCrystals.field_B;
        if (((tb) this).field_h != null) {
            // ifeq L36
            // if_icmplt L36
        } else {
            return -1;
        }
        if (param0 > ((tb) this).field_h[((tb) this).field_h.length + -1].field_b) {
            return -1;
        }
        if (!(1 != ((tb) this).field_h.length)) {
            return ((tb) this).field_h[0].a(-64, param1);
        }
        int var4 = 0;
        int var5 = 0;
        if (param2 != 51) {
            int discarded$0 = ((tb) this).a(85, 75);
        }
        while (var5 < ((tb) this).field_h.length) {
            var6 = ((tb) this).field_h[var5];
            if (param0 >= var6.field_f) {
                if (var6.field_b >= param0) {
                    var7 = var6.a(param2 + -92, param1);
                    if (0 == (var7 ^ -1)) {
                        return -1;
                    }
                    return var7 + var4;
                }
            }
            var4 = var4 + (var6.field_e.length + -1);
            var5++;
        }
        return -1;
    }

    final static int a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!ge.b(-42)) {
            L1: {
              lb.field_l.a(0, be.a(-1013410975, to.field_a, dp.field_h), be.a(-1013410975, qh.field_i, bm.field_h));
              if (lb.field_l.a(param0)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3 = 0;
              if (var1 != 0) {
                if (-1 <= lb.field_l.field_c) {
                  L3: {
                    var3 = sn.field_a[lb.field_l.field_c];
                    if (var3 == 2) {
                      break L3;
                    } else {
                      if ((var3 ^ -1) == -6) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  gn.f(false);
                  break L2;
                } else {
                  if ((am.field_g ^ -1) == -3) {
                    break L2;
                  } else {
                    gn.f(false);
                    break L2;
                  }
                }
              } else {
                if (var2 == 0) {
                  break L2;
                } else {
                  if (am.field_g == -3) {
                    break L2;
                  } else {
                    gn.f(false);
                    break L2;
                  }
                }
              }
            }
            L4: {
              if (0 != var3) {
                break L4;
              } else {
                if (am.field_g == 2) {
                  var4 = lo.a((byte) -67) - wm.field_d;
                  var6 = (int)((10999L + -var4) / 1000L);
                  if (0 >= var6) {
                    var3 = 2;
                    a.a(108, 5, true);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            return var3;
          } else {
            L5: {
              lb.field_l.f(0);
              if (!lb.field_l.a(true)) {
                break L5;
              } else {
                var1 = 1;
                break L5;
              }
            }
            if ((pj.field_q ^ -1) != -14) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Player Name: ";
        field_f = "Dig through the earth to let the rocks fall. Take your time; you can support the rocks!";
        field_b = new wb();
    }
}
