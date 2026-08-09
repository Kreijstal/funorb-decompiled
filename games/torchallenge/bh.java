/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends ma {
    static kh field_o;
    private dj field_s;
    static int field_t;
    static boolean field_p;
    static boolean field_r;
    static String[] field_m;
    private dj field_n;
    static lj field_q;

    final rj a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rj stackIn_3_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_9_0 = null;
        rj stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_s.field_v.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackIn_3_0 = lk.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (mh.a(var3, true, var4)) {
                if (param0 == 24) {
                  if (this.a(param0 + -25, param1)) {
                    stackIn_13_0 = lk.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return tf.field_w;
                  }
                } else {
                  stackIn_9_0 = (rj) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = lk.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("bh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 != 1) {
            field_p = true;
        }
        field_o = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, ka[] param4, int param5, int param6, ka[] param7, int param8, int param9, int param10, int param11, int param12, int param13, eg param14, int param15, int param16, int param17, ka[] param18, int param19, eg param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          L0: {
            ee.a(param10, param19, new h(param18), param2, param3, param0, 0, param1, param13, param11, param12, param17, param14, param5, param20, param6, param9, new h(param4), param8, new h(param7), param15);
            var21_int = -19 / ((-15 - param16) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var21 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var21);

            stackIn_4_1 = new StringBuilder().append("bh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');

            if (param18 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param19).append(',');

            if (param20 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), stackIn_17_2 + ')');
        }
    }

    bh(dj param0, dj param1, dj param2) {
        super(param0);
        try {
            this.field_n = param2;
            this.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_n.field_v.toLowerCase();
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= param0) {
                break L1;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var5 = var3.lastIndexOf("@");
                  if (-1 < (var5 ^ -1)) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var5) {
                      break L1;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) >= 0) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (0 > var4.indexOf(var7)) {
                          break L1;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_13_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("bh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -123) {
                break L1;
              } else {
                bh.f(-13);
                break L1;
              }
            }
            var1_int = 0;
            var2 = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var10 = 0;
            L2: while (true) {
              L3: {
                if (var10 >= -1 + rd.field_p[rf.field_ib]) {
                  break L3;
                } else {
                  var6 = var1_int;
                  var1_int = var1_int + fa.field_m[rf.field_ib][var10];
                  var7 = var1_int;
                  if ((var1_int ^ -1) >= (nd.field_e ^ -1)) {
                    var10++;
                    continue L2;
                  } else {
                    wj.field_e = var10;
                    break L3;
                  }
                }
              }
              L4: {
                var5 = qk.field_nb[rf.field_ib][wj.field_e - -1][1];
                var9 = -var6 + var7;
                var3 = qk.field_nb[rf.field_ib][wj.field_e - -1][0];
                var4 = qk.field_nb[rf.field_ib][wj.field_e][1];
                var8 = nd.field_e + -var6;
                var2 = qk.field_nb[rf.field_ib][wj.field_e][0];
                if (var9 != 0) {
                  cg.field_e[1] = (var4 << -1603526652) + ((var5 + -var4) * var8 << -294451644) / var9;
                  cg.field_e[0] = (var2 << 641871780) - -(((-var2 + var3) * var8 << 1272992996) / var9);
                  break L4;
                } else {
                  cg.field_e[0] = var2 << -604190748;
                  cg.field_e[1] = var4 << 932070180;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "bh.B(" + param0 + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_s.field_v.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              var5 = var4;
              if (gi.a((byte) 89, var5)) {
                stackIn_6_0 = oh.field_c;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (li.a((byte) -82, var5)) {
                  stackIn_10_0 = rd.field_j;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (param1 == -24) {
                    if (qf.a(-8503, var5)) {
                      stackIn_17_0 = ah.field_c;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (this.a(-1, param0)) {
                        stackIn_21_0 = pd.field_a;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (var6.length() <= 0) {
                          stackIn_35_0 = ol.field_i;
                          decompiledRegionSelector0 = 9;
                          break L0;
                        } else {
                          if (!kc.a(var6, (byte) 59, var5)) {
                            if (!bc.a((byte) -127, var5, var6)) {
                              if (!ja.a(var5, 94, var6)) {
                                stackIn_33_0 = oh.field_c;
                                decompiledRegionSelector0 = 8;
                                break L0;
                              } else {
                                stackIn_31_0 = wc.field_f;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            } else {
                              stackIn_28_0 = k.field_k;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            stackIn_25_0 = wc.field_f;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_13_0 = (String) null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("bh.C(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L1;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_28_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_33_0;
                        } else {
                          return stackIn_35_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_r = true;
        field_p = false;
    }
}
