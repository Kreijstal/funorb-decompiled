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
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (var2_int <= var4) {
                stackIn_6_0 = var3;
                break L0;
              } else {
                var3 = de.a(33, param1.charAt(var4)) + (-var3 + (var3 << 90255621));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("gb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final static nb[] a(fe param0, byte param1) {
        nb[] stackIn_3_0 = null;
        nb[] stackIn_10_0 = null;
        nb[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.b(5)) {
              var9 = param0.a(-1);
              L1: while (true) {
                if (var9.field_c != 0) {
                  if (var9.field_c == 2) {
                    stackIn_10_0 = new nb[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var11 = (int[]) (var9.field_g);
                    var10 = var11;
                    var3 = var10;
                    var4 = new nb[var11.length >> -312875230];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        L3: {
                          if (param1 <= -30) {
                            break L3;
                          } else {
                            var8 = (String) null;
                            gb.a(-23, -90, (String) null);
                            break L3;
                          }
                        }
                        stackIn_17_0 = (nb[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new nb();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << -1512085278];
                        var6.field_d = var3[(var5 << -1945014270) + 1];
                        var6.field_b = var3[(var5 << -338265438) - -2];
                        var6.field_e = var3[3 + (var5 << 1709461314)];
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
              stackIn_3_0 = new nb[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("gb.F(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
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
        }
        field_a = null;
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                      if (-9 != (param0 ^ -1)) {
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
                      break L2;
                    } else {
                      if (-11 == (param0 ^ -1)) {
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
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("gb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final static void a(byte param0) {
        if (param0 != 81) {
            String var2 = (String) null;
            gb.a(92, 22, (String) null);
        }
        ba.a(param0 ^ 60, 17);
    }

    final static void a(oa param0, boolean param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            var5 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                if (param1) {
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
                                  if (-1 != (var6[var3_int] ^ -1)) {
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
                              if (-25 >= (var4 ^ -1)) {
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
                      }
                    }
                    param0.a((byte) -89, var2, 24, 0);
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
                stackIn_21_0 = (RuntimeException) (var2_ref);

                stackIn_21_1 = new StringBuilder().append("gb.G(");

                if (param0 == null) {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "null";
                  break L8;
                } else {
                  stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackIn_22_2 = "{...}";
                  break L8;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
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
