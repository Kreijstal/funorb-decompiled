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
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 18180) {
                break L1;
              } else {
                df.f((byte) -8);
                break L1;
              }
            }
            ge.h(80, 0, 560, 480);
            var1_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (fg.field_a <= var1_int) {
                    break L4;
                  } else {
                    stackOut_5_0 = (n.field_d[var1_int][0] < 0.0f ? -1 : (n.field_d[var1_int][0] == 0.0f ? 0 : 1));
                    stackIn_12_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_6_0 <= 0) {
                            break L6;
                          } else {
                            cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].c((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
                            if (var2 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        cc.field_a[ul.field_O[var1_int]][hh.field_r[var1_int]].f((int)pl.field_f[var1_int][0], (int)pl.field_f[var1_int][1]);
                        break L5;
                      }
                      var1_int++;
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              }
              ge.h(stackIn_12_0, 0, 640, 480);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "df.BA(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
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
                incrementValue$40 = var3;
                var3++;
                var2[incrementValue$40] = 0;
                incrementValue$41 = var3;
                var3++;
                var2[incrementValue$41] = 0;
                incrementValue$42 = var3;
                var3++;
                var2[incrementValue$42] = 0;
                incrementValue$43 = var3;
                var3++;
                var2[incrementValue$43] = 0;
                incrementValue$44 = var3;
                var3++;
                var2[incrementValue$44] = 0;
                incrementValue$45 = var3;
                var3++;
                var2[incrementValue$45] = 0;
                incrementValue$46 = var3;
                var3++;
                var2[incrementValue$46] = 0;
                incrementValue$47 = var3;
                var3++;
                var2[incrementValue$47] = 0;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
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
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        String stackOut_32_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_30_0 = null;
        String stackOut_13_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
                        stackOut_17_0 = ad.field_d;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        if (-1 <= (var6.length() ^ -1)) {
                          stackOut_32_0 = pb.field_i;
                          stackIn_33_0 = stackOut_32_0;
                          decompiledRegionSelector0 = 8;
                          break L0;
                        } else {
                          if (qj.a(var5, false, var6)) {
                            stackOut_22_0 = fc.field_b;
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (ue.a(var5, var6, (byte) 66)) {
                              stackOut_26_0 = ck.field_d;
                              stackIn_27_0 = stackOut_26_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              if (di.a(95, var6, var5)) {
                                stackOut_30_0 = fc.field_b;
                                stackIn_31_0 = stackOut_30_0;
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
                      stackOut_13_0 = eb.field_E;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackOut_10_0 = qi.field_E;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = dd.field_a;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackOut_4_0 = (String) null;
                stackIn_5_0 = stackOut_4_0;
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
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("df.A(").append(param0).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L1;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                        stackOut_9_0 = 1;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (0 <= var4.indexOf(var7)) {
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            break L3;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_14_0 = stackOut_12_0;
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
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3_ref);
            stackOut_17_1 = new StringBuilder().append("df.AA(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            int var9 = 0;
            int var10 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                if (!param1) {
                  L1: {
                    L2: {
                      var8 = new byte[24];
                      var7 = var8;
                      var6 = var7;
                      var2 = var6;
                      if (hj.field_D != null) {
                        try {
                          L3: {
                            hj.field_D.a((byte) 101, 0L);
                            hj.field_D.a(3805, var8);
                            var3_int = 0;
                            L4: while (true) {
                              L5: {
                                L6: {
                                  L7: {
                                    if (-25 >= (var3_int ^ -1)) {
                                      break L7;
                                    } else {
                                      var10 = var8[var3_int];
                                      var9 = 0;
                                      if (var5 != 0) {
                                        if (var9 <= var10) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        L8: {
                                          if (var9 == var10) {
                                            break L8;
                                          } else {
                                            if (var5 == 0) {
                                              break L7;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        var3_int++;
                                        if (var5 == 0) {
                                          continue L4;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  if (24 <= var3_int) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                decompiledRegionSelector0 = 0;
                                break L3;
                              }
                              throw new IOException();
                            }
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L9: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L10: while (true) {
                              if (var4 >= 24) {
                                decompiledRegionSelector0 = 0;
                                break L9;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L9;
                                } else {
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          break L1;
                        }
                      } else {
                        break L2;
                      }
                    }
                    param0.b(var8, 24, -2, 0);
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
              L11: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) (var2_ref);
                stackOut_27_1 = new StringBuilder().append("df.G(");
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param0 == null) {
                  stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
                  stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L11;
                } else {
                  stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
                  stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L11;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ai stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_2_0 = rd.a(var5, param1, var4_int, 1896);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("df.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        na stackOut_10_0 = null;
        na stackOut_6_0 = null;
        na stackOut_3_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                  stackOut_10_0 = ol.field_h;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return wj.field_i;
                }
              } else {
                stackOut_6_0 = ol.field_h;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_3_0 = ol.field_h;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("df.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
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
