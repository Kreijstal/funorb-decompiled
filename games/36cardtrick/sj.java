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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = Main.field_T;
        try {
          L0: {
            if (param1 > 0) {
              if (ng.a(param1, (byte) -101)) {
                stackOut_5_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                var3_int = -2147483648 + -(int)(4294967296L % (long)param1);
                L1: while (true) {
                  var4 = param2.nextInt();
                  if (var4 >= var3_int) {
                    continue L1;
                  } else {
                    stackOut_9_0 = sk.a(29, param1, var4);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("sj.A(").append(10999).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        ei var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ei stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (136 < param2.length) {
                var3 = new ei();
                ((vf) (Object) var3).a(param2, (byte) 120);
                stackOut_5_0 = (ei) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param2;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("sj.G(").append(false).append(',').append(136).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return (Object) (Object) stackIn_6_0;
    }

    final static kc b() {
        int var5_int = 0;
        int var6 = Main.field_T;
        int var1 = hb.field_a[0] * na.field_q[0];
        byte[] var2 = rd.field_k[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        for (var5_int = 0; var5_int < var1; var5_int++) {
            var3[var5_int] = jf.field_i[bc.a(255, (int) var2[var5_int])];
        }
        kc var5 = new kc(p.field_l, gk.field_a, kb.field_c[0], ml.field_b[0], na.field_q[0], hb.field_a[0], var3);
        rh.d(-128);
        return var5;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
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
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        vg stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        vg stackOut_45_0 = null;
        vg stackOut_44_0 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              var1_int = qe.field_E;
              var2 = 0;
              if (v.field_R != 2) {
                break L1;
              } else {
                var3_long = -jl.field_c + id.a(87);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~me.field_a.length) {
                break L0;
              } else {
                L3: {
                  var4 = wd.field_d[var3];
                  if (var4 < 0) {
                    var5 = af.field_jb;
                    break L3;
                  } else {
                    if (~var4 == ~cg.field_e.field_k) {
                      var5 = ca.field_b;
                      break L3;
                    } else {
                      var5 = wg.field_a;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = me.field_a[var3];
                  if (v.field_R != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (~tf.field_p.length >= ~ia.field_d.length) {
                          stackOut_18_0 = ia.field_d.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = tf.field_p.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (~gl.field_G.length < ~da.field_c.length) {
                          stackOut_21_0 = gl.field_G.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L6;
                        } else {
                          stackOut_20_0 = da.field_c.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_22_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var3 < var7 + 6) {
                            L8: {
                              if (ia.field_d.length + (var3 - 6 + -var7) >= 0) {
                                stackOut_27_0 = ia.field_d[ia.field_d.length + (-6 + (var3 - var7))];
                                stackIn_28_0 = stackOut_27_0;
                                break L8;
                              } else {
                                stackOut_26_0 = "";
                                stackIn_28_0 = stackOut_26_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var3 < var7 + 7) {
                        break L4;
                      } else {
                        if (var3 < 7 - (-var7 + -var8)) {
                          L9: {
                            if (-7 + (var3 - var7) >= da.field_c.length) {
                              stackOut_34_0 = "";
                              stackIn_35_0 = stackOut_34_0;
                              break L9;
                            } else {
                              stackOut_33_0 = da.field_c[-7 + var3 - var7];
                              stackIn_35_0 = stackOut_33_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_35_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_38_0 = 0;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_39_0 = stackOut_38_0;
                  if (var4 < 0) {
                    stackOut_40_0 = stackIn_40_0;
                    stackOut_40_1 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    break L11;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    break L11;
                  }
                }
                L12: {
                  var7 = hj.a(stackIn_41_0 != 0, stackIn_41_1 != 0, var6);
                  var8 = dl.field_g - (var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + e.field_i;
                      if (~cg.field_e.field_k == ~var4) {
                        stackOut_45_0 = ie.field_m;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = wd.field_b;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_46_0;
                      if (var9 != null) {
                        var9.a((byte) -122, var1_int, tl.field_b + (a.field_o << 1), var8 - tc.field_b, var7 - -(tc.field_b << 1));
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + a.field_o;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 >= 0) {
                    c.field_u.b(var6, var8, var1_int - -field_c, var5, -1);
                    var1_int = var1_int + (a.field_o - (-e.field_i + -tl.field_b));
                    break L15;
                  } else {
                    mb.field_a.b(var6, var8, mg.field_q + var1_int, var5, -1);
                    var1_int = var1_int + sa.field_d;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "sj.E(" + -100 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static nc a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_15_0 = null;
        nc stackIn_19_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_6_0 = null;
        nc stackOut_18_0 = null;
        nc stackOut_14_0 = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int != 0) {
            if (var2_int > 63) {
              stackOut_6_0 = dj.field_f;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var3 >= var2_int) {
                  return null;
                } else {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if (ag.field_c.indexOf(var4) == -1) {
                        stackOut_18_0 = ij.field_i;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        break L1;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var2_int + -1 != var3) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_14_0 = ij.field_i;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            stackOut_2_0 = ec.field_j;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("sj.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 8 + ')');
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              jc.field_P = gg.field_b;
              if (255 != param3) {
                L2: {
                  if (param3 < 100) {
                    break L2;
                  } else {
                    if (param3 <= 105) {
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
                  stackOut_2_0 = -1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (13 <= ok.field_c) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L3;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L3;
                  }
                }
                mh.field_a = il.a(stackIn_5_0, stackIn_5_1 != 0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("sj.D(").append(44).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
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
