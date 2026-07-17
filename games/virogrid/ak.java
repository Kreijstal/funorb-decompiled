/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak {
    static String field_c;
    static int field_a;
    static String[] field_b;
    static int[] field_f;
    static km[] field_d;
    static mg field_e;

    final static void a(int param0, km param1) {
        km var5 = null;
        km var6 = null;
        int var3 = Virogrid.field_F ? 1 : 0;
        try {
            var5 = (km) (Object) param1.field_W.a((byte) -89);
            km var2 = var5;
            while (var5 != null) {
                var5.field_ub = 0;
                var5.field_Cb = 0;
                var5.field_kb = 0;
                var5.field_F = 0;
                var6 = (km) (Object) param1.field_W.a(param0 + -164);
                var6 = var6;
            }
            if (param0 != 16377) {
                Object var4 = null;
                ak.a(97, (km) null);
            }
            param1.field_F = 0;
            param1.field_kb = 0;
            param1.field_ub = 0;
            param1.field_Cb = 0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ak.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, byte param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (0 < param0) {
              if (!am.a((byte) -56, param0)) {
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L1: while (true) {
                  var4 = param2.nextInt();
                  if (var4 >= var3_int) {
                    continue L1;
                  } else {
                    int discarded$2 = 1;
                    stackOut_8_0 = bj.b(param0, var4);
                    stackIn_9_0 = stackOut_8_0;
                    break L0;
                  }
                }
              } else {
                stackOut_4_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ak.F(").append(param0).append(44).append(-74).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final static boolean b() {
        oc.field_l = true;
        hc.field_a = 15000L + hc.a(-9986);
        return j.field_l == 11 ? true : false;
    }

    final static mg[] a(int param0, int param1) {
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        mg[] var7 = new mg[9];
        mg[] var4 = var7;
        var7[0] = eg.a(1, (byte) 29, param0);
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = eg.a(64, (byte) 63, param1);
        return var4;
    }

    final static void c() {
        se.field_f = new String[ad.field_c];
        se.field_f[19] = rk.field_d;
        se.field_f[13] = ej.field_H;
        se.field_f[16] = el.field_f;
        se.field_f[5] = eg.field_G;
        se.field_f[4] = s.field_h;
        se.field_f[11] = ql.field_e;
        se.field_f[18] = wm.field_Q;
        se.field_f[7] = kd.field_n;
        se.field_f[17] = cg.field_g;
        se.field_f[9] = ld.field_a;
        se.field_f[15] = mk.field_fb;
        se.field_f[20] = gf.field_D;
        se.field_f[6] = pm.field_s;
        se.field_f[21] = kn.field_F;
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        field_f = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new byte[var2_int];
              if (param0 == 1514) {
                break L1;
              } else {
                field_a = 33;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_68_0 = (byte[]) var3;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (128 > var5) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (var5 == 8218) {
                        var3[var4] = (byte) -126;
                        break L3;
                      } else {
                        if (var5 == 402) {
                          var3[var4] = (byte) -125;
                          break L3;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L3;
                          } else {
                            if (var5 == 8230) {
                              var3[var4] = (byte) -123;
                              break L3;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L3;
                              } else {
                                if (var5 != 8225) {
                                  if (710 == var5) {
                                    var3[var4] = (byte) -120;
                                    break L3;
                                  } else {
                                    if (8240 != var5) {
                                      if (var5 != 352) {
                                        if (8249 == var5) {
                                          var3[var4] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (var5 != 338) {
                                            if (var5 != 381) {
                                              if (8216 == var5) {
                                                var3[var4] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (8217 != var5) {
                                                  if (var5 != 8220) {
                                                    if (var5 != 8221) {
                                                      if (8226 != var5) {
                                                        if (var5 != 8211) {
                                                          if (8212 != var5) {
                                                            if (732 == var5) {
                                                              var3[var4] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (8482 == var5) {
                                                                var3[var4] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (var5 == 353) {
                                                                  var3[var4] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var5 != 8250) {
                                                                    if (var5 == 339) {
                                                                      var3[var4] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 != var5) {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte) -105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte) -107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L3;
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L3;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte) -118;
                                        break L3;
                                      }
                                    } else {
                                      var3[var4] = (byte) -119;
                                      break L3;
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte) -121;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      break L3;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var2;
            stackOut_70_1 = new StringBuilder().append("ak.C(").append(param0).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + 41);
        }
        return stackIn_69_0;
    }

    final static void a(int param0, oc param1) {
        hg var3 = null;
        try {
            var3 = gk.field_g;
            var3.g(3, 8);
            var3.a(5, 56);
            var3.a(0, -114);
            var3.a((byte) -126, param1.field_j);
            var3.a(param1.field_g, -90);
            var3.a(param1.field_m, -96);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ak.B(" + -26039 + 44 + (param1 != null ? "{...}" : "null") + 44 + 3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 1;
        field_b = new String[]{"Play five Rated games", "Capture eight pieces in one move", "Win five Rated games", "Win by capturing all opposing pieces", "Win five Rated games in a row", "Lose five Rated games in a row", "Win by leaving the opponent unable to move", "Win a game using only jumps", "Play 55 Rated games", "Find the ghost during Hallowe'en"};
        field_c = "Open";
        field_f = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
    }
}
