/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class el extends fe {
    static int field_j;
    static int field_m;
    static long[] field_e;
    static String field_i;
    static de[] field_h;
    static bd field_f;
    static bd field_d;
    private java.net.ProxySelector field_k;
    static bd field_l;
    static String field_g;

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                el.a(-90, -101, -48);
                break L1;
              }
            }
            field_g = null;
            field_i = null;
            field_e = null;
            field_h = null;
            field_d = null;
            field_f = null;
            field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "el.E(" + param0 + ')');
        }
    }

    final static bd a(int param0, int param1, int param2) {
        bd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        bd stackIn_7_0 = null;
        bd stackIn_11_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = new bd(param1, param1);
                        if (param0 <= -6) {
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
                        field_m = -43;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = 0;
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
                        if ((var4 ^ -1) <= (var3.field_D.length ^ -1)) {
                            statePc = 10;
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
                        stackIn_11_0 = (bd) (var3);
                        stackIn_7_0 = stackIn_11_0;
                        if (var5 != 0) {
                            statePc = 11;
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
                        stackIn_7_0.field_D[var4] = param2;
                        var4++;
                        if (var5 == 0) {
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (bd) (var3);
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
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    throw wg.a((Throwable) ((Object) var3_ref), "el.C(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static double a(double param0, double param1, int param2, double param3, double param4) {
        RuntimeException var9 = null;
        double stackIn_4_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 16) {
                break L1;
              } else {
                el.a((int[]) null, (int[]) null, -25, false, (pf) null, true, true);
                break L1;
              }
            }
            stackIn_4_0 = Math.atan2(param0 - param1, param3 - param4) * 128.0 / 3.141592653589793;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var9), "el.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    private final java.net.Socket a(int param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket var5 = null;
        RuntimeException var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var5 = new java.net.Socket(param3, param1);
                var5.setSoTimeout(10000);
                var6 = var5.getOutputStream();
                if (param2 != null) {
                  break L2;
                } else {
                  var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                  if (var12 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6.write(("CONNECT " + this.field_a + ":" + this.field_b + " HTTP/1.0\n" + param2 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
              break L1;
            }
            L3: {
              var6.flush();
              var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var5.getInputStream())));
              if (param0 == 10) {
                break L3;
              } else {
                field_e = (long[]) null;
                break L3;
              }
            }
            L4: {
              var8 = var7.readLine();
              if (var8 != null) {
                L5: {
                  if (var8.startsWith("HTTP/1.0 200")) {
                    break L5;
                  } else {
                    if (!var8.startsWith("HTTP/1.1 200")) {
                      L6: {
                        if (var8.startsWith("HTTP/1.0 407")) {
                          break L6;
                        } else {
                          if (!var8.startsWith("HTTP/1.1 407")) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var9 = 0;
                      var8 = var7.readLine();
                      var10 = "proxy-authenticate: ";
                      L7: while (true) {
                        L8: {
                          if (null == var8) {
                            break L8;
                          } else {
                            if (-51 >= (var9 ^ -1)) {
                              break L8;
                            } else {
                              if (!var8.toLowerCase().startsWith(var10)) {
                                var9++;
                                var8 = var7.readLine();
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              } else {
                                L9: {
                                  var8 = var8.substring(var10.length()).trim();
                                  var11 = var8.indexOf(' ');
                                  if (var11 == -1) {
                                    break L9;
                                  } else {
                                    var8 = var8.substring(0, var11);
                                    break L9;
                                  }
                                }
                                throw new ab(var8);
                              }
                            }
                          }
                        }
                        throw new ab("");
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                stackIn_18_0 = (java.net.Socket) (var5);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L4;
              }
            }
            var6.close();
            var7.close();
            var5.close();
            stackIn_35_0 = null;
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var5_ref);

            stackIn_39_1 = new StringBuilder().append("el.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L10;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param3 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return (java.net.Socket) ((Object) stackIn_35_0);
        }
    }

    final static void a(int[] param0, int[] param1, int param2, boolean param3, pf param4, boolean param5, boolean param6) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param1[3] >> 498890914;
                        var22 = param1[4] >> 1850452258;
                        var23 = param1[5] >> 245853058;
                        var24 = param1[6] >> -512034238;
                        var25 = param1[7] >> 1471312002;
                        var26 = param1[8] >> -1768954142;
                        var27 = param1[9] >> 945234530;
                        var28 = param1[10] >> -2070406910;
                        var29 = param1[11] >> 1509307714;
                        var13 = param0[4] * var25 + (var24 * param0[3] - -(param0[5] * var26)) >> 442737006;
                        var12 = param0[5] * var23 + var21 * param0[3] - -(var22 * param0[4]) >> 815755758;
                        var18 = var22 * param0[10] + param0[9] * var21 + var23 * param0[11] >> 1474414734;
                        var14 = param0[5] * var29 + var27 * param0[3] + param0[4] * var28 >> 1007014926;
                        var19 = var26 * param0[11] + var25 * param0[10] + var24 * param0[9] >> 1073860302;
                        var20 = var28 * param0[10] + (param0[9] * var27 + param0[11] * var29) >> 1179701422;
                        var16 = var25 * param0[7] + (param0[6] * var24 + param0[8] * var26) >> 1419240750;
                        var17 = var29 * param0[8] + var27 * param0[6] - -(var28 * param0[7]) >> -1197032306;
                        var15 = param0[8] * var23 + var21 * param0[6] - -(var22 * param0[7]) >> -1389274322;
                        var21 = -param1[0] + param0[0];
                        var22 = param0[1] - param1[1];
                        if (param2 == -12705) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_h = (de[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var23 = param0[2] - param1[2];
                        var9 = param1[3] * var21 - (-(var22 * param1[4]) + -(param1[5] * var23)) >> -ih.field_w + 16;
                        var10 = var22 * param1[7] + (param1[6] * var21 - -(param1[8] * var23)) >> 16 - ih.field_w;
                        var11 = param1[11] * var23 + param1[9] * var21 - -(param1[10] * var22) >> -104365456;
                        var21 = ge.field_c;
                        var22 = ge.field_b;
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var23 >= param4.field_c) {
                            statePc = 27;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param4.field_n[var23];
                        var25 = param4.field_E[var23];
                        var26 = param4.field_H[var23];
                        var27 = (var12 * var24 - -(var25 * var15) - -(var26 * var18) >> -ih.field_w + 16) + var9;
                        var28 = (var19 * var26 + (var13 * var24 - -(var25 * var16)) >> -ih.field_w + 16) + var10;
                        var29 = (var26 * var20 + (var25 * var17 + var14 * var24) >> -1668083280) + var11;
                        stackIn_69_0 = var29;
                        stackIn_7_0 = stackIn_69_0;
                        stackIn_69_1 = 50;
                        stackIn_7_1 = stackIn_69_1;
                        if (var30 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 < stackIn_7_1) {
                            statePc = 21;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        tb.field_K[var23] = var21 - -(var27 / var29);
                        lc.field_c[var23] = var22 + var28 / var29;
                        if (var8 < var29) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = var29;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7_int > var29) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int = var29;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        rb.field_p[var23] = var29;
                        if (var30 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        rb.field_p[var23] = -2147483648;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (!param5) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        dk.field_m[var23] = var27 >> ih.field_w;
                        sj.field_f[var23] = var28 >> ih.field_w;
                        ii.field_c[var23] = var29;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null == param4.field_v) {
                            statePc = 60;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param4.field_p == null) {
                            statePc = 60;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param4.field_e == null) {
                            statePc = 60;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param4.field_Q == null) {
                            statePc = 60;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == param4.field_B) {
                            statePc = 60;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == param4.field_M) {
                            statePc = 60;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == param4.field_h) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param4.field_l == null) {
                            statePc = 60;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param4.field_F != null) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var23 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (param4.field_k <= var23) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var24 = param4.field_v[var23];
                        var25 = param4.field_p[var23];
                        var26 = param4.field_e[var23];
                        ac.field_j[var23] = var9 - -(var25 * var15 + (var24 * var12 + var18 * var26) >> 172749488);
                        ke.field_v[var23] = (var16 * var25 + var24 * var13 + var26 * var19 >> 1143814448) + var10;
                        vi.field_m[var23] = var11 + (var26 * var20 + var25 * var17 + var14 * var24 >> -726502736);
                        var24 = param4.field_Q[var23];
                        var25 = param4.field_B[var23];
                        var26 = param4.field_M[var23];
                        lk.field_M[var23] = (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> -1328874288) + var9;
                        fm.field_c[var23] = (var13 * var24 - -(var16 * var25) + var19 * var26 >> -1528535376) + var10;
                        l.field_c[var23] = (var25 * var17 + var24 * var14 - -(var20 * var26) >> 1571331280) + var11;
                        var24 = param4.field_h[var23];
                        var25 = param4.field_l[var23];
                        var26 = param4.field_F[var23];
                        se.field_d[var23] = (var18 * var26 + var25 * var15 + var12 * var24 >> -73117296) + var9;
                        ae.field_q[var23] = var10 + (var19 * var26 + var13 * var24 + var16 * var25 >> 699737520);
                        gi.field_l[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> -837593872) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var30 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!param3) {
                            statePc = 68;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = param0[3];
                        var10 = param0[4];
                        var11 = param0[5];
                        var12 = param0[6];
                        var13 = param0[7];
                        var14 = param0[8];
                        var15 = param0[9];
                        var16 = param0[10];
                        var17 = param0[11];
                        var18 = 0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var18 >= param4.field_L) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_69_0 = oa.field_c.length ^ -1;
                        stackIn_64_0 = stackIn_69_0;
                        stackIn_69_1 = var18 ^ -1;
                        stackIn_64_1 = stackIn_69_1;
                        if (var30 != 0) {
                            statePc = 69;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 >= stackIn_64_1) {
                            statePc = 68;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var19 = param4.field_u[var18];
                        var20 = param4.field_w[var18];
                        var21 = param4.field_r[var18];
                        oa.field_c[var18] = var9 * var19 - (-(var20 * var12) - var15 * var21) >> -69862544;
                        in.field_c[var18] = var21 * var16 + (var13 * var20 + var10 * var19) >> -892753328;
                        dl.field_o[var18] = var20 * var14 + var19 * var11 + var17 * var21 >> 1352655952;
                        var18++;
                        if (var30 == 0) {
                            statePc = 62;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_69_0 = var8;
                        stackIn_69_1 = var7_int;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        pc.a(stackIn_69_0, stackIn_69_1, param6, param4, (byte) 106);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 71;
                        continue stateLoop;
                    }
                }
                case 71: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_74_0 = (RuntimeException) (var7);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = new StringBuilder().append("el.B(");
                    stackIn_72_1 = stackIn_74_1;
                    if (param0 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param1 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_82_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_0 = stackIn_82_0;
                    stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_80_1 = stackIn_82_1;
                    if (param4 == null) {
                        statePc = 82;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_83_2 = "{...}";
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (RuntimeException) ((Object) stackIn_82_0);
                    stackIn_83_1 = (StringBuilder) ((Object) stackIn_82_1);
                    stackIn_83_2 = "null";
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    throw wg.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param5 + ',' + param6 + ')');
                }
                case 84: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, p param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (-1 < (param1.field_e ^ -1)) {
                break L1;
              } else {
                sj.field_e.a(true, 128, (int)param1.field_c, param0, param3);
                break L1;
              }
            }
            L2: {
              if (param2 <= -86) {
                break L2;
              } else {
                el.a((int[]) null, (int[]) null, 87, true, (pf) null, true, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("el.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final java.net.Socket a(java.net.Proxy param0, byte param1) throws IOException {
        Exception exception = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        java.net.InetSocketAddress var5 = null;
        Object var6 = null;
        Class var7 = null;
        java.lang.reflect.Method var8 = null;
        Object var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        java.lang.reflect.Method var12 = null;
        String var13 = null;
        String var14 = null;
        java.net.Socket stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0.type() == java.net.Proxy.Type.DIRECT) {
              stackIn_4_0 = this.b(117);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = param0.address();
              if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = -85 % ((-67 - param1) / 46);
                var5 = (java.net.InetSocketAddress) ((Object) var3);
                if (param0.type() != java.net.Proxy.Type.HTTP) {
                  if (param0.type() != java.net.Proxy.Type.SOCKS) {
                    stackIn_23_0 = null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    var6 = new java.net.Socket(param0);
                    ((java.net.Socket) (var6)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_b)));
                    stackIn_21_0 = var6;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  var6 = null;
                  try {
                    L1: {
                      L2: {
                        var7 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var8 = var7.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                        var8.setAccessible(true);
                        var9 = var8.invoke((Object) null, new Object[]{var5.getHostName(), new Integer(var5.getPort())});
                        if (null == var9) {
                          break L2;
                        } else {
                          var10 = var7.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                          var10.setAccessible(true);
                          if (!((Boolean) (var10.invoke(var9, new Object[]{}))).booleanValue()) {
                            break L2;
                          } else {
                            var11 = var7.getDeclaredMethod("getHeaderName", new Class[]{});
                            var11.setAccessible(true);
                            var12 = var7.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                            var12.setAccessible(true);
                            var13 = (String) (var11.invoke(var9, new Object[]{}));
                            var14 = (String) (var12.invoke(var9, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                            var6 = var13 + ": " + var14;
                            break L2;
                          }
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  stackIn_18_0 = this.a(10, var5.getPort(), (String) (var6), var5.getHostName());
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("el.F(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_21_0);
              } else {
                return (java.net.Socket) ((Object) stackIn_23_0);
              }
            }
          }
        }
    }

    final static int c(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 9) {
              stackIn_4_0 = ae.field_s;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 47;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "el.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final java.net.Socket a(int param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_16_0;
        java.net.URI stackIn_16_1;
        java.net.URI stackIn_16_2;
        StringBuilder stackIn_16_3;
        java.net.ProxySelector stackIn_17_0;
        java.net.URI stackIn_17_1;
        java.net.URI stackIn_17_2;
        StringBuilder stackIn_17_3;
        String stackIn_17_4;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_30_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        ab var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
              if (var2_int != 0) {
                break L1;
              } else {
                System.setProperty("java.net.useSystemProxies", "true");
                break L1;
              }
            }
            L2: {
              if (-444 != (this.field_b ^ -1)) {
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            var5 = stackIn_8_0;
            try {
              L3: {
                L4: {
                  stackIn_12_0 = this.field_k;

                  stackIn_12_1 = null;

                  stackIn_12_2 = null;

                  stackIn_12_3 = new StringBuilder();

                  if (var5 != 0) {
                    stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                    stackIn_13_1 = null;
                    stackIn_13_2 = null;
                    stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                    stackIn_13_4 = "https";
                    break L4;
                  } else {
                    stackIn_13_0 = (java.net.ProxySelector) ((Object) stackIn_12_0);
                    stackIn_13_1 = null;
                    stackIn_13_2 = null;
                    stackIn_13_3 = (StringBuilder) ((Object) stackIn_12_3);
                    stackIn_13_4 = "http";
                    break L4;
                  }
                }
                L5: {
                  var3 = ((java.net.ProxySelector) (Object) stackIn_13_0).select(new java.net.URI(stackIn_13_4 + "://" + this.field_a));
                  stackIn_16_0 = this.field_k;

                  stackIn_16_1 = null;

                  stackIn_16_2 = null;

                  stackIn_16_3 = new StringBuilder();

                  if (var5 != 0) {
                    stackIn_17_0 = (java.net.ProxySelector) ((Object) stackIn_16_0);
                    stackIn_17_1 = null;
                    stackIn_17_2 = null;
                    stackIn_17_3 = (StringBuilder) ((Object) stackIn_16_3);
                    stackIn_17_4 = "http";
                    break L5;
                  } else {
                    stackIn_17_0 = (java.net.ProxySelector) ((Object) stackIn_16_0);
                    stackIn_17_1 = null;
                    stackIn_17_2 = null;
                    stackIn_17_3 = (StringBuilder) ((Object) stackIn_16_3);
                    stackIn_17_4 = "https";
                    break L5;
                  }
                }
                var4 = ((java.net.ProxySelector) (Object) stackIn_17_0).select(new java.net.URI(stackIn_17_4 + "://" + this.field_a));
                break L3;
              }
            } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
              stackIn_20_0 = this.b(98);
              return stackIn_20_0;
            }
            var3.addAll((Collection) ((Object) var4));
            var6_array = var3.toArray();
            var7 = null;
            var8 = var6_array;
            var9 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if ((var8.length ^ -1) >= (var9 ^ -1)) {
                    break L8;
                  } else {
                    var10 = var8[var9];
                    var11 = (java.net.Proxy) (var10);
                    try {
                      L9: {
                        var12 = this.a(var11, (byte) -117);
                        stackIn_42_0 = (java.net.Socket) (var12);

                        if (var13 != 0) {
                          decompiledRegionSelector0 = 0;
                          break L9;
                        } else {
                          if (stackIn_42_0 != null) {
                            stackIn_30_0 = (java.net.Socket) (var12);
                            decompiledRegionSelector0 = 1;
                            break L9;
                          } else {
                            decompiledRegionSelector0 = 2;
                            break L9;
                          }
                        }
                      }
                    } catch (ab decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var12_ref = (ab) (Object) decompiledCaughtException;
                        var7 = var12_ref;
                        decompiledRegionSelector0 = 2;
                        break L10;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L11: {
                        var12_ref2 = (IOException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 2;
                        break L11;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      break L7;
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        decompiledRegionSelector1 = 1;
                        break L0;
                      } else {
                        var9++;
                        if (var13 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (param0 == 31067) {
                    break L12;
                  } else {
                    field_e = (long[]) null;
                    break L12;
                  }
                }
                if (var7 == null) {
                  stackIn_42_0 = this.b(param0 + -30986);
                  break L7;
                } else {
                  throw el.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
                }
              }
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "el.D(" + param0 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_42_0;
        } else {
          return stackIn_30_0;
        }
    }

    el() {
        try {
            this.field_k = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "el.<init>()");
        }
    }

    static {
        field_m = 0;
        field_h = new de[2];
        field_i = "points";
        field_e = new long[32];
        field_j = 0;
        field_g = "The lift has a security lock on it. There should be a security console to turn it off somewhere.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
