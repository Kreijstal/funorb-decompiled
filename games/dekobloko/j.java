/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j {
    static int field_c;
    static int[] field_d;
    static String field_a;
    static int field_b;

    final static void a(int param0) {
        jb.a(tg.field_h, ua.field_H, gf.field_g, -47, ui.field_x);
        if (param0 != 8225) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, int param4, long param5, int param6, boolean param7, int param8, int param9, boolean param10, boolean param11, int param12, String param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                de.field_V = new uf(param3);
                we.field_b = new uf(param4);
                mc.field_e = param13;
                lf.field_f = param2;
                if (param11) {
                  L1: {
                    kb.field_g = param8;
                    l.field_c = param6;
                    qk.field_a = param0;
                    if (!param10) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    ce.field_w = stackIn_5_0 != 0;
                    rm.field_c = param5;
                    ef.field_P = param9;
                    hc.field_a = param12;
                    if (!param7) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ci.field_c = stackIn_8_0 != 0;
                    re.field_v = param1;
                    if (null == lf.field_f.field_v) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          dj.field_cb = new nh(lf.field_f.field_v, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

                if (param13 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    final static void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_14_0;
        boolean stackOut_23_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 <= param6) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (1 + param6 < param2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (param2 <= 5 + param6) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param3 != param5) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_int = -1 + param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var7_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 <= param6) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = param6;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7_int <= var8) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = ch.field_a[var8];
                        var10 = ch.field_a[1 + var8];
                        stackOut_14_0 = ee.a((byte) 100, param1, var10, var9);
                        stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var14 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ch.field_a[var8] = var10;
                        ch.field_a[1 + var8] = var9;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var7_int = (param3 >> 861831393) + ((param5 >> -973240543) + (param5 & param3 & 1));
                        var8 = param6;
                        var9 = param3;
                        var10 = param5;
                        var11 = param6;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param2 <= var11) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = ch.field_a[var11];
                        stackOut_23_0 = param1;
                        stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var14 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!stackIn_24_0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = ad.field_i[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = cc.field_h[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = stackIn_27_0;
                        if (var7_int >= var13) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        ch.field_a[var11] = ch.field_a[var8];
                        incrementValue$0 = var8;
                        var8++;
                        ch.field_a[incrementValue$0] = var12;
                        if (var9 <= var13) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = var13;
                        if (var14 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var13 <= var10) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var10 = var13;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        j.a((byte) -33, param1, var8, param3, param4, var9, param6);
                        stackIn_34_0 = param0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        j.a((byte) stackIn_34_0, param1, param2, var10, param4, param5, var8);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var7), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 37: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        jb var14;
        StringWriter var15;
        BufferedReader var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        BufferedReader var27;
        String var28;
        String var29;
        String var30;
        String var31;
        String var32;
        String var33;
        L0: {
          L1: {
            var13 = client.field_A ? 1 : 0;
            if (param0 instanceof jb) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var14 = (jb) ((Object) param0);
          var2 = var14.field_i + " | ";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          param0 = var14.field_e;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        if (param1 == 37) {
          var20 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var26 = var20.readLine();
          var11 = var26;
          var2 = var11;
          var11 = var26;
          L2: while (true) {
            L3: {
              L4: {
                var21 = var20.readLine();
                var11 = var21;
                var2 = var11;
                var11 = var21;
                if (var21 != null) {
                  break L4;
                } else {
                  if (var13 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  var9 = var21.indexOf('(');
                  var10 = var21.indexOf(')', var9 + 1);
                  if (var9 == -1) {
                    break L6;
                  } else {
                    var11 = var21.substring(0, var9);
                    if (var13 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = var21;
                var2 = var11;
                var2 = var11;
                break L5;
              }
              L7: {
                var22 = var11.trim();
                var2 = var22;
                var2 = var22;
                var23 = var22.substring(var22.lastIndexOf(' ') + 1);
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(1 + var23.lastIndexOf('\t'));
                var2 = var24;
                var2 = var24;
                var25 = var2 + var24;
                var2 = var25;
                var2 = var25;
                var2 = var25;
                if ((var9 ^ -1) == 0) {
                  break L7;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L7;
                  } else {
                    var12 = var21.indexOf(".java:", var9);
                    if ((var12 ^ -1) > -1) {
                      break L7;
                    } else {
                      var2 = var25 + var21.substring(var12 - -5, var10);
                      break L7;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              if (var13 == 0) {
                continue L2;
              } else {
                break L3;
              }
            }
            var2 = var2 + "| " + var26;
            var11 = var2;
            var2 = var11;
            var11 = var2;
            return var2;
          }
        } else {
          field_c = 30;
          var27 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var6 = var27;
          var33 = var27.readLine();
          var11 = var33;
          var2 = var11;
          var11 = var33;
          var7 = var33;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L8: while (true) {
            L9: {
              L10: {
                var28 = var27.readLine();
                var11 = var28;
                var2 = var11;
                var11 = var28;
                if (var28 != null) {
                  break L10;
                } else {
                  if (var13 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                L12: {
                  var9 = var28.indexOf('(');
                  var10 = var28.indexOf(')', var9 + 1);
                  if (var9 == -1) {
                    break L12;
                  } else {
                    var11 = var28.substring(0, var9);
                    if (var13 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                var11 = var28;
                var2 = var11;
                var2 = var11;
                break L11;
              }
              L13: {
                var29 = var11.trim();
                var2 = var29;
                var2 = var29;
                var30 = var29.substring(var29.lastIndexOf(' ') + 1);
                var2 = var30;
                var2 = var30;
                var31 = var30.substring(1 + var30.lastIndexOf('\t'));
                var2 = var31;
                var2 = var31;
                var32 = var2 + var31;
                var2 = var32;
                var2 = var32;
                var2 = var32;
                if ((var9 ^ -1) == 0) {
                  break L13;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L13;
                  } else {
                    var12 = var28.indexOf(".java:", var9);
                    if ((var12 ^ -1) > -1) {
                      break L13;
                    } else {
                      var2 = var32 + var28.substring(var12 - -5, var10);
                      break L13;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              if (var13 == 0) {
                continue L8;
              } else {
                break L9;
              }
            }
            var2 = var2 + "| " + var33;
            var11 = var2;
            var2 = var11;
            var11 = var2;
            return var2;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param0 == -8241) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 <= 122) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_d = (int[]) null;
          if (param1 >= 48) {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                L6: {
                  L7: {
                    if (param1 < 97) {
                      break L7;
                    } else {
                      if (param1 > 122) {
                        break L7;
                      } else {
                        stackIn_9_0 = 1;
                        break L6;
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  break L6;
                }
                return stackIn_9_0 != 0;
              } else {
                return true;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_d = (int[]) null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param1 == 28) {
          if (param0 <= 0) {
            if (param0 >= 160) {
              if (255 >= param0) {
                var2 = (byte)param0;
                return (byte) var2;
              } else {
                L0: {
                  L1: {
                    if (param0 == 8364) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 != 8218) {
                          break L2;
                        } else {
                          var2 = -126;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L3: {
                        if (402 == param0) {
                          break L3;
                        } else {
                          L4: {
                            if (param0 == 8222) {
                              break L4;
                            } else {
                              L5: {
                                if (param0 != 8230) {
                                  break L5;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (param0 != 8224) {
                                  break L6;
                                } else {
                                  var2 = -122;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (8225 == param0) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (param0 != 710) {
                                      break L8;
                                    } else {
                                      var2 = -120;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (param0 == 8240) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (param0 == 352) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (param0 != 8249) {
                                              break L11;
                                            } else {
                                              var2 = -117;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (param0 == 338) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (381 != param0) {
                                                  break L13;
                                                } else {
                                                  var2 = -114;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              L14: {
                                                if (param0 != 8216) {
                                                  break L14;
                                                } else {
                                                  var2 = -111;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L15: {
                                                if (param0 == 8217) {
                                                  break L15;
                                                } else {
                                                  L16: {
                                                    if (param0 == 8220) {
                                                      break L16;
                                                    } else {
                                                      L17: {
                                                        if (param0 != 8221) {
                                                          break L17;
                                                        } else {
                                                          var2 = -108;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L17;
                                                          }
                                                        }
                                                      }
                                                      L18: {
                                                        if (8226 == param0) {
                                                          break L18;
                                                        } else {
                                                          L19: {
                                                            if (8211 != param0) {
                                                              break L19;
                                                            } else {
                                                              var2 = -106;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          L20: {
                                                            if (8212 == param0) {
                                                              break L20;
                                                            } else {
                                                              L21: {
                                                                if (param0 != 732) {
                                                                  break L21;
                                                                } else {
                                                                  var2 = -104;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              L22: {
                                                                if (param0 == 8482) {
                                                                  break L22;
                                                                } else {
                                                                  L23: {
                                                                    if (param0 == 353) {
                                                                      break L23;
                                                                    } else {
                                                                      L24: {
                                                                        if (8250 != param0) {
                                                                          break L24;
                                                                        } else {
                                                                          var2 = -101;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L24;
                                                                          }
                                                                        }
                                                                      }
                                                                      L25: {
                                                                        if (param0 != 339) {
                                                                          break L25;
                                                                        } else {
                                                                          var2 = -100;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L25;
                                                                          }
                                                                        }
                                                                      }
                                                                      L26: {
                                                                        if (param0 != 382) {
                                                                          break L26;
                                                                        } else {
                                                                          var2 = -98;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L26;
                                                                          }
                                                                        }
                                                                      }
                                                                      L27: {
                                                                        if (param0 == 376) {
                                                                          break L27;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L27;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L22;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L20;
                                                              }
                                                            }
                                                          }
                                                          var2 = -105;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                      var2 = -107;
                                                      if (var3 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              var2 = -110;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          var2 = -116;
                                          if (var3 == 0) {
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var2 = -118;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var2 = -124;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2 = -125;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    var2 = (byte)param0;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L28: {
                L29: {
                  if (param0 == 8364) {
                    break L29;
                  } else {
                    L30: {
                      if (param0 != 8218) {
                        break L30;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if (402 == param0) {
                        break L31;
                      } else {
                        L32: {
                          if (param0 == 8222) {
                            break L32;
                          } else {
                            L33: {
                              if (param0 != 8230) {
                                break L33;
                              } else {
                                var2 = -123;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (param0 != 8224) {
                                break L34;
                              } else {
                                var2 = -122;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if (8225 == param0) {
                                break L35;
                              } else {
                                L36: {
                                  if (param0 != 710) {
                                    break L36;
                                  } else {
                                    var2 = -120;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                L37: {
                                  if (param0 == 8240) {
                                    break L37;
                                  } else {
                                    L38: {
                                      if (param0 == 352) {
                                        break L38;
                                      } else {
                                        L39: {
                                          if (param0 != 8249) {
                                            break L39;
                                          } else {
                                            var2 = -117;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                        L40: {
                                          if (param0 == 338) {
                                            break L40;
                                          } else {
                                            L41: {
                                              if (381 != param0) {
                                                break L41;
                                              } else {
                                                var2 = -114;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                            L42: {
                                              if (param0 != 8216) {
                                                break L42;
                                              } else {
                                                var2 = -111;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            L43: {
                                              if (param0 == 8217) {
                                                break L43;
                                              } else {
                                                L44: {
                                                  if (param0 == 8220) {
                                                    break L44;
                                                  } else {
                                                    L45: {
                                                      if (param0 != 8221) {
                                                        break L45;
                                                      } else {
                                                        var2 = -108;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                    L46: {
                                                      if (8226 == param0) {
                                                        break L46;
                                                      } else {
                                                        L47: {
                                                          if (8211 != param0) {
                                                            break L47;
                                                          } else {
                                                            var2 = -106;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L47;
                                                            }
                                                          }
                                                        }
                                                        L48: {
                                                          if (8212 == param0) {
                                                            break L48;
                                                          } else {
                                                            L49: {
                                                              if (param0 != 732) {
                                                                break L49;
                                                              } else {
                                                                var2 = -104;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L49;
                                                                }
                                                              }
                                                            }
                                                            L50: {
                                                              if (param0 == 8482) {
                                                                break L50;
                                                              } else {
                                                                L51: {
                                                                  if (param0 == 353) {
                                                                    break L51;
                                                                  } else {
                                                                    L52: {
                                                                      if (8250 != param0) {
                                                                        break L52;
                                                                      } else {
                                                                        var2 = -101;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L52;
                                                                        }
                                                                      }
                                                                    }
                                                                    L53: {
                                                                      if (param0 != 339) {
                                                                        break L53;
                                                                      } else {
                                                                        var2 = -100;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L53;
                                                                        }
                                                                      }
                                                                    }
                                                                    L54: {
                                                                      if (param0 != 382) {
                                                                        break L54;
                                                                      } else {
                                                                        var2 = -98;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L54;
                                                                        }
                                                                      }
                                                                    }
                                                                    L55: {
                                                                      if (param0 == 376) {
                                                                        break L55;
                                                                      } else {
                                                                        var2 = 63;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L55;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -97;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L51;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -102;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L50;
                                                                }
                                                              }
                                                            }
                                                            var2 = -103;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L48;
                                                            }
                                                          }
                                                        }
                                                        var2 = -105;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                    var2 = -107;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                var2 = -109;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                            var2 = -110;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                        var2 = -116;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    var2 = -118;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                var2 = -119;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2 = -121;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L32;
                            }
                          }
                        }
                        var2 = -124;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L31;
                        }
                      }
                    }
                    var2 = -125;
                    if (var3 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L28;
                } else {
                  var2 = (byte)param0;
                  break L28;
                }
              }
              return (byte) var2;
            }
          } else {
            if (param0 < 128) {
              var2 = (byte)param0;
              return (byte) var2;
            } else {
              L56: {
                L57: {
                  L58: {
                    if (param0 < 160) {
                      break L58;
                    } else {
                      if (255 >= param0) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (param0 == 8364) {
                      break L59;
                    } else {
                      L60: {
                        if (param0 != 8218) {
                          break L60;
                        } else {
                          var2 = -126;
                          if (var3 == 0) {
                            break L56;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (402 == param0) {
                          break L61;
                        } else {
                          L62: {
                            if (param0 == 8222) {
                              break L62;
                            } else {
                              L63: {
                                if (param0 != 8230) {
                                  break L63;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                if (param0 != 8224) {
                                  break L64;
                                } else {
                                  var2 = -122;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                if (8225 == param0) {
                                  break L65;
                                } else {
                                  L66: {
                                    if (param0 != 710) {
                                      break L66;
                                    } else {
                                      var2 = -120;
                                      if (var3 == 0) {
                                        break L56;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                  L67: {
                                    if (param0 == 8240) {
                                      break L67;
                                    } else {
                                      L68: {
                                        if (param0 == 352) {
                                          break L68;
                                        } else {
                                          L69: {
                                            if (param0 != 8249) {
                                              break L69;
                                            } else {
                                              var2 = -117;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                          L70: {
                                            if (param0 == 338) {
                                              break L70;
                                            } else {
                                              L71: {
                                                if (381 != param0) {
                                                  break L71;
                                                } else {
                                                  var2 = -114;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L71;
                                                  }
                                                }
                                              }
                                              L72: {
                                                if (param0 != 8216) {
                                                  break L72;
                                                } else {
                                                  var2 = -111;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L72;
                                                  }
                                                }
                                              }
                                              L73: {
                                                if (param0 == 8217) {
                                                  break L73;
                                                } else {
                                                  L74: {
                                                    if (param0 == 8220) {
                                                      break L74;
                                                    } else {
                                                      L75: {
                                                        if (param0 != 8221) {
                                                          break L75;
                                                        } else {
                                                          var2 = -108;
                                                          if (var3 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L75;
                                                          }
                                                        }
                                                      }
                                                      L76: {
                                                        if (8226 == param0) {
                                                          break L76;
                                                        } else {
                                                          L77: {
                                                            if (8211 != param0) {
                                                              break L77;
                                                            } else {
                                                              var2 = -106;
                                                              if (var3 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                          }
                                                          L78: {
                                                            if (8212 == param0) {
                                                              break L78;
                                                            } else {
                                                              L79: {
                                                                if (param0 != 732) {
                                                                  break L79;
                                                                } else {
                                                                  var2 = -104;
                                                                  if (var3 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                              L80: {
                                                                if (param0 == 8482) {
                                                                  break L80;
                                                                } else {
                                                                  L81: {
                                                                    if (param0 == 353) {
                                                                      break L81;
                                                                    } else {
                                                                      L82: {
                                                                        if (8250 != param0) {
                                                                          break L82;
                                                                        } else {
                                                                          var2 = -101;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L82;
                                                                          }
                                                                        }
                                                                      }
                                                                      L83: {
                                                                        if (param0 != 339) {
                                                                          break L83;
                                                                        } else {
                                                                          var2 = -100;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L83;
                                                                          }
                                                                        }
                                                                      }
                                                                      L84: {
                                                                        if (param0 != 382) {
                                                                          break L84;
                                                                        } else {
                                                                          var2 = -98;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L84;
                                                                          }
                                                                        }
                                                                      }
                                                                      L85: {
                                                                        if (param0 == 376) {
                                                                          break L85;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L85;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L56;
                                                                      } else {
                                                                        break L81;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  if (var3 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L80;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L78;
                                                              }
                                                            }
                                                          }
                                                          var2 = -105;
                                                          if (var3 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L76;
                                                          }
                                                        }
                                                      }
                                                      var2 = -107;
                                                      if (var3 == 0) {
                                                        break L56;
                                                      } else {
                                                        break L74;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                              var2 = -110;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                          var2 = -116;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      var2 = -118;
                                      if (var3 == 0) {
                                        break L56;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var3 == 0) {
                                break L56;
                              } else {
                                break L62;
                              }
                            }
                          }
                          var2 = -124;
                          if (var3 == 0) {
                            break L56;
                          } else {
                            break L61;
                          }
                        }
                      }
                      var2 = -125;
                      if (var3 == 0) {
                        break L56;
                      } else {
                        break L59;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
                var2 = (byte)param0;
                break L56;
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) 85;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.length();
                        var5 = param0.length();
                        var6 = param2.length();
                        if (param3 != var5) {
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
                        throw new IllegalArgumentException("Key cannot have zero length");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = var4_int;
                        var8 = -var5 + var6;
                        if (0 != var8) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9_int = 0;
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
                        var9_int = param1.indexOf(param0, var9_int);
                        if (var9_int >= 0) {
                            statePc = 10;
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
                        if (var12 != 0) {
                            statePc = 11;
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
                        if (var12 == 0) {
                            statePc = 12;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var7 = var7 + var8;
                        var9_int = var9_int + var5;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = new StringBuilder(var7);
                        var10 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = param1.indexOf(param0, var10);
                        if (0 <= var11) {
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
                        if (var12 != 0) {
                            statePc = 18;
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
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
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
                        discarded$0 = var9.append(param1.substring(var10, var11));
                        discarded$1 = var9.append(param2);
                        var10 = var11 - -var5;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var12 == 0) {
                            statePc = 13;
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
                        discarded$2 = var9.append(param1.substring(var10));
                        stackIn_20_0 = var9.toString();
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
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var4);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("j.F(");
                    stackIn_22_1 = stackIn_23_1;
                    if (param0 == null) {
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
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param1 == null) {
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
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param2 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_a = "Not yet achieved";
        field_d = b.h(26);
    }
}
