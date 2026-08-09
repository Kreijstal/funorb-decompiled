/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fc {
    static w field_f;
    static int[] field_d;
    static w field_c;
    static int[] field_b;
    static long field_h;
    static int field_a;
    static String field_g;
    static int field_e;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        String var5;
        fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, w.field_kb);
        param0 += 26;
        fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, se.field_S);
        ph.field_yb[0].c(122 + param3, param0);
        param0 += 16;
        fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 - -4, se.field_S);
        ph.field_yb[1].c(param3 + 122, param0);
        param0 += 23;
        if (param1 != 5) {
          L0: {
            var5 = (String) null;
            fc.a((byte) 7, (String) null);
            fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, se.field_S);
            ph.field_yb[3].c(122 + param3, param0);
            param0 += 16;
            fl.a(param0 - -12, 256, 16777215, vk.field_b[3], 4 + param3, se.field_S);
            ph.field_yb[2].c(param3 + 100, param0);
            ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, se.field_S);
            ph.field_yb[4].c(122 + param3, param0);
            param0 += 23;
            fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 - -4, se.field_S);
            ph.field_yb[5].c(122 + param3, param0);
            param0 += 23;
            if (param2) {
              fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
              ph.field_yb[6].c(param3 + 122, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, se.field_S);
            ph.field_yb[3].c(122 + param3, param0);
            param0 += 16;
            fl.a(param0 - -12, 256, 16777215, vk.field_b[3], 4 + param3, se.field_S);
            ph.field_yb[2].c(param3 + 100, param0);
            ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, se.field_S);
            ph.field_yb[4].c(122 + param3, param0);
            param0 += 23;
            fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 - -4, se.field_S);
            ph.field_yb[5].c(122 + param3, param0);
            param0 += 23;
            if (param2) {
              fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
              ph.field_yb[6].c(param3 + 122, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
            param1 = false;
        }
        cg.b(param1, 1);
        ub.a((byte) 54);
        if (param0 != 5) {
            field_g = (String) null;
            return;
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            return;
        }
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1, int param2) {
        ck dupTemp$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        ck[] stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        ck[] stackIn_8_0 = null;
        int stackIn_11_0 = 0;
        ck[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        ck[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = new ck[param0];
                        var4 = param1.field_D;
                        var5 = param1.field_K / param0;
                        if (param2 == -10241) {
                            statePc = 4;
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
                        stackIn_3_0 = (ck[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6 = param1.field_I - var5;
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = var7;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= param0) {
                            statePc = 19;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_20_0 = (ck[]) (var3);
                        stackIn_8_0 = stackIn_20_0;
                        if (var16 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        dupTemp$0 = new ck(var5, param1.field_H);
                        stackIn_8_0[var7] = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = var8.field_D;
                        var10 = var7 * var5 + param1.field_F;
                        var11 = param1.field_z;
                        var12 = var11 * var5 + var10;
                        var13 = 0;
                        var14 = -param1.field_H;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var14 ^ -1) <= -1) {
                            statePc = 18;
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
                        stackIn_6_0 = -var5;
                        stackIn_11_0 = stackIn_6_0;
                        if (var16 != 0) {
                            statePc = 6;
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
                        var15 = stackIn_11_0;
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
                        if (-1 >= (var15 ^ -1)) {
                            statePc = 16;
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
                        incrementValue$1 = var13;
                        var13++;
                        incrementValue$2 = var12;
                        var12++;
                        var9[incrementValue$1] = var4[incrementValue$2];
                        var15++;
                        if (var16 != 0) {
                            statePc = 17;
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
                        if (var16 == 0) {
                            statePc = 12;
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
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var12 = var12 + var6;
                        var14++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var16 == 0) {
                            statePc = 9;
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
                        var7++;
                        if (var16 == 0) {
                            statePc = 5;
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
                        stackIn_20_0 = (ck[]) (var3);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0;
                }
                case 21: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var3_ref);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("fc.B(").append(param0).append(',');
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
                    throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!fd.field_d.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 >= param1.length()) {
                          break L5;
                        } else {
                          var6 = var2.indexOf((int) param1.charAt(var3)) ^ -1;
                          var5 = 0;
                          if (var4 != 0) {
                            if (var5 == var6) {
                              break L4;
                            } else {
                              stackIn_16_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L1;
                            }
                          } else {
                            if (var5 != var6) {
                              var3++;
                              if (var4 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      if (param0 == -19) {
                        break L4;
                      } else {
                        stackIn_20_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L1;
                      }
                    }
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_24_0 = 0;
              return stackIn_24_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2_ref2);

            stackIn_27_1 = new StringBuilder().append("fc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            IOException var3_ref = null;
            RuntimeException runtimeException = null;
            int var1_int = 0;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ta.field_k == null) {
                    break L1;
                  } else {
                    ta.field_k.d((byte) 117);
                    break L1;
                  }
                }
                L2: {
                  if (qb.field_r == null) {
                    break L2;
                  } else {
                    qb.field_r.a((byte) -98);
                    break L2;
                  }
                }
                L3: {
                  if (null != mk.field_d) {
                    try {
                      L4: {
                        mk.field_d.c((byte) 124);
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
                  } else {
                    break L3;
                  }
                }
                var1_int = -32 % ((param0 - -41) / 50);
                if (null != ig.field_cc) {
                  var2 = 0;
                  L6: while (true) {
                    L7: {
                      if (ig.field_cc.length <= var2) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          L8: {
                            if (ig.field_cc[var2] != null) {
                              try {
                                L9: {
                                  ig.field_cc[var2].c((byte) 125);
                                  break L9;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter1) {
                                decompiledCaughtException = decompiledCaughtParameter1;
                                L10: {
                                  var3_ref = (IOException) (Object) decompiledCaughtException;
                                  break L10;
                                }
                              }
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var2++;
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw dh.a((Throwable) ((Object) runtimeException), "fc.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new int[8192];
        field_g = "Cancel";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
