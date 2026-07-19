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
                throw ch.a((Throwable) ((Object) runtimeException), "gb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        String var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              var4 = 0;
              if (param0 == -14741) {
                break L1;
              } else {
                var6 = (String) null;
                gb.a(-113, 32, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  stackOut_6_0 = var3;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_4_0 = de.a(33, param1.charAt(var4)) + (-var3 + (var3 << 90255621));
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L3;
                  } else {
                    var3 = stackIn_5_0;
                    var4++;
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2);
            stackOut_8_1 = new StringBuilder().append("gb.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static nb[] a(fe param0, byte param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        nb[] var4 = null;
        int var5 = 0;
        nb var6 = null;
        int var7 = 0;
        String var8 = null;
        ib var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        nb[] stackIn_3_0 = null;
        nb[] stackIn_12_0 = null;
        nb[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nb[] stackOut_20_0 = null;
        nb[] stackOut_11_0 = null;
        nb[] stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.b(5)) {
              var9 = param0.a(-1);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9.field_c != 0) {
                      break L3;
                    } else {
                      pg.a(10L, -126);
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var9.field_c == 2) {
                    break L2;
                  } else {
                    var11 = (int[]) (var9.field_g);
                    var10 = var11;
                    var3 = var10;
                    var4 = new nb[var11.length >> -312875230];
                    var5 = 0;
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var4.length <= var5) {
                            break L6;
                          } else {
                            var6 = new nb();
                            var4[var5] = var6;
                            var6.field_a = var3[var5 << -1512085278];
                            var6.field_d = var3[(var5 << -1945014270) + 1];
                            var6.field_b = var3[(var5 << -338265438) - -2];
                            var6.field_e = var3[3 + (var5 << 1709461314)];
                            var5++;
                            if (var7 != 0) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        if (param1 <= -30) {
                          break L5;
                        } else {
                          var8 = (String) null;
                          gb.a(-23, -90, (String) null);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (nb[]) (var4);
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                stackOut_11_0 = new nb[]{};
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = new nb[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("gb.F(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -2) {
          field_b = (String) null;
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
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
              wl.field_I = false;
              aa.field_g = false;
              var3_int = -66 % ((-23 - param1) / 41);
              if (null == wg.field_d) {
                break L1;
              } else {
                if (!wg.field_d.field_A) {
                  break L1;
                } else {
                  L2: {
                    var4 = 1;
                    if (-9 != (param0 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          param0 = 2;
                          if (lb.field_d) {
                            break L4;
                          } else {
                            param2 = wj.field_k;
                            if (!Transmogrify.field_A) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        param2 = ih.field_a;
                        break L3;
                      }
                      ok.field_a.a(ob.field_F, 30);
                      break L2;
                    }
                  }
                  L5: {
                    if (10 != param0) {
                      break L5;
                    } else {
                      var4 = 0;
                      bj.d(-2147483648);
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
                          param2 = ij.a(ol.field_e, new String[]{param2}, (byte) -113);
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
                  if ((param0 ^ -1) == -257) {
                    break L1;
                  } else {
                    if (-11 == (param0 ^ -1)) {
                      break L1;
                    } else {
                      if (lb.field_d) {
                        break L1;
                      } else {
                        ok.field_a.l(-31891);
                        return;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("gb.A(").append(param0).append(',').append(param1).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final static void a(byte param0) {
        String var2 = null;
        if (param0 != 81) {
          var2 = (String) null;
          gb.a(92, 22, (String) null);
          ba.a(param0 ^ 60, 17);
          return;
        } else {
          ba.a(param0 ^ 60, 17);
          return;
        }
    }

    final static void a(oa param0, boolean param1) {
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
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var5 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                if (param1) {
                  L1: {
                    L2: {
                      var8 = new byte[24];
                      var7 = var8;
                      var6 = var7;
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
                                L6: {
                                  L7: {
                                    if (var3_int >= 24) {
                                      break L7;
                                    } else {
                                      var10 = var8[var3_int] ^ -1;
                                      var9 = -1;
                                      if (var5 != 0) {
                                        if (var9 <= var10) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      } else {
                                        if (var9 != var10) {
                                          break L7;
                                        } else {
                                          var3_int++;
                                          if (var5 == 0) {
                                            continue L4;
                                          } else {
                                            break L7;
                                          }
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
                          L8: {
                            var3 = (Exception) (Object) decompiledCaughtException;
                            var4 = 0;
                            L9: while (true) {
                              if (-25 >= (var4 ^ -1)) {
                                decompiledRegionSelector0 = 0;
                                break L8;
                              } else {
                                var6[var4] = (byte)-1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    param0.a((byte) -89, var8, 24, 0);
                                    return;
                                  }
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
                      }
                    }
                    param0.a((byte) -89, var8, 24, 0);
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
              L10: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) (var2_ref);
                stackOut_24_1 = new StringBuilder().append("gb.G(");
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param0 == null) {
                  stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
                  stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L10;
                } else {
                  stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L10;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
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

    static {
        field_b = "Type your password again to make sure it's correct";
        field_e = "That name is not available";
        field_d = "This password contains your email address, and would be easy to guess";
        field_c = "Logging in...";
    }
}
