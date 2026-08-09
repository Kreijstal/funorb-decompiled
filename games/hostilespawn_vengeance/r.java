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
                ji var6 = (ji) null;
                r.a(-25, -74, (ji) null, -65, false);
            }
            ha.field_w.a(param0, (byte) -4, !param4 ? true : false, param3, param2, 1000000);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "r.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, p param2, int param3, oj param4) {
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                field_d = (int[]) null;
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
                  if (-1 <= (jf.field_g ^ -1)) {
                    break L2;
                  } else {
                    param2.field_i = 7;
                    jf.field_g = jf.field_g - 1;
                    break L2;
                  }
                } else {
                  if (-3 == (var6 ^ -1)) {
                    param2.field_c = param2.field_c + (double)param0;
                    var5_int = 5;
                    break L2;
                  } else {
                    if (var6 == 3) {
                      L3: {
                        if (0 == param0) {
                          if (30 > d.field_u) {
                            stackIn_24_0 = 1;
                            break L3;
                          } else {
                            stackIn_24_0 = 0;
                            break L3;
                          }
                        } else {
                          stackIn_24_0 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        var6 = stackIn_24_0;
                        if (0 >= qh.field_k) {
                          stackIn_27_0 = 0;
                          break L4;
                        } else {
                          stackIn_27_0 = 1;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var7 = stackIn_27_0;
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
                      break L2;
                    } else {
                      if (-5 == (var6 ^ -1)) {
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
                        break L2;
                      } else {
                        if (var6 != 5) {
                          if (6 != var6) {
                            if (var6 != 7) {
                              break L2;
                            } else {
                              L8: {
                                if (-1 > (gb.field_h ^ -1)) {
                                  gb.field_h = gb.field_h - 1;
                                  param2.field_i = 27;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var5_int = 2;
                              break L2;
                            }
                          } else {
                            var5_int = 5;
                            if ((gf.field_j ^ -1) >= -1) {
                              break L2;
                            } else {
                              param2.field_i = 25;
                              gf.field_j = gf.field_j - 1;
                              break L2;
                            }
                          }
                        } else {
                          L9: {
                            if (-1 <= (gb.field_h ^ -1)) {
                              break L9;
                            } else {
                              gb.field_h = gb.field_h - 1;
                              param2.field_i = 26;
                              break L9;
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
          L10: {
            var5 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var5);

            stackIn_53_1 = new StringBuilder().append("r.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L10;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "null";
              break L11;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackIn_57_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_54_0), stackIn_57_2 + ')');
        }
    }

    final static void a(String param0, String param1, int param2) {
        try {
            if (param2 >= -20) {
                ji var4 = (ji) null;
                r.a(60, -88, (ji) null, 75, false);
            }
            ri.a((byte) 115, false, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "r.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 13496) {
          field_e = (bd) null;
          field_c = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    static {
        field_a = 1;
        field_d = new int[]{24, 5};
    }
}
