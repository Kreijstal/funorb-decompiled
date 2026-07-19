/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends cj {
    static String field_Fb;
    static int field_Gb;
    static ja[][] field_Hb;
    private cj field_Ib;
    static String field_Kb;
    static ri field_Jb;

    final static void c(byte param0) {
        String var2 = null;
        int var1 = -7 % ((-1 - param0) / 63);
        if (null != sb.field_k) {
            var2 = sb.field_k;
            cf.a((byte) -61, vl.a(lp.field_h, new String[]{var2}, 2));
            sb.field_k = null;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        boolean stackIn_26_0 = false;
        String stackIn_34_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        boolean stackOut_25_0 = false;
        String stackOut_33_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_39_0 = null;
        String stackOut_21_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = bg.field_q;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 <= (var3_int ^ -1)) {
                    L2: {
                      var4 = tg.a(param2, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (eb.a((byte) -104, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (eb.a((byte) -119, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param1 < -11) {
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      L6: {
                                        if (var6 >= param2.length()) {
                                          break L6;
                                        } else {
                                          var7 = param2.charAt(var6);
                                          stackOut_25_0 = eb.a((byte) 94, (char) var7);
                                          stackIn_37_0 = stackOut_25_0 ? 1 : 0;
                                          stackIn_26_0 = stackOut_25_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              if (!stackIn_26_0) {
                                                var5 = 0;
                                                if (var8 == 0) {
                                                  break L7;
                                                } else {
                                                  var5++;
                                                  break L7;
                                                }
                                              } else {
                                                var5++;
                                                break L7;
                                              }
                                            }
                                            L8: {
                                              if (2 > var5) {
                                                break L8;
                                              } else {
                                                if (!param0) {
                                                  stackOut_33_0 = hn.field_a;
                                                  stackIn_34_0 = stackOut_33_0;
                                                  decompiledRegionSelector0 = 5;
                                                  break L0;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_36_0 = 0;
                                      stackIn_37_0 = stackOut_36_0;
                                      break L5;
                                    }
                                    if (stackIn_37_0 < var5) {
                                      stackOut_39_0 = th.field_a;
                                      stackIn_40_0 = stackOut_39_0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  }
                                } else {
                                  stackOut_21_0 = (String) null;
                                  stackIn_22_0 = stackOut_21_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackOut_18_0 = th.field_a;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackOut_13_0 = bg.field_q;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = bg.field_q;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var3);
            stackOut_42_1 = new StringBuilder().append("no.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0;
                  } else {
                    return stackIn_40_0;
                  }
                }
              }
            }
          }
        }
    }

    final static bm a(byte param0, byte[] param1) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        bm stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        bm stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            incrementValue$12 = var2_int;
            var2_int++;
            var3 = re.a(param1, incrementValue$12, (byte) 86);
            incrementValue$13 = var2_int;
            var2_int++;
            var4 = re.a(param1, incrementValue$13, (byte) 99);
            incrementValue$14 = var2_int;
            var2_int++;
            var5 = re.a(param1, incrementValue$14, (byte) 113);
            var23 = new int[4];
            var19 = var23;
            var6 = var19;
            var24 = new int[4];
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-5 >= (var8 ^ -1)) {
                    break L3;
                  } else {
                    incrementValue$15 = var2_int;
                    var2_int++;
                    var6[var8] = re.a(param1, incrementValue$15, (byte) 56);
                    incrementValue$16 = var2_int;
                    var2_int++;
                    var7[var8] = re.a(param1, incrementValue$16, (byte) 88);
                    var8++;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                incrementValue$17 = var2_int;
                var2_int++;
                var8 = re.a(param1, incrementValue$17, (byte) 75);
                break L2;
              }
              incrementValue$18 = var2_int;
              var2_int++;
              var9 = re.a(param1, incrementValue$18, (byte) 112);
              incrementValue$19 = var2_int;
              var2_int++;
              var10 = re.a(param1, incrementValue$19, (byte) 113);
              incrementValue$20 = var2_int;
              var2_int++;
              var11 = re.a(param1, incrementValue$20, (byte) 67);
              var26 = new int[var11][var10];
              var13 = 0;
              L4: while (true) {
                L5: {
                  if (var13 >= var11) {
                    incrementValue$21 = var2_int;
                    var2_int++;
                    var13 = re.a(param1, incrementValue$21, (byte) 59);
                    stackOut_17_0 = var13 * 4;
                    stackIn_18_0 = stackOut_17_0;
                    break L5;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_18_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var16 != 0) {
                      break L5;
                    } else {
                      var14_int = stackIn_10_0;
                      L6: while (true) {
                        L7: {
                          if (var14_int >= var10) {
                            var13++;
                            break L7;
                          } else {
                            incrementValue$22 = var2_int;
                            var2_int++;
                            var26[var13][var14_int] = re.a(param1, incrementValue$22, (byte) 71);
                            var14_int++;
                            if (var16 != 0) {
                              break L7;
                            } else {
                              continue L6;
                            }
                          }
                        }
                        continue L4;
                      }
                    }
                  }
                }
                var22 = new int[stackIn_18_0];
                var18 = var22;
                var14 = var18;
                var15 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var15 >= 4 * var13) {
                        break L10;
                      } else {
                        incrementValue$23 = var2_int;
                        var2_int++;
                        var14[var15] = re.a(param1, incrementValue$23, (byte) 62);
                        var15++;
                        if (var16 != 0) {
                          break L9;
                        } else {
                          if (var16 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (param0 == 104) {
                      break L9;
                    } else {
                      field_Hb = (ja[][]) null;
                      break L9;
                    }
                  }
                  stackOut_25_0 = new bm(var26, var22, var3, var4, var5, var23, var24, var8, var9);
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var2);
            stackOut_27_1 = new StringBuilder().append("no.CA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_26_0;
    }

    public static void h(int param0) {
        String discarded$2 = null;
        CharSequence var2 = null;
        field_Fb = null;
        field_Jb = null;
        if (param0 != 15) {
          var2 = (CharSequence) null;
          discarded$2 = no.a(false, -117, (CharSequence) null);
          field_Hb = (ja[][]) null;
          field_Kb = null;
          return;
        } else {
          field_Hb = (ja[][]) null;
          field_Kb = null;
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == 0) {
          this.a(param0 ^ -11838, true);
          if (kd.field_b == 0) {
            if (-1 != (this.field_Ib.field_T ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (this.field_T != 0) {
              L0: {
                if (-1 == (this.field_Ib.field_T ^ -1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    no(cj param0, cj param1, cj param2, cj param3, cj param4, cj param5) {
        RuntimeException var7 = null;
        cj var8 = null;
        cj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var13 = null;
        cj var14 = null;
        int var15 = 0;
        int var16 = 0;
        cj var17 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var17 = new cj(0L, param1, le.field_I.toUpperCase());
            var17.field_R = 1;
            this.field_Ib = new cj(0L, param2);
            var8 = new cj(0L, param3);
            var9 = new cj(0L, param3, qa.field_j);
            var9.field_R = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (lj.field_h.length <= var12) {
                    break L3;
                  } else {
                    var13 = new cj(0L, param3, cm.field_c[var12]);
                    var14 = new cj(0L, param3, lj.field_h[var12]);
                    var15 = param3.field_yb.a(lj.field_h[var12]);
                    var13.a(15, var10, 65, 20, -3344);
                    stackOut_3_0 = var11;
                    stackOut_3_1 = var15;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_8_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= stackIn_4_1) {
                          break L4;
                        } else {
                          var11 = var15;
                          break L4;
                        }
                      }
                      var14.a(15, var10, 640, 90, -3344);
                      var8.a((byte) 50, var13);
                      var8.a((byte) 50, var14);
                      var10 += 30;
                      var12++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10 += 15;
                var17.a(24, 0, 20 + var11 - -90, 0, -3344);
                this.a(var10 + var17.field_z, 100, var17.field_zb, 100, -3344);
                this.field_Ib.a(15, 5, 15, -20 + var17.field_zb, -3344);
                var8.a(this.field_z - var17.field_z, var17.field_z, this.field_zb, 0, -3344);
                var9.a(15, 20, this.field_zb, 0, -3344);
                var8.field_ab = tg.a(2105376, var8.field_z, 8421504, 3, 11579568, 102);
                var17.a((byte) 50, this.field_Ib);
                var8.a((byte) 50, var9);
                this.a((byte) 50, var17);
                this.a((byte) 50, var8);
                stackOut_7_0 = -(this.field_z >> -617126399);
                stackOut_7_1 = 240;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              }
              var10 = stackIn_8_0 + stackIn_8_1;
              this.field_x = 320 + -(this.field_zb >> -1388909887);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var7);
            stackOut_10_1 = new StringBuilder().append("no.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_Fb = "Left-click or press 'ESC' to skip cutscene";
        field_Hb = new ja[2][];
        field_Kb = "Make them tremble and shake.";
    }
}
