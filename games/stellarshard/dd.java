/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dd {
    static oj field_g;
    static int field_d;
    private int[] field_c;
    static pb field_a;
    static String field_h;
    static String field_b;
    static int field_e;
    static String field_i;
    static String field_f;

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
            String stackIn_7_0 = null;
            String stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            String stackOut_6_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = stellarshard.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) sh.a("getcookies", param1, (byte) 78);
                            var5 = qj.a(';', var4, 10287);
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var5[var6].substring(var7 - -1).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null != l.field_g) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            return param1.getParameter("settings");
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = l.field_g;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_15_0 = (RuntimeException) var2_ref;
                        stackOut_15_1 = new StringBuilder().append("dd.F(").append(0).append(',');
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param1 == null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                        stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                        stackOut_17_2 = "null";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
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

    final static bm a(int param0, byte param1, pf param2, pf param3, int param4) {
        RuntimeException var5 = null;
        bm stackIn_6_0 = null;
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
        bm stackOut_5_0 = null;
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
              if (param1 >= 108) {
                break L1;
              } else {
                dd.b(-57);
                break L1;
              }
            }
            if (tl.a(param2, (byte) -5, param0, param4)) {
              stackOut_5_0 = sa.a(2376, param3.a(param4, 16, param0));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("dd.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -26269) {
            Object var2 = null;
            bm discarded$0 = dd.a(48, (byte) -60, (pf) null, (pf) null, 98);
        }
        field_h = null;
        field_i = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = stellarshard.field_B;
          if (param6 < param7) {
            if (param7 >= param5) {
              if (param6 < param5) {
                mg.a(param7, param3, param2, param4, param6, ti.field_a, -445834032, param1, param5);
                break L0;
              } else {
                mg.a(param7, param3, param2, param1, param5, ti.field_a, -445834032, param4, param6);
                break L0;
              }
            } else {
              mg.a(param5, param1, param2, param4, param6, ti.field_a, -445834032, param3, param7);
              break L0;
            }
          } else {
            if (param5 <= param6) {
              if (param5 <= param7) {
                mg.a(param6, param4, param2, param1, param5, ti.field_a, -445834032, param3, param7);
                break L0;
              } else {
                mg.a(param6, param4, param2, param3, param7, ti.field_a, -445834032, param1, param5);
                break L0;
              }
            } else {
              mg.a(param5, param1, param2, param3, param7, ti.field_a, -445834032, param4, param6);
              break L0;
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (pk.field_e != null) {
            var1 = (Object) (Object) pk.field_e;
            synchronized (var1) {
              L1: {
                pk.field_e = null;
                break L1;
              }
            }
            break L0;
          } else {
            break L0;
          }
        }
    }

    final int a(byte[] param0, int param1, int param2, byte[] param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_65_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            if (param4 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var7_int = 0;
              param4 = param4 + param2;
              var8 = param1;
              L1: while (true) {
                L2: {
                  var9 = param0[var8];
                  if (0 <= var9) {
                    var7_int++;
                    break L2;
                  } else {
                    var7_int = ((dd) this).field_c[var7_int];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] >= 0) {
                      break L4;
                    } else {
                      int incrementValue$8 = param2;
                      param2++;
                      param3[incrementValue$8] = (byte)(~var10);
                      if (param4 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((64 & var9) == 0) {
                      var7_int++;
                      break L5;
                    } else {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L5;
                    }
                  }
                  L6: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] >= 0) {
                      break L6;
                    } else {
                      int incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(~var10);
                      if (param4 <= param2) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((var9 & 32) != 0) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L7;
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] < 0) {
                      int incrementValue$10 = param2;
                      param2++;
                      param3[incrementValue$10] = (byte)(~var10);
                      if (param2 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((16 & var9) != 0) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L9;
                    } else {
                      var7_int++;
                      break L9;
                    }
                  }
                  L10: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] >= 0) {
                      break L10;
                    } else {
                      int incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(~var10);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L10;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L11: {
                    if (0 != (8 & var9)) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L11;
                    } else {
                      var7_int++;
                      break L11;
                    }
                  }
                  L12: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] >= 0) {
                      break L12;
                    } else {
                      int incrementValue$12 = param2;
                      param2++;
                      param3[incrementValue$12] = (byte)(~var10);
                      if (param4 > param2) {
                        var7_int = 0;
                        break L12;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L13: {
                    if ((var9 & 4) != 0) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L13;
                    } else {
                      var7_int++;
                      break L13;
                    }
                  }
                  L14: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (0 > ((dd) this).field_c[var7_int]) {
                      int incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(~var10);
                      if (param2 >= param4) {
                        break L3;
                      } else {
                        var7_int = 0;
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((var9 & 2) != 0) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L15;
                    } else {
                      var7_int++;
                      break L15;
                    }
                  }
                  L16: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (((dd) this).field_c[var7_int] < 0) {
                      int incrementValue$14 = param2;
                      param2++;
                      param3[incrementValue$14] = (byte)(~var10);
                      if (param2 < param4) {
                        var7_int = 0;
                        break L16;
                      } else {
                        break L3;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((1 & var9) != 0) {
                      var7_int = ((dd) this).field_c[var7_int];
                      break L17;
                    } else {
                      var7_int++;
                      break L17;
                    }
                  }
                  L18: {
                    var10 = ((dd) this).field_c[var7_int];
                    if (0 > ((dd) this).field_c[var7_int]) {
                      int incrementValue$15 = param2;
                      param2++;
                      param3[incrementValue$15] = (byte)(~var10);
                      if (param4 > param2) {
                        var7_int = 0;
                        break L18;
                      } else {
                        break L3;
                      }
                    } else {
                      break L18;
                    }
                  }
                  var8++;
                  continue L1;
                }
                L19: {
                  if (param5) {
                    break L19;
                  } else {
                    dd.b(-68);
                    break L19;
                  }
                }
                stackOut_65_0 = -param1 + 1 + var8;
                stackIn_66_0 = stackOut_65_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("dd.C(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L20;
            }
          }
          L21: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L21;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L21;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_66_0;
    }

    private dd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new oj();
        field_h = "Email: ";
        field_b = "Orb coins: <%0>";
        field_f = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_i = "Free game ending in ";
    }
}
