/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static int[] field_a;
    static int[][] field_h;
    static int field_f;
    static cd field_d;
    static int[] field_c;
    static int[] field_b;
    static int[] field_e;
    static String field_i;
    static long field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_h = (int[][]) null;
        field_b = null;
        field_d = null;
        field_i = null;
        if (param0 <= 103) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kk.field_c = param2;
              ob.field_F = param3;
              jj.a(param1, gb.field_c, 1702);
              if (param0 >= 58) {
                break L1;
              } else {
                fd.a(-9);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = el.field_n;
          synchronized (var1) {
            L0: {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_f = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    bg.field_l = bf.field_B;
                    vd.field_a = vd.field_a + 1;
                    if (0 <= j.field_b) {
                      break L4;
                    } else {
                      var2 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (112 <= var2) {
                              break L7;
                            } else {
                              ve.field_B[var2] = false;
                              var2++;
                              if (var4 != 0) {
                                break L6;
                              } else {
                                if (var4 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          j.field_b = sc.field_a;
                          break L6;
                        }
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: while (true) {
                    if (sc.field_a == j.field_b) {
                      break L3;
                    } else {
                      var2 = se.field_p[sc.field_a];
                      sc.field_a = 127 & sc.field_a + 1;
                      stackIn_21_0 = var2;

                      if (var4 != 0) {
                        break L2;
                      } else {
                        L9: {
                          L10: {
                            if (stackIn_21_0 < 0) {
                              break L10;
                            } else {
                              ve.field_B[var2] = true;
                              if (var4 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          ve.field_B[var2 ^ -1] = false;
                          break L9;
                        }
                        if (var4 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_21_0 = dk.field_i;
                break L2;
              }
              bf.field_B = stackIn_21_0;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (var1), "fd.D(" + param0 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            StringBuilder discarded$9 = null;
            java.net.URL stackIn_48_0 = null;
            java.net.URL stackIn_50_0 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            String stackIn_57_2 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            String stackIn_60_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5 = param3.getFile();
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                                statePc = 11;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = var5.indexOf('/', var6 - -1);
                            var11 = var7_int;
                            var10 = 0;
                            if (var9 != 0) {
                                statePc = 6;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var10 > var11) {
                                statePc = 11;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var10 < var11) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (-1 >= (param0 ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5.regionMatches(var6, "/a=", 0, 3)) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var7_int = var5.indexOf('/', var6 - -1);
                            if (-1 < (var7_int ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (var7_int >= 0) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (param4 != null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 25;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var7_int = var5.indexOf('/', var6 + 1);
                            if (var7_int >= 0) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (param1 == null) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var7 = new StringBuilder(var6);
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if (param2 == 130) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            field_d = (cd) null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((param0 ^ -1) >= -1) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param0));
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (param4 == null) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (param4.length() > 0) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param4);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (param1 == null) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-1 > (param1.length() ^ -1)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param1);
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var5.length() > var6) {
                                statePc = 45;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            discarded$7 = var7.append('/');
                            if (var9 == 0) {
                                statePc = 47;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            discarded$8 = var7.append(var5.substring(var6, var5.length()));
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            discarded$9 = var7.append(var5.substring(var6, var5.length()));
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_48_0 = new java.net.URL(param3, var7.toString());
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof Exception ? 49 : 51);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        return stackIn_48_0;
                    }
                    case 49: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_50_0 = (java.net.URL) (param3);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 51;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        return stackIn_50_0;
                    }
                    case 51: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_53_0 = (RuntimeException) (var5_ref);
                        stackIn_52_0 = stackIn_53_0;
                        stackIn_53_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
                        stackIn_52_1 = stackIn_53_1;
                        if (param1 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_54_1 = (StringBuilder) ((Object) stackIn_52_1);
                        stackIn_54_2 = "{...}";
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 53: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
                        stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                        stackIn_54_2 = "null";
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        stackIn_56_0 = (RuntimeException) ((Object) stackIn_54_0);
                        stackIn_55_0 = stackIn_56_0;
                        stackIn_56_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param2).append(',');
                        stackIn_55_1 = stackIn_56_1;
                        if (param3 == null) {
                            statePc = 56;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                        stackIn_57_1 = (StringBuilder) ((Object) stackIn_55_1);
                        stackIn_57_2 = "{...}";
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
                        stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
                        stackIn_57_2 = "null";
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        stackIn_59_0 = (RuntimeException) ((Object) stackIn_57_0);
                        stackIn_58_0 = stackIn_59_0;
                        stackIn_59_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');
                        stackIn_58_1 = stackIn_59_1;
                        if (param4 == null) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        stackIn_60_0 = (RuntimeException) ((Object) stackIn_58_0);
                        stackIn_60_1 = (StringBuilder) ((Object) stackIn_58_1);
                        stackIn_60_2 = "{...}";
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 59: {
                        stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                        stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                        stackIn_60_2 = "null";
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        throw ch.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
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

    static {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[]{0, 3, 17, 12, 13, 4, 2, 14, 11}, (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[]{1, 12, 13, 4, 3, 7}, (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[]{21, 12, 13, 4, 3, 22}, (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[]{15, 5}, (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[]{18, 6, 19, 20}, (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[]{15, 5}, (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[]{2, 5}, (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[]{15, 16}, (byte) 57, 443, 197, 260);
    }
}
