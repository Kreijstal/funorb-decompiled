/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qm {
    static int field_g;
    static int field_d;
    static String field_a;
    static boolean[] field_f;
    static int[] field_c;
    static String field_e;
    static int field_b;

    final static void a(km[] param0, int param1, int param2, int param3) {
        try {
            if (param1 >= -54) {
                Object var5 = null;
                qm.a((km[]) null, 95, 62, -2);
            }
            de.field_c = new le(param0);
            bb.field_b = param2;
            o.field_f = param3;
            int discarded$0 = 6;
            fi.a();
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "qm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_f = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ae var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Chess.field_G;
          if (param1 instanceof ae) {
            var14 = (ae) (Object) param1;
            param1 = var14.field_g;
            var2 = var14.field_h + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf('\t'));
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (-1 != var10) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var19 + var8.substring(var12 - -5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + ' ';
                  continue L1;
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static sa a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        sa stackIn_3_0 = null;
        sa stackIn_7_0 = null;
        sa stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        sa stackIn_26_0 = null;
        sa stackIn_40_0 = null;
        sa stackIn_45_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_6_0 = null;
        sa stackOut_12_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        sa stackOut_25_0 = null;
        sa stackOut_44_0 = null;
        sa stackOut_39_0 = null;
        sa stackOut_2_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var6 = Chess.field_G;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int > 64) {
              stackOut_6_0 = ok.field_Ob;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (34 == param1.charAt(0)) {
                if (param1.charAt(-1 + var2_int) != 34) {
                  stackOut_12_0 = wh.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var4 < var2_int + -1) {
                      L1: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L2: {
                            if (var3 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L2;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L2;
                            }
                          }
                          var3 = stackIn_22_0;
                          break L1;
                        } else {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 != 0) {
                                break L3;
                              } else {
                                stackOut_25_0 = wh.field_b;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                L4: {
                  var3 = 0;
                  var4 = 0;
                  if (param0 == -24) {
                    break L4;
                  } else {
                    var7 = null;
                    sa discarded$1 = qm.a((byte) 111, (String) null);
                    break L4;
                  }
                }
                L5: while (true) {
                  if (var4 < var2_int) {
                    L6: {
                      var5 = param1.charAt(var4);
                      if (var5 != 46) {
                        if (kh.field_m.indexOf(var5) == -1) {
                          stackOut_44_0 = wh.field_b;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          var3 = 0;
                          break L6;
                        }
                      } else {
                        L7: {
                          if (0 == var4) {
                            break L7;
                          } else {
                            if (-1 + var2_int == var4) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = wh.field_b;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                    var4++;
                    continue L5;
                  } else {
                    return null;
                  }
                }
              }
            }
          } else {
            stackOut_2_0 = ef.field_j;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("qm.A(").append(param0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L8;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L8;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
        }
    }

    final static String a(char param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            var4_int = param1.length();
            L1: {
              var5 = param2.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (0 == var7) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param1.indexOf('_', var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param1.indexOf('_', var9);
              if (var10 >= 0) {
                StringBuilder discarded$3 = var8.append(param1.substring(var9, var10));
                StringBuilder discarded$4 = var8.append(param2);
                var9 = 1 + var10;
                continue L3;
              } else {
                StringBuilder discarded$5 = var8.append(param1.substring(var9));
                stackOut_12_0 = var8.toString();
                stackIn_13_0 = stackOut_12_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("qm.C(").append('_').append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + -51 + ')');
        }
        return stackIn_13_0;
    }

    final static rk[] a(int param0, String param1, String param2, um param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        rk[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            var4_int = param3.a(param1, 0);
            var5 = param3.a(param2, 7, var4_int);
            stackOut_2_0 = om.a(param3, var4_int, true, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qm.G(").append(1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw fk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = ad.a(param1, -2);
                    if (var4 == null) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (cg.a(2, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!cg.a(2, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              if (param2 >= 79) {
                                var6 = 0;
                                L3: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (var5 > 0) {
                                      stackOut_34_0 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L4: {
                                      var7 = param1.charAt(var6);
                                      if (cg.a(2, (char) var7)) {
                                        var5++;
                                        break L4;
                                      } else {
                                        var5 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (var5 < 2) {
                                        break L5;
                                      } else {
                                        if (param0) {
                                          break L5;
                                        } else {
                                          stackOut_29_0 = 0;
                                          stackIn_30_0 = stackOut_29_0;
                                          return stackIn_30_0 != 0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L3;
                                  }
                                }
                              } else {
                                stackOut_20_0 = 1;
                                stackIn_21_0 = stackOut_20_0;
                                return stackIn_21_0 != 0;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("qm.E(").append(param0).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param2 + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static void a(int param0) {
        if (hm.field_g) {
            return;
        }
        if (!(null != gf.field_d)) {
            gf.field_d = vc.a(-122, 4);
        }
        if (!(!gf.field_d.field_m)) {
            vk.field_b = vk.field_b & ~gf.field_d.field_j;
            wc.field_w = wc.field_w | gf.field_d.field_j;
            gf.field_d = null;
            hm.field_g = true;
        }
        if (hm.field_g) {
            dn.a(true);
            df.a((byte) 102);
            if (6 == jc.field_f) {
                if (vk.field_b == 0) {
                    jc.field_f = 0;
                    uk.a(qk.field_h, false, 28333, 0);
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Previous";
        field_g = 0;
        field_e = "Reject";
        field_c = new int[8192];
        field_f = new boolean[]{true, true, true, true, true, true, true, true, true, true, field_g == 1 ? true : false};
    }
}
