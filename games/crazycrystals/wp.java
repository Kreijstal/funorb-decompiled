/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wp {
    static String field_a;
    static mb field_c;
    static am field_b;
    static int[] field_d;

    final static void a(Throwable param0, String param1, int param2) {
        try {
            un stackIn_11_0;
            int stackIn_11_1;
            java.net.URL stackIn_11_2;
            java.net.URL stackIn_11_3;
            java.net.URL stackIn_11_4;
            StringBuilder stackIn_11_5;
            un stackIn_12_0;
            int stackIn_12_1;
            java.net.URL stackIn_12_2;
            java.net.URL stackIn_12_3;
            java.net.URL stackIn_12_4;
            StringBuilder stackIn_12_5;
            String stackIn_12_6;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            gb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  var3 = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3 = oo.a((byte) -117, param0);
                    break L1;
                  }
                }
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3 = var3 + " | ";
                        break L3;
                      }
                    }
                    var3 = var3 + param1;
                    break L2;
                  }
                }
                qf.a(var3, param2 + -21861);
                var7 = ca.a("%3a", param2 + -21862, var3, ":");
                var8 = ca.a("%40", 0, var7, "@");
                var9 = ca.a("%26", 0, var8, "&");
                var10 = ca.a("%23", 0, var9, "#");
                if (pj.field_w != null) {
                  L4: {
                    stackIn_11_0 = rd.field_g;

                    stackIn_11_1 = param2 ^ 21859;

                    stackIn_11_2 = null;

                    stackIn_11_3 = null;

                    stackIn_11_4 = pj.field_w.getCodeBase();

                    stackIn_11_5 = new StringBuilder().append("clienterror.ws?c=").append(me.field_e).append("&u=");

                    if (bn.field_f != null) {
                      stackIn_12_0 = (un) ((Object) stackIn_11_0);
                      stackIn_12_1 = stackIn_11_1;
                      stackIn_12_2 = null;
                      stackIn_12_3 = null;
                      stackIn_12_4 = (java.net.URL) ((Object) stackIn_11_4);
                      stackIn_12_5 = (StringBuilder) ((Object) stackIn_11_5);
                      stackIn_12_6 = bn.field_f;
                      break L4;
                    } else {
                      stackIn_12_0 = (un) ((Object) stackIn_11_0);
                      stackIn_12_1 = stackIn_11_1;
                      stackIn_12_2 = null;
                      stackIn_12_3 = null;
                      stackIn_12_4 = (java.net.URL) ((Object) stackIn_11_4);
                      stackIn_12_5 = (StringBuilder) ((Object) stackIn_11_5);
                      stackIn_12_6 = "" + wi.field_h;
                      break L4;
                    }
                  }
                  var4 = ((un) (Object) stackIn_12_0).a(stackIn_12_1, new java.net.URL(stackIn_12_4, stackIn_12_6 + "&v1=" + un.field_e + "&v2=" + un.field_m + "&e=" + var10));
                  L5: while (true) {
                    if (var4.field_a != 0) {
                      if (param2 == 21862) {
                        L6: {
                          if (-2 != (var4.field_a ^ -1)) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) (var4.field_b);
                            var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      fh.a(true, 1L);
                      continue L5;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 2;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        hj stackIn_44_0 = null;
        int decompiledRegionSelector0 = 0;
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
        hj var9 = null;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var1_int = pf.field_n;
              var2 = 0;
              if (2 != am.field_g) {
                break L1;
              } else {
                var3_long = -wm.field_d + lo.a((byte) 122);
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 <= var2) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            if (param0 <= -41) {
              var3 = 0;
              L2: while (true) {
                if (je.field_i.length <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = ub.field_b[var3];
                    if (0 > var4) {
                      var5 = ao.field_e;
                      break L3;
                    } else {
                      if (var4 == lb.field_l.field_c) {
                        var5 = jn.field_i;
                        break L3;
                      } else {
                        var5 = mc.field_s;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6 = je.field_i[var3];
                    if ((am.field_g ^ -1) != -3) {
                      break L4;
                    } else {
                      if (-2 != (var2 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if (sl.field_r.length <= jl.field_a.length) {
                            stackIn_18_0 = jl.field_a.length;
                            break L5;
                          } else {
                            stackIn_18_0 = sl.field_r.length;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_18_0;
                          if (lo.field_c.length >= ne.field_a.length) {
                            stackIn_21_0 = lo.field_c.length;
                            break L6;
                          } else {
                            stackIn_21_0 = ne.field_a.length;
                            break L6;
                          }
                        }
                        L7: {
                          var8 = stackIn_21_0;
                          if (-7 < (var3 ^ -1)) {
                            break L7;
                          } else {
                            if (var3 >= 6 + var7) {
                              break L7;
                            } else {
                              L8: {
                                if (-1 >= (jl.field_a.length + (var3 + -6 - var7) ^ -1)) {
                                  stackIn_26_0 = jl.field_a[var3 + -6 - -jl.field_a.length - var7];
                                  break L8;
                                } else {
                                  stackIn_26_0 = "";
                                  break L8;
                                }
                              }
                              var6 = stackIn_26_0;
                              break L7;
                            }
                          }
                        }
                        if (var3 < 7 - -var7) {
                          break L4;
                        } else {
                          if (var8 + (var7 + 7) > var3) {
                            L9: {
                              if (lo.field_c.length <= -var7 + (-7 + var3)) {
                                stackIn_33_0 = "";
                                break L9;
                              } else {
                                stackIn_33_0 = lo.field_c[-var7 + -7 + var3];
                                break L9;
                              }
                            }
                            var6 = stackIn_33_0;
                            break L4;
                          } else {
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
                    stackIn_38_0 = 102;

                    if (-1 < (var4 ^ -1)) {
                      stackIn_39_0 = stackIn_38_0;
                      stackIn_39_1 = 0;
                      break L11;
                    } else {
                      stackIn_39_0 = stackIn_38_0;
                      stackIn_39_1 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = vm.a((byte) stackIn_39_0, stackIn_39_1 != 0, var6);
                    var8 = oa.field_b + -(var7 >> -666594975);
                    if (var4 >= 0) {
                      L13: {
                        if (lb.field_l.field_c == var4) {
                          stackIn_44_0 = qo.field_k;
                          break L13;
                        } else {
                          stackIn_44_0 = qh.field_h;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_44_0;
                        var1_int = var1_int + a.field_a;
                        if (var9 == null) {
                          break L14;
                        } else {
                          var9.a(-to.field_d + var8, 2, var1_int, (bn.field_c << 1866876385) + gh.field_w, var7 + (to.field_d << 1006164033));
                          break L14;
                        }
                      }
                      var1_int = var1_int + bn.field_c;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if (var4 < 0) {
                      ec.field_m.a(var6, var8, sc.field_g + var1_int, var5, -1);
                      var1_int = var1_int + io.field_O;
                      break L15;
                    } else {
                      gh.field_F.a(var6, var8, var1_int + kb.field_h, var5, -1);
                      var1_int = var1_int + (a.field_a + bn.field_c + gh.field_w);
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wp.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = pc.a(param2, 0);
            if (param0.indexOf(param2) != param1) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0.indexOf(var3) == -1) {
                L1: {
                  L2: {
                    if (param0.startsWith(param2)) {
                      break L2;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param0.endsWith(param2)) {
                          break L2;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackIn_12_0 = 0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_12_0 = 1;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("wp.D(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -78) {
          field_d = (int[]) null;
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = "Please wait...";
        field_c = new mb("usename");
    }
}
