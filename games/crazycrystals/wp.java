/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class wp {
    static String field_a;
    static mb field_c;
    static am field_b;
    static int[] field_d;

    final static void a(Throwable param0, String param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            gb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            un stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            java.net.URL stackIn_10_4 = null;
            StringBuilder stackIn_10_5 = null;
            un stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            un stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            String stackIn_12_6 = null;
            Throwable decompiledCaughtException = null;
            un stackOut_9_0 = null;
            int stackOut_9_1 = 0;
            java.net.URL stackOut_9_2 = null;
            java.net.URL stackOut_9_3 = null;
            java.net.URL stackOut_9_4 = null;
            StringBuilder stackOut_9_5 = null;
            un stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            un stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            String stackOut_10_6 = null;
            var6 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 == null) {
                    break L1;
                  } else {
                    var3_ref = oo.a((byte) -117, param0);
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
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param1;
                    break L2;
                  }
                }
                qf.a(var3_ref, param2 + -21861);
                var7 = ca.a("%3a", param2 + -21862, var3_ref, ":");
                var8 = ca.a("%40", 0, var7, "@");
                var9 = ca.a("%26", 0, var8, "&");
                var10 = ca.a("%23", 0, var9, "#");
                if (pj.field_w != null) {
                  L4: {
                    stackOut_9_0 = rd.field_g;
                    stackOut_9_1 = param2 ^ 21859;
                    stackOut_9_2 = null;
                    stackOut_9_3 = null;
                    stackOut_9_4 = pj.field_w.getCodeBase();
                    stackOut_9_5 = new StringBuilder().append("clienterror.ws?c=").append(me.field_e).append("&u=");
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    stackIn_11_5 = stackOut_9_5;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    stackIn_10_5 = stackOut_9_5;
                    if (bn.field_f != null) {
                      stackOut_11_0 = (un) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                      stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                      stackOut_11_6 = bn.field_f;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      stackIn_12_4 = stackOut_11_4;
                      stackIn_12_5 = stackOut_11_5;
                      stackIn_12_6 = stackOut_11_6;
                      break L4;
                    } else {
                      stackOut_10_0 = (un) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = null;
                      stackOut_10_3 = null;
                      stackOut_10_4 = (java.net.URL) (Object) stackIn_10_4;
                      stackOut_10_5 = (StringBuilder) (Object) stackIn_10_5;
                      stackOut_10_6 = "" + wi.field_h;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_12_5 = stackOut_10_5;
                      stackIn_12_6 = stackOut_10_6;
                      break L4;
                    }
                  }
                  var4 = ((un) (Object) stackIn_12_0).a(stackIn_12_1, new java.net.URL(stackIn_12_4, stackIn_12_6 + "&v1=" + un.field_e + "&v2=" + un.field_m + "&e=" + var10));
                  L5: while (true) {
                    if ((var4.field_a ^ -1) != -1) {
                      if (param2 == 21862) {
                        L6: {
                          if (-2 != (var4.field_a ^ -1)) {
                            break L6;
                          } else {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$1 = var5.read();
                            var5.close();
                            break L6;
                          }
                        }
                        break L0;
                      } else {
                        return;
                      }
                    } else {
                      fh.a(true, 1L);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
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
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        String stackIn_32_0 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        hj stackIn_43_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        hj stackOut_42_0 = null;
        hj stackOut_41_0 = null;
        L0: {
          var10 = CrazyCrystals.field_B;
          var1 = pf.field_n;
          var2 = 0;
          if (2 != am.field_g) {
            break L0;
          } else {
            var3_long = -wm.field_d + lo.a((byte) 122);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 <= var2) {
              break L0;
            } else {
              var2 = 0;
              break L0;
            }
          }
        }
        if (param0 <= -41) {
          var3 = 0;
          L1: while (true) {
            if (je.field_i.length <= var3) {
              return;
            } else {
              L2: {
                var4 = ub.field_b[var3];
                if (0 > var4) {
                  var5 = ao.field_e;
                  break L2;
                } else {
                  if (var4 == lb.field_l.field_c) {
                    var5 = jn.field_i;
                    break L2;
                  } else {
                    var5 = mc.field_s;
                    break L2;
                  }
                }
              }
              L3: {
                var6 = je.field_i[var3];
                if ((am.field_g ^ -1) != -3) {
                  break L3;
                } else {
                  if (-2 != (var2 ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if ((sl.field_r.length ^ -1) >= (jl.field_a.length ^ -1)) {
                        stackOut_16_0 = jl.field_a.length;
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = sl.field_r.length;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_17_0;
                      if (lo.field_c.length >= ne.field_a.length) {
                        stackOut_19_0 = lo.field_c.length;
                        stackIn_20_0 = stackOut_19_0;
                        break L5;
                      } else {
                        stackOut_18_0 = ne.field_a.length;
                        stackIn_20_0 = stackOut_18_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_20_0;
                      if (-7 < (var3 ^ -1)) {
                        break L6;
                      } else {
                        if ((var3 ^ -1) <= (6 + var7 ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if (-1 >= (jl.field_a.length + (var3 + -6 - var7) ^ -1)) {
                              stackOut_24_0 = jl.field_a[var3 + -6 - -jl.field_a.length - var7];
                              stackIn_25_0 = stackOut_24_0;
                              break L7;
                            } else {
                              stackOut_23_0 = "";
                              stackIn_25_0 = stackOut_23_0;
                              break L7;
                            }
                          }
                          var6 = stackIn_25_0;
                          break L6;
                        }
                      }
                    }
                    if (var3 < 7 - -var7) {
                      break L3;
                    } else {
                      if ((var8 + (var7 + 7) ^ -1) < (var3 ^ -1)) {
                        L8: {
                          if ((lo.field_c.length ^ -1) >= (-var7 + (-7 + var3) ^ -1)) {
                            stackOut_31_0 = "";
                            stackIn_32_0 = stackOut_31_0;
                            break L8;
                          } else {
                            stackOut_30_0 = lo.field_c[-var7 + -7 + var3];
                            stackIn_32_0 = stackOut_30_0;
                            break L8;
                          }
                        }
                        var6 = stackIn_32_0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if (var4 != -2) {
                  break L9;
                } else {
                  var6 = Integer.toString(var2);
                  break L9;
                }
              }
              L10: {
                stackOut_35_0 = 102;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (-1 < (var4 ^ -1)) {
                  stackOut_37_0 = stackIn_37_0;
                  stackOut_37_1 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  break L10;
                } else {
                  stackOut_36_0 = stackIn_36_0;
                  stackOut_36_1 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L10;
                }
              }
              L11: {
                var7 = vm.a((byte) stackIn_38_0, stackIn_38_1 != 0, var6);
                var8 = oa.field_b + -(var7 >> -666594975);
                if (var4 >= 0) {
                  L12: {
                    if (lb.field_l.field_c == var4) {
                      stackOut_42_0 = qo.field_k;
                      stackIn_43_0 = stackOut_42_0;
                      break L12;
                    } else {
                      stackOut_41_0 = qh.field_h;
                      stackIn_43_0 = stackOut_41_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_43_0;
                    var1 = var1 + a.field_a;
                    if (var9 == null) {
                      break L13;
                    } else {
                      var9.a(-to.field_d + var8, 2, var1, (bn.field_c << 1866876385) + gh.field_w, var7 + (to.field_d << 1006164033));
                      break L13;
                    }
                  }
                  var1 = var1 + bn.field_c;
                  break L11;
                } else {
                  break L11;
                }
              }
              if (var4 < 0) {
                ec.field_m.a(var6, var8, sc.field_g + var1, var5, -1);
                var1 = var1 + io.field_O;
                var3++;
                var3++;
                continue L1;
              } else {
                gh.field_F.a(var6, var8, var1 + kb.field_h, var5, -1);
                var1 = var1 + (a.field_a + bn.field_c + gh.field_w);
                var3++;
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        var3 = pc.a(param2, 0);
        if (param0.indexOf(param2) == param1) {
          if (param0.indexOf(var3) == -1) {
            if (!param0.startsWith(param2)) {
              if (!param0.startsWith(var3)) {
                if (!param0.endsWith(param2)) {
                  if (param0.endsWith(var3)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  return stackIn_12_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -78) {
          field_d = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please wait...";
        field_c = new mb("usename");
    }
}
