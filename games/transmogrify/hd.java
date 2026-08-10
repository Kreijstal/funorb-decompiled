/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static int[][] field_c;
    static int field_d;
    static boolean field_b;
    static boolean field_a;

    final static void a(String param0, String param1, int param2) {
        try {
            if (param2 != -4776) {
                String var4 = (String) null;
                hd.a('>', (byte) -124, (String) null, (String) null);
            }
            fd.a(86, false, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "hd.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_a = false;
            return ql.field_a;
        }
        return ql.field_a;
    }

    public static void c(byte param0) {
        if (param0 > -80) {
            return;
        }
        field_c = (int[][]) null;
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String var12 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param1 == -81) {
                break L1;
              } else {
                var12 = (String) null;
                hd.a('￻', (byte) 28, (String) null, (String) null);
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
              if (-1 < (var10 ^ -1)) {
                discarded$0 = var8.append(param3.substring(var9));
                stackIn_13_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                discarded$2 = var8.append(param2);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
        return stackIn_13_0;
    }

    final static kh[] b(byte param0) {
        String var2;
        if (param0 != 87) {
          var2 = (String) null;
          hd.a('￦', (byte) -39, (String) null, (String) null);
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        } else {
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        }
    }

    final static void a(byte param0) {
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        pg stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = qa.field_u;
              var2 = 0;
              if (2 == q.field_a) {
                var3_long = -c.field_c + lk.a(param0 + -8);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if ((var2 ^ -1) > -1) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 8) {
                break L2;
              } else {
                hd.b((byte) 70);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (qb.field_f.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = ce.field_a[var3];
                  if ((var4 ^ -1) > -1) {
                    var5 = u.field_b;
                    break L4;
                  } else {
                    if (var4 != bk.field_c.field_d) {
                      var5 = Transmogrify.field_D;
                      break L4;
                    } else {
                      var5 = pf.field_b;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = qb.field_f[var3];
                  if (-3 != (q.field_a ^ -1)) {
                    break L5;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L5;
                    } else {
                      L6: {
                        if (ng.field_i.length > bd.field_p.length) {
                          stackIn_20_0 = ng.field_i.length;
                          break L6;
                        } else {
                          stackIn_20_0 = bd.field_p.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_20_0;
                        if (th.field_d.length > ne.field_a.length) {
                          stackIn_23_0 = th.field_d.length;
                          break L7;
                        } else {
                          stackIn_23_0 = ne.field_a.length;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_23_0;
                        if (-7 < (var3 ^ -1)) {
                          break L8;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L8;
                          } else {
                            L9: {
                              if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                stackIn_28_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                break L9;
                              } else {
                                stackIn_28_0 = "";
                                break L9;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L8;
                          }
                        }
                      }
                      if (var3 < 7 + var7) {
                        break L5;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (-var7 + (-7 + var3) < ne.field_a.length) {
                              stackIn_34_0 = ne.field_a[-var7 + (-7 + var3)];
                              break L10;
                            } else {
                              stackIn_34_0 = "";
                              break L10;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (1 == (var4 ^ -1)) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_40_0 = (String) (var6);

                  stackIn_40_1 = 0;

                  if (-1 < (var4 ^ -1)) {
                    stackIn_41_0 = (String) ((Object) stackIn_40_0);
                    stackIn_41_1 = stackIn_40_1;
                    stackIn_41_2 = 0;
                    break L12;
                  } else {
                    stackIn_41_0 = (String) ((Object) stackIn_40_0);
                    stackIn_41_1 = stackIn_40_1;
                    stackIn_41_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = uc.a(stackIn_41_0, stackIn_41_1 != 0, stackIn_41_2 != 0);
                  var8 = wd.field_j - (var7 >> -1429395903);
                  if (-1 >= (var4 ^ -1)) {
                    L14: {
                      if (var4 != bk.field_c.field_d) {
                        stackIn_46_0 = gl.field_B;
                        break L14;
                      } else {
                        stackIn_46_0 = cd.field_f;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_46_0;
                      var1_int = var1_int + ee.field_D;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var7 - -(vh.field_m << 1577700897), var1_int, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                        break L15;
                      }
                    }
                    var1_int = var1_int + jl.field_o;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (var4 < 0) {
                    ce.field_b.b(var6, var8, var1_int - -field_d, var5, -1);
                    var1_int = var1_int + fi.field_x;
                    break L16;
                  } else {
                    tb.field_c.b(var6, var8, var1_int + pi.field_k, var5, -1);
                    var1_int = var1_int + (hi.field_c + (ee.field_D + jl.field_o));
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
          throw ch.a((Throwable) ((Object) var1), "hd.C(" + param0 + ')');
        }
    }

    static {
        field_b = false;
        field_a = false;
    }
}
