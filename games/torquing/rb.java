/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class rb extends lg {
    private ei field_D;
    private String[] field_E;
    static long field_C;
    private tb field_F;

    rb(String param0, el param1) {
        super(param0, (ca) null);
        ((rb) this).field_F = null;
        try {
            ((rb) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "rb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    boolean a(gm param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rb.JA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = -124 % ((66 - param0) / 57);
        super.a((byte) 125, param1, param2, param3, param4);
        ((rb) this).a((byte) 125);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 46) {
            return;
        }
        ((rb) this).a((byte) 124, param1, param3, ((fe) (Object) ((rb) this).field_q).a((gm) this, 2), param2);
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            String stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Torquing.field_u;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) hp.a(param1, (byte) -85, "getcookies");
                            var5 = kc.a(';', var4, 0);
                            if (param0 <= -102) {
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
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var6 = 0;
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
                            if (var5.length <= var6) {
                                statePc = 13;
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
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 10;
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
                            stackOut_8_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2 = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (null != rd.field_t) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            return param1.getParameter("settings");
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = rd.field_t;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2_ref;
                        stackOut_17_1 = new StringBuilder().append("rb.C(").append(param0).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
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

    private final tb a(int param0, boolean param1, int param2) {
        tb var4 = null;
        tb var5 = null;
        int var6 = 0;
        var6 = Torquing.field_u;
        var4 = (tb) (Object) ((rb) this).field_D.b(0);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (tb) (Object) ((rb) this).field_D.f(-24059);
                continue L0;
              } else {
                L2: {
                  if (var5.field_m > param0) {
                    break L2;
                  } else {
                    if (param2 < var5.field_p) {
                      break L2;
                    } else {
                      if (var5.field_m + var5.field_q <= param0) {
                        break L2;
                      } else {
                        if (param2 <= var5.field_n + var5.field_p) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, gm param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(71, param1, param2, param3);
              var5_int = 0;
              ((rb) this).field_F = null;
              if (!((rb) this).field_s) {
                break L1;
              } else {
                var6 = -((rb) this).field_w + -param3 + n.field_t;
                var7 = k.field_e + (-param2 + -((rb) this).field_k);
                ((rb) this).field_F = this.a(var6, false, var7);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rb.P(").append(-88).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (byte) -44, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        fe var5 = (fe) (Object) ((rb) this).field_q;
        tb var6 = ((rb) this).field_F;
        if (var6 != null) {
            var7 = var5.a(2, param3, (gm) this);
            var8 = var5.a((gm) this, param2, -59);
            do {
                he.a(-2 + var7 + var6.field_m, 2 + var6.field_n, -2 + (var6.field_p + var8), 2, var6.field_q + 2);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    final void a(int param0, byte param1, String param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (((rb) this).field_E == null) {
                  break L2;
                } else {
                  if (((rb) this).field_E.length > param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var8 = new String[param0 + 1];
                var9 = var8;
                var4 = var9;
                if (((rb) this).field_E != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (((rb) this).field_E.length <= var5) {
                      break L3;
                    } else {
                      var8[var5] = ((rb) this).field_E[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((rb) this).field_E = var9;
              break L1;
            }
            L5: {
              ((rb) this).field_E[param0] = param2;
              if (param1 < -73) {
                break L5;
              } else {
                var7 = null;
                boolean discarded$2 = ((rb) this).a((gm) null, false);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("rb.B(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    String b(int param0) {
        if (((rb) this).field_F == null) {
            return null;
        }
        if (null == ((rb) this).field_E) {
            return null;
        }
        if (((rb) this).field_E.length <= ((rb) this).field_F.field_j) {
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        return ((rb) this).field_E[((rb) this).field_F.field_j];
    }

    final void a(byte param0) {
        int var2 = 0;
        fe var3 = null;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        kp var13 = null;
        int var14 = 0;
        int var15 = 0;
        tb var16 = null;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var17 = Torquing.field_u;
        ((rb) this).field_D = new ei();
        var2 = 0;
        var3 = (fe) (Object) ((rb) this).field_q;
        var4 = var3.b((byte) 110, (gm) this);
        var5 = -116 / ((param0 - 76) / 41);
        L0: while (true) {
          var6 = ((rb) this).field_m.indexOf("<hotspot=", var2);
          if (var6 == -1) {
            return;
          } else {
            var8 = ((rb) this).field_m.indexOf(">", var6);
            var7 = ((rb) this).field_m.substring(9 + var6, var8);
            var8 = Integer.parseInt(var7);
            var2 = ((rb) this).field_m.indexOf("</hotspot>", var6);
            var9 = var4.b(var6, (byte) 110);
            var10 = var4.b(var2, (byte) 110);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var12 > var10) {
                continue L0;
              } else {
                L2: {
                  var13 = var4.field_c[var12];
                  if (var9 != var12) {
                    stackOut_6_0 = var13.field_b[0];
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var4.a(var6, (byte) -110);
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 == var12) {
                    stackOut_11_0 = var4.a(var2, (byte) -112);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var13 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = var13.field_b[-1 + var13.field_b.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new tb(var8, var14, var13.field_c, -var14 + var15, Math.max(var3.a(false), -var13.field_c + var13.field_a));
                  if (var11 != null) {
                    ((tb) var11).field_k = var16;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11 = (Object) (Object) var16;
                ((rb) this).field_D.a((byte) 54, (q) (Object) var16);
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    final static ga a(Throwable param0, String param1) {
        ga var2 = null;
        if (!(param0 instanceof ga)) {
            var2 = new ga(param0, param1);
        } else {
            var2 = (ga) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param2 != -1) {
            return;
        }
        int var5 = -((rb) this).field_w + param3;
        int var6 = param1 - ((rb) this).field_k;
        tb var7 = this.a(var5, false, var6);
        if (var7 != null) {
            if (!(((rb) this).field_t == null)) {
                ((fp) (Object) ((rb) this).field_t).a((byte) 124, param0, var7.field_j, (rb) this);
            }
        }
    }

    static {
    }
}
