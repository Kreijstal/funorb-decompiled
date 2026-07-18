/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static bd field_c;
    static bd field_b;
    static int field_a;
    static int[] field_d;
    static bd field_e;

    final static void a(int param0, int param1, ji param2, int param3, boolean param4) {
        try {
            if (param1 != 14654) {
                Object var6 = null;
                r.a(-25, -74, (ji) null, -65, false);
            }
            ha.field_w.a(param0, (byte) -4, !param4 ? true : false, param3, param2, 1000000);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "r.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, p param2, int param3, oj param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ln.field_a.field_c[param4.field_j.b(-4)] = 0;
              param2.field_c = param4.field_c;
              param2.field_j.a((byte) 46, param4.field_j);
              param2.field_l.a(param4.field_l, -28860);
              param2.field_h = 0;
              param2.field_l.field_a = param2.field_l.field_a - 0.5;
              param2.field_e = 0;
              param2.field_l.field_f = param2.field_l.field_f - 0.5;
              param2.field_i = fh.field_f[param1];
              param2.field_l.a(6, (byte) 94, param2.field_c + 192.0);
              param2.field_l.a(20, (byte) 94, param2.field_c);
              var5_int = 0;
              var6 = param1;
              if (var6 == 0) {
                var5_int = 4 - 2 * dn.field_j;
                break L1;
              } else {
                if (var6 == 1) {
                  var5_int = 5;
                  if (jf.field_g <= 0) {
                    break L1;
                  } else {
                    param2.field_i = 7;
                    jf.field_g = jf.field_g - 1;
                    break L1;
                  }
                } else {
                  if (var6 == 2) {
                    param2.field_c = param2.field_c + (double)param0;
                    var5_int = 5;
                    break L1;
                  } else {
                    if (var6 == 3) {
                      L2: {
                        L3: {
                          if (0 != param0) {
                            break L3;
                          } else {
                            if (30 <= d.field_u) {
                              break L3;
                            } else {
                              stackOut_18_0 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              break L2;
                            }
                          }
                        }
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        break L2;
                      }
                      L4: {
                        var6 = stackIn_20_0;
                        if (0 >= qh.field_k) {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          break L4;
                        } else {
                          stackOut_21_0 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var7 = stackIn_23_0;
                          if (var6 == 0) {
                            break L6;
                          } else {
                            if (var7 != 0) {
                              param2.field_i = 30;
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var6 != 0) {
                          param2.field_i = 17;
                          break L5;
                        } else {
                          param2.field_i = 4;
                          break L5;
                        }
                      }
                      var5_int = 20;
                      param2.field_c = param2.field_c + (double)(5 * param0 + 2);
                      break L1;
                    } else {
                      if (var6 == 4) {
                        L7: {
                          if (0 < gf.field_j) {
                            param2.field_i = 24;
                            gf.field_j = gf.field_j - 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var5_int = 0;
                        break L1;
                      } else {
                        if (var6 != 5) {
                          if (6 != var6) {
                            if (var6 != 7) {
                              break L1;
                            } else {
                              L8: {
                                if (gb.field_h > 0) {
                                  gb.field_h = gb.field_h - 1;
                                  param2.field_i = 27;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var5_int = 2;
                              break L1;
                            }
                          } else {
                            var5_int = 5;
                            if (gf.field_j <= 0) {
                              break L1;
                            } else {
                              param2.field_i = 25;
                              gf.field_j = gf.field_j - 1;
                              break L1;
                            }
                          }
                        } else {
                          L9: {
                            if (gb.field_h <= 0) {
                              break L9;
                            } else {
                              gb.field_h = gb.field_h - 1;
                              param2.field_i = 26;
                              break L9;
                            }
                          }
                          var5_int = 2;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (0 >= var5_int) {
              break L0;
            } else {
              param2.a(225, param2.field_c + (Math.random() - 0.5) * (double)var5_int, 50);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var5;
            stackOut_47_1 = new StringBuilder().append("r.D(").append(param0).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L10;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L10;
            }
          }
          L11: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(-5).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param4 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L11;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L11;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    final static void a(String param0, String param1) {
        try {
            ri.a((byte) 115, false, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "r.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -125 + ')');
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_d = new int[]{24, 5};
    }
}
