/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd implements Runnable {
    static tf field_e;
    static int field_g;
    volatile boolean field_d;
    volatile boolean field_c;
    ab field_b;
    static String field_a;
    volatile b[] field_f;

    final static boolean a(String param0, int param1, int param2, String param3, pj param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        u var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bk.field_c == c.field_m) {
              L1: {
                var8 = new u(ug.field_A, param4);
                if (param1 == 0) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              L2: {
                ug.field_A.a(param1 + -14579, var8);
                if (!g.f(256)) {
                  break L2;
                } else {
                  var8.k((byte) -92);
                  if (!Lexicominos.field_L) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                ce.field_d = param0;
                Lexicominos.field_H = param3;
                cg.field_l = param2;
                wa.field_k = param5;
                bk.field_c = ca.field_i;
                li.field_T = null;
                if (!param6) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = 1;
                  break L3;
                }
              }
              we.field_d = stackIn_11_0 != 0;
              return true;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var7);

            stackIn_16_1 = new StringBuilder().append("fd.B(");

            if (param0 == null) {
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
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_26_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    final static long a(byte param0, CharSequence param1) {
        long stackIn_31_0 = 0L;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var5 >= var4) {
                      break L4;
                    } else {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      var9 = -66;
                      var8 = var6 ^ -1;
                      if (var7 != 0) {
                        if (var8 == var9) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              if (var8 > var9) {
                                break L7;
                              } else {
                                if (var6 <= 90) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              L9: {
                                if (var6 < 97) {
                                  break L9;
                                } else {
                                  if (122 >= var6) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              if (var6 < 48) {
                                break L5;
                              } else {
                                if (57 < var6) {
                                  break L5;
                                } else {
                                  var2_long = var2_long + (long)(var6 + 27 - 48);
                                  if (var7 == 0) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var2_long = var2_long + (long)(-97 + (1 - -var6));
                            if (var7 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                          var2_long = var2_long + (long)(-65 + var6 + 1);
                          break L5;
                        }
                        L10: {
                          if ((var2_long ^ -1L) > -177917621779460414L) {
                            break L10;
                          } else {
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var5++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == -58) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                fd.a((byte) -11);
                break L2;
              }
              L11: while (true) {
                L12: {
                  L13: {
                    if (-1L != (var2_long % 37L ^ -1L)) {
                      break L13;
                    } else {
                      stackIn_31_0 = -1L;

                      if (var7 != 0) {
                        break L12;
                      } else {
                        if (stackIn_31_0 == (var2_long ^ -1L)) {
                          break L13;
                        } else {
                          var2_long = var2_long / 37L;
                          if (var7 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                  }
                  stackIn_31_0 = var2_long;
                  break L12;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("fd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L14;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L14;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        b var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    this.field_c = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_d) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_f[var1_int];
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2.e();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ge.a(0, 10L);
                        ki.a((Object) null, this.field_b, 50);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    this.field_c = false;
                    return;
                }
                case 13: {
                    try {
                        var1 = (Exception) ((Object) caughtException);
                        var5 = (String) null;
                        uj.a((String) null, (Throwable) ((Object) var1), 1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    this.field_c = false;
                    return;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    this.field_c = false;
                    throw fd.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 == -61) {
            return;
        }
        field_g = -15;
    }

    fd() {
        this.field_f = new b[2];
        this.field_d = false;
        this.field_c = false;
    }

    static {
        field_a = "No highscores";
        field_e = new tf();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
