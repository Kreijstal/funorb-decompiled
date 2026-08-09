/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_p;
    ml field_l;
    int field_n;
    ta field_m;
    int field_r;
    int field_k;
    static int field_j;
    ml field_a;
    private boolean field_q;
    int field_f;
    ml field_o;
    ml field_i;
    static ib field_d;
    int field_b;
    private int field_c;
    ml field_g;
    int field_s;
    static ib field_h;
    static mj field_e;

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_p + this.field_n;
              var6 = this.field_f + this.field_k;
              var7 = this.field_b;
              if (0 == (var7 ^ -1)) {
                var7 = this.field_m.field_C + this.field_m.field_D;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var8 = ge.field_h >> 723108066;
                    var9 = this.field_m.a(param1);
                    var10 = this.field_m.field_D + this.field_m.field_C;
                    var11 = 1;
                    if (var9 > var8) {
                      break L5;
                    } else {
                      if (-1 != param1.indexOf("<br>")) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (nd.field_g != null) {
                      break L6;
                    } else {
                      nd.field_g = new String[16];
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (var9 > var8) {
                        break L8;
                      } else {
                        var12 = var8;
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var13 = var9 / var8;
                    var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
                    break L7;
                  }
                  var11 = this.field_m.a(param1, new int[]{var12}, nd.field_g);
                  var9 = 0;
                  var10 = var10 + (var11 + -1) * var7;
                  var13 = 0;
                  L9: while (true) {
                    if (var13 >= var11) {
                      break L4;
                    } else {
                      var14 = this.field_m.a(nd.field_g[var13]);
                      var17 = var14;
                      var16 = var9;
                      if (var15 != 0) {
                        if (var16 > var17) {
                          break L3;
                        } else {
                          break L2;
                        }
                      } else {
                        L10: {
                          if (var16 >= var17) {
                            break L10;
                          } else {
                            var9 = var14;
                            break L10;
                          }
                        }
                        var13++;
                        if (var15 == 0) {
                          continue L9;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var12 = -40 / ((-24 - param0) / 34);
                var13 = param3;
                if (ge.field_h < var5_int + (var9 + var13)) {
                  break L3;
                } else {
                  break L2;
                }
              }
              var13 = -var5_int + ge.field_h - var9;
              break L2;
            }
            L11: {
              var14 = 32 + -this.field_m.field_j + param2;
              if (ge.field_g >= var14 - (-var10 - var6)) {
                break L11;
              } else {
                var14 = -var6 + (param2 - var10);
                break L11;
              }
            }
            ge.f(var13, var14, var5_int + var9, var10 - -var6, this.field_r);
            ge.d(1 + var13, var14 - -1, var5_int + (var9 + -2), var10 + (var6 + -2), this.field_s);
            this.field_m.a(param1, var13 - -this.field_p, var14 + this.field_k, var9, var10, this.field_c, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("dk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, be param3, ta param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 == -25006) {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              L1: while (true) {
                L2: {
                  if (var7 >= param0.length()) {
                    break L2;
                  } else {
                    var8 = param0.charAt(var7);
                    if (var9 == 0) {
                      L3: {
                        if (var8 == 60) {
                          var6 = (var5_int >> -950064312) + (param3.field_c[0] + param4.a(param0.substring(0, var7)));
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        L5: {
                          if (var6 != -1) {
                            break L5;
                          } else {
                            L6: {
                              if (var8 != 32) {
                                break L6;
                              } else {
                                var5_int = var5_int + param1;
                                break L6;
                              }
                            }
                            param3.field_c[var7] = (var5_int >> -365433432) + param3.field_c[0] + (param4.a(param0.substring(0, var7 + 1)) + -param4.a((char) var8));
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        param3.field_c[var7] = var6;
                        break L4;
                      }
                      L7: {
                        if (var8 != 62) {
                          break L7;
                        } else {
                          var6 = -1;
                          break L7;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("dk.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 < 82) {
          dk.a(41);
          ge.c(param0, param6, param5, param3, param1, param2);
          return;
        } else {
          ge.c(param0, param6, param5, param3, param1, param2);
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_e = null;
        if (param0 < 100) {
            field_d = (ib) null;
        }
    }

    final static boolean a(int param0, byte param1) {
        int var2 = -89 % ((param1 - 64) / 61);
        return (-param0 & param0) == param0 ? true : false;
    }

    final void a(ta param0, boolean param1) {
        db discarded$3 = null;
        mc discarded$4 = null;
        le dupTemp$5 = null;
        RuntimeException runtimeException = null;
        ak var4 = null;
        le[] var5 = null;
        ak var6 = null;
        int var7_int = 0;
        ak var7 = null;
        ak var8 = null;
        le[] var9 = null;
        le[] var10 = null;
        ak var11 = null;
        ak var12 = null;
        le var13 = null;
        ak var14 = null;
        int var15 = 0;
        ae var16 = null;
        a var17 = null;
        ae var18 = null;
        ak var19 = null;
        hc stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        hc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        hc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var17 = new a(param0, 2, 2, 2236962, 1, 1, 1, param0.field_C + param0.field_D - -2);
                        var17.field_f = 16777215;
                        this.field_a = (ml) ((Object) var17);
                        var4 = new ak();
                        var17.a(false, var4);
                        this.field_m = param0;
                        this.field_s = 5592405;
                        this.field_p = 3;
                        this.field_n = 3;
                        this.field_f = 3;
                        this.field_b = -1;
                        this.field_r = 15658734;
                        var4.field_e = 11711154;
                        this.field_k = 3;
                        var4.field_k = 15658734;
                        this.field_c = 15658734;
                        var4.a((byte) -102, 0).a(15658734, (byte) -3).a(-20433, vl.a(10066329, 7829367, 8947848, true));
                        var4.a((byte) -102, 1).a(-20433, vl.a(10066329, 13421772, 11184810, true));
                        stackIn_3_0 = var4.a((byte) -102, 3);
                        stackIn_2_0 = stackIn_3_0;
                        stackIn_3_1 = -20433;
                        stackIn_2_1 = stackIn_3_1;
                        stackIn_3_2 = 7829367;
                        stackIn_2_2 = stackIn_3_2;
                        stackIn_3_3 = 10066329;
                        stackIn_2_3 = stackIn_3_3;
                        stackIn_3_4 = 8947848;
                        stackIn_2_4 = stackIn_3_4;
                        if (param1) {
                            statePc = 3;
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
                        stackIn_4_0 = (hc) ((Object) stackIn_2_0);
                        stackIn_4_1 = stackIn_2_1;
                        stackIn_4_2 = stackIn_2_2;
                        stackIn_4_3 = stackIn_2_3;
                        stackIn_4_4 = stackIn_2_4;
                        stackIn_4_5 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = (hc) ((Object) stackIn_3_0);
                        stackIn_4_1 = stackIn_3_1;
                        stackIn_4_2 = stackIn_3_2;
                        stackIn_4_3 = stackIn_3_3;
                        stackIn_4_4 = stackIn_3_4;
                        stackIn_4_5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((hc) (Object) stackIn_4_0).a(stackIn_4_1, vl.a(stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5 != 0)).b(122, 1).a(1, 215650672);
                        var5 = new le[9];
                        var16 = new ae(32, 32);
                        var18 = var16;
                        var7_int = 0;
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
                        if (var18.field_s.length <= var7_int) {
                            statePc = 9;
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
                        var16.field_s[var7_int] = 1077952576;
                        var7_int++;
                        if (var15 != 0) {
                            statePc = 10;
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
                        if (var15 == 0) {
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5[4] = (le) ((Object) var16);
                        var4.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
                        var4.a((byte) -102, 5).a(-20433, jc.a(65793, 0, 64, 0, 0)).a((byte) -48, true).a(-1, (byte) -3);
                        this.field_i = (ml) ((Object) var4);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = new ak(var4, true);
                        var6.field_l = 0;
                        var7 = new ak(var4, true);
                        var7.field_l = 0;
                        var7.a(ck.a(8947848, -14377), 250);
                        var7.a((byte) -102, 1).a(-20433, ck.a(11184810, -14377)).a(2236962, (byte) -3);
                        this.field_l = (ml) ((Object) new pb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                        discarded$3 = new db(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                        discarded$4 = new mc(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                        var8 = new ak();
                        var17.a(param1, var8);
                        var8.a((byte) -102, 0).a(-20433, vl.a(7829367, 10066329, 15658734, true)).a(1118481, (byte) -3).a(true, -1);
                        var8.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
                        this.field_o = (ml) ((Object) var8);
                        var9 = new le[9];
                        var9[4] = new le(2, 1);
                        var10 = new le[9];
                        var10[4] = new le(1, 2);
                        dupTemp$5 = var9[4];
                        dupTemp$5.field_s = new int[]{6710886, 7829367};
                        var10[4].field_s = new int[]{6710886, 7829367};
                        var11 = new ak();
                        var12 = new ak();
                        var11.a(var9, 4986, 0);
                        var12.a(var10, 4986, 0);
                        var13 = new le(7, 4);
                        var13.field_s = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                        var14 = new ak(var4, true);
                        var14.a((byte) 1, var13.d());
                        var13.b();
                        var14 = new ak(var4, true);
                        var14.a((byte) 1, var13.d());
                        var13.b();
                        var14 = new ak(var4, true);
                        var14.a((byte) 1, var13.d());
                        var13.b();
                        var19 = new ak(var4, true);
                        var19.a((byte) 1, var13);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("dk.F(");
                    stackIn_13_1 = stackIn_14_1;
                    if (param0 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, String param1, byte param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (param2 == -87) {
              L1: {
                var5_int = this.field_m.a(param1);
                var6 = this.field_m.field_j - -this.field_m.field_D;
                var7 = param3;
                if (ge.field_h >= var7 - -var5_int + 6) {
                  break L1;
                } else {
                  var7 = -var5_int + ge.field_h + -6;
                  break L1;
                }
              }
              L2: {
                var8 = param0 - this.field_m.field_j + 32;
                if (var8 + var6 + 6 > ge.field_g) {
                  var8 = -var6 + (ge.field_g + -6);
                  break L2;
                } else {
                  break L2;
                }
              }
              ge.f(var7, var8, 6 + var5_int, var6 - -6, this.field_c);
              ge.d(var7 - -1, 1 + var8, var5_int + 4, var6 - -4, this.field_s);
              this.field_m.b(param1, var7 - -3, var8 - -3 - -this.field_m.field_j, this.field_c, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("dk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 6) {
              L1: {
                if (!this.field_q) {
                  break L1;
                } else {
                  this.a(96, param3, param0, param2);
                  if (!MonkeyPuzzle2.field_F) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.a(param0, param3, (byte) -87, param2);
              return;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("dk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ge.e(param2, param3, param5, param4, param1);
        if (param0 != 13421772) {
            this.a(126, 26, -59, -95, -111, -126);
        }
    }

    public dk() {
        this.field_q = true;
    }

    static {
        field_j = 0;
        field_d = new ib();
    }
}
