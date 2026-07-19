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
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                        continue L9;
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
            discarded$1 = this.field_m.a(param1, var13 - -this.field_p, var14 + this.field_k, var9, var10, this.field_c, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("dk.E(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, be param3, ta param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param2 == -25006) {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              L1: while (true) {
                if (var7 >= param0.length()) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = param0.charAt(var7);
                  if (var9 == 0) {
                    L2: {
                      if (var8 == 60) {
                        var6 = (var5_int >> -950064312) + (param3.field_c[0] + param4.a(param0.substring(0, var7)));
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (var6 != -1) {
                          break L4;
                        } else {
                          L5: {
                            if (var8 != 32) {
                              break L5;
                            } else {
                              var5_int = var5_int + param1;
                              break L5;
                            }
                          }
                          param3.field_c[var7] = (var5_int >> -365433432) + param3.field_c[0] + (param4.a(param0.substring(0, var7 + 1)) + -param4.a((char) var8));
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      param3.field_c[var7] = var6;
                      break L3;
                    }
                    L6: {
                      if (var8 != 62) {
                        break L6;
                      } else {
                        var6 = -1;
                        break L6;
                      }
                    }
                    var7++;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("dk.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
        hc discarded$10 = null;
        hc discarded$11 = null;
        hc discarded$12 = null;
        hc discarded$13 = null;
        hc discarded$14 = null;
        hc discarded$15 = null;
        db discarded$16 = null;
        mc discarded$17 = null;
        hc discarded$18 = null;
        hc discarded$19 = null;
        RuntimeException var3 = null;
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
        RuntimeException decompiledCaughtException = null;
        hc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        hc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        hc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_2_5 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
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
              discarded$10 = var4.a((byte) -102, 0).a(15658734, (byte) -3).a(-20433, vl.a(10066329, 7829367, 8947848, true));
              discarded$11 = var4.a((byte) -102, 1).a(-20433, vl.a(10066329, 13421772, 11184810, true));
              stackOut_1_0 = var4.a((byte) -102, 3);
              stackOut_1_1 = -20433;
              stackOut_1_2 = 7829367;
              stackOut_1_3 = 10066329;
              stackOut_1_4 = 8947848;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              if (param1) {
                stackOut_3_0 = (hc) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                break L1;
              } else {
                stackOut_2_0 = (hc) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                break L1;
              }
            }
            discarded$12 = ((hc) (Object) stackIn_4_0).a(stackIn_4_1, vl.a(stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5 != 0)).b(122, 1).a(1, 215650672);
            var5 = new le[9];
            var16 = new ae(32, 32);
            var18 = var16;
            var7_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var18.field_s.length <= var7_int) {
                    break L4;
                  } else {
                    var16.field_s[var7_int] = 1077952576;
                    var7_int++;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var5[4] = (le) ((Object) var16);
                discarded$13 = var4.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
                discarded$14 = var4.a((byte) -102, 5).a(-20433, jc.a(65793, 0, 64, 0, 0)).a((byte) -48, true).a(-1, (byte) -3);
                this.field_i = (ml) ((Object) var4);
                break L3;
              }
              var6 = new ak(var4, true);
              var6.field_l = 0;
              var7 = new ak(var4, true);
              var7.field_l = 0;
              var7.a(ck.a(8947848, -14377), 250);
              discarded$15 = var7.a((byte) -102, 1).a(-20433, ck.a(11184810, -14377)).a(2236962, (byte) -3);
              this.field_l = (ml) ((Object) new pb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
              discarded$16 = new db(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
              discarded$17 = new mc(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
              var8 = new ak();
              var17.a(param1, var8);
              discarded$18 = var8.a((byte) -102, 0).a(-20433, vl.a(7829367, 10066329, 15658734, true)).a(1118481, (byte) -3).a(true, -1);
              discarded$19 = var8.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
              this.field_o = (ml) ((Object) var8);
              var9 = new le[9];
              var9[4] = new le(2, 1);
              var10 = new le[9];
              var10[4] = new le(1, 2);
              var9[4].field_s = new int[]{6710886, 7829367};
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("dk.F(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, String param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("dk.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
