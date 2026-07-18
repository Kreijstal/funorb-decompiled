/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ob implements ed {
    private nk field_f;
    static jc[] field_h;
    static int field_g;
    static int[] field_d;
    static int[] field_c;
    static int[][] field_e;

    final static void a(jg param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        da var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var3 = da.field_p;
              var3.c((byte) 33, param2);
              var3.f(param1 ^ 57, 5);
              if (param1 == 86) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            var3.f(param1 + 25, 0);
            var3.b(-652561784, param0.field_i);
            var3.f(111, param0.field_l);
            var3.f(111, param0.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("gd.O(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        try {
            field_e = null;
            field_c = null;
            field_d = null;
            field_h = null;
            if (param0 != -1) {
                boolean discarded$0 = gd.e((byte) -13);
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "gd.M(" + param0 + ')');
        }
    }

    final fd c(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        fd stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -92) {
              stackOut_3_0 = ((gd) this).a(((gd) this).field_f.field_q, (byte) 70);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "gd.I(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, hj param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                boolean discarded$2 = gd.e((byte) -29);
                break L1;
              }
            }
            lf.field_e = param1;
            dl.field_j = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("gd.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    abstract String a(String param0, boolean param1);

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 <= -1) {
                break L1;
              } else {
                boolean discarded$2 = gd.e((byte) 28);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param2 <= 0) {
                    break L4;
                  } else {
                    var3_int = param0 & 1 | var3_int << -606366175;
                    stackOut_5_0 = param0 >>> 1;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      param0 = stackIn_6_0;
                      param2--;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_7_0 = var3_int;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var3, "gd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    public final void a(byte param0, nk param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 19) {
                break L1;
              } else {
                field_d = null;
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
            stackOut_3_1 = new StringBuilder().append("gd.F(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -10) {
                break L1;
              } else {
                ((gd) this).field_f = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((gd) this).field_f.field_q == null) {
                  break L3;
                } else {
                  if (((gd) this).field_f.field_q.length() != 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "gd.B(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    gd(nk param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((gd) this).field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gd.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final void a(nk param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((gd) this).a(21871);
            var3_int = -21 % ((param1 - -61) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("gd.P(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                gd.e(-126);
                break L1;
              }
            }
            stackOut_3_0 = ((gd) this).a(((gd) this).field_f.field_q, true);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "gd.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean e(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 1) {
              L1: {
                L2: {
                  if (null == lk.field_h) {
                    break L2;
                  } else {
                    if (d.field_f != ad.field_b) {
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_10_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                }
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "gd.J(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static ji f(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        ji var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String[] var7 = null;
        int var8 = 0;
        String var9 = null;
        ok var10 = null;
        int var11 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_15_0 = null;
        ji stackIn_68_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        ji stackOut_67_0 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            L1: while (true) {
              L2: {
                L3: {
                  if (null != kf.field_q) {
                    L4: {
                      L5: {
                        if (kf.field_q.charAt(0) != 91) {
                          break L5;
                        } else {
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      jf.a(4);
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                    if (param0 < -108) {
                      break L2;
                    } else {
                      stackOut_13_0 = null;
                      stackIn_15_0 = stackOut_13_0;
                      break L3;
                    }
                  } else {
                    stackOut_2_0 = null;
                    stackIn_3_0 = stackOut_2_0;
                    stackOut_3_0 = stackIn_3_0;
                    stackIn_15_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11 != 0) {
                      break L3;
                    } else {
                      return (ji) (Object) stackIn_4_0;
                    }
                  }
                }
                field_h = (jc[]) (Object) stackIn_15_0;
                break L2;
              }
              var1_ref = kf.field_q.substring(1, kf.field_q.indexOf(']'));
              jf.a(4);
              var2 = new ji(var1_ref);
              var3 = new StringBuilder();
              L6: while (true) {
                L7: {
                  if (kf.field_q == null) {
                    break L7;
                  } else {
                    if (91 == kf.field_q.charAt(0)) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          L10: {
                            if (kf.field_q.charAt(0) != 64) {
                              break L10;
                            } else {
                              var4 = kf.field_q.indexOf(' ');
                              if (-1 != var4) {
                                L11: {
                                  var5 = kf.field_q.substring(1, var4);
                                  var6 = kf.field_q.substring(var4);
                                  var7 = ca.a((byte) -116, ',', var6);
                                  if (var5.equalsIgnoreCase("left")) {
                                    ac.a(var2, var7, 1, 0);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (!var5.equalsIgnoreCase("right")) {
                                    break L12;
                                  } else {
                                    ac.a(var2, var7, 1, 1);
                                    break L12;
                                  }
                                }
                                L13: {
                                  if (!var5.equalsIgnoreCase("top")) {
                                    break L13;
                                  } else {
                                    ac.a(var2, var7, 1, 2);
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (var5.equalsIgnoreCase("bottom")) {
                                    ac.a(var2, var7, 1, 3);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                L15: {
                                  if (var5.equalsIgnoreCase("tag")) {
                                    if (1 == var7.length) {
                                      var2.field_l = var7[0];
                                      break L15;
                                    } else {
                                      throw new IllegalArgumentException();
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                                L16: {
                                  if (!var5.equalsIgnoreCase("jump")) {
                                    break L16;
                                  } else {
                                    var8 = var7[0].indexOf(' ');
                                    if (-1 != var8) {
                                      var9 = var7[0].substring(0, var8).trim();
                                      var7[0] = var7[0].substring(var8);
                                      var10 = w.a(var7, (byte) 55);
                                      var10.field_b = var9;
                                      var2.a(var10, (byte) 7);
                                      break L16;
                                    } else {
                                      throw new IllegalArgumentException();
                                    }
                                  }
                                }
                                L17: {
                                  if (var5.equalsIgnoreCase("continue")) {
                                    var2.a(w.a(var7, (byte) 55), (byte) 7);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (!var5.equalsIgnoreCase("action")) {
                                    break L18;
                                  } else {
                                    var8 = 0;
                                    L19: while (true) {
                                      if (~var7.length >= ~var8) {
                                        break L18;
                                      } else {
                                        var2.a(tl.a(var7[var8], (byte) -95), 0);
                                        var8++;
                                        if (var11 != 0) {
                                          break L8;
                                        } else {
                                          if (var11 == 0) {
                                            continue L19;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              } else {
                                throw new IllegalArgumentException();
                              }
                            }
                          }
                          StringBuilder discarded$1 = var3.append(kf.field_q);
                          break L9;
                        }
                        jf.a(4);
                        break L8;
                      }
                      if (var11 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var2.field_f = var3.toString();
                stackOut_67_0 = (ji) var2;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "gd.K(" + param0 + ')');
        }
        return stackIn_68_0;
    }

    abstract fd a(String param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = new jc[255];
        var0 = 0;
        L0: while (true) {
          if (var0 >= field_h.length) {
            field_d = new int[8192];
            field_c = new int[4];
            field_g = 0;
            return;
          } else {
            field_h[var0] = new jc();
            var0++;
            continue L0;
          }
        }
    }
}
