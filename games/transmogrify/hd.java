/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static int[][] field_c;
    static int field_d;
    static boolean field_b;
    static boolean field_a;

    final static void a(String param0, String param1, int param2) {
        String discarded$0 = null;
        try {
            if (param2 != -4776) {
                String var4 = (String) null;
                discarded$0 = hd.a('>', (byte) -124, (String) null, (String) null);
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
        String discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              if (param1 == -81) {
                break L1;
              } else {
                var12 = (String) null;
                discarded$4 = hd.a('￻', (byte) 28, (String) null, (String) null);
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
                  L4: {
                    L5: {
                      var8_int = param3.indexOf((int) param0, var8_int);
                      if (0 <= var8_int) {
                        break L5;
                      } else {
                        if (var11 != 0) {
                          break L4;
                        } else {
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var8_int++;
                    var6 = var6 + var7;
                    break L4;
                  }
                  if (var11 == 0) {
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
            L6: while (true) {
              L7: {
                L8: {
                  var10 = param3.indexOf((int) param0, var9);
                  if (-1 < (var10 ^ -1)) {
                    break L8;
                  } else {
                    discarded$5 = var8.append(param3.substring(var9, var10));
                    var9 = 1 + var10;
                    discarded$6 = var8.append(param2);
                    if (var11 != 0) {
                      break L7;
                    } else {
                      if (var11 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                discarded$7 = var8.append(param3.substring(var9));
                break L7;
              }
              stackOut_18_0 = var8.toString();
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("hd.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_19_0;
    }

    final static kh[] b(byte param0) {
        String discarded$2 = null;
        String var2 = null;
        if (param0 != 87) {
          var2 = (String) null;
          discarded$2 = hd.a('￦', (byte) -39, (String) null, (String) null);
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        } else {
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        }
    }

    final static void a(byte param0) {
        kh[] discarded$1 = null;
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
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        String stackIn_30_0 = null;
        String stackIn_36_0 = null;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        pg stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_29_0 = null;
        String stackOut_28_0 = null;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        String stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        String stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        pg stackOut_47_0 = null;
        pg stackOut_46_0 = null;
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
                discarded$1 = hd.b((byte) 70);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (qb.field_f.length <= var3) {
                break L0;
              } else {
                var4 = ce.field_a[var3];
                if (var10 == 0) {
                  L4: {
                    L5: {
                      if ((var4 ^ -1) > -1) {
                        break L5;
                      } else {
                        L6: {
                          if (var4 != bk.field_c.field_d) {
                            break L6;
                          } else {
                            var5 = pf.field_b;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5 = Transmogrify.field_D;
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var5 = u.field_b;
                    break L4;
                  }
                  L7: {
                    var6 = qb.field_f[var3];
                    if (-3 != (q.field_a ^ -1)) {
                      break L7;
                    } else {
                      if ((var2 ^ -1) != -2) {
                        break L7;
                      } else {
                        L8: {
                          if (ng.field_i.length > bd.field_p.length) {
                            stackOut_21_0 = ng.field_i.length;
                            stackIn_22_0 = stackOut_21_0;
                            break L8;
                          } else {
                            stackOut_20_0 = bd.field_p.length;
                            stackIn_22_0 = stackOut_20_0;
                            break L8;
                          }
                        }
                        L9: {
                          var7 = stackIn_22_0;
                          if (th.field_d.length > ne.field_a.length) {
                            stackOut_24_0 = th.field_d.length;
                            stackIn_25_0 = stackOut_24_0;
                            break L9;
                          } else {
                            stackOut_23_0 = ne.field_a.length;
                            stackIn_25_0 = stackOut_23_0;
                            break L9;
                          }
                        }
                        L10: {
                          var8 = stackIn_25_0;
                          if (-7 < (var3 ^ -1)) {
                            break L10;
                          } else {
                            if (6 - -var7 <= var3) {
                              break L10;
                            } else {
                              L11: {
                                if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                  stackOut_29_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                  stackIn_30_0 = stackOut_29_0;
                                  break L11;
                                } else {
                                  stackOut_28_0 = "";
                                  stackIn_30_0 = stackOut_28_0;
                                  break L11;
                                }
                              }
                              var6 = stackIn_30_0;
                              break L10;
                            }
                          }
                        }
                        if (var3 < 7 + var7) {
                          break L7;
                        } else {
                          if (var8 + var7 + 7 <= var3) {
                            break L7;
                          } else {
                            L12: {
                              if (-var7 + (-7 + var3) < ne.field_a.length) {
                                stackOut_35_0 = ne.field_a[-var7 + (-7 + var3)];
                                stackIn_36_0 = stackOut_35_0;
                                break L12;
                              } else {
                                stackOut_34_0 = "";
                                stackIn_36_0 = stackOut_34_0;
                                break L12;
                              }
                            }
                            var6 = stackIn_36_0;
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (1 == (var4 ^ -1)) {
                      var6 = Integer.toString(var2);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    stackOut_40_0 = (String) (var6);
                    stackOut_40_1 = 0;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    if (-1 < (var4 ^ -1)) {
                      stackOut_42_0 = (String) ((Object) stackIn_42_0);
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = 0;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      stackIn_43_2 = stackOut_42_2;
                      break L14;
                    } else {
                      stackOut_41_0 = (String) ((Object) stackIn_41_0);
                      stackOut_41_1 = stackIn_41_1;
                      stackOut_41_2 = 1;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      stackIn_43_2 = stackOut_41_2;
                      break L14;
                    }
                  }
                  L15: {
                    var7 = uc.a(stackIn_43_0, stackIn_43_1 != 0, stackIn_43_2 != 0);
                    var8 = wd.field_j - (var7 >> -1429395903);
                    if (-1 >= (var4 ^ -1)) {
                      L16: {
                        if (var4 != bk.field_c.field_d) {
                          stackOut_47_0 = gl.field_B;
                          stackIn_48_0 = stackOut_47_0;
                          break L16;
                        } else {
                          stackOut_46_0 = cd.field_f;
                          stackIn_48_0 = stackOut_46_0;
                          break L16;
                        }
                      }
                      L17: {
                        var9 = stackIn_48_0;
                        var1_int = var1_int + ee.field_D;
                        if (var9 == null) {
                          break L17;
                        } else {
                          var9.a(var7 - -(vh.field_m << 1577700897), var1_int, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                          break L17;
                        }
                      }
                      var1_int = var1_int + jl.field_o;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L18: {
                    L19: {
                      if (var4 < 0) {
                        break L19;
                      } else {
                        tb.field_c.b(var6, var8, var1_int + pi.field_k, var5, -1);
                        var1_int = var1_int + (hi.field_c + (ee.field_D + jl.field_o));
                        if (var10 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ce.field_b.b(var6, var8, var1_int - -field_d, var5, -1);
                    var1_int = var1_int + fi.field_x;
                    break L18;
                  }
                  var3++;
                  continue L3;
                } else {
                  return;
                }
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
