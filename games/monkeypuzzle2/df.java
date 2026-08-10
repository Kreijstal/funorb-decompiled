/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class df extends wj {
    static String field_o;
    static le[] field_q;
    private rj field_n;
    static ad field_p;
    private rj field_r;

    final static void f(int param0) {
        int var1_int = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            if (param0 != 18180) {
                df.f((byte) -8);
            }
            ge.h(80, 0, 560, 480);
            for (var1_int = 0; fg.field_a > var1_int; var1_int++) {
                if (n.field_d[var1_int][0] > 0.0f) {
                    cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].c((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
                } else {
                    cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].f((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
                }
            }
            ge.h(0, 0, 640, 480);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "df.BA(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = -126 / ((param0 - 64) / 47);
            var2 = cl.field_g;
            var3 = 0;
            var4 = var2.length;
            L1: while (true) {
              if (var3 >= var4) {
                break L0;
              } else {
                incrementValue$16 = var3;
                var3++;
                var2[incrementValue$16] = 0;
                incrementValue$17 = var3;
                var3++;
                var2[incrementValue$17] = 0;
                incrementValue$18 = var3;
                var3++;
                var2[incrementValue$18] = 0;
                incrementValue$19 = var3;
                var3++;
                var2[incrementValue$19] = 0;
                incrementValue$20 = var3;
                var3++;
                var2[incrementValue$20] = 0;
                incrementValue$21 = var3;
                var3++;
                var2[incrementValue$21] = 0;
                incrementValue$22 = var3;
                var3++;
                var2[incrementValue$22] = 0;
                incrementValue$23 = var3;
                var3++;
                var2[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "df.C(" + param0 + ')');
        }
    }

    final static void e(int param0) {
        if (!(ha.field_db)) {
            throw new IllegalStateException();
        }
        cf.field_c = true;
        hl.a((byte) -60, false);
        int var1 = -79 % ((21 - param0) / 46);
        k.field_g = 0;
    }

    df(rj param0, rj param1, rj param2) {
        super(param0);
        try {
            this.field_r = param2;
            this.field_n = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_n.field_s.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              if (param0 == 1) {
                var5 = var4;
                if (!tl.a(0, var5)) {
                  if (!bg.a(param0 ^ 4827, var5)) {
                    if (!sg.a(var5, false)) {
                      if (this.a((byte) 119, param1)) {
                        stackIn_18_0 = ad.field_d;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (-1 <= (var6.length() ^ -1)) {
                          stackIn_33_0 = pb.field_i;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          if (qj.a(var5, false, var6)) {
                            stackIn_23_0 = fc.field_b;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (ue.a(var5, var6, (byte) 66)) {
                              stackIn_27_0 = ck.field_d;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              if (di.a(95, var6, var5)) {
                                stackIn_31_0 = fc.field_b;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                return dd.field_a;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_14_0 = eb.field_E;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackIn_11_0 = qi.field_E;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = dd.field_a;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("df.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L1;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        return stackIn_33_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final boolean a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 50) {
                break L1;
              } else {
                field_p = (ad) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_r.field_s.toLowerCase();
              var4 = param1.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L2;
              } else {
                if (0 < var4.length()) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(1 + var5);
                      if (var4.indexOf(var6) >= 0) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("df.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static void a(gk param0, boolean param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                if (!param1) {
                  L1: {
                    L2: {
                      var6 = new byte[24];
                      var2 = var6;
                      if (hj.field_D != null) {
                        try {
                          L3: {
                            hj.field_D.a((byte) 101, 0L);
                            hj.field_D.a(3805, var6);
                            var3_int = 0;
                            L4: while (true) {
                              L5: {
                                if (-25 >= (var3_int ^ -1)) {
                                  break L5;
                                } else {
                                  if (0 == var2[var3_int]) {
                                    var3_int++;
                                    continue L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              if (24 <= var3_int) {
                                throw new IOException();
                              } else {
                                param0.b(var2, 24, -2, 0);
                                decompiledRegionSelector0 = 0;
                                break L3;
                              }
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L6: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L7: while (true) {
                              if (var4 >= 24) {
                                decompiledRegionSelector0 = 1;
                                break L6;
                              } else {
                                var2[var4] = (byte)-1;
                                var4++;
                                continue L7;
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param0.b(var2, 24, -2, 0);
                    break L1;
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref);

                stackIn_22_1 = new StringBuilder().append("df.G(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L8;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L8;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ai a(String param0, ad param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ai stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.c(param0, (byte) -105);
              var5 = param1.a(param3, var4_int, param2 ^ -28509);
              if (param2 == 118) {
                break L1;
              } else {
                field_q = (le[]) null;
                break L1;
              }
            }
            stackIn_3_0 = rd.a(var5, param1, var4_int, 1896);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("df.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void f(byte param0) {
        if (param0 > -17) {
            return;
        }
        ua.field_v = new pj();
    }

    final na a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        na stackIn_4_0 = null;
        na stackIn_7_0 = null;
        na stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_n.field_s.toLowerCase();
              if (param1 == 3917) {
                break L1;
              } else {
                df.f((byte) 86);
                break L1;
              }
            }
            var4 = param0.toLowerCase();
            if (-1 != (var4.length() ^ -1)) {
              if (ph.a(var3, -67, var4)) {
                if (this.a((byte) 76, param0)) {
                  stackIn_11_0 = ol.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return wj.field_i;
                }
              } else {
                stackIn_7_0 = ol.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = ol.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("df.B(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void g(int param0) {
        field_p = null;
        field_q = null;
        field_o = null;
        if (param0 != 0) {
            field_p = (ad) null;
        }
    }

    static {
    }
}
