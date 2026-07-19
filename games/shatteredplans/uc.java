/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends vd {
    static int field_v;
    static String field_z;
    static String field_y;
    static boolean field_B;
    static int field_A;
    private int field_x;
    private int field_u;
    static int[] field_w;

    final static ro a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ro stackIn_24_0 = null;
        ro stackIn_36_0 = null;
        ro stackIn_40_0 = null;
        ro stackIn_46_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ro stackOut_3_0 = null;
        ro stackOut_45_0 = null;
        ro stackOut_39_0 = null;
        ro stackOut_35_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ro stackOut_23_0 = null;
        ro stackOut_10_0 = null;
        ro stackOut_6_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackOut_3_0 = fg.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var2_int) {
                      if (param0 >= -43) {
                        stackOut_45_0 = (ro) null;
                        stackIn_46_0 = stackOut_45_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        return null;
                      }
                    } else {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 != 46) {
                          if (0 != (hr.field_c.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L2;
                          } else {
                            stackOut_39_0 = as.field_t;
                            stackIn_40_0 = stackOut_39_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L3: {
                            if (0 == var4) {
                              break L3;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  var3 = 1;
                                  break L2;
                                }
                              }
                            }
                          }
                          stackOut_35_0 = as.field_t;
                          stackIn_36_0 = stackOut_35_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  if (param1.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (-1 + var2_int > var4) {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackOut_19_0 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                break L6;
                              } else {
                                stackOut_18_0 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                break L6;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 != 0) {
                                  break L7;
                                } else {
                                  stackOut_23_0 = as.field_t;
                                  stackIn_24_0 = stackOut_23_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_10_0 = as.field_t;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = cm.field_e;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var2);
            stackOut_48_1 = new StringBuilder().append("uc.B(").append(param0).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_40_0;
                  } else {
                    return stackIn_46_0;
                  }
                }
              }
            }
          }
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new hh(param0, cf.field_H, sj.field_a, mc.field_s, cm.field_g, hd.field_q);
              pd.a(param1 ^ param1);
              stackOut_3_0 = (hh) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("uc.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hh) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(byte param0) {
        hh discarded$0 = null;
        field_z = null;
        field_w = null;
        if (param0 <= 61) {
            byte[] var2 = (byte[]) null;
            discarded$0 = uc.a((byte[]) null, -44);
        }
        field_y = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, boolean param6, bi[] param7, byte param8, int param9, bi[] param10, nq param11, boolean param12, int param13, int param14) {
        try {
            if (param8 != -87) {
                uc.e((byte) -47);
            }
            ub.a(param2, param11, nr.field_h, param1, param3, param9, param11, param4, em.field_j, 0, param1, new v(param10), param2, ih.field_b, wo.field_a, param13, param0, dn.field_l, qi.field_j, new v(param7));
            kb.a(param6, true, param12, param14, param5);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "uc.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (!(-1 != rr.field_t)) {
            if (!es.a(-57, 1)) {
                return false;
            }
            rr.field_t = sa.field_a.j(-54);
            sa.field_a.field_j = 0;
        }
        if (-2 == rr.field_t) {
            if (!es.a(118, 2)) {
                return false;
            }
            rr.field_t = sa.field_a.f(-20976);
            sa.field_a.field_j = 0;
        }
        if (param0 > -25) {
            nq var2 = (nq) null;
            uc.a(-68, -91, -81, 82, -51, (String) null, true, (bi[]) null, (byte) -67, 2, (bi[]) null, (nq) null, true, 22, -30);
        }
        return es.a(-78, rr.field_t);
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        this.field_u = param5;
        this.field_x = param4;
    }

    final void a(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(this.field_s)) {
            return;
        }
        for (var3 = 0; this.field_m > var3; var3++) {
            var2 = ui.a(this.field_x, this.field_u, -115, 256 * var3 / this.field_m);
            gf.j(var3 + this.field_k, this.field_t, this.field_i, var2);
        }
        int var4 = 3 % ((67 - param0) / 47);
    }

    static {
        field_y = "End Game";
        field_v = 0;
        field_z = "All games";
    }
}
