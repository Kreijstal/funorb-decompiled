/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj {
    static int field_c;
    static be field_d;
    static bk field_a;
    static Calendar field_b;

    final static int a(int param0, int param1, Random param2) {
        int var4 = 0;
        int var5 = Main.field_T;
        if (param1 <= 0) {
            throw new IllegalArgumentException();
        }
        if (!(!ng.a(param1, (byte) -101))) {
            return (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> -1558177248);
        }
        int var3 = -2147483648 + -(int)(4294967296L % (long)param1);
        if (param0 != 10999) {
            field_a = null;
        }
        do {
            var4 = param2.nextInt();
        } while (var4 >= var3);
        return sk.a(param0 + -10970, param1, var4);
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        ei var3 = null;
        if (param2 == null) {
            return null;
        }
        if (!(param1 >= param2.length)) {
            var3 = new ei();
            ((vf) (Object) var3).a(param2, (byte) 120);
            return (Object) (Object) var3;
        }
        if (!param0) {
            return (Object) (Object) param2;
        }
        return (Object) (Object) bf.a(0, param2);
    }

    final static kc b(byte param0) {
        int var5_int = 0;
        int var6 = Main.field_T;
        int var1 = hb.field_a[0] * na.field_q[0];
        byte[] var2 = rd.field_k[0];
        int[] var3 = new int[var1];
        int var4 = -87 % ((-29 - param0) / 59);
        for (var5_int = 0; var5_int < var1; var5_int++) {
            var3[var5_int] = jf.field_i[bc.a(255, (int) var2[var5_int])];
        }
        kc var5 = new kc(p.field_l, gk.field_a, kb.field_c[0], ml.field_b[0], na.field_q[0], hb.field_a[0], var3);
        rh.d(-128);
        return var5;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        vg stackIn_45_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        vg stackOut_44_0 = null;
        vg stackOut_43_0 = null;
        var10 = Main.field_T;
        if (param0 <= -60) {
          L0: {
            var1 = qe.field_E;
            var2 = 0;
            if (v.field_R != 2) {
              break L0;
            } else {
              var3_long = -jl.field_c + id.a(87);
              var2 = (int)((10999L + -var3_long) / 1000L);
              if ((var2 ^ -1) > -1) {
                var2 = 0;
                break L0;
              } else {
                break L0;
              }
            }
          }
          var3 = 0;
          L1: while (true) {
            if ((var3 ^ -1) <= (me.field_a.length ^ -1)) {
              return;
            } else {
              L2: {
                var4 = wd.field_d[var3];
                if (-1 < (var4 ^ -1)) {
                  var5 = af.field_jb;
                  break L2;
                } else {
                  if ((var4 ^ -1) == (cg.field_e.field_k ^ -1)) {
                    var5 = ca.field_b;
                    break L2;
                  } else {
                    var5 = wg.field_a;
                    break L2;
                  }
                }
              }
              L3: {
                var6 = me.field_a[var3];
                if (v.field_R != 2) {
                  break L3;
                } else {
                  if (var2 != 1) {
                    break L3;
                  } else {
                    L4: {
                      if ((tf.field_p.length ^ -1) >= (ia.field_d.length ^ -1)) {
                        stackOut_17_0 = ia.field_d.length;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = tf.field_p.length;
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_18_0;
                      if ((gl.field_G.length ^ -1) < (da.field_c.length ^ -1)) {
                        stackOut_20_0 = gl.field_G.length;
                        stackIn_21_0 = stackOut_20_0;
                        break L5;
                      } else {
                        stackOut_19_0 = da.field_c.length;
                        stackIn_21_0 = stackOut_19_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_21_0;
                      if ((var3 ^ -1) > -7) {
                        break L6;
                      } else {
                        if (var3 < var7 + 6) {
                          L7: {
                            if (ia.field_d.length + (var3 - 6 + -var7) >= 0) {
                              stackOut_26_0 = ia.field_d[ia.field_d.length + (-6 + (var3 - var7))];
                              stackIn_27_0 = stackOut_26_0;
                              break L7;
                            } else {
                              stackOut_25_0 = "";
                              stackIn_27_0 = stackOut_25_0;
                              break L7;
                            }
                          }
                          var6 = stackIn_27_0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var3 < var7 + 7) {
                      break L3;
                    } else {
                      if (var3 < 7 - (-var7 + -var8)) {
                        L8: {
                          if (-7 + (var3 - var7) >= da.field_c.length) {
                            stackOut_33_0 = "";
                            stackIn_34_0 = stackOut_33_0;
                            break L8;
                          } else {
                            stackOut_32_0 = da.field_c[-7 + var3 - var7];
                            stackIn_34_0 = stackOut_32_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_34_0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if (1 != (var4 ^ -1)) {
                  break L9;
                } else {
                  var6 = Integer.toString(var2);
                  break L9;
                }
              }
              L10: {
                stackOut_37_0 = 0;
                stackIn_39_0 = stackOut_37_0;
                stackIn_38_0 = stackOut_37_0;
                if (var4 < 0) {
                  stackOut_39_0 = stackIn_39_0;
                  stackOut_39_1 = 0;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  break L10;
                } else {
                  stackOut_38_0 = stackIn_38_0;
                  stackOut_38_1 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  break L10;
                }
              }
              L11: {
                var7 = hj.a(stackIn_40_0 != 0, stackIn_40_1 != 0, var6);
                var8 = dl.field_g - (var7 >> 548018209);
                if (-1 >= (var4 ^ -1)) {
                  L12: {
                    var1 = var1 + e.field_i;
                    if ((cg.field_e.field_k ^ -1) == (var4 ^ -1)) {
                      stackOut_44_0 = ie.field_m;
                      stackIn_45_0 = stackOut_44_0;
                      break L12;
                    } else {
                      stackOut_43_0 = wd.field_b;
                      stackIn_45_0 = stackOut_43_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_45_0;
                    if (var9 != null) {
                      var9.a((byte) -122, var1, tl.field_b + (a.field_o << 1452217473), var8 - tc.field_b, var7 - -(tc.field_b << -1063980095));
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var1 = var1 + a.field_o;
                  break L11;
                } else {
                  break L11;
                }
              }
              L14: {
                if ((var4 ^ -1) <= -1) {
                  c.field_u.b(var6, var8, var1 - -field_c, var5, -1);
                  var1 = var1 + (a.field_o - (-e.field_i + -tl.field_b));
                  break L14;
                } else {
                  mb.field_a.b(var6, var8, mg.field_q + var1, var5, -1);
                  var1 = var1 + sa.field_d;
                  break L14;
                }
              }
              var3++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static nc a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = Main.field_T;
        var2 = param0.length();
        if (var2 != 0) {
          if (-64 > (var2 ^ -1)) {
            return dj.field_f;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param1 != 8) {
                  var6 = null;
                  Object discarded$1 = sj.a(true, 21, (byte[]) null);
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 != 45) {
                  if ((ag.field_c.indexOf(var4) ^ -1) == 0) {
                    return ij.field_i;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var2 + -1 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return ij.field_i;
                }
              }
            }
          }
        } else {
          return ec.field_j;
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          var5 = Main.field_T;
          if (param0 > 23) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          jc.field_P = gg.field_b;
          if (255 != param3) {
            L2: {
              if (-101 < (param3 ^ -1)) {
                break L2;
              } else {
                if (-106 <= (param3 ^ -1)) {
                  mh.field_a = pf.a(-109, param2);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            mh.field_a = nc.a(param3, 0, param1);
            break L1;
          } else {
            L3: {
              stackOut_3_0 = -1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (13 <= ok.field_c) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L3;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L3;
              }
            }
            mh.field_a = il.a(stackIn_6_0, stackIn_6_1 != 0);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new be();
        field_a = new bk();
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
