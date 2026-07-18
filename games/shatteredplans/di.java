/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class di extends oh {
    int field_l;
    int field_n;
    static String field_j;
    static String field_q;
    static bi[] field_i;
    int field_h;
    static String field_k;
    int field_o;
    static boolean[] field_p;
    static int field_m;

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        sk var4_ref_sk = null;
        int var4 = 0;
        int var5_int = 0;
        sk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (cs.field_j == ih.field_f) {
              L1: {
                L2: {
                  var2_long = pr.a(14274);
                  if (0 == jc.field_o) {
                    break L2;
                  } else {
                    if (ar.field_b < 0) {
                      L3: {
                        var4_ref_sk = (sk) (Object) oe.field_h.d(0);
                        if (var4_ref_sk == null) {
                          break L3;
                        } else {
                          if (~var4_ref_sk.field_l <= ~var2_long) {
                            break L3;
                          } else {
                            var4_ref_sk.b((byte) -61);
                            rr.field_t = var4_ref_sk.field_h.length;
                            sa.field_a.field_j = 0;
                            var5_int = 0;
                            L4: while (true) {
                              if (rr.field_t <= var5_int) {
                                rm.field_e = tp.field_g;
                                tp.field_g = kp.field_n;
                                kp.field_n = ej.field_e;
                                ej.field_e = var4_ref_sk.field_j;
                                stackOut_12_0 = 1;
                                stackIn_13_0 = stackOut_12_0;
                                return stackIn_13_0 != 0;
                              } else {
                                sa.field_a.field_h[var5_int] = var4_ref_sk.field_h[var5_int];
                                var5_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_15_0 = ar.field_b;
                      stackIn_17_0 = stackOut_15_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_14_0 = ar.field_b;
                stackIn_17_0 = stackOut_14_0;
                break L1;
              }
              L5: while (true) {
                L6: {
                  if (stackIn_17_0 < 0) {
                    sa.field_a.field_j = 0;
                    if (!es.a(-74, 1)) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      return stackIn_22_0 != 0;
                    } else {
                      ar.field_b = sa.field_a.h((byte) 126);
                      sa.field_a.field_j = 0;
                      rr.field_t = param0[ar.field_b];
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                if (!uc.d((byte) -50)) {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                } else {
                  if (jc.field_o == 0) {
                    rm.field_e = tp.field_g;
                    tp.field_g = kp.field_n;
                    kp.field_n = ej.field_e;
                    ej.field_e = ar.field_b;
                    ar.field_b = -1;
                    stackOut_37_0 = 1;
                    stackIn_38_0 = stackOut_37_0;
                    break L0;
                  } else {
                    L7: {
                      var4 = jc.field_o;
                      if (0.0 != aq.field_h) {
                        var4 = (int)((double)var4 + na.field_u.nextGaussian() * aq.field_h);
                        if (var4 >= 0) {
                          break L7;
                        } else {
                          var4 = 0;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    var5 = new sk(var2_long - -(long)var4, ar.field_b, new byte[rr.field_t]);
                    var6 = 0;
                    L8: while (true) {
                      if (var6 >= rr.field_t) {
                        oe.field_h.a((byte) -113, (oh) (Object) var5);
                        ar.field_b = -1;
                        stackOut_16_0 = ar.field_b;
                        stackIn_17_0 = stackOut_16_0;
                        continue L5;
                      } else {
                        var5.field_h[var6] = sa.field_a.field_h[var6];
                        var6++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) var2;
            stackOut_39_1 = new StringBuilder().append("di.B(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + 1 + ')');
        }
        return stackIn_38_0 != 0;
    }

    final static ve a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ve stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ve stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (sl.field_m != null) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              int discarded$4 = 1;
              var2 = ji.a(var6);
              if (param1 > 115) {
                break L0;
              } else {
                di.c(false);
                break L0;
              }
            }
            L1: {
              if (var2 == null) {
                var2 = param0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (ve) (Object) sl.field_m.a(65280, (long)var2.hashCode());
            L2: while (true) {
              if (var3 != null) {
                L3: {
                  var7 = (CharSequence) (Object) var3.field_Ab;
                  int discarded$5 = 1;
                  var4 = ji.a(var7);
                  if (var4 == null) {
                    var4 = var3.field_Ab;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  stackOut_17_0 = (ve) var3;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0;
                } else {
                  var3 = (ve) (Object) sl.field_m.d((byte) -116);
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("di.D(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
    }

    final static void a(ln param0, boolean param1, ob param2) {
        RuntimeException var3 = null;
        ob stackIn_1_0 = null;
        ob stackIn_2_0 = null;
        ob stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_0_0 = null;
        ob stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ob stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = (ob) param2;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0 != null) {
                stackOut_2_0 = (ob) (Object) stackIn_2_0;
                stackOut_2_1 = param0.field_p;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (ob) (Object) stackIn_1_0;
                stackOut_1_1 = -1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((ob) (Object) stackIn_3_0).c(stackIn_3_1, (byte) -57);
              if (!param1) {
                break L2;
              } else {
                di.c(true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("di.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        field_k = null;
        field_q = null;
        field_i = null;
        if (!param0) {
            return;
        }
        field_p = null;
    }

    final static void a(boolean param0, boolean param1) {
        qr stackIn_5_0 = null;
        qr stackIn_6_0 = null;
        qr stackIn_7_0 = null;
        qr stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        qr stackIn_9_0 = null;
        qr stackIn_10_0 = null;
        qr stackIn_11_0 = null;
        qr stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        qr stackIn_22_0 = null;
        qr stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        qr stackIn_24_0 = null;
        qr stackIn_25_0 = null;
        qr stackIn_26_0 = null;
        qr stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        qr stackOut_4_0 = null;
        qr stackOut_5_0 = null;
        qr stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        qr stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qr stackOut_8_0 = null;
        qr stackOut_9_0 = null;
        qr stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qr stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        qr stackOut_19_0 = null;
        qr stackOut_20_0 = null;
        qr stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        qr stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        qr stackOut_23_0 = null;
        qr stackOut_24_0 = null;
        qr stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        qr stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        L0: {
          ke.a(-6187, gf.field_b - -640 >> 1, gf.field_k, 0, -640 + gf.field_b >> 1);
          if (qa.field_t <= 0) {
            break L0;
          } else {
            L1: {
              if (gn.field_y != null) {
                gn.field_y.c(ia.field_j.field_hb, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_4_0 = ia.field_j;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_5_0 = (qr) (Object) stackIn_5_0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (on.field_b) {
                    break L3;
                  } else {
                    stackOut_6_0 = (qr) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (qr) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              L5: {
                ((qr) (Object) stackIn_8_0).b(stackIn_8_1 != 0, 102);
                stackOut_8_0 = se.field_i;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_9_0 = (qr) (Object) stackIn_9_0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (on.field_b) {
                    break L5;
                  } else {
                    stackOut_10_0 = (qr) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (qr) (Object) stackIn_11_0;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L4;
            }
            ((qr) (Object) stackIn_12_0).b(stackIn_12_1 != 0, 119);
            break L0;
          }
        }
        L6: {
          L7: {
            if (bc.field_b > 0) {
              break L7;
            } else {
              if (ee.field_k <= 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (null != gn.field_y) {
              gn.field_y.c(am.field_xb.field_hb, 0);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              stackOut_19_0 = am.field_xb;
              stackIn_22_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param1) {
                break L10;
              } else {
                stackOut_20_0 = (qr) (Object) stackIn_20_0;
                stackIn_22_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (ti.field_e) {
                  break L10;
                } else {
                  stackOut_21_0 = (qr) (Object) stackIn_21_0;
                  stackOut_21_1 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  break L9;
                }
              }
            }
            stackOut_22_0 = (qr) (Object) stackIn_22_0;
            stackOut_22_1 = 0;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            break L9;
          }
          L11: {
            L12: {
              ((qr) (Object) stackIn_23_0).b(stackIn_23_1 != 0, 123);
              stackOut_23_0 = pf.field_g;
              stackIn_26_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (!param1) {
                break L12;
              } else {
                stackOut_24_0 = (qr) (Object) stackIn_24_0;
                stackIn_26_0 = stackOut_24_0;
                stackIn_25_0 = stackOut_24_0;
                if (ti.field_e) {
                  break L12;
                } else {
                  stackOut_25_0 = (qr) (Object) stackIn_25_0;
                  stackOut_25_1 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  break L11;
                }
              }
            }
            stackOut_26_0 = (qr) (Object) stackIn_26_0;
            stackOut_26_1 = 0;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            break L11;
          }
          ((qr) (Object) stackIn_27_0).b(stackIn_27_1 != 0, 115);
          break L6;
        }
        ln.f((byte) 123);
    }

    di() {
    }

    final static void a(int param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        pf var4 = null;
        Object var5 = null;
        ve var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        fc var16 = null;
        fc var17 = null;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ub stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        ub stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        ub stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        ub stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        qr stackOut_18_0 = null;
        qr stackOut_20_0 = null;
        String stackOut_20_1 = null;
        qr stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_3_0 = wg.field_a.field_Db;
              stackOut_3_1 = param2 * ((cr.field_c - -2) * 3);
              stackOut_3_2 = 2 + cr.field_c;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              if (wg.field_a.field_Db != hp.field_l) {
                stackOut_5_0 = (ub) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                break L1;
              } else {
                stackOut_4_0 = (ub) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((ub) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3 != 0, -76, param1, 2) ? 1 : 0;
                var4 = wg.field_a.field_Eb.field_M;
                if (2 == po.field_b) {
                  break L3;
                } else {
                  if (1 == po.field_b) {
                    break L3;
                  } else {
                    wg.field_a.field_s = false;
                    wg.field_a.field_Db.field_zb.field_z = tb.field_c;
                    fj.a(false, wg.field_a.field_Eb);
                    break L2;
                  }
                }
              }
              wg.field_a.field_Db.field_zb.field_z = null;
              wg.field_a.field_s = true;
              var5 = null;
              var6 = (ve) (Object) var4.d(0);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (wg.field_a.field_Fb.field_rb == 0) {
                      break L5;
                    } else {
                      lg.field_e = new jp(wg.field_a.field_Fb.field_B, wg.field_a.field_Fb.field_N, wg.field_a.field_Fb.field_K, wg.field_a.field_Fb.field_mb, ob.field_l, h.field_v, ii.field_u, ii.field_u);
                      ia.field_b = 2;
                      break L5;
                    }
                  }
                  if (wg.field_a.field_yb.field_rb == 0) {
                    break L2;
                  } else {
                    lg.field_e = new jp(wg.field_a.field_yb.field_B, wg.field_a.field_yb.field_N, wg.field_a.field_yb.field_K, wg.field_a.field_yb.field_mb, ln.field_E, h.field_v, ii.field_u, ii.field_u);
                    ia.field_b = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null != var6.field_M) {
                      break L6;
                    } else {
                      var6.field_Cb = new qr(0L, ek.field_E);
                      var6.a(4, var6.field_Cb);
                      var6.field_Db = new qr(0L, ek.field_E);
                      var6.a(4, var6.field_Db);
                      var7 = 1;
                      var6.e((byte) -123);
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_K = wg.field_a.field_Eb.field_K;
                    var6.field_Cb.a(var6.field_K, cr.field_c, (byte) 78, 0, 0);
                    var8 = 0;
                    if (var6.field_Bb == null) {
                      break L7;
                    } else {
                      if (var6.field_Bb.equals((Object) (Object) "")) {
                        break L7;
                      } else {
                        var6.field_Db.field_jb = 16737894;
                        var6.field_Db.field_pb = ke.field_i;
                        var8 = 1;
                        var6.field_Db.a(3 + ke.field_i.field_o, cr.field_c, (byte) 126, 0, 0);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_K;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = ke.field_i.field_o - -3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var6.field_Cb;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (0 < var10) {
                      stackOut_20_0 = (qr) (Object) stackIn_20_0;
                      stackOut_20_1 = nq.a(var6.field_Cb.field_nb, var6.field_Ab, var10);
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (qr) (Object) stackIn_19_0;
                      stackOut_19_1 = var6.field_Ab;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_z = stackIn_21_1;
                    if (var6.field_Cb.field_z.equals((Object) (Object) var6.field_Ab)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_24_0;
                    var6.field_Cb.a(var10, cr.field_c, (byte) 39, 0, var9);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_gb = cr.field_c + -var6.field_mb;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      wg.field_a.field_Eb.a(2, (qr) var5, (qr) (Object) var6, (byte) 55);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (var6.field_Db == null) {
                        break L14;
                      } else {
                        if (!var6.field_Db.field_L) {
                          break L14;
                        } else {
                          dn.field_k = var6.field_Bb;
                          break L13;
                        }
                      }
                    }
                    if (!var6.field_Cb.field_L) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        dn.field_k = var6.field_Ab;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    var5 = (Object) (Object) var6;
                    if (0 != var6.field_rb) {
                      tp.a((int[]) null, 0L, var6.field_Ab, var6.field_Eb, 293, wg.field_a.field_Db, (qr) (Object) var6, -1, -1);
                      var16 = hp.field_m;
                      var13_ref_String = qg.field_o;
                      var16.field_j.a(1, 7, var13_ref_String);
                      var17 = hp.field_m;
                      var13 = nh.field_p;
                      var14 = td.field_P;
                      var17.field_j.b(0, 0, 0, var13, var14);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var6 = (ve) (Object) var4.a((byte) -71);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "di.F(" + -7904 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Owner";
        field_k = "Public chat is unavailable while setting up a rated game.";
        field_p = new boolean[112];
    }
}
