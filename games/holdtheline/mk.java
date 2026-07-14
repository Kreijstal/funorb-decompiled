/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends w {
    static String field_o;
    private long field_f;
    static String[] field_j;
    private int field_g;
    static int field_d;
    private long field_h;
    private long field_m;
    static int field_i;
    static int field_e;
    private int field_k;
    private long[] field_l;
    static int[] field_n;

    final static ei a(ei param0, byte param1) {
        qm var3 = null;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ei var9 = null;
        L0: {
          var8 = HoldTheLine.field_D;
          if (param1 == -127) {
            break L0;
          } else {
            hj discarded$2 = mk.a(67, -35, -105);
            break L0;
          }
        }
        var9 = new ei();
        var3 = ((vj) param0.field_b[-1 + param0.field_e]).a(0);
        var4 = 0;
        L1: while (true) {
          if (var4 >= param0.field_e) {
            return var9;
          } else {
            var5 = (lb) param0.field_b[var4];
            var5.field_r.field_h = var3.field_h;
            var5.field_r.field_f = var3.field_f;
            var6 = -var5.field_r.field_h + var5.field_s.field_h;
            var7 = -var5.field_r.field_f + var5.field_s.field_f;
            if (4 <= var6 * var6 + var7 * var7) {
              var3 = var5.field_s;
              var9.a((Object) (Object) var5, (byte) 6);
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, ib param4, int param5) {
        nl[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        nl[] var10 = null;
        af var11 = null;
        var9 = HoldTheLine.field_D;
        if (param4.a(true)) {
          L0: {
            if (0 != param2) {
              break L0;
            } else {
              var10 = oh.a(param4, (byte) 111);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param1 == var10[var8].field_b) {
                      if (param3 == var10[var8].field_a) {
                        L2: {
                          if (-1 == (param5 ^ -1)) {
                            break L2;
                          } else {
                            if (param5 == var10[var8].field_d) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (param2 < var10[var8].field_g) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param2 = var10[var8].field_g;
                        var7_int = 1;
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
                  }
                }
              } else {
                return null;
              }
            }
          }
          if (param0 == 2) {
            var11 = param4.a(param5, param2, param3, param1, false);
            L4: while (true) {
              if (var11.field_d != 0) {
                var7 = (java.awt.Frame) var11.field_b;
                if (var7 != null) {
                  if ((var11.field_d ^ -1) == -3) {
                    rd.a((byte) 102, param4, var7);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              } else {
                qe.a(10L, (byte) 45);
                continue L4;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final int a(long param0, int param1) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = 61 % ((param1 - 27) / 36);
        if ((((mk) this).field_h ^ -1L) <= (((mk) this).field_f ^ -1L)) {
            var5 = 0;
            do {
                ((mk) this).field_f = ((mk) this).field_f + param0;
                var5++;
                // if_icmpge L82
            } while ((((mk) this).field_h ^ -1L) < (((mk) this).field_f ^ -1L));
            if (((mk) this).field_h > ((mk) this).field_f) {
                ((mk) this).field_f = ((mk) this).field_h;
            }
            return var5;
        }
        ((mk) this).field_m = ((mk) this).field_m + (-((mk) this).field_h + ((mk) this).field_f);
        ((mk) this).field_h = ((mk) this).field_h + (-((mk) this).field_h + ((mk) this).field_f);
        ((mk) this).field_f = ((mk) this).field_f + param0;
        return 1;
    }

    final void b(byte param0) {
        if (!(((mk) this).field_f <= ((mk) this).field_h)) {
            ((mk) this).field_h = ((mk) this).field_h + (((mk) this).field_f - ((mk) this).field_h);
        }
        int var2 = 57 % ((-67 - param0) / 36);
        ((mk) this).field_m = 0L;
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        vn var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        vn stackIn_44_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        vn stackOut_43_0 = null;
        vn stackOut_42_0 = null;
        L0: {
          var10 = HoldTheLine.field_D;
          var1 = ie.field_j;
          var2 = 0;
          if (pa.field_h != 2) {
            break L0;
          } else {
            var3_long = -cg.field_g + bb.b(-1);
            var2 = (int)((10999L + -var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 > 98) {
            break L1;
          } else {
            mk.a(false);
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (var3 >= ii.field_b.length) {
            return;
          } else {
            L3: {
              var4 = cd.field_f[var3];
              if (var4 < 0) {
                var5 = hg.field_I;
                break L3;
              } else {
                if (var4 == kl.field_q.field_g) {
                  var5 = ge.field_b;
                  break L3;
                } else {
                  var5 = sd.field_c;
                  break L3;
                }
              }
            }
            L4: {
              var6 = ii.field_b[var3];
              if (2 != pa.field_h) {
                break L4;
              } else {
                if (var2 != 1) {
                  break L4;
                } else {
                  L5: {
                    if (qg.field_b.length < dg.field_b.length) {
                      stackOut_17_0 = dg.field_b.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = qg.field_b.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (aa.field_j.length < pb.field_a.length) {
                      stackOut_20_0 = pb.field_a.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = aa.field_j.length;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = stackIn_21_0;
                    if (6 > var3) {
                      break L7;
                    } else {
                      if (var3 < 6 - -var7) {
                        L8: {
                          if ((-var7 + var3 + (-6 - -qg.field_b.length) ^ -1) > -1) {
                            stackOut_26_0 = "";
                            stackIn_27_0 = stackOut_26_0;
                            break L8;
                          } else {
                            stackOut_25_0 = qg.field_b[-var7 + qg.field_b.length + var3 + -6];
                            stackIn_27_0 = stackOut_25_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_27_0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var3 < var7 + 7) {
                    break L4;
                  } else {
                    if (var3 >= var8 + 7 - -var7) {
                      break L4;
                    } else {
                      L9: {
                        if (aa.field_j.length > -7 + var3 - var7) {
                          stackOut_32_0 = aa.field_j[-7 + (var3 - var7)];
                          stackIn_33_0 = stackOut_32_0;
                          break L9;
                        } else {
                          stackOut_31_0 = "";
                          stackIn_33_0 = stackOut_31_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_33_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (var4 == -2) {
                var6_ref = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_37_0 = (String) var6_ref;
              stackOut_37_1 = -113;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              if (-1 < (var4 ^ -1)) {
                stackOut_39_0 = (String) (Object) stackIn_39_0;
                stackOut_39_1 = stackIn_39_1;
                stackOut_39_2 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                stackIn_40_2 = stackOut_39_2;
                break L11;
              } else {
                stackOut_38_0 = (String) (Object) stackIn_38_0;
                stackOut_38_1 = stackIn_38_1;
                stackOut_38_2 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                break L11;
              }
            }
            L12: {
              var7 = h.a(stackIn_40_0, (byte) stackIn_40_1, stackIn_40_2 != 0);
              var8 = -(var7 >> -1019571679) + field_i;
              if (0 > var4) {
                break L12;
              } else {
                L13: {
                  if (var4 == kl.field_q.field_g) {
                    stackOut_43_0 = na.field_p;
                    stackIn_44_0 = stackOut_43_0;
                    break L13;
                  } else {
                    stackOut_42_0 = qm.field_e;
                    stackIn_44_0 = stackOut_42_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_44_0;
                  var1 = var1 + dc.field_bb;
                  if (var9 != null) {
                    var9.a(var1, w.field_b + (vf.field_w << -1225228351), -51, (pg.field_G << 345411713) + var7, -pg.field_G + var8);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var1 = var1 + vf.field_w;
                break L12;
              }
            }
            if (0 <= var4) {
              q.field_a.a(var6_ref, var8, var1 + wg.field_b, var5, -1);
              var1 = var1 + (w.field_b + vf.field_w + dc.field_bb);
              var3++;
              continue L2;
            } else {
              sj.field_G.a(var6_ref, var8, var1 + gh.field_i, var5, -1);
              var1 = var1 + hn.field_M;
              var3++;
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hj[] var5 = jc.field_h;
        hj var6 = ij.a(-8096, param0, var5, param1);
        param2 = param2 - (var6.field_y - param1 >> 246788257);
        param4 = param4 - (-param0 + var6.field_s >> 1224021441);
        tc.c(10 + param4, 10 + param2, var6.field_s, var6.field_y, 0, 128);
        if (param3 != -42) {
            return;
        }
        var6.a(param4, param2);
    }

    final static void a(int param0, int param1, ih param2) {
        da var5 = da.field_p;
        var5.c((byte) 33, param1);
        var5.field_l = var5.field_l + 1;
        int var4 = var5.field_l;
        var5.f(111, param0);
        var5.f(111, param2.field_r);
        var5.f(111, param2.field_s);
        var5.a((byte) -58, param2.field_l);
        var5.a((byte) -58, param2.field_q);
        var5.a((byte) -58, param2.field_k);
        var5.a((byte) -58, param2.field_u);
        int discarded$0 = var5.a(var4, (byte) 85);
        var5.a(-268435456, var5.field_l + -var4);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = HoldTheLine.field_D;
          if (tc.field_d > param4) {
            param1 = param1 - (-param4 + tc.field_d);
            param4 = tc.field_d;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 - -param1 <= tc.field_e) {
            break L1;
          } else {
            param1 = -param4 + tc.field_e;
            break L1;
          }
        }
        L2: {
          if (tc.field_a <= param3) {
            break L2;
          } else {
            param2 = param2 - (tc.field_a + -param3);
            param3 = tc.field_a;
            break L2;
          }
        }
        L3: {
          if (tc.field_i >= param2 + param3) {
            break L3;
          } else {
            param2 = tc.field_i - param3;
            break L3;
          }
        }
        L4: {
          if (0 >= param1) {
            break L4;
          } else {
            if (param2 <= 0) {
              break L4;
            } else {
              var6 = tc.field_j * param3 + param4;
              var7 = -param1 + tc.field_j;
              if (param0 == 255) {
                param3 = -param2;
                L5: while (true) {
                  if (param3 >= 0) {
                    return;
                  } else {
                    param4 = -param1;
                    L6: while (true) {
                      if ((param4 ^ -1) <= -1) {
                        var6 = var6 + var7;
                        param3++;
                        continue L5;
                      } else {
                        var8 = tc.field_b[var6];
                        if ((var8 & 65280) >> -1029126936 > param5) {
                          if ((var8 & 65280) >> 1616206760 >= (var8 & 16711680) >> -1512710544) {
                            L7: {
                              var9 = -60 + ((var8 & 16711680) >> 1172402255);
                              if (var9 <= 255) {
                                break L7;
                              } else {
                                var9 = 255;
                                break L7;
                              }
                            }
                            var10 = var8 & 65280;
                            var10 = 65280 & -(var10 >> 880940165) + (var10 >> 827642145);
                            var11 = (255 & var8) >> -439113245;
                            tc.field_b[var6] = kc.a(kc.a(var10, var9 << 1566120400), var11);
                            var6++;
                            param4++;
                            continue L6;
                          } else {
                            var6++;
                            param4++;
                            continue L6;
                          }
                        } else {
                          var6++;
                          param4++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final long a(int param0) {
        ((mk) this).field_h = ((mk) this).field_h + this.b(10);
        if ((((mk) this).field_h ^ -1L) > (((mk) this).field_f ^ -1L)) {
            return (-((mk) this).field_h + ((mk) this).field_f) / 1000000L;
        }
        if (param0 > -25) {
            Object var3 = null;
            ei discarded$0 = mk.a((ei) null, (byte) -102);
        }
        return 0L;
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
            field_j = null;
        }
        field_n = null;
        field_o = null;
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = HoldTheLine.field_D;
        if (param0 != 10) {
            field_e = 16;
        }
        long var2 = System.nanoTime();
        long var4 = -((mk) this).field_m + var2;
        ((mk) this).field_m = var2;
        if (var4 > -5000000000L) {
            if (5000000000L > var4) {
                ((mk) this).field_l[((mk) this).field_k] = var4;
                ((mk) this).field_k = (1 + ((mk) this).field_k) % 10;
                if (!(1 <= ((mk) this).field_g)) {
                    ((mk) this).field_g = ((mk) this).field_g + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((mk) this).field_g >= var8; var8++) {
            var6 = var6 + ((mk) this).field_l[(10 + -var8 + ((mk) this).field_k) % 10];
        }
        return var6 / (long)((mk) this).field_g;
    }

    final static void a(int param0, String param1, int param2) {
        int var3 = 0;
        aa.field_k = false;
        if (param2 != -2698) {
            return;
        }
        fi.field_nb = false;
        if (sb.field_c != null) {
            if (!sb.field_c.field_F) {
            } else {
                if (-9 == (param0 ^ -1)) {
                    if (!ci.field_o) {
                        param1 = sg.field_Z;
                    } else {
                        param1 = wb.field_j;
                    }
                    param0 = 2;
                    lh.field_a.a(param2 ^ 2795, ec.field_v);
                }
                var3 = 1;
                if (10 == param0) {
                    var3 = 0;
                    be.a(17902);
                }
                if (!(var3 == 0)) {
                    if (!(!fi.field_nb)) {
                        param1 = sd.a(fk.field_d, new String[1], true);
                    }
                    if (gn.field_g) {
                        param1 = mi.field_g;
                    }
                    sb.field_c.a(true, param1, param0);
                }
                if (-257 != (param0 ^ -1)) {
                    if (!(10 == param0)) {
                        if (!(ci.field_o)) {
                            lh.field_a.j(param2 ^ -2692);
                        }
                    }
                }
            }
        }
    }

    final static hj a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = -105 / ((66 - param1) / 56);
        hj var7 = new hj(param2, param2);
        hj var3 = var7;
        for (var5 = 0; var3.field_z.length > var5; var5++) {
            var7.field_z[var5] = param0;
        }
        return var3;
    }

    mk() {
        ((mk) this).field_g = 1;
        ((mk) this).field_f = 0L;
        ((mk) this).field_h = 0L;
        ((mk) this).field_m = 0L;
        ((mk) this).field_k = 0;
        ((mk) this).field_l = new long[10];
        ((mk) this).field_h = System.nanoTime();
        ((mk) this).field_f = System.nanoTime();
    }

    final static void a(boolean param0, kk param1) {
        if (null != param1.field_p) {
            ai.a((byte) -123, param1.field_p);
        }
        if (!param0) {
            return;
        }
        param1.d(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_o = "Effects will stack, so holding one <col=1>red</col> and<br> two <col=1>blue</col> will give mines and a major shield.";
        field_e = 256;
        field_n = new int[4];
    }
}
