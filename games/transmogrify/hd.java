/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static int[][] field_c;
    static int field_d;
    static boolean field_b;
    static boolean field_a;

    final static void a(String param0, String param1) {
        try {
            fd.a(86, false, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "hd.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -4776 + ')');
        }
    }

    final static String a(int param0) {
        return ql.field_a;
    }

    public static void c() {
        field_c = null;
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param1 == -81) {
                break L1;
              } else {
                var12 = null;
                String discarded$5 = hd.a('￻', (byte) 28, (String) null, (String) null);
                break L1;
              }
            }
            L2: {
              var5 = param2.length();
              var6 = var4_int;
              var7 = -1 + var5;
              if (var7 != 0) {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param3.indexOf((int) param0, var8_int);
                  if (0 <= var8_int) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (var10 < 0) {
                StringBuilder discarded$6 = var8.append(param3.substring(var9));
                stackOut_12_0 = var8.toString();
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                StringBuilder discarded$7 = var8.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$8 = var8.append(param2);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final static kh[] b() {
        return new kh[]{aa.field_d, of.field_f, qe.field_x};
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
        pg var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        pg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        pg stackOut_43_0 = null;
        pg stackOut_42_0 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = qa.field_u;
              var2 = 0;
              if (2 == q.field_a) {
                var3_long = -c.field_c + lk.a(0);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~qb.field_f.length >= ~var3) {
                break L0;
              } else {
                L3: {
                  var4 = ce.field_a[var3];
                  if (var4 < 0) {
                    var5 = u.field_b;
                    break L3;
                  } else {
                    if (~var4 != ~bk.field_c.field_d) {
                      var5 = Transmogrify.field_D;
                      break L3;
                    } else {
                      var5 = pf.field_b;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = qb.field_f[var3];
                  if (q.field_a != 2) {
                    break L4;
                  } else {
                    if (var2 != 1) {
                      break L4;
                    } else {
                      L5: {
                        if (ng.field_i.length > bd.field_p.length) {
                          stackOut_17_0 = ng.field_i.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = bd.field_p.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (th.field_d.length > ne.field_a.length) {
                          stackOut_20_0 = th.field_d.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = ne.field_a.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_21_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (~(6 - -var7) >= ~var3) {
                            break L7;
                          } else {
                            L8: {
                              if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                stackOut_25_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                stackIn_26_0 = stackOut_25_0;
                                break L8;
                              } else {
                                stackOut_24_0 = "";
                                stackIn_26_0 = stackOut_24_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L7;
                          }
                        }
                      }
                      if (~var3 > ~(7 + var7)) {
                        break L4;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L4;
                        } else {
                          L9: {
                            if (-var7 + (-7 + var3) < ne.field_a.length) {
                              stackOut_31_0 = ne.field_a[-var7 + (-7 + var3)];
                              stackIn_32_0 = stackOut_31_0;
                              break L9;
                            } else {
                              stackOut_30_0 = "";
                              stackIn_32_0 = stackOut_30_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_32_0;
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = (String) var6;
                  stackOut_36_1 = 0;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (var4 < 0) {
                    stackOut_38_0 = (String) (Object) stackIn_38_0;
                    stackOut_38_1 = stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L11;
                  } else {
                    stackOut_37_0 = (String) (Object) stackIn_37_0;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = uc.a(stackIn_39_0, stackIn_39_1 != 0, stackIn_39_2 != 0);
                  var8 = wd.field_j - (var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      if (var4 != bk.field_c.field_d) {
                        stackOut_43_0 = gl.field_B;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = cd.field_f;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + ee.field_D;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(var7 - -(vh.field_m << 1), var1_int, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << 1));
                        break L14;
                      }
                    }
                    var1_int = var1_int + jl.field_o;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (var4 < 0) {
                  ce.field_b.b(var6, var8, var1_int - -field_d, var5, -1);
                  var1_int = var1_int + fi.field_x;
                  var3++;
                  var3++;
                  continue L2;
                } else {
                  tb.field_c.b(var6, var8, var1_int + pi.field_k, var5, -1);
                  var1_int = var1_int + (hi.field_c + (ee.field_D + jl.field_o));
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
          throw ch.a((Throwable) (Object) var1, "hd.C(" + 8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = false;
    }
}
