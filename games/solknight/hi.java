/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hi {
    private o[] field_a;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (param0 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              L4: {
                if (param0 != 0) {
                  var6 = vk.field_e;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      stackIn_19_0 = param0 ^ -1;

                      stackIn_19_1 = var4 ^ -1;

                      if (var5 != 0) {
                        break L3;
                      } else {
                        if (stackIn_19_0 != stackIn_19_1) {
                          var3++;
                          if (var5 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_16_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackIn_19_0 = -14;
              stackIn_19_1 = (param1 - -14) / 57;
              break L3;
            }
            var2_int = stackIn_19_0 / stackIn_19_1;
            stackIn_20_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "hi.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
            dl stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            dl stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            dl stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            nj var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = "";
                            if (param0 == null) {
                                statePc = 3;
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
                            var3 = kj.a((byte) 105, param0);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
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
                            var3 = var3 + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3 = var3 + param1;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            we.a(var3, param2 ^ -2);
                            var7 = hl.a(var3, "%3a", ":", true);
                            var8 = hl.a(var7, "%40", "@", true);
                            var9 = hl.a(var8, "%26", "&", true);
                            var10 = hl.a(var9, "%23", "#", true);
                            if (ik.field_c == null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackIn_13_0 = lg.field_l;
                            stackIn_12_0 = stackIn_13_0;
                            stackIn_13_1 = null;
                            stackIn_12_1 = stackIn_13_1;
                            stackIn_13_2 = null;
                            stackIn_12_2 = stackIn_13_2;
                            stackIn_13_3 = ik.field_c.getCodeBase();
                            stackIn_12_3 = stackIn_13_3;
                            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ke.field_J).append("&u=");
                            stackIn_12_4 = stackIn_13_4;
                            if (lb.field_W != null) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackIn_14_0 = (dl) ((Object) stackIn_12_0);
                            stackIn_14_1 = null;
                            stackIn_14_2 = null;
                            stackIn_14_3 = (java.net.URL) ((Object) stackIn_12_3);
                            stackIn_14_4 = (StringBuilder) ((Object) stackIn_12_4);
                            stackIn_14_5 = "" + d.field_c;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackIn_14_0 = (dl) ((Object) stackIn_13_0);
                            stackIn_14_1 = null;
                            stackIn_14_2 = null;
                            stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                            stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                            stackIn_14_5 = lb.field_W;
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
                            var4 = ((dl) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + dl.field_a + "&v2=" + dl.field_x + "&e=" + var10), (byte) 68);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 != (var4.field_c ^ -1)) {
                                statePc = 19;
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
                            i.a((byte) 27, 1L);
                            if (var6 != 0) {
                                statePc = 23;
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
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var4.field_c != param2) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = (DataInputStream) (var4.field_e);
                            var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3_ref = (Exception) ((Object) caughtException);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
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

    final static void a(int param0, int param1) {
        gg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bl var4 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (bl) ((Object) m.field_h.a((byte) 51));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        la.a(0, param0, var4);
                        var4 = (bl) ((Object) m.field_h.b(param1 ^ 5819));
                        if (var3 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == -5887) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        var2 = kh.field_a.a((byte) 51);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2 == null) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        v.a(param1 ^ -5885, param0);
                        var2 = kh.field_a.b(-57);
                        if (var3 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var2_ref), "hi.D(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return;
        }
        uj.a(param1, param3, param4, this.field_a, param2, 2);
    }

    hi(o[] param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
