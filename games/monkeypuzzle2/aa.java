/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    be[] field_c;
    static int field_a;
    static ib field_b;

    final int a(int param0, String param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
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
                        var5_int = 0;
                        var6 = 0;
                        if (param3 == -79) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var11 = (java.applet.Applet) null;
                        aa.a(71, (java.applet.Applet) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = param1.length();
                        var8 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 <= var8) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = param1.charAt(var8);
                        var13 = 60;
                        var12 = var9;
                        if (var10 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var12 == var13) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var12 < var13) {
                            statePc = 20;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return 0;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (62 == var9) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 32) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var6 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (0 < var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (-param2 + param0 << 427847240) / var5_int;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    try {
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var5);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("aa.A(").append(param0).append(',');
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
                    throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(int param0, int param1) {
        int var3;
        be var4;
        int var5;
        int stackIn_6_0 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          var3 = 0;
          if (param1 < 0) {
            break L0;
          } else {
            field_b = (ib) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < this.field_c.length) {
            var4 = this.field_c[var3];
            stackIn_6_0 = var4.field_c.length ^ -1;

            if (var5 == 0) {
              if (stackIn_6_0 < (param0 ^ -1)) {
                return var3;
              } else {
                param0 = param0 - (-1 + var4.field_c.length);
                var3++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return this.field_c.length;
                }
              }
            } else {
              return stackIn_6_0;
            }
          } else {
            return this.field_c.length;
          }
        }
    }

    final static int a(ta param0, int param1, String param2, boolean param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2);
              if (var5_int > param1) {
                break L1;
              } else {
                if (param2.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param2;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int - -param1 + -1) / param1;
            if (param3) {
              param1 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param2.length();
              var9 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var8 <= var9) {
                        break L5;
                      } else {
                        var10 = param2.charAt(var9);
                        var15 = -33;
                        var14 = var10 ^ -1;
                        if (var13 != 0) {
                          if (var14 >= var15) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          L6: {
                            L7: {
                              if (var14 == var15) {
                                break L7;
                              } else {
                                if (var10 != 45) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var11 = param2.substring(var7, 1 + var9).trim();
                            var12 = param0.a(var11);
                            if (param1 > var12) {
                              break L6;
                            } else {
                              incrementValue$0 = var6;
                              var6++;
                              param4[incrementValue$0] = var11;
                              var7 = var9 - -1;
                              break L6;
                            }
                          }
                          L8: {
                            if (var10 != 62) {
                              break L8;
                            } else {
                              if (!param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                                break L8;
                              } else {
                                incrementValue$1 = var6;
                                var6++;
                                param4[incrementValue$1] = param2.substring(var7, -3 + var9).trim();
                                var7 = 1 + var9;
                                break L8;
                              }
                            }
                          }
                          var9++;
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var7 >= var8) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                  incrementValue$2 = var6;
                  var6++;
                  param4[incrementValue$2] = param2.substring(var7, var8).trim();
                  break L3;
                }
                stackIn_26_0 = var6;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_7_0 = 23;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("aa.B(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    final int a(int param0, int param1) {
        be[] var3;
        int var4;
        int var5;
        be var6;
        int var7;
        be[] var8;
        int stackIn_5_0 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var8 = this.field_c;
        var3 = var8;
        var4 = -95 / ((32 - param0) / 51);
        var5 = 0;
        L0: while (true) {
          if (var5 < var8.length) {
            var6 = var8[var5];
            stackIn_5_0 = param1 ^ -1;

            if (var7 == 0) {
              if (stackIn_5_0 > (var6.field_c.length ^ -1)) {
                return var6.field_c[param1];
              } else {
                param1 = param1 - (-1 + var6.field_c.length);
                var5++;
                if (var7 == 0) {
                  continue L0;
                } else {
                  return 0;
                }
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return 0;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 <= -123) {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(uf.a(param1, (byte) 107, var2), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("aa.J(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 == -1) {
            return;
        }
        field_a = 39;
    }

    final int b(int param0) {
        String var3;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 62) {
          if (this.field_c != null) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_a + this.field_c[-1 + this.field_c.length].field_f;
            }
          } else {
            stackIn_11_0 = 0;
            return stackIn_11_0;
          }
        } else {
          var3 = (String) null;
          this.a(121, (String) null, 20, (byte) -1);
          if (this.field_c == null) {
            return 0;
          } else {
            L0: {
              if (0 < this.field_c.length) {
                stackIn_5_0 = -this.field_c[0].field_a + this.field_c[-1 + this.field_c.length].field_f;
                break L0;
              } else {
                stackIn_5_0 = 0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(int param0) {
        L0: {
          if (vh.field_B != null) {
            vh.field_B.b();
            break L0;
          } else {
            break L0;
          }
        }
        if (null == fc.field_k) {
          if (param0 == -11449) {
            return;
          } else {
            aa.c(26);
            return;
          }
        } else {
          fc.field_k.b();
          if (param0 == -11449) {
            return;
          } else {
            aa.c(26);
            return;
          }
        }
    }

    final int a(boolean param0) {
        int var2;
        be[] var3;
        int var4;
        be var5;
        int var6;
        int var7;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var3.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.a(-1);
                      if (var6 > var2) {
                        var2 = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return -117;
        }
    }

    final int a(int param0, int param1, int param2) {
        int stackIn_14_0 = 0;
        int stackIn_30_0 = 0;
        int var4;
        int var5;
        be var6;
        int var7;
        int var8;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_c == null) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              if (this.field_c[0].field_a <= param1) {
                if (this.field_c[this.field_c.length + -1].field_f >= param1) {
                  if ((this.field_c.length ^ -1) != -2) {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param2 <= -100) {
                        break L1;
                      } else {
                        aa.a(-27);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 < this.field_c.length) {
                        var6 = this.field_c[var5];
                        stackIn_30_0 = var6.field_a ^ -1;

                        if (var8 == 0) {
                          L3: {
                            if (stackIn_30_0 < (param1 ^ -1)) {
                              break L3;
                            } else {
                              if (param1 <= var6.field_f) {
                                var7 = var6.a(0, param0);
                                if ((var7 ^ -1) == 0) {
                                  return -1;
                                } else {
                                  return var7 + var4;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_c.length);
                          var5++;
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            return -1;
                          }
                        } else {
                          stackIn_14_0 = stackIn_30_0;
                          return stackIn_14_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return this.field_c[0].a(0, param0);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    static {
        field_b = new ib();
    }
}
