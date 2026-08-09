/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ki extends rc implements oh {
    static int field_C;
    static String field_A;
    nc field_B;

    private final void c(boolean param0) {
        int statePc = 0;
        ck var2 = null;
        rc var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    var2 = new ck(this.field_B);
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ki.d(false);
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (rc) ((Object) var2.a((byte) 114));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var3.d(1);
                    var3 = (rc) ((Object) var2.c(124));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var3 = (rc) ((Object) var2.a((byte) 114));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    var3.d(1);
                    var3 = (rc) ((Object) var2.c(124));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int f(int param0) {
        int var2;
        ck var3;
        rc var4;
        int var5;
        int var6;
        int var7;
        int stackIn_8_0 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = 0;
        var3 = new ck(this.field_B);
        var4 = (rc) ((Object) var3.a((byte) -59));
        var5 = 21 / ((param0 - 17) / 43);
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                var6 = var4.f(74);
                stackIn_8_0 = var2;

                if (var7 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_8_0 < var6) {
                      var2 = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = (rc) ((Object) var3.c(116));
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_8_0 = var2;
            break L1;
          }
          return stackIn_8_0;
        }
    }

    ki(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (dg) null);
        this.field_B = new nc();
    }

    final void a(rc param0, int param1) {
        try {
            if (param1 != 5411) {
                Hashtable var4 = (Hashtable) null;
                this.a(24, 112, (StringBuilder) null, (Hashtable) null);
            }
            this.field_B.a(param0, -7044);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ki.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 == -1) {
                  break L0;
                } else {
                  field_A = (String) null;
                  break L0;
                }
              }
              try {
                L1: {
                  var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                  param0.getAppletContext().showDocument(kk.a(param1 ^ -89, var2, param0), "_top");
                  break L1;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("ki.IA(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od[] a(int param0, da param1, int param2, int param3) {
        RuntimeException var4 = null;
        java.applet.Applet var5 = null;
        od[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (l.a(87, param2, param3, param1)) {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  var5 = (java.applet.Applet) null;
                  ki.a((java.applet.Applet) null, 57);
                  break L1;
                }
              }
              stackIn_6_0 = bl.b(false);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ki.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final void a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        RuntimeException runtimeException = null;
        int var6 = 0;
        rc var7 = null;
        int var8 = 0;
        int var9 = 0;
        ck var10 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = 26 / ((param1 - 39) / 59);
                        var10 = new ck(this.field_B);
                        var7 = (rc) ((Object) var10.a((byte) -99));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 == null) {
                            statePc = 20;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        discarded$11 = param2.append('\n');
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 > param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        discarded$12 = param2.append(' ');
                        var8++;
                        if (var9 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7.a(-81, param3, param2, param0 - -1);
                        var7 = (rc) ((Object) var10.c(115));
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (runtimeException);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ki.V(").append(param0).append(',').append(param1).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param3 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int statePc = 0;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        ck var9 = null;
        ck var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    if (-1 == (param1 ^ -1)) {
                        statePc = 11;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param3 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var8 = new ck(this.field_B);
                    var6 = (rc) ((Object) var8.a(-25119));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var6.a(this.field_j + param0, param1, param2 - -this.field_m, 0);
                    var6 = (rc) ((Object) var8.b(640));
                    if (var7 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 11: {
                    if (this.field_w != null) {
                        statePc = 22;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param3 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var9 = new ck(this.field_B);
                    var6 = (rc) ((Object) var9.a(-25119));
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var6 != null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    var6.a(this.field_j + param0, param1, param2 - -this.field_m, 0);
                    var6 = (rc) ((Object) var9.b(640));
                    if (var7 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var7 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 22: {
                    this.field_w.a((byte) 116, param0, true, param2, (rc) (this));
                    if (param3 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    var10 = new ck(this.field_B);
                    var5 = var10;
                    var6 = (rc) ((Object) var10.a(-25119));
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var6 != null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    var6.a(this.field_j + param0, param1, param2 - -this.field_m, 0);
                    var6 = (rc) ((Object) var10.b(640));
                    if (var7 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                case 29: {
                    if (var7 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        rc var9 = null;
        int var10 = 0;
        ck var11 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ck(this.field_B);
            var9 = (rc) ((Object) var11.a((byte) 125));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackIn_10_0 = var9.a(false);

                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_10_0) {
                        break L3;
                      } else {
                        if (!var9.a(param0, param1 - -this.field_m, false, param3, param4, param5 - -this.field_j, param6)) {
                          var9 = (rc) ((Object) var11.c(122));
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          stackIn_7_0 = 1;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackIn_10_0 = param2;
                break L2;
              }
              if (!stackIn_10_0) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.d((byte) 97);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var8);

            stackIn_16_1 = new StringBuilder().append("ki.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return null != this.d((byte) -48) ? true : false;
    }

    public static void d(boolean param0) {
        field_A = null;
        if (param0) {
            field_C = 53;
        }
    }

    final boolean b(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_B.c(-1)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0 > 89) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.field_B = (nc) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = new ck(this.field_B);
                        var4 = (rc) ((Object) var8.a((byte) 112));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var4.b(true);
                        stackIn_20_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = new ck(this.field_B);
                        var5.a(26229, var4);
                        var6 = (rc) ((Object) var5.c(121));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6.a(-1463, param1);
                        stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        var6 = (rc) ((Object) var5.c(125));
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = (rc) ((Object) var8.c(115));
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var3);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("ki.CA(").append(param0).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        rc var8 = null;
        ck var9 = null;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var9 = new ck(this.field_B);
            var8 = (rc) ((Object) var9.a((byte) 77));
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.a(false);
                    stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var8.b(true)) {
                            break L4;
                          } else {
                            if (var8.a(param0, (byte) 88, param2, param3)) {
                              stackIn_9_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var8 = (rc) ((Object) var9.c(115));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = param2;
                break L2;
              }
              var6 = stackIn_12_0;
              if (80 == var6) {
                L5: {
                  if (fh.field_d[81]) {
                    stackIn_17_0 = this.a((byte) -105, param3);
                    break L5;
                  } else {
                    stackIn_17_0 = this.b(112, param3);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = 9 / ((param1 - 31) / 56);
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ki.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        rc var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param2, -1, param1, param3)) {
                this.b(param2, -111, param1, param3);
                this.a(param3, -31, param2, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 <= -41) {
                break L2;
              } else {
                var6 = (rc) null;
                this.a('￯', (byte) 103, -3, (rc) null);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ki.GA(").append(param0).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ck var7 = null;
        rc var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = new ck(this.field_B);
              if (param1 == 0) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            var8 = (rc) ((Object) var7.a((byte) 93));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.a(false)) {
                    break L3;
                  } else {
                    var8.a(param0, param1 + 0, param2, this.field_j + param3, param4, this.field_m + param5);
                    var8 = (rc) ((Object) var7.c(param1 ^ 127));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("ki.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        rc var9 = null;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new ck(this.field_B);
            var9 = (rc) ((Object) var8.a((byte) 98));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.a(false);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.b(true)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, param2, param3, param4, param5, (byte) 50)) {
                              break L4;
                            } else {
                              stackIn_8_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var9 = (rc) ((Object) var8.c(118));
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_11_0 = param6;
                break L2;
              }
              if (stackIn_11_0 > 33) {
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("ki.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    final String c(byte param0) {
        ck var2;
        rc var3;
        String var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = new ck(this.field_B);
        if (param0 >= 14) {
          var3 = (rc) ((Object) var2.a((byte) -122));
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.c((byte) 106);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (rc) ((Object) var2.c(117));
                if (var5 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          this.c((byte) 48);
          var3 = (rc) ((Object) var2.a((byte) -122));
          L1: while (true) {
            if (var3 != null) {
              var4 = var3.c((byte) 106);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (rc) ((Object) var2.c(117));
                if (var5 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final void g(int param0) {
        int statePc = 0;
        ck var2 = null;
        rc var3 = null;
        int var4 = 0;
        rc var5 = null;
        ck var6 = null;
        ck var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = (rc) null;
                    this.a((byte) 3, (rc) null);
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new ck(this.field_B);
                    var2 = var6;
                    var3 = (rc) ((Object) var6.a((byte) 81));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var3.g(0);
                    var3 = (rc) ((Object) var6.c(115));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var9 = new ck(this.field_B);
                    var2 = var9;
                    var3 = (rc) ((Object) var9.a((byte) 81));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    var3.g(0);
                    var3 = (rc) ((Object) var9.c(115));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, rc param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var3 = new ck(this.field_B);
            var4 = (rc) ((Object) var3.a((byte) 92));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var4.a(-1463, param1);
                    stackIn_9_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        var4 = (rc) ((Object) var3.c(121));
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        stackIn_6_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_9_0 = param0;
                break L2;
              }
              if (stackIn_9_0 == -1463) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_B = (nc) null;
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("ki.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = -1;
                        if (param0 == -27129) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 75;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var5 = param3;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2 <= var5) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = var4_int >>> 2021887144 ^ og.field_g[255 & (param1[var5] ^ var4_int)];
                        var5++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_int = var4_int ^ -1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var4_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var4);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("ki.AA(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ne.field_g = te.field_N.h(92);
        if (param0 > -100) {
            return;
        }
        CharSequence var2 = (CharSequence) ((Object) ne.field_g);
        kf.field_D = jg.a(var2, -2);
    }

    void a(int param0, int param1, int param2, rc param3) {
        RuntimeException runtimeException = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ck(this.field_B);
            var6 = (rc) ((Object) var5.a((byte) 117));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.a(false)) {
                    break L2;
                  } else {
                    var6.a(param0 + this.field_m, 18874, param2 + this.field_j, param3);
                    var6 = (rc) ((Object) var5.c(param1 ^ 18880));
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ki.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final boolean a(byte param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        ck var5 = null;
        rc var6 = null;
        int var7 = 0;
        ck var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_B.c(-1)) {
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
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var8 = new ck(this.field_B);
                        if (param0 < -104) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var4 = (rc) ((Object) var8.a(-25119));
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
                        if (var4 == null) {
                            statePc = 20;
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
                        stackOut_9_0 = var4.b(true);
                        stackIn_21_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                            statePc = 21;
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
                        if (!stackIn_10_0) {
                            statePc = 19;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = new ck(this.field_B);
                        var5.a(var4, 118);
                        var6 = (rc) ((Object) var5.b(640));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6.a(-1463, param1);
                        stackIn_21_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0) {
                            statePc = 16;
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var6 = (rc) ((Object) var5.b(640));
                        if (var7 == 0) {
                            statePc = 12;
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
                        var4 = (rc) ((Object) var8.b(640));
                        if (var7 == 0) {
                            statePc = 8;
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
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var3);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("ki.P(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
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
                    throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.c(true);
    }

    rc d(byte param0) {
        ck var2;
        rc var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -48) {
          var2 = new ck(this.field_B);
          var3 = (rc) ((Object) var2.a((byte) -119));
          L0: while (true) {
            if (var3 != null) {
              if (var3.b(true)) {
                return var3;
              } else {
                var3 = (rc) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          this.field_B = (nc) null;
          var2 = new ck(this.field_B);
          var3 = (rc) ((Object) var2.a((byte) -119));
          L1: while (true) {
            if (var3 != null) {
              if (var3.b(true)) {
                return var3;
              } else {
                var3 = (rc) ((Object) var2.c(121));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    static {
        field_A = "members-only content";
    }
}
