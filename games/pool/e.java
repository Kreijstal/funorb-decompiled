/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String[] field_h;
    static vh field_a;
    static String field_g;
    static wg field_e;
    static int[] field_c;
    static int[] field_d;
    static String field_b;
    static String field_f;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_c = null;
        field_h = null;
    }

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nm var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        nm stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_37_0 = null;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        nm stackOut_44_0 = null;
        nm stackOut_43_0 = null;
        var10 = Pool.field_O;
        try {
          L0: {
            L1: {
              var1_int = uh.field_n;
              var2 = 0;
              if (2 == oa.field_h) {
                var3_long = -ap.field_y + rl.a((byte) -112);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 <= var2) {
                  var3 = 0;
                  field_e = null;
                  break L1;
                } else {
                  var2 = 0;
                  var3 = 0;
                  field_e = null;
                  break L1;
                }
              } else {
                var3 = 0;
                field_e = null;
                break L1;
              }
            }
            L2: while (true) {
              if (~dq.field_j.length >= ~var3) {
                break L0;
              } else {
                L3: {
                  var4 = bm.field_c[var3];
                  if (var4 < 0) {
                    var5 = tm.field_f;
                    break L3;
                  } else {
                    if (var4 != n.field_W.field_h) {
                      var5 = vn.field_c;
                      break L3;
                    } else {
                      var5 = ch.field_H;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = dq.field_j[var3];
                  if (oa.field_h != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (~va.field_W.length >= ~hk.field_n.length) {
                          stackOut_18_0 = hk.field_n.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L5;
                        } else {
                          stackOut_17_0 = va.field_W.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_19_0;
                        if (6 > var3) {
                          break L6;
                        } else {
                          if (var3 < 6 + var7) {
                            L7: {
                              if (-var7 + (hk.field_n.length + -6) + var3 < 0) {
                                stackOut_24_0 = "";
                                stackIn_25_0 = stackOut_24_0;
                                break L7;
                              } else {
                                stackOut_23_0 = hk.field_n[var3 - (6 + -hk.field_n.length - -var7)];
                                stackIn_25_0 = stackOut_23_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_25_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (~rq.field_H.length <= ~fo.field_a.length) {
                          stackOut_28_0 = rq.field_H.length;
                          stackIn_29_0 = stackOut_28_0;
                          break L8;
                        } else {
                          stackOut_27_0 = fo.field_a.length;
                          stackIn_29_0 = stackOut_27_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_29_0;
                      if (~(var7 + 7) < ~var3) {
                        break L4;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L4;
                        } else {
                          L9: {
                            if (var3 - 7 + -var7 >= rq.field_H.length) {
                              stackOut_33_0 = "";
                              stackIn_34_0 = stackOut_33_0;
                              break L9;
                            } else {
                              stackOut_32_0 = rq.field_H[-7 + var3 + -var7];
                              stackIn_34_0 = stackOut_32_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_34_0;
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
                  stackOut_37_0 = (String) var6;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var4 < 0) {
                    stackOut_39_0 = (String) (Object) stackIn_39_0;
                    stackOut_39_1 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L11;
                  } else {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L11;
                  }
                }
                L12: {
                  int discarded$1 = 0;
                  var7 = ch.a(stackIn_40_0, stackIn_40_1 != 0);
                  var8 = -(var7 >> 1) + nn.field_c;
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + qi.field_e;
                      if (var4 != n.field_W.field_h) {
                        stackOut_44_0 = bk.field_m;
                        stackIn_45_0 = stackOut_44_0;
                        break L13;
                      } else {
                        stackOut_43_0 = td.field_e;
                        stackIn_45_0 = stackOut_43_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_45_0;
                      if (var9 != null) {
                        var9.a(var7 - -(rm.field_b << 1), var1_int, -6316, var8 + -rm.field_b, (fj.field_h << 1) + ch.field_I);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + fj.field_h;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var4 < 0) {
                  dq.field_f.d(var6, var8, vc.field_K + var1_int, var5, -1);
                  var1_int = var1_int + qe.field_y;
                  var3++;
                  var3++;
                  continue L2;
                } else {
                  gj.field_R.d(var6, var8, var1_int - -mm.field_b, var5, -1);
                  var1_int = var1_int + (ch.field_I + qi.field_e + fj.field_h);
                  var3++;
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "e.B(" + 29383 + 41);
        }
    }

    final static boolean a(int param0, uf param1) {
        qe var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
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
              if (!oh.field_h) {
                break L1;
              } else {
                var2 = param1.field_I.j(60);
                kh.field_Vb.a(true, false);
                if (hk.field_t.field_R != 1) {
                  if (rl.field_b.field_R != 1) {
                    break L1;
                  } else {
                    var2.a(me.field_n, true);
                    oh.field_h = false;
                    int discarded$4 = -16813;
                    tn.a(param1);
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0 != 0;
                  }
                } else {
                  var2.a(ag.field_a, true);
                  oh.field_h = false;
                  int discarded$5 = -16813;
                  tn.a(param1);
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("e.A(").append(-19839).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Confirm Password: ";
        field_c = new int[5];
        field_d = new int[]{2, 20, 21, 49, 5, 9};
        field_h = new String[]{"<%0> wins!", "Foul! <%0> hit an opponent's ball first!", "Foul! <%0> hit the 8 ball first!", "Foul! <%0> potted the cue ball!", "Foul! <%0> potted opponent's ball!", "<%0> potted the 8 ball!", "Foul! Not enough balls touched the cushion!", "Foul! Didn't hit any balls!", "Foul! Hit wrong ball first!", "<%0> loses! Fouled and potted the 9 ball!", "<%0> wins! Potted the 9 ball!", "Foul snooker!", "Foul! No balls touched any cushions!", "Foul! No object balls touched any cushions!", "Foul! Not enough object balls touched the cushion!", "Foul! No target balls touched any cushions!", "Foul! Not enough target balls touched the cushion!", "Foul! <%0> ran out of time!", "<%0>: Didn't pot anything! Lose a life!", "<%0>: Foul! Lose a life!", "<%0>: Potted the black! Gain a life!", "<%0>: Out of time! Lose a life!", "<%0>: Foul break! Lose a life!"};
        field_b = "Set up new unrated game";
        field_f = "To Customer Support";
    }
}
