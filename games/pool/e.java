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
        if (!param0) {
          return;
        } else {
          field_f = null;
          field_g = null;
          field_c = null;
          field_h = null;
          return;
        }
    }

    final static void a(int param0) {
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
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        nm stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        String stackOut_23_0 = null;
        String stackOut_22_0 = null;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_36_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        nm stackOut_43_0 = null;
        nm stackOut_42_0 = null;
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
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              var3 = 0;
              if (param0 <= -78) {
                break L2;
              } else {
                field_e = (wg) null;
                break L2;
              }
            }
            L3: while (true) {
              if (dq.field_j.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = bm.field_c[var3];
                  if ((var4 ^ -1) > -1) {
                    var5 = tm.field_f;
                    break L4;
                  } else {
                    if (var4 != n.field_W.field_h) {
                      var5 = vn.field_c;
                      break L4;
                    } else {
                      var5 = ch.field_H;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = dq.field_j[var3];
                  if (-3 != (oa.field_h ^ -1)) {
                    break L5;
                  } else {
                    if (-2 != (var2 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (va.field_W.length <= hk.field_n.length) {
                          stackOut_17_0 = hk.field_n.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        } else {
                          stackOut_16_0 = va.field_W.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_18_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 < 6 + var7) {
                            L8: {
                              if (-1 < (-var7 + (hk.field_n.length + -6) + var3 ^ -1)) {
                                stackOut_23_0 = "";
                                stackIn_24_0 = stackOut_23_0;
                                break L8;
                              } else {
                                stackOut_22_0 = hk.field_n[var3 - (6 + -hk.field_n.length - -var7)];
                                stackIn_24_0 = stackOut_22_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_24_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (rq.field_H.length >= fo.field_a.length) {
                          stackOut_27_0 = rq.field_H.length;
                          stackIn_28_0 = stackOut_27_0;
                          break L9;
                        } else {
                          stackOut_26_0 = fo.field_a.length;
                          stackIn_28_0 = stackOut_26_0;
                          break L9;
                        }
                      }
                      var8 = stackIn_28_0;
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (var3 - 7 + -var7 >= rq.field_H.length) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L10;
                            } else {
                              stackOut_31_0 = rq.field_H[-7 + var3 + -var7];
                              stackIn_33_0 = stackOut_31_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if ((var4 ^ -1) != 1) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  stackOut_36_0 = (String) (var6);
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if (var4 < 0) {
                    stackOut_38_0 = (String) ((Object) stackIn_38_0);
                    stackOut_38_1 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    break L12;
                  } else {
                    stackOut_37_0 = (String) ((Object) stackIn_37_0);
                    stackOut_37_1 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    break L12;
                  }
                }
                L13: {
                  var7 = ch.a(stackIn_39_0, stackIn_39_1 != 0, false);
                  var8 = -(var7 >> 56558657) + nn.field_c;
                  if ((var4 ^ -1) <= -1) {
                    L14: {
                      var1_int = var1_int + qi.field_e;
                      if (var4 != n.field_W.field_h) {
                        stackOut_43_0 = bk.field_m;
                        stackIn_44_0 = stackOut_43_0;
                        break L14;
                      } else {
                        stackOut_42_0 = td.field_e;
                        stackIn_44_0 = stackOut_42_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_44_0;
                      if (var9 != null) {
                        var9.a(var7 - -(rm.field_b << -1897890527), var1_int, -6316, var8 + -rm.field_b, (fj.field_h << -1956731039) + ch.field_I);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + fj.field_h;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (-1 < (var4 ^ -1)) {
                    dq.field_f.d(var6, var8, vc.field_K + var1_int, var5, -1);
                    var1_int = var1_int + qe.field_y;
                    break L16;
                  } else {
                    gj.field_R.d(var6, var8, var1_int - -mm.field_b, var5, -1);
                    var1_int = var1_int + (ch.field_I + qi.field_e + fj.field_h);
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "e.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, uf param1) {
        qe var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (!oh.field_h) {
                break L1;
              } else {
                var2 = param1.field_I.j(60);
                kh.field_Vb.a(true, false);
                if (hk.field_t.field_R != 1) {
                  if ((rl.field_b.field_R ^ -1) != -2) {
                    break L1;
                  } else {
                    var2.a(me.field_n, true);
                    oh.field_h = false;
                    tn.a(param1, -16813);
                    stackOut_5_0 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var2.a(ag.field_a, true);
                  oh.field_h = false;
                  tn.a(param1, -16813);
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 == -19839) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              field_h = (String[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2_ref);
            stackOut_11_1 = new StringBuilder().append("e.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    static {
        field_g = "Confirm Password: ";
        field_c = new int[5];
        field_d = new int[]{2, 20, 21, 49, 5, 9};
        field_h = new String[]{"<%0> wins!", "Foul! <%0> hit an opponent's ball first!", "Foul! <%0> hit the 8 ball first!", "Foul! <%0> potted the cue ball!", "Foul! <%0> potted opponent's ball!", "<%0> potted the 8 ball!", "Foul! Not enough balls touched the cushion!", "Foul! Didn't hit any balls!", "Foul! Hit wrong ball first!", "<%0> loses! Fouled and potted the 9 ball!", "<%0> wins! Potted the 9 ball!", "Foul snooker!", "Foul! No balls touched any cushions!", "Foul! No object balls touched any cushions!", "Foul! Not enough object balls touched the cushion!", "Foul! No target balls touched any cushions!", "Foul! Not enough target balls touched the cushion!", "Foul! <%0> ran out of time!", "<%0>: Didn't pot anything! Lose a life!", "<%0>: Foul! Lose a life!", "<%0>: Potted the black! Gain a life!", "<%0>: Out of time! Lose a life!", "<%0>: Foul break! Lose a life!"};
        field_b = "Set up new unrated game";
        field_f = "To Customer Support";
    }
}
