/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gb {
    static String field_e;
    static String field_b;
    static ii[] field_a;
    static String field_c;
    static String field_d;

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                mg.field_e = param2;
                try {
                    var3 = param0.getParameter("cookieprefix");
                    var4 = param0.getParameter("cookiehost");
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (!(param2.length() != 0)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    int var6 = 110 % ((param1 - -58) / 60);
                    kj.a(-108, "document.cookie=\"" + var5 + "\"", param0);
                } catch (Throwable throwable) {
                }
                ok.a(9507, param0);
            } catch (RuntimeException runtimeException) {
                throw ch.a((Throwable) (Object) runtimeException, "gb.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = var3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3 = de.a(33, param1.charAt(var4)) + (-var3 + (var3 << 5));
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("gb.D(").append(-14741).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final static nb[] a(fe param0) {
        RuntimeException var2 = null;
        int[] var3 = null;
        nb[] var4 = null;
        int var5 = 0;
        nb var6 = null;
        int var7 = 0;
        ib var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        nb[] stackIn_3_0 = null;
        nb[] stackIn_10_0 = null;
        nb[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        nb[] stackOut_9_0 = null;
        nb[] stackOut_14_0 = null;
        nb[] stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.b(5)) {
              var8 = param0.a(-1);
              L1: while (true) {
                if (var8.field_c != 0) {
                  if (var8.field_c == 2) {
                    stackOut_9_0 = new nb[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var12 = (int[]) var8.field_g;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new nb[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_14_0 = (nb[]) var4;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var6 = new nb();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2];
                        var6.field_d = var3[(var5 << 2) + 1];
                        var6.field_b = var3[(var5 << 2) - -2];
                        var6.field_e = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  pg.a(10L, -126);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new nb[]{};
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("gb.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + -122 + 41);
        }
        return stackIn_15_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -2) {
            field_b = null;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                wl.field_I = false;
                aa.field_g = false;
                var3_int = -66 % ((-23 - param1) / 41);
                if (null == wg.field_d) {
                  break L2;
                } else {
                  if (!wg.field_d.field_A) {
                    break L2;
                  } else {
                    L3: {
                      var4 = 1;
                      if (param0 != 8) {
                        break L3;
                      } else {
                        L4: {
                          param0 = 2;
                          if (lb.field_d) {
                            param2 = ih.field_a;
                            break L4;
                          } else {
                            param2 = wj.field_k;
                            break L4;
                          }
                        }
                        ok.field_a.a(ob.field_F, 30);
                        break L3;
                      }
                    }
                    L5: {
                      if (10 != param0) {
                        break L5;
                      } else {
                        var4 = 0;
                        int discarded$18 = -2147483648;
                        bj.d();
                        break L5;
                      }
                    }
                    L6: {
                      if (var4 == 0) {
                        break L6;
                      } else {
                        L7: {
                          if (!wl.field_I) {
                            break L7;
                          } else {
                            param2 = ij.a(ol.field_e, new String[1], (byte) -113);
                            break L7;
                          }
                        }
                        L8: {
                          if (!hd.field_b) {
                            break L8;
                          } else {
                            param2 = qd.field_c;
                            break L8;
                          }
                        }
                        wg.field_d.a(param2, param0, -4);
                        break L6;
                      }
                    }
                    if (param0 == 256) {
                      break L2;
                    } else {
                      if (param0 == 10) {
                        break L2;
                      } else {
                        if (lb.field_d) {
                          break L2;
                        } else {
                          ok.field_a.l(-31891);
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("gb.A(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    final static void a() {
        ba.a(109, 17);
    }

    final static void a(oa param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var5 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (ah.field_b == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          ah.field_b.a(0L, (byte) -128);
                          ah.field_b.a(var6, 16711708);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (var3_int >= 24) {
                                break L5;
                              } else {
                                if (var6[var3_int] != 0) {
                                  break L5;
                                } else {
                                  var3_int++;
                                  continue L4;
                                }
                              }
                            }
                            if (24 <= var3_int) {
                              throw new IOException();
                            } else {
                              param0.a((byte) -89, var2, 24, 0);
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
                              var2[var4] = (byte) -1;
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
                    }
                  }
                  param0.a((byte) -89, var2, 24, 0);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var2_ref;
                stackOut_17_1 = new StringBuilder().append("gb.G(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L8;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L8;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Type your password again to make sure it's correct";
        field_e = "That name is not available";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Logging in...";
    }
}
