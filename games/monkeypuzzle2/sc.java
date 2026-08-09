/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc {
    static char[] field_a;
    static int field_e;
    static String field_d;
    static int[] field_h;
    static String field_b;
    static int field_c;
    static int field_g;
    static eb field_f;

    final static void b(int param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            RuntimeException runtimeException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (lg.field_n == null) {
                    break L1;
                  } else {
                    lg.field_n.b((byte) 7);
                    break L1;
                  }
                }
                L2: {
                  if (null == jc.field_c) {
                    break L2;
                  } else {
                    jc.field_c.a(true);
                    break L2;
                  }
                }
                L3: {
                  if (null == ah.field_f) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ah.field_f.a(true);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (param0 == 0) {
                    break L6;
                  } else {
                    sc.a(40);
                    break L6;
                  }
                }
                L7: {
                  if (null == bl.field_o) {
                    break L7;
                  } else {
                    var1_int = 0;
                    L8: while (true) {
                      if (bl.field_o.length <= var1_int) {
                        break L7;
                      } else {
                        if (var3 == 0) {
                          L9: {
                            if (bl.field_o[var1_int] == null) {
                              break L9;
                            } else {
                              try {
                                L10: {
                                  bl.field_o[var1_int].a(true);
                                  break L10;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L11: {
                                  var2_ref = (IOException) (Object) decompiledCaughtException;
                                  break L11;
                                }
                              }
                              break L9;
                            }
                          }
                          var1_int++;
                          if (var3 == 0) {
                            continue L8;
                          } else {
                            break L7;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw la.a((Throwable) ((Object) runtimeException), "sc.A(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0) {
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        uh var3_ref_uh = null;
        int var3 = 0;
        int var4_int = 0;
        mk var4 = null;
        Object var5 = null;
        int var6 = 0;
        hb var9 = null;
        byte[] var13 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var9 = MonkeyPuzzle2.field_D;
                var2 = var9.a((byte) 114);
                if (var2 != 0) {
                  break L3;
                } else {
                  var3_ref_uh = (uh) ((Object) t.field_v.a((byte) -117));
                  if (var3_ref_uh != null) {
                    L4: {
                      L5: {
                        var4_int = var9.a((byte) 114);
                        if (var4_int != 0) {
                          break L5;
                        } else {
                          var5 = null;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var13 = new byte[var4_int];
                      var9.a(var13, var4_int, -122, 0);
                      break L4;
                    }
                    var9.field_h = var9.field_h + 4;
                    if (!var9.l(-24685)) {
                      gk.a(-1);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3_ref_uh.c(-19822);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    gk.a(-1);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L6: {
                if (1 != var2) {
                  break L6;
                } else {
                  var3 = var9.e(126);
                  var4 = (mk) ((Object) eb.field_C.a((byte) -117));
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var4 == null) {
                          break L9;
                        } else {
                          stackIn_23_0 = var3;

                          if (var6 != 0) {
                            break L8;
                          } else {
                            if (stackIn_23_0 == var4.field_e) {
                              break L9;
                            } else {
                              var4 = (mk) ((Object) eb.field_C.d((byte) 63));
                              if (var6 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      if (var4 != null) {
                        var4.c(-19822);
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      } else {
                        stackIn_23_0 = -1;
                        break L8;
                      }
                    }
                    gk.a(stackIn_23_0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              kk.a("A1: " + bh.a((byte) -21), (byte) 126, (Throwable) null);
              gk.a(-1);
              break L2;
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "sc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = sb.a((byte) 79, param2);
        int var5 = 37 % ((-85 - param0) / 36);
        int var4 = r.a((byte) 71, param2);
        int var6 = sb.a((byte) 79, param1);
        int var7 = r.a((byte) 71, param1);
        int var8 = (int)((long)var3 * (long)var6 >> -237110320);
        int var9 = (int)((long)var7 * (long)var3 >> -1575055664);
        int var10 = (int)((long)var6 * (long)var4 >> -768349552);
        int var11 = (int)((long)var7 * (long)var4 >> -1192020016);
        return new int[]{0, 0, 0, var7, 0, var6, var8, var4, -var9, -var10, var3, var11};
    }

    public static void a(int param0) {
        field_b = null;
        field_f = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0 != -21718) {
            byte[] var2 = (byte[]) null;
            sc.a((byte[]) null, -77, 2, 45);
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        String stackIn_15_0 = null;
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
                    var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = -95 % ((param2 - 0) / 52);
                        var13 = new char[param1];
                        var12 = var13;
                        var11 = var12;
                        var4 = var11;
                        var6 = 0;
                        var7 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 >= param1) {
                            statePc = 14;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = param0[param3 - -var7] & 255;
                        if (-1 != (var8 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var10 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var8 ^ -1) > -129) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 >= 160) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9 = sb.field_n[-128 + var8];
                        if (var9 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = 63;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var8 = var9;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$1 = var6;
                        var6++;
                        var11[incrementValue$1] = (char)var8;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = new String(var13, 0, var6);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var4_ref);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("sc.D(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = "Level Complete: <%0> pts";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_b = "This game has been updated! Please reload this page.";
        field_e = 0;
        field_h = new int[300];
        field_c = 0;
    }
}
