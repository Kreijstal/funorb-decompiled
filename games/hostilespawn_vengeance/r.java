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
            throw wg.a((Throwable) (Object) runtimeException, "r.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1, p param2, int param3, oj param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ln.field_a.field_c[param4.field_j.b(-4)] = 0;
              param2.field_c = param4.field_c;
              param2.field_j.a((byte) 46, param4.field_j);
              param2.field_l.a(param4.field_l, param3 + -28855);
              param2.field_h = 0;
              param2.field_l.field_a = param2.field_l.field_a - 0.5;
              param2.field_e = 0;
              param2.field_l.field_f = param2.field_l.field_f - 0.5;
              param2.field_i = fh.field_f[param1];
              param2.field_l.a(6, (byte) 94, param2.field_c + 192.0);
              param2.field_l.a(20, (byte) 94, param2.field_c);
              var5_int = 0;
              if (param3 == -5) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              var6 = param1;
              if (var6 == 0) {
                var5_int = 4 - 2 * dn.field_j;
                break L2;
              } else {
                if (var6 == 1) {
                  var5_int = 5;
                  if (jf.field_g <= 0) {
                    break L2;
                  } else {
                    param2.field_i = 7;
                    jf.field_g = jf.field_g - 1;
                    break L2;
                  }
                } else {
                  if (var6 == 2) {
                    param2.field_c = param2.field_c + (double)param0;
                    var5_int = 5;
                    break L2;
                  } else {
                    if (var6 == 3) {
                      L3: {
                        L4: {
                          if (0 != param0) {
                            break L4;
                          } else {
                            if (30 <= d.field_u) {
                              break L4;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L3;
                            }
                          }
                        }
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L3;
                      }
                      L5: {
                        var6 = stackIn_22_0;
                        if (0 >= qh.field_k) {
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          break L5;
                        } else {
                          stackOut_23_0 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          var7 = stackIn_25_0;
                          if (var6 == 0) {
                            break L7;
                          } else {
                            if (var7 != 0) {
                              param2.field_i = 30;
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var6 != 0) {
                          param2.field_i = 17;
                          break L6;
                        } else {
                          param2.field_i = 4;
                          break L6;
                        }
                      }
                      var5_int = 20;
                      param2.field_c = param2.field_c + (double)(5 * param0 + 2);
                      break L2;
                    } else {
                      if (var6 == 4) {
                        L8: {
                          if (0 < gf.field_j) {
                            param2.field_i = 24;
                            gf.field_j = gf.field_j - 1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var5_int = 0;
                        break L2;
                      } else {
                        if (var6 != 5) {
                          if (6 != var6) {
                            if (var6 != 7) {
                              break L2;
                            } else {
                              L9: {
                                if (gb.field_h > 0) {
                                  gb.field_h = gb.field_h - 1;
                                  param2.field_i = 27;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var5_int = 2;
                              break L2;
                            }
                          } else {
                            var5_int = 5;
                            if (gf.field_j <= 0) {
                              break L2;
                            } else {
                              param2.field_i = 25;
                              gf.field_j = gf.field_j - 1;
                              break L2;
                            }
                          }
                        } else {
                          L10: {
                            if (gb.field_h <= 0) {
                              break L10;
                            } else {
                              gb.field_h = gb.field_h - 1;
                              param2.field_i = 26;
                              break L10;
                            }
                          }
                          var5_int = 2;
                          break L2;
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
              param2.a(param3 + 230, param2.field_c + (Math.random() - 0.5) * (double)var5_int, 50);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var5;
            stackOut_49_1 = new StringBuilder().append("r.D(").append(param0).append(44).append(param1).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L11;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L11;
            }
          }
          L12: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44).append(param3).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param4 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L12;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L12;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    final static void a(String param0, String param1, int param2) {
        try {
            ri.a((byte) 115, false, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "r.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + -125 + 41);
        }
    }

    public static void a(int param0) {
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
