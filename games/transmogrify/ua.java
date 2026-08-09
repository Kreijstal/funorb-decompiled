/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String[] field_a;
    static long field_e;
    static int field_c;
    static int field_d;
    static String field_b;
    static ti[] field_f;

    public static void a(int param0) {
        int var1 = 122 % ((-70 - param0) / 50);
        field_b = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(byte param0) {
        if (param0 > 29) {
          if (null != nk.field_b) {
            if (!lj.field_z.a(-65)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ua.a((ci) null, (String) null, -14, (ci) null, (String) null);
          if (null != nk.field_b) {
            if (!lj.field_z.a(-65)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void b(byte param0) {
        int stackIn_12_0 = 0;
        sj stackIn_18_0 = null;
        sj stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        sj stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        sj stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        sj stackIn_46_0 = null;
        sj stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        sj stackIn_50_0 = null;
        Object stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 12;
              if (oa.field_j < 34) {
                break L1;
              } else {
                if (34 + 12 * wl.field_K.field_n <= oa.field_j) {
                  break L1;
                } else {
                  if (114 > bk.field_a) {
                    break L1;
                  } else {
                    if (wl.field_K.field_m + 114 <= bk.field_a) {
                      break L1;
                    } else {
                      var1_int = (-34 + oa.field_j) / wl.field_K.field_n;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (od.field_g.field_e[11] != null) {
                var1_int = 12;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (od.field_g == sg.field_d.field_o) {
                stackIn_12_0 = sg.field_d.field_t;
                break L3;
              } else {
                stackIn_12_0 = 12;
                break L3;
              }
            }
            var2 = stackIn_12_0;
            var3 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        if ((var3 ^ -1) <= -13) {
                          break L9;
                        } else {
                          var4 = od.field_g.field_e[var3];
                          stackIn_50_0 = (sj) (var4);

                          if (var5 != 0) {
                            break L8;
                          } else {
                            if (stackIn_50_0 == null) {
                              break L9;
                            } else {
                              L10: {
                                stackIn_18_0 = (sj) (var4);

                                if (var1_int > var3) {
                                  stackIn_19_0 = (sj) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 0;
                                  break L10;
                                } else {
                                  stackIn_19_0 = (sj) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 32;
                                  break L10;
                                }
                              }
                              L11: {


                                stackIn_21_1 = stackIn_19_1 + var3 * 32;

                                stackIn_21_2 = 34;

                                if (var3 <= var2) {
                                  stackIn_19_0 = (sj) ((Object) stackIn_19_0);
                                  stackIn_22_1 = stackIn_21_1;
                                  stackIn_22_2 = stackIn_21_2;
                                  stackIn_22_3 = 0;
                                  break L11;
                                } else {
                                  stackIn_19_0 = (sj) ((Object) stackIn_19_0);
                                  stackIn_22_1 = stackIn_21_1;
                                  stackIn_22_2 = stackIn_21_2;
                                  stackIn_22_3 = -32;
                                  break L11;
                                }
                              }
                              stackIn_19_0.field_g = stackIn_22_1 + (stackIn_22_2 - -stackIn_22_3);
                              var3++;
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        if (param0 > 57) {
                          break L12;
                        } else {
                          ua.a(51, 18);
                          break L12;
                        }
                      }
                      L13: {
                        L14: {
                          if (var2 > var1_int) {
                            break L14;
                          } else {
                            var3 = 0;
                            L15: while (true) {
                              L16: {
                                if (12 <= var3) {
                                  break L16;
                                } else {
                                  var4 = od.field_g.field_e[var3];
                                  stackIn_55_0 = null;

                                  if (var5 != 0) {
                                    break L7;
                                  } else {
                                    if (stackIn_55_0 == var4) {
                                      break L16;
                                    } else {
                                      L17: {
                                        L18: {
                                          stackIn_33_0 = (sj) (var4);

                                          stackIn_33_1 = 34;

                                          stackIn_33_2 = 32 * var3;

                                          if (var3 > var1_int) {
                                            break L18;
                                          } else {






                                            if (var2 < var3) {
                                              stackIn_35_0 = (sj) ((Object) stackIn_33_0);
                                              stackIn_35_1 = stackIn_33_1;
                                              stackIn_35_2 = stackIn_33_2;
                                              stackIn_35_3 = -32;
                                              break L17;
                                            } else {
                                              stackIn_33_0 = (sj) ((Object) stackIn_33_0);


                                              break L18;
                                            }
                                          }
                                        }
                                        stackIn_35_0 = (sj) ((Object) stackIn_33_0);
                                        stackIn_35_1 = stackIn_33_1;
                                        stackIn_35_2 = stackIn_33_2;
                                        stackIn_35_3 = 0;
                                        break L17;
                                      }
                                      stackIn_35_0.field_g = stackIn_35_1 + (stackIn_35_2 + stackIn_35_3);
                                      var3++;
                                      if (var5 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var3 = 0;
                        L19: while (true) {
                          if (-13 >= (var3 ^ -1)) {
                            break L13;
                          } else {
                            var4 = od.field_g.field_e[var3];
                            stackIn_55_0 = null;

                            if (var5 != 0) {
                              break L7;
                            } else {
                              L20: {
                                if (stackIn_55_0 != var4) {
                                  break L20;
                                } else {
                                  if (var5 == 0) {
                                    break L13;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                L22: {
                                  stackIn_46_0 = (sj) (var4);

                                  if (var1_int > var3) {
                                    break L22;
                                  } else {


                                    if (var3 < var2) {
                                      stackIn_48_0 = (sj) ((Object) stackIn_46_0);
                                      stackIn_48_1 = 32;
                                      break L21;
                                    } else {
                                      stackIn_46_0 = (sj) ((Object) stackIn_46_0);
                                      break L22;
                                    }
                                  }
                                }
                                stackIn_48_0 = (sj) ((Object) stackIn_46_0);
                                stackIn_48_1 = 0;
                                break L21;
                              }
                              stackIn_48_0.field_g = stackIn_48_1 + (34 - -(32 * var3));
                              var3++;
                              if (var5 == 0) {
                                continue L19;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                      stackIn_50_0 = sg.field_d;
                      break L8;
                    }
                    if (stackIn_50_0 == null) {
                      break L5;
                    } else {
                      L23: {
                        sg.field_d.field_j = oa.field_j - -rk.field_p;
                        sg.field_d.field_q = bk.field_a + ek.field_e;
                        if (sg.field_d.field_j != sg.field_d.field_g) {
                          break L23;
                        } else {
                          if (sg.field_d.field_q == sg.field_d.field_p) {
                            break L6;
                          } else {
                            break L23;
                          }
                        }
                      }
                      stackIn_55_0 = null;
                      break L7;
                    }
                  }
                  nc.field_s = (sj) ((Object) stackIn_55_0);
                  break L6;
                }
                sg.field_d.field_p = sg.field_d.field_q;
                sg.field_d.field_g = sg.field_d.field_j;
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ua.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = (gh) ((Object) mf.field_b.a((byte) -95));
                        var3 = -73 / ((param0 - 80) / 36);
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
                        if (var2 == null) {
                            statePc = 6;
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
                        nb.a(param1, (gh) (var2), 0);
                        var2 = (gh) ((Object) mf.field_b.a(true));
                        if (var4 != 0) {
                            statePc = 7;
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
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
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
                        var2 = pj.field_A.a((byte) -95);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2 == null) {
                            statePc = 14;
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
                        ki.a(false, param1);
                        var2 = pj.field_A.a(true);
                        if (var4 == 0) {
                            statePc = 10;
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
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = caughtException;
                    throw ch.a((Throwable) (var2), "ua.E(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static hh a(ci param0, String param1, int param2, ci param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 32) {
                break L1;
              } else {
                field_d = 80;
                break L1;
              }
            }
            var5_int = param0.b(80, param1);
            var6 = param0.a(param2 ^ -33, param4, var5_int);
            stackIn_3_0 = pe.a((byte) -66, param0, var5_int, param3, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ua.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, fe param1, int param2, oa param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            ba var15 = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var14 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param2 == -22635) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ua.a(-89);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var15 = new ba();
                            var15.field_p = param3.d((byte) 101);
                            var15.field_i = param3.c((byte) -127);
                            var15.field_o = new ib[var15.field_p];
                            var15.field_j = new int[var15.field_p];
                            var15.field_k = new int[var15.field_p];
                            var15.field_h = new int[var15.field_p];
                            var15.field_m = new ib[var15.field_p];
                            var15.field_g = new byte[var15.field_p][][];
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var15.field_p <= var5) {
                                statePc = 43;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6_int = param3.d((byte) 26);
                            if (var14 != 0) {
                                statePc = 52;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_5 instanceof SecurityException ? 38 : ((Object) stateCaught_5 instanceof NullPointerException ? 39 : ((Object) stateCaught_5 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (0 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_6 instanceof SecurityException ? 38 : ((Object) stateCaught_6 instanceof NullPointerException ? 39 : ((Object) stateCaught_6 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (-2 == (var6_int ^ -1)) {
                                statePc = 32;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_7 instanceof SecurityException ? 38 : ((Object) stateCaught_7 instanceof NullPointerException ? 39 : ((Object) stateCaught_7 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (2 == var6_int) {
                                statePc = 32;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_8 instanceof SecurityException ? 38 : ((Object) stateCaught_8 instanceof NullPointerException ? 39 : ((Object) stateCaught_8 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 12;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_9 instanceof SecurityException ? 38 : ((Object) stateCaught_9 instanceof NullPointerException ? 39 : ((Object) stateCaught_9 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-5 != (var6_int ^ -1)) {
                                statePc = 42;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_10 instanceof SecurityException ? 38 : ((Object) stateCaught_10 instanceof NullPointerException ? 39 : ((Object) stateCaught_10 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_11 instanceof SecurityException ? 38 : ((Object) stateCaught_11 instanceof NullPointerException ? 39 : ((Object) stateCaught_11 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var17 = param3.g(12248);
                            var18 = param3.g(12248);
                            var9 = param3.d((byte) 116);
                            var10 = new String[var9];
                            var11_int = 0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = ((Object) stateCaught_12 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_12 instanceof SecurityException ? 38 : ((Object) stateCaught_12 instanceof NullPointerException ? 39 : ((Object) stateCaught_12 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var9 <= var11_int) {
                                statePc = 17;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_13 instanceof SecurityException ? 38 : ((Object) stateCaught_13 instanceof NullPointerException ? 39 : ((Object) stateCaught_13 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var10[var11_int] = param3.g(param2 + 34883);
                            var11_int++;
                            if (var14 != 0) {
                                statePc = 42;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_14 instanceof SecurityException ? 38 : ((Object) stateCaught_14 instanceof NullPointerException ? 39 : ((Object) stateCaught_14 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var14 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = ((Object) stateCaught_15 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_15 instanceof SecurityException ? 38 : ((Object) stateCaught_15 instanceof NullPointerException ? 39 : ((Object) stateCaught_15 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_16 instanceof SecurityException ? 38 : ((Object) stateCaught_16 instanceof NullPointerException ? 39 : ((Object) stateCaught_16 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var20 = new byte[var9][];
                            var16 = var20;
                            var11 = var16;
                            if ((var6_int ^ -1) == -4) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_17 instanceof SecurityException ? 38 : ((Object) stateCaught_17 instanceof NullPointerException ? 39 : ((Object) stateCaught_17 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_18 instanceof SecurityException ? 38 : ((Object) stateCaught_18 instanceof NullPointerException ? 39 : ((Object) stateCaught_18 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var12_int = 0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = ((Object) stateCaught_19 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_19 instanceof SecurityException ? 38 : ((Object) stateCaught_19 instanceof NullPointerException ? 39 : ((Object) stateCaught_19 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var9 <= var12_int) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = ((Object) stateCaught_20 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_20 instanceof SecurityException ? 38 : ((Object) stateCaught_20 instanceof NullPointerException ? 39 : ((Object) stateCaught_20 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var13 = param3.c((byte) -126);
                            array$0 = new byte[var13];
                            var11[var12_int] = array$0;
                            param3.a(var13, 2, var20[var12_int], 0);
                            var12_int++;
                            if (var14 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = ((Object) stateCaught_21 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_21 instanceof SecurityException ? 38 : ((Object) stateCaught_21 instanceof NullPointerException ? 39 : ((Object) stateCaught_21 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var14 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = ((Object) stateCaught_22 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_22 instanceof SecurityException ? 38 : ((Object) stateCaught_22 instanceof NullPointerException ? 39 : ((Object) stateCaught_22 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = ((Object) stateCaught_23 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_23 instanceof SecurityException ? 38 : ((Object) stateCaught_23 instanceof NullPointerException ? 39 : ((Object) stateCaught_23 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var15.field_j[var5] = var6_int;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_24 instanceof SecurityException ? 38 : ((Object) stateCaught_24 instanceof NullPointerException ? 39 : ((Object) stateCaught_24 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var12 = new Class[var9];
                            var13 = 0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_25 instanceof SecurityException ? 38 : ((Object) stateCaught_25 instanceof NullPointerException ? 39 : ((Object) stateCaught_25 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var9 <= var13) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_26 instanceof SecurityException ? 38 : ((Object) stateCaught_26 instanceof NullPointerException ? 39 : ((Object) stateCaught_26 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var12[var13] = ek.a(3249872, var10[var13]);
                            var13++;
                            if (var14 != 0) {
                                statePc = 31;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_27 instanceof SecurityException ? 38 : ((Object) stateCaught_27 instanceof NullPointerException ? 39 : ((Object) stateCaught_27 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var14 == 0) {
                                statePc = 26;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_28 instanceof SecurityException ? 38 : ((Object) stateCaught_28 instanceof NullPointerException ? 39 : ((Object) stateCaught_28 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_29 instanceof SecurityException ? 38 : ((Object) stateCaught_29 instanceof NullPointerException ? 39 : ((Object) stateCaught_29 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var15.field_o[var5] = param1.a(ek.a(3249872, var17), (byte) 81, var12, var18);
                            var15.field_g[var5] = var20;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_30 instanceof SecurityException ? 38 : ((Object) stateCaught_30 instanceof NullPointerException ? 39 : ((Object) stateCaught_30 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var14 == 0) {
                                statePc = 42;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_31 instanceof SecurityException ? 38 : ((Object) stateCaught_31 instanceof NullPointerException ? 39 : ((Object) stateCaught_31 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var19 = param3.g(param2 + 34883);
                            var8 = param3.g(12248);
                            var9 = 0;
                            if (1 == var6_int) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_32 instanceof SecurityException ? 38 : ((Object) stateCaught_32 instanceof NullPointerException ? 39 : ((Object) stateCaught_32 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_33 instanceof SecurityException ? 38 : ((Object) stateCaught_33 instanceof NullPointerException ? 39 : ((Object) stateCaught_33 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var9 = param3.c((byte) -121);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_34 instanceof SecurityException ? 38 : ((Object) stateCaught_34 instanceof NullPointerException ? 39 : ((Object) stateCaught_34 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var15.field_j[var5] = var6_int;
                            var15.field_h[var5] = var9;
                            var15.field_m[var5] = param1.a(ak.a(param2, 22529), var8, ek.a(ak.a(param2, -3264187), var19));
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = ((Object) stateCaught_35 instanceof ClassNotFoundException ? 37 : ((Object) stateCaught_35 instanceof SecurityException ? 38 : ((Object) stateCaught_35 instanceof NullPointerException ? 39 : ((Object) stateCaught_35 instanceof Exception ? 40 : 41))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var6 = (ClassNotFoundException) ((Object) caughtException);
                            var15.field_k[var5] = -1;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var6_ref = (SecurityException) ((Object) caughtException);
                            var15.field_k[var5] = -2;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var6_ref2 = (NullPointerException) ((Object) caughtException);
                            var15.field_k[var5] = -3;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var6_ref3 = (Exception) ((Object) caughtException);
                            var15.field_k[var5] = -4;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var6_ref4 = caughtException;
                            var15.field_k[var5] = -5;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var5++;
                            if (var14 == 0) {
                                statePc = 4;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            wg.field_f.a(var15, param2 ^ 22577);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 45;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        var4 = (RuntimeException) ((Object) caughtException);
                        stackIn_47_0 = (RuntimeException) (var4);
                        stackIn_46_0 = stackIn_47_0;
                        stackIn_47_1 = new StringBuilder().append("ua.A(").append(param0).append(',');
                        stackIn_46_1 = stackIn_47_1;
                        if (param1 == null) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_46_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_46_1);
                        stackIn_48_2 = "{...}";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 47: {
                        stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                        stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                        stackIn_48_2 = "null";
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        stackIn_50_0 = (RuntimeException) ((Object) stackIn_48_0);
                        stackIn_49_0 = stackIn_50_0;
                        stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param2).append(',');
                        stackIn_49_1 = stackIn_50_1;
                        if (param3 == null) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_49_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_49_1);
                        stackIn_51_2 = "{...}";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_51_2 = "null";
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        throw ch.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
                    }
                    case 52: {
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

    static {
        field_a = new String[]{"mummy", "skeleton", "pumpkin", "vampire"};
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
