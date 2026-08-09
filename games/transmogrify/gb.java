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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        var3 = 0;
                        var4 = 0;
                        if (param0 == -14741) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6 = (String) null;
                        gb.a(-113, 32, (String) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_7_0 = de.a(33, param1.charAt(var4)) + (-var3 + (var3 << 90255621));
                        stackIn_5_0 = stackIn_7_0;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = stackIn_5_0;
                        var4++;
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = var3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var2);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("gb.D(").append(param0).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param1 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static nb[] a(fe param0, byte param1) {
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
        int statePc = 0;
        Throwable caughtException = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.b(5)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = new nb[]{};
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var9 = param0.a(-1);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var9.field_c != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        pg.a(10L, -126);
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9.field_c == 2) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = new nb[]{};
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var11 = (int[]) (var9.field_g);
                        var10 = var11;
                        var3 = var10;
                        var4 = new nb[var11.length >> -312875230];
                        var5 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var4.length <= var5) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = new nb();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << -1512085278];
                        var6.field_d = var3[(var5 << -1945014270) + 1];
                        var6.field_b = var3[(var5 << -338265438) - -2];
                        var6.field_e = var3[3 + (var5 << 1709461314)];
                        var5++;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param1 <= -30) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var8 = (String) null;
                        gb.a(-23, -90, (String) null);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (nb[]) (var4);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var2);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("gb.F(");
                    stackIn_23_1 = stackIn_24_1;
                    if (param0 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        String var2;
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
            int var3_int = 0;
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
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            var8 = new byte[24];
                            var7 = var8;
                            var6 = var7;
                            var2 = var6;
                            if (ah.field_b == null) {
                                statePc = 22;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ah.field_b.a(0L, (byte) -128);
                            ah.field_b.a(var6, 16711708);
                            var3_int = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var10 = var8[var3_int] ^ -1;
                            var9 = -1;
                            if (var5 != 0) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var9 != var10) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var9 <= var10) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 5;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof Exception ? 17 : 24);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 28;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var5 == 0) {
                                statePc = 18;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            param0.a((byte) -89, var8, 24, 0);
                            return;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            param0.a((byte) -89, var8, 24, 0);
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        var2_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_26_0 = (RuntimeException) (var2_ref);
                        stackIn_25_0 = stackIn_26_0;
                        stackIn_26_1 = new StringBuilder().append("gb.G(");
                        stackIn_25_1 = stackIn_26_1;
                        if (param0 == null) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                        stackIn_27_2 = "{...}";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                        stackIn_27_2 = "null";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
                    }
                    case 28: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
