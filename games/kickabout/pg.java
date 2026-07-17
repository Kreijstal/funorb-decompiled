/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static uh field_d;
    static String field_c;
    static int field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1) {
        ni.field_l = param1 ? new rf(lb.field_H, w.field_e) : new rf(c.field_d, fm.field_C);
        dn.field_Cb = new hd(0L, (hd) null);
        dn.field_Cb.a((byte) -110, (hd) (Object) ni.field_l.field_b);
        dn.field_Cb.a((byte) -126, ac.field_b);
        tn.field_f = new hd(0L, tv.field_e);
        vj.field_g = new hd(0L, (hd) null);
        tn.field_f.a((byte) -125, is.field_b);
        tn.field_f.a((byte) -105, vj.field_g);
        vj.field_g.a((byte) -124, mc.field_d);
        vj.field_g.a((byte) -119, kt.field_i);
        bq.a(93, param1);
    }

    final static int a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!nk.b((byte) -59)) {
                L2: {
                  ll.field_k.a(-21174, sj.a(el.field_A, n.field_m, (byte) -96), sj.a(sm.field_q, vc.field_y, (byte) -101));
                  if (!ll.field_k.c(-1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (ll.field_k.field_e < 0) {
                        break L4;
                      } else {
                        var3 = sh.field_f[ll.field_k.field_e];
                        if (var3 == 2) {
                          oc.a((byte) -43);
                          break L3;
                        } else {
                          if (var3 == 5) {
                            oc.a((byte) -43);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (ck.field_a == 2) {
                      break L3;
                    } else {
                      oc.a((byte) -16);
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var3 != 0) {
                    break L5;
                  } else {
                    if (ck.field_a == 2) {
                      var4 = -va.field_o + nj.a(48);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L5;
                      } else {
                        ba.a(true, 6, 5);
                        var3 = 2;
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_26_0 = var3;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L6: {
                  ll.field_k.d(98);
                  if (!ll.field_k.c(-1)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if (cc.field_e != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "pg.E(" + -3 + 41);
        }
        return stackIn_27_0;
    }

    final static String[] a(boolean param0, int param1) {
        if (param1 == 1) {
            return nn.field_I;
        }
        if (!(param1 != 9)) {
            return rd.field_e;
        }
        if (!(10 != param1)) {
            return rd.field_e;
        }
        if (!(param1 != 8)) {
            return ow.field_d;
        }
        if (param1 == 11) {
            return fs.field_a;
        }
        if (!(param1 != 18)) {
            return fs.field_a;
        }
        if (!(param1 != 19)) {
            return fs.field_a;
        }
        if (!(param1 != 32)) {
            return fs.field_a;
        }
        if (!(37 != param1)) {
            return fs.field_a;
        }
        if (!(param1 != 24)) {
            return fs.field_a;
        }
        if (!(param1 != 25)) {
            return pd.field_M;
        }
        String[] discarded$9 = pg.a(false, -50);
        if (!(23 != param1)) {
            return vq.field_i;
        }
        if (param1 == 29) {
            return fs.field_a;
        }
        if (!(param1 != 34)) {
            return fs.field_a;
        }
        if (param1 == 30) {
            return fs.field_a;
        }
        if (!(param1 != 21)) {
            return si.field_q;
        }
        if (!(param1 != 20)) {
            return fs.field_a;
        }
        return fp.field_u;
    }

    public static void b() {
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static gm a(int param0, int param1, up param2, int param3, int param4) {
        long var5_long = 0L;
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        up stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        up stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        up stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        up stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        up stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        up stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        up stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        up stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        up stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        up stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        gm stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        up stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        up stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        up stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        up stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        up stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        up stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        up stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        up stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        up stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        gm stackOut_12_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_long = nj.a(51);
            if (80L <= -tr.field_d + var5_long) {
              L1: {
                tr.field_d = var5_long;
                stackOut_5_0 = (up) param2;
                stackOut_5_1 = param1;
                stackOut_5_2 = param4;
                stackOut_5_3 = (up) param2;
                stackOut_5_4 = -107;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                if (param2.f(13467)) {
                  stackOut_7_0 = (up) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = (up) (Object) stackIn_7_3;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  stackIn_8_5 = stackOut_7_5;
                  break L1;
                } else {
                  stackOut_6_0 = (up) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = (up) (Object) stackIn_6_3;
                  stackOut_6_4 = stackIn_6_4;
                  stackOut_6_5 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_8_4 = stackOut_6_4;
                  stackIn_8_5 = stackOut_6_5;
                  break L1;
                }
              }
              L2: {
                L3: {
                  stackOut_8_0 = (up) (Object) stackIn_8_0;
                  stackOut_8_1 = stackIn_8_1;
                  stackOut_8_2 = stackIn_8_2;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  if (((up) (Object) stackIn_8_3).c((byte) stackIn_8_4, stackIn_8_5 == 0)) {
                    break L3;
                  } else {
                    stackOut_9_0 = (up) (Object) stackIn_9_0;
                    stackOut_9_1 = stackIn_9_1;
                    stackOut_9_2 = stackIn_9_2;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    if (!wn.a((byte) 34)) {
                      break L3;
                    } else {
                      stackOut_10_0 = (up) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      break L2;
                    }
                  }
                }
                stackOut_11_0 = (up) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L2;
              }
              stackOut_12_0 = mg.a(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0, param0, (byte) 106);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (gm) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("pg.A(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -79 + 44 + param4 + 41);
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Close";
    }
}
