/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class uj implements rd {
    static jb[] field_a;
    private int field_b;
    static int[][] field_f;
    static aj field_c;
    private le field_d;
    private int field_e;

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          uj.a(-66, (java.awt.Canvas) null);
          field_a = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        int var2 = 25 % ((param0 - 3) / 42);
        if (!(11 != ta.field_g)) {
            ee.b(95);
        }
        de.a(fh.field_i, tl.field_g, pb.field_j, true);
        lj.a(0, param1, 0, (byte) -128);
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ei var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ab stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            ab stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            ab stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            ab stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            ab stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            ab stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param1 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = ik.a(-64, param1);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param1 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            oe.a(var3_ref, true);
                            var7 = tb.a(":", var3_ref, true, "%3a");
                            var8 = tb.a("@", var7, true, "%40");
                            var9 = tb.a("&", var8, true, "%26");
                            var10 = tb.a("#", var9, true, "%23");
                            if (null == tg.field_i) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = pk.field_n;
                            stackOut_10_1 = param2 ^ -23815;
                            stackOut_10_2 = null;
                            stackOut_10_3 = null;
                            stackOut_10_4 = tg.field_i.getCodeBase();
                            stackOut_10_5 = new StringBuilder().append("clienterror.ws?c=").append(ki.field_f).append("&u=");
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_12_4 = stackOut_10_4;
                            stackIn_12_5 = stackOut_10_5;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            stackIn_11_4 = stackOut_10_4;
                            stackIn_11_5 = stackOut_10_5;
                            if (null != gl.field_b) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (ab) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = null;
                            stackOut_11_3 = null;
                            stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                            stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                            stackOut_11_6 = "" + d.field_a;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_13_5 = stackOut_11_5;
                            stackIn_13_6 = stackOut_11_6;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (ab) (Object) stackIn_12_0;
                            stackOut_12_1 = stackIn_12_1;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                            stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                            stackOut_12_6 = gl.field_b;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            stackIn_13_6 = stackOut_12_6;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + ab.field_j + "&v2=" + ab.field_v + "&e=" + var10);
                            var4 = ((ab) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-1 != (var4.field_b ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ge.a(param2 + -1, 1L);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4.field_b != param2) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var5 = (DataInputStream) var4.field_g;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
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

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if (!param3.field_m) {
          if (!param3.a(18337)) {
            var6 = 2188450;
            int discarded$3 = ((uj) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_u + "</u>", param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, var6, -1, ((uj) this).field_b, ((uj) this).field_e, ((uj) this).field_d.field_E + ((uj) this).field_d.field_G);
            if (param4 == -3284) {
              if (param3.a(18337)) {
                var7 = ((uj) this).field_d.b(param3.field_u);
                var8 = ((uj) this).field_d.field_G + ((uj) this).field_d.field_E;
                var9 = param3.field_t + param1;
                var10 = param3.field_o + param0;
                if (((uj) this).field_b != 2) {
                  if ((((uj) this).field_b ^ -1) == -2) {
                    var9 = var9 + (param3.field_j + -var7 >> -1830937631);
                    if (((uj) this).field_e != 2) {
                      if (1 != ((uj) this).field_e) {
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      } else {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  } else {
                    if (((uj) this).field_e != 2) {
                      if (1 != ((uj) this).field_e) {
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      } else {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  }
                } else {
                  var9 = var9 + (-var7 + param3.field_j);
                  if (((uj) this).field_e != 2) {
                    if (1 != ((uj) this).field_e) {
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    } else {
                      var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  } else {
                    var10 = var10 + (param3.field_v - var8);
                    pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            var6 = 3249872;
            int discarded$4 = ((uj) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_u + "</u>", param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, var6, -1, ((uj) this).field_b, ((uj) this).field_e, ((uj) this).field_d.field_E + ((uj) this).field_d.field_G);
            if (param4 == -3284) {
              if (param3.a(18337)) {
                var7 = ((uj) this).field_d.b(param3.field_u);
                var8 = ((uj) this).field_d.field_G + ((uj) this).field_d.field_E;
                var9 = param3.field_t + param1;
                var10 = param3.field_o + param0;
                if (((uj) this).field_b != 2) {
                  if ((((uj) this).field_b ^ -1) == -2) {
                    var9 = var9 + (param3.field_j + -var7 >> -1830937631);
                    if (((uj) this).field_e != 2) {
                      if (1 != ((uj) this).field_e) {
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      } else {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  } else {
                    if (((uj) this).field_e != 2) {
                      if (1 != ((uj) this).field_e) {
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      } else {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                        return;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  }
                } else {
                  L0: {
                    var9 = var9 + (-var7 + param3.field_j);
                    if (((uj) this).field_e != 2) {
                      if (1 == ((uj) this).field_e) {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      break L0;
                    }
                  }
                  pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var6 = 3249872;
          int discarded$5 = ((uj) this).field_d.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_u + "</u>", param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, var6, -1, ((uj) this).field_b, ((uj) this).field_e, ((uj) this).field_d.field_E + ((uj) this).field_d.field_G);
          if (param4 == -3284) {
            if (param3.a(18337)) {
              var7 = ((uj) this).field_d.b(param3.field_u);
              var8 = ((uj) this).field_d.field_G + ((uj) this).field_d.field_E;
              var9 = param3.field_t + param1;
              var10 = param3.field_o + param0;
              if (((uj) this).field_b != 2) {
                if ((((uj) this).field_b ^ -1) == -2) {
                  var9 = var9 + (param3.field_j + -var7 >> -1830937631);
                  if (((uj) this).field_e != 2) {
                    if (1 != ((uj) this).field_e) {
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    } else {
                      var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                      pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                      return;
                    }
                  } else {
                    var10 = var10 + (param3.field_v - var8);
                    pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                    return;
                  }
                } else {
                  L1: {
                    if (((uj) this).field_e != 2) {
                      if (1 == ((uj) this).field_e) {
                        var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      var10 = var10 + (param3.field_v - var8);
                      break L1;
                    }
                  }
                  pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                  return;
                }
              } else {
                L2: {
                  var9 = var9 + (-var7 + param3.field_j);
                  if (((uj) this).field_e != 2) {
                    if (1 == ((uj) this).field_e) {
                      var10 = var10 + (-var8 + param3.field_v >> 1642385793);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var10 = var10 + (param3.field_v - var8);
                    break L2;
                  }
                }
                pk.a(var8, 2 + var10, -2 + var9, 1, var7 - -4);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public uj() {
        ((uj) this).field_b = 1;
        ((uj) this).field_d = ql.field_Q;
        ((uj) this).field_e = 1;
    }

    uj(le param0, int param1, int param2) {
        ((uj) this).field_b = param1;
        ((uj) this).field_e = param2;
        ((uj) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new aj(7, 0, 1, 1);
    }
}
