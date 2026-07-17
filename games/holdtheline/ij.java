/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static String field_a;
    String field_o;
    static String field_k;
    int field_e;
    int[] field_b;
    static String field_n;
    static int[][] field_c;
    int field_h;
    private long field_f;
    int field_j;
    static boolean field_l;
    private String field_i;
    static oa field_g;
    private int field_d;
    private boolean field_m;

    final static hj a(int param0, int param1, hj[] param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        hj var23 = null;
        hj var24 = null;
        hj stackIn_19_0 = null;
        hj stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_39_0 = null;
        hj stackOut_18_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var22 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_int = param2[0].field_o;
              var5 = param2[2].field_o;
              var6 = param2[0].field_v;
              var7 = param2[6].field_v;
              var8 = 16;
              var9 = 16;
              if (0 != param1 % var8) {
                param1 = param1 + (var8 + -(param1 % var8));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 % var9 != 0) {
                param3 = param3 + (var9 + -(param3 % var9));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = param1 + (var4_int + var5);
              if (param0 == -8096) {
                break L3;
              } else {
                ij.b(70);
                break L3;
              }
            }
            var12 = param3 + (var7 + var6);
            var13 = 0;
            L4: while (true) {
              if (var13 >= 4) {
                var13 = 3;
                L5: while (true) {
                  if (var13 <= 0) {
                    hj dupTemp$1 = new hj(param1 + (var4_int + var5), var6 + (var7 - -param3));
                    lb.field_t[0] = dupTemp$1;
                    var24 = dupTemp$1;
                    var10 = var24;
                    vb.a(-98, var24);
                    tc.a(10, 10, var4_int + param1 - (-var5 + 10), -10 + (var7 + var6 + param3));
                    var13 = 0;
                    L6: while (true) {
                      if (var4_int + (param1 - -var5) <= var13) {
                        tc.d();
                        hi.a(param2, var7 + var6 + param3, true, var5 + (var4_int + param1), 0, 0);
                        var13 = (param1 * param1 + param3 * param3) / 4;
                        var14 = -4;
                        L7: while (true) {
                          if (param1 - -4 <= var14) {
                            ug.b(-1);
                            stackOut_39_0 = (hj) var10;
                            stackIn_40_0 = stackOut_39_0;
                            break L0;
                          } else {
                            var15 = -4;
                            L8: while (true) {
                              if (4 + param3 <= var15) {
                                var14++;
                                continue L7;
                              } else {
                                L9: {
                                  var16 = (int)Math.sqrt((double)((var14 - param1 / 2) * (var14 - param1 / 2) + (-(param3 / 2) + var15) * (-(param3 / 2) + var15)));
                                  var17 = 128 - -(64 * var16 / (int)Math.sqrt((double)var13));
                                  if (var17 > 256) {
                                    var17 = 256;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                var18 = var14 + (var4_int + tc.field_j * (var6 + var15));
                                var19 = tc.field_b[var18];
                                var20 = var19 & 16711935;
                                var20 = var20 * var17;
                                var21 = 65280 & var19;
                                var21 = var21 * var17;
                                var20 = var20 & -16711936;
                                var21 = var21 & 16711680;
                                var19 = (var20 | var21) >> 8;
                                tc.field_b[var18] = var19;
                                var15++;
                                continue L8;
                              }
                            }
                          }
                        }
                      } else {
                        var14 = 0;
                        L10: while (true) {
                          if (var7 + (var6 + param3) <= var14) {
                            var13 = var13 + param2[4].field_s;
                            continue L6;
                          } else {
                            param2[4].a(var13, var14);
                            var14 = var14 + param2[4].field_y;
                            continue L10;
                          }
                        }
                      }
                    }
                  } else {
                    lb.field_t[var13] = lb.field_t[-1 + var13];
                    var13--;
                    continue L5;
                  }
                }
              } else {
                L11: {
                  var23 = lb.field_t[var13];
                  if (var23 == null) {
                    break L11;
                  } else {
                    if (var23.field_s != var11) {
                      break L11;
                    } else {
                      if (var12 == var23.field_y) {
                        var14 = var13;
                        L12: while (true) {
                          if (var14 <= 0) {
                            lb.field_t[0] = var23;
                            stackOut_18_0 = (hj) var23;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0;
                          } else {
                            lb.field_t[var14] = lb.field_t[var14 - 1];
                            var14--;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                var13++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("ij.E(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 41);
        }
        return stackIn_40_0;
    }

    final static void c(int param0) {
        if (!(null != cc.field_w)) {
            return;
        }
        om.a(-46342, (java.awt.Canvas) (Object) cc.field_w);
        cc.field_w.a(wi.field_b, 50);
        cc.field_w = null;
        if (param0 != 4) {
            ij.c(-47);
        }
        if (!(hh.field_c == null)) {
            hh.field_c.b(125);
        }
        kd.field_b.requestFocus();
    }

    final static nd a(String param0, int param1, int param2) {
        nd var3 = null;
        RuntimeException var3_ref = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3 = new nd(false);
            var3.field_d = param0;
            var3.field_b = param2;
            stackOut_2_0 = (nd) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("ij.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 256 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final int a(int param0) {
        L0: {
          if (((ij) this).field_m) {
            break L0;
          } else {
            L1: {
              if (2 != ((ij) this).field_h) {
                break L1;
              } else {
                if (0 >= ((ij) this).field_d) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (param0 <= -36) {
              if (((ij) this).field_f == ra.field_bb) {
                return 1;
              } else {
                if (eg.field_b != 2) {
                  return 0;
                } else {
                  if (cg.a(2113942113, ((ij) this).field_i)) {
                    return 1;
                  } else {
                    return 0;
                  }
                }
              }
            } else {
              return 80;
            }
          }
        }
        return 2;
    }

    final static void a(boolean param0, int param1) {
        if (!(7 == mi.field_d)) {
            throw new RuntimeException();
        }
        int var2 = pf.a((byte) 65, kn.b((byte) -49).field_p);
        if (!(var2 != 2)) {
            wm.a(param0, false, 12);
        }
        if (var2 != 0) {
            return;
        }
        qd.a(20830, 3 - -cf.field_w);
        nm.field_b = kn.b((byte) -49);
        int discarded$7 = 1;
        if (pd.a(nm.field_b)) {
            bl.field_r = new sg(nm.field_b, 0, false, false, t.field_l, -1);
        } else {
            ca.field_r = 0;
            on.field_r = t.field_l;
            fl.field_j = false;
            qn.field_k = false;
            bl.field_r = null;
            sk.field_i = -1;
        }
        kk.field_j = true;
        wm.a(param0, false, 10);
        ((ti) (Object) l.field_a[10]).field_p = 480;
        if (param1 >= -72) {
            field_k = null;
        }
    }

    public static void b(int param0) {
        int var1 = -26 / ((param0 - 53) / 48);
        field_k = null;
        field_c = null;
        field_a = null;
        field_g = null;
        field_n = null;
    }

    ij(boolean param0) {
        ((ij) this).field_j = kf.field_H;
        ((ij) this).field_f = fc.field_c;
        ((ij) this).field_h = ch.field_m;
        ((ij) this).field_i = kl.field_u;
        ((ij) this).field_e = vn.field_f;
        ((ij) this).field_o = fi.field_kb;
        ((ij) this).field_d = pj.field_o;
        if (param0) {
            ((ij) this).field_b = lm.field_d;
        } else {
            ((ij) this).field_b = null;
        }
        ((ij) this).field_m = jc.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Two kills remaining.";
        field_c = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[4]};
        field_a = "pts";
    }
}
