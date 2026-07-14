/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends aa {
    private int field_k;
    private int field_g;
    private String field_o;
    private boolean field_h;
    static le field_m;
    private int field_j;
    private int field_p;
    private int field_i;
    static int field_f;
    static vk field_r;
    static long field_e;
    static int[] field_l;
    static String field_q;
    private ta field_d;
    static char[] field_n;

    private final be a(ta param0, int param1, int param2, String param3) {
        int var6 = -30 / ((62 - param2) / 35);
        be var7 = new be(-param0.field_C + param1, param0.field_D + param1, param3.length());
        be var5 = var7;
        ((sb) this).field_c = new be[]{var7};
        return var5;
    }

    final static int a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == 79) {
          if ((param1 ^ -1) <= -4097) {
            L0: {
              if ((param1 ^ -1) > -6145) {
                stackOut_18_0 = -tj.field_b[param1 + -4096];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -tj.field_b[-param1 + 8192];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (2048 <= param1) {
                stackOut_14_0 = tj.field_b[-param1 + 4096];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = tj.field_b[param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          am discarded$1 = sb.a(-19, (String) null);
          if ((param1 ^ -1) <= -4097) {
            L2: {
              if ((param1 ^ -1) > -6145) {
                stackOut_8_0 = -tj.field_b[param1 + -4096];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -tj.field_b[-param1 + 8192];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (2048 <= param1) {
                stackOut_4_0 = tj.field_b[-param1 + 4096];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = tj.field_b[param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void a(byte param0, ta param1, String param2, int param3, int param4) {
        be var8 = null;
        be var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        be var15 = null;
        if (param2 == null) {
          ((sb) this).field_c = null;
          return;
        } else {
          if (param1 == ((sb) this).field_d) {
            if (((sb) this).field_h) {
              L0: {
                if (2 != ((sb) this).field_g) {
                  break L0;
                } else {
                  if (((sb) this).field_o == null) {
                    break L0;
                  } else {
                    if (!((sb) this).field_o.equals((Object) (Object) param2)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((sb) this).field_o = param2;
              ((sb) this).field_g = 2;
              ((sb) this).field_h = true;
              if (param0 != -82) {
                field_e = 20L;
                ((sb) this).field_d = param1;
                var8 = this.a(param1, param3, 106, param2);
                var14 = var8;
                var14.field_c[0] = -param1.a(param2) + param4;
                var14.field_c[param2.length()] = param4;
                dk.a(param2, 0, -25006, var14, param1);
                return;
              } else {
                ((sb) this).field_d = param1;
                var8 = this.a(param1, param3, 106, param2);
                var15 = var8;
                var15.field_c[0] = -param1.a(param2) + param4;
                var15.field_c[param2.length()] = param4;
                dk.a(param2, 0, -25006, var15, param1);
                return;
              }
            } else {
              ((sb) this).field_o = param2;
              ((sb) this).field_g = 2;
              ((sb) this).field_h = true;
              if (param0 != -82) {
                field_e = 20L;
                ((sb) this).field_d = param1;
                var8 = this.a(param1, param3, 106, param2);
                var12 = var8;
                var12.field_c[0] = -param1.a(param2) + param4;
                var12.field_c[param2.length()] = param4;
                dk.a(param2, 0, -25006, var12, param1);
                return;
              } else {
                ((sb) this).field_d = param1;
                var8 = this.a(param1, param3, 106, param2);
                var13 = var8;
                var13.field_c[0] = -param1.a(param2) + param4;
                var13.field_c[param2.length()] = param4;
                dk.a(param2, 0, -25006, var13, param1);
                return;
              }
            }
          } else {
            ((sb) this).field_o = param2;
            ((sb) this).field_g = 2;
            ((sb) this).field_h = true;
            if (param0 != -82) {
              field_e = 20L;
              ((sb) this).field_d = param1;
              var8 = this.a(param1, param3, 106, param2);
              var10 = var8;
              var10.field_c[0] = -param1.a(param2) + param4;
              var10.field_c[param2.length()] = param4;
              dk.a(param2, 0, -25006, var10, param1);
              return;
            } else {
              ((sb) this).field_d = param1;
              var8 = this.a(param1, param3, 106, param2);
              var11 = var8;
              var11.field_c[0] = -param1.a(param2) + param4;
              var11.field_c[param2.length()] = param4;
              dk.a(param2, 0, -25006, var11, param1);
              return;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (!param1) {
          b.field_j[1] = new int[5];
          if (param0 > 24) {
            return;
          } else {
            int discarded$4 = sb.a((byte) -119, -113);
            return;
          }
        } else {
          b.field_j[1] = new int[6];
          if (param0 > 24) {
            return;
          } else {
            int discarded$5 = sb.a((byte) -119, -113);
            return;
          }
        }
    }

    final void a(int param0, int param1, String param2, int param3, ta param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        String var18 = null;
        be var19 = null;
        String var20 = null;
        be var21 = null;
        String var28 = null;
        be var29 = null;
        String var34 = null;
        be var35 = null;
        String var36 = null;
        be var37 = null;
        String var38 = null;
        be var39 = null;
        be stackIn_33_0 = null;
        be stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        be stackIn_34_0 = null;
        be stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        be stackIn_35_0 = null;
        be stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        be stackIn_57_0 = null;
        be stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        be stackIn_58_0 = null;
        be stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        be stackIn_59_0 = null;
        be stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        String stackIn_61_0 = null;
        String stackIn_62_0 = null;
        String stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        be stackIn_73_0 = null;
        be stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        be stackIn_74_0 = null;
        be stackIn_74_1 = null;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        be stackIn_75_0 = null;
        be stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        String stackIn_77_0 = null;
        String stackIn_78_0 = null;
        String stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        be stackIn_87_0 = null;
        be stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        be stackIn_88_0 = null;
        be stackIn_88_1 = null;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        be stackIn_89_0 = null;
        be stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        int stackIn_89_4 = 0;
        String stackIn_91_0 = null;
        String stackIn_92_0 = null;
        String stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        be stackIn_99_0 = null;
        be stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        be stackIn_100_0 = null;
        be stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        be stackIn_101_0 = null;
        be stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        String stackIn_103_0 = null;
        String stackIn_104_0 = null;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        be stackIn_114_0 = null;
        be stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        be stackIn_115_0 = null;
        be stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        be stackIn_116_0 = null;
        be stackIn_116_1 = null;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        String stackIn_118_0 = null;
        String stackIn_119_0 = null;
        String stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        be stackOut_56_0 = null;
        be stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        be stackOut_58_0 = null;
        be stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        be stackOut_57_0 = null;
        be stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        String stackOut_60_0 = null;
        String stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        String stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        be stackOut_113_0 = null;
        be stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        be stackOut_115_0 = null;
        be stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        be stackOut_114_0 = null;
        be stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        String stackOut_117_0 = null;
        String stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        String stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        be stackOut_98_0 = null;
        be stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        be stackOut_100_0 = null;
        be stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        be stackOut_99_0 = null;
        be stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        String stackOut_102_0 = null;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        be stackOut_86_0 = null;
        be stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        be stackOut_88_0 = null;
        be stackOut_88_1 = null;
        int stackOut_88_2 = 0;
        int stackOut_88_3 = 0;
        int stackOut_88_4 = 0;
        be stackOut_87_0 = null;
        be stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        String stackOut_90_0 = null;
        String stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        String stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        be stackOut_72_0 = null;
        be stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        be stackOut_74_0 = null;
        be stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        be stackOut_73_0 = null;
        be stackOut_73_1 = null;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        int stackOut_73_4 = 0;
        String stackOut_76_0 = null;
        String stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        String stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        be stackOut_32_0 = null;
        be stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        be stackOut_34_0 = null;
        be stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        be stackOut_33_0 = null;
        be stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        String stackOut_36_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var15 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (0 != param1) {
            break L0;
          } else {
            param1 = param4.field_t;
            break L0;
          }
        }
        if (param2 == null) {
          ((sb) this).field_c = null;
          return;
        } else {
          L1: {
            if (param4 != ((sb) this).field_d) {
              break L1;
            } else {
              if (((sb) this).field_h) {
                break L1;
              } else {
                if (param7 != ((sb) this).field_g) {
                  break L1;
                } else {
                  if (((sb) this).field_p != param3) {
                    break L1;
                  } else {
                    if (((sb) this).field_j != param1) {
                      break L1;
                    } else {
                      if (param5 != ((sb) this).field_k) {
                        break L1;
                      } else {
                        if (param0 != ((sb) this).field_i) {
                          break L1;
                        } else {
                          if (((sb) this).field_o == null) {
                            break L1;
                          } else {
                            if (!((sb) this).field_o.equals((Object) (Object) param2)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((sb) this).field_d = param4;
          ((sb) this).field_o = param2;
          ((sb) this).field_g = param7;
          ((sb) this).field_k = param5;
          ((sb) this).field_i = param0;
          ((sb) this).field_p = param3;
          ((sb) this).field_j = param1;
          ((sb) this).field_h = false;
          var16 = new String[param4.a(param2, param0) - -1];
          var17 = var16;
          if (param6 == 4476) {
            L2: {
              var10 = Math.max(1, param4.a(param2, new int[1], var17));
              if (-4 != ((sb) this).field_p) {
                break L2;
              } else {
                if (-2 == var10) {
                  ((sb) this).field_p = 1;
                  break L2;
                } else {
                  L3: {
                    ((sb) this).field_c = new be[var10];
                    if (((sb) this).field_p != -1) {
                      if (-2 != ((sb) this).field_p) {
                        if (-3 == (((sb) this).field_p ^ -1)) {
                          var11 = ((sb) this).field_k - (param4.field_D - -(var10 * ((sb) this).field_j));
                          break L3;
                        } else {
                          L4: {
                            var12 = (-(var10 * ((sb) this).field_j) + ((sb) this).field_k) / (var10 - -1);
                            if ((var12 ^ -1) > -1) {
                              var12 = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((sb) this).field_j = ((sb) this).field_j + var12;
                          var11 = var12 + param4.field_C;
                          break L3;
                        }
                      } else {
                        var11 = param4.field_C + (-(var10 * ((sb) this).field_j) + ((sb) this).field_k >> 1138451105);
                        break L3;
                      }
                    } else {
                      var11 = param4.field_C;
                      break L3;
                    }
                  }
                  var12 = 0;
                  L5: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L6: {
                        var20 = var16[var12];
                        stackOut_56_0 = null;
                        stackOut_56_1 = null;
                        stackOut_56_2 = var11 + -param4.field_C;
                        stackOut_56_3 = var11 + param4.field_D;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        stackIn_58_2 = stackOut_56_2;
                        stackIn_58_3 = stackOut_56_3;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        if (var20 != null) {
                          stackOut_58_0 = null;
                          stackOut_58_1 = null;
                          stackOut_58_2 = stackIn_58_2;
                          stackOut_58_3 = stackIn_58_3;
                          stackOut_58_4 = var20.length();
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          stackIn_59_3 = stackOut_58_3;
                          stackIn_59_4 = stackOut_58_4;
                          break L6;
                        } else {
                          stackOut_57_0 = null;
                          stackOut_57_1 = null;
                          stackOut_57_2 = stackIn_57_2;
                          stackOut_57_3 = stackIn_57_3;
                          stackOut_57_4 = 0;
                          stackIn_59_0 = stackOut_57_0;
                          stackIn_59_1 = stackOut_57_1;
                          stackIn_59_2 = stackOut_57_2;
                          stackIn_59_3 = stackOut_57_3;
                          stackIn_59_4 = stackOut_57_4;
                          break L6;
                        }
                      }
                      L7: {
                        new be(stackIn_59_2, stackIn_59_3, stackIn_59_4);
                        var21 = stackIn_59_0;
                        var21.field_c[0] = 0;
                        if (var20 == null) {
                          break L7;
                        } else {
                          L8: {
                            var21.field_c[var20.length()] = param4.a(var20);
                            stackOut_60_0 = (String) var20;
                            stackIn_62_0 = stackOut_60_0;
                            stackIn_61_0 = stackOut_60_0;
                            if (3 != param7) {
                              stackOut_62_0 = (String) (Object) stackIn_62_0;
                              stackOut_62_1 = 0;
                              stackIn_63_0 = stackOut_62_0;
                              stackIn_63_1 = stackOut_62_1;
                              break L8;
                            } else {
                              stackOut_61_0 = (String) (Object) stackIn_61_0;
                              stackOut_61_1 = ((sb) this).a(param0, var20, param4.a(var20), (byte) -79);
                              stackIn_63_0 = stackOut_61_0;
                              stackIn_63_1 = stackOut_61_1;
                              break L8;
                            }
                          }
                          dk.a(stackIn_63_0, stackIn_63_1, -25006, var21, param4);
                          break L7;
                        }
                      }
                      var11 = var11 + param1;
                      ((sb) this).field_c[var12] = var21;
                      var12++;
                      continue L5;
                    }
                  }
                }
              }
            }
            ((sb) this).field_c = new be[var10];
            if (((sb) this).field_p != 0) {
              if (-2 != (((sb) this).field_p ^ -1)) {
                if (-3 != (((sb) this).field_p ^ -1)) {
                  L9: {
                    var12 = (-(var10 * ((sb) this).field_j) + ((sb) this).field_k) / (var10 - -1);
                    if ((var12 ^ -1) > -1) {
                      var12 = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((sb) this).field_j = ((sb) this).field_j + var12;
                  var11 = var12 + param4.field_C;
                  var12 = 0;
                  L10: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L11: {
                        var36 = var16[var12];
                        stackOut_113_0 = null;
                        stackOut_113_1 = null;
                        stackOut_113_2 = var11 + -param4.field_C;
                        stackOut_113_3 = var11 + param4.field_D;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        stackIn_115_3 = stackOut_113_3;
                        stackIn_114_0 = stackOut_113_0;
                        stackIn_114_1 = stackOut_113_1;
                        stackIn_114_2 = stackOut_113_2;
                        stackIn_114_3 = stackOut_113_3;
                        if (var36 != null) {
                          stackOut_115_0 = null;
                          stackOut_115_1 = null;
                          stackOut_115_2 = stackIn_115_2;
                          stackOut_115_3 = stackIn_115_3;
                          stackOut_115_4 = var36.length();
                          stackIn_116_0 = stackOut_115_0;
                          stackIn_116_1 = stackOut_115_1;
                          stackIn_116_2 = stackOut_115_2;
                          stackIn_116_3 = stackOut_115_3;
                          stackIn_116_4 = stackOut_115_4;
                          break L11;
                        } else {
                          stackOut_114_0 = null;
                          stackOut_114_1 = null;
                          stackOut_114_2 = stackIn_114_2;
                          stackOut_114_3 = stackIn_114_3;
                          stackOut_114_4 = 0;
                          stackIn_116_0 = stackOut_114_0;
                          stackIn_116_1 = stackOut_114_1;
                          stackIn_116_2 = stackOut_114_2;
                          stackIn_116_3 = stackOut_114_3;
                          stackIn_116_4 = stackOut_114_4;
                          break L11;
                        }
                      }
                      L12: {
                        new be(stackIn_116_2, stackIn_116_3, stackIn_116_4);
                        var37 = stackIn_116_0;
                        var37.field_c[0] = 0;
                        if (var36 == null) {
                          break L12;
                        } else {
                          L13: {
                            var37.field_c[var36.length()] = param4.a(var36);
                            stackOut_117_0 = (String) var36;
                            stackIn_119_0 = stackOut_117_0;
                            stackIn_118_0 = stackOut_117_0;
                            if (3 != param7) {
                              stackOut_119_0 = (String) (Object) stackIn_119_0;
                              stackOut_119_1 = 0;
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              break L13;
                            } else {
                              stackOut_118_0 = (String) (Object) stackIn_118_0;
                              stackOut_118_1 = ((sb) this).a(param0, var36, param4.a(var36), (byte) -79);
                              stackIn_120_0 = stackOut_118_0;
                              stackIn_120_1 = stackOut_118_1;
                              break L13;
                            }
                          }
                          dk.a(stackIn_120_0, stackIn_120_1, -25006, var37, param4);
                          break L12;
                        }
                      }
                      var11 = var11 + param1;
                      ((sb) this).field_c[var12] = var37;
                      var12++;
                      continue L10;
                    }
                  }
                } else {
                  var11 = ((sb) this).field_k - (param4.field_D - -(var10 * ((sb) this).field_j));
                  var12 = 0;
                  L14: while (true) {
                    if (var10 <= var12) {
                      return;
                    } else {
                      L15: {
                        var38 = var16[var12];
                        stackOut_98_0 = null;
                        stackOut_98_1 = null;
                        stackOut_98_2 = var11 + -param4.field_C;
                        stackOut_98_3 = var11 + param4.field_D;
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        stackIn_100_2 = stackOut_98_2;
                        stackIn_100_3 = stackOut_98_3;
                        stackIn_99_0 = stackOut_98_0;
                        stackIn_99_1 = stackOut_98_1;
                        stackIn_99_2 = stackOut_98_2;
                        stackIn_99_3 = stackOut_98_3;
                        if (var38 != null) {
                          stackOut_100_0 = null;
                          stackOut_100_1 = null;
                          stackOut_100_2 = stackIn_100_2;
                          stackOut_100_3 = stackIn_100_3;
                          stackOut_100_4 = var38.length();
                          stackIn_101_0 = stackOut_100_0;
                          stackIn_101_1 = stackOut_100_1;
                          stackIn_101_2 = stackOut_100_2;
                          stackIn_101_3 = stackOut_100_3;
                          stackIn_101_4 = stackOut_100_4;
                          break L15;
                        } else {
                          stackOut_99_0 = null;
                          stackOut_99_1 = null;
                          stackOut_99_2 = stackIn_99_2;
                          stackOut_99_3 = stackIn_99_3;
                          stackOut_99_4 = 0;
                          stackIn_101_0 = stackOut_99_0;
                          stackIn_101_1 = stackOut_99_1;
                          stackIn_101_2 = stackOut_99_2;
                          stackIn_101_3 = stackOut_99_3;
                          stackIn_101_4 = stackOut_99_4;
                          break L15;
                        }
                      }
                      L16: {
                        new be(stackIn_101_2, stackIn_101_3, stackIn_101_4);
                        var39 = stackIn_101_0;
                        var39.field_c[0] = 0;
                        if (var38 == null) {
                          break L16;
                        } else {
                          L17: {
                            var39.field_c[var38.length()] = param4.a(var38);
                            stackOut_102_0 = (String) var38;
                            stackIn_104_0 = stackOut_102_0;
                            stackIn_103_0 = stackOut_102_0;
                            if (3 != param7) {
                              stackOut_104_0 = (String) (Object) stackIn_104_0;
                              stackOut_104_1 = 0;
                              stackIn_105_0 = stackOut_104_0;
                              stackIn_105_1 = stackOut_104_1;
                              break L17;
                            } else {
                              stackOut_103_0 = (String) (Object) stackIn_103_0;
                              stackOut_103_1 = ((sb) this).a(param0, var38, param4.a(var38), (byte) -79);
                              stackIn_105_0 = stackOut_103_0;
                              stackIn_105_1 = stackOut_103_1;
                              break L17;
                            }
                          }
                          dk.a(stackIn_105_0, stackIn_105_1, -25006, var39, param4);
                          break L16;
                        }
                      }
                      var11 = var11 + param1;
                      ((sb) this).field_c[var12] = var39;
                      var12++;
                      continue L14;
                    }
                  }
                }
              } else {
                var11 = param4.field_C + (-(var10 * ((sb) this).field_j) + ((sb) this).field_k >> 1138451105);
                var12 = 0;
                L18: while (true) {
                  if (var10 > var12) {
                    L19: {
                      var34 = var16[var12];
                      stackOut_86_0 = null;
                      stackOut_86_1 = null;
                      stackOut_86_2 = var11 + -param4.field_C;
                      stackOut_86_3 = var11 + param4.field_D;
                      stackIn_88_0 = stackOut_86_0;
                      stackIn_88_1 = stackOut_86_1;
                      stackIn_88_2 = stackOut_86_2;
                      stackIn_88_3 = stackOut_86_3;
                      stackIn_87_0 = stackOut_86_0;
                      stackIn_87_1 = stackOut_86_1;
                      stackIn_87_2 = stackOut_86_2;
                      stackIn_87_3 = stackOut_86_3;
                      if (var34 != null) {
                        stackOut_88_0 = null;
                        stackOut_88_1 = null;
                        stackOut_88_2 = stackIn_88_2;
                        stackOut_88_3 = stackIn_88_3;
                        stackOut_88_4 = var34.length();
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        stackIn_89_2 = stackOut_88_2;
                        stackIn_89_3 = stackOut_88_3;
                        stackIn_89_4 = stackOut_88_4;
                        break L19;
                      } else {
                        stackOut_87_0 = null;
                        stackOut_87_1 = null;
                        stackOut_87_2 = stackIn_87_2;
                        stackOut_87_3 = stackIn_87_3;
                        stackOut_87_4 = 0;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_89_1 = stackOut_87_1;
                        stackIn_89_2 = stackOut_87_2;
                        stackIn_89_3 = stackOut_87_3;
                        stackIn_89_4 = stackOut_87_4;
                        break L19;
                      }
                    }
                    L20: {
                      new be(stackIn_89_2, stackIn_89_3, stackIn_89_4);
                      var35 = stackIn_89_0;
                      var35.field_c[0] = 0;
                      if (var34 == null) {
                        break L20;
                      } else {
                        L21: {
                          var35.field_c[var34.length()] = param4.a(var34);
                          stackOut_90_0 = (String) var34;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_91_0 = stackOut_90_0;
                          if (3 != param7) {
                            stackOut_92_0 = (String) (Object) stackIn_92_0;
                            stackOut_92_1 = 0;
                            stackIn_93_0 = stackOut_92_0;
                            stackIn_93_1 = stackOut_92_1;
                            break L21;
                          } else {
                            stackOut_91_0 = (String) (Object) stackIn_91_0;
                            stackOut_91_1 = ((sb) this).a(param0, var34, param4.a(var34), (byte) -79);
                            stackIn_93_0 = stackOut_91_0;
                            stackIn_93_1 = stackOut_91_1;
                            break L21;
                          }
                        }
                        dk.a(stackIn_93_0, stackIn_93_1, -25006, var35, param4);
                        break L20;
                      }
                    }
                    var11 = var11 + param1;
                    ((sb) this).field_c[var12] = var35;
                    var12++;
                    continue L18;
                  } else {
                    return;
                  }
                }
              }
            } else {
              var11 = param4.field_C;
              var12 = 0;
              L22: while (true) {
                if (var10 > var12) {
                  L23: {
                    var28 = var16[var12];
                    stackOut_72_0 = null;
                    stackOut_72_1 = null;
                    stackOut_72_2 = var11 + -param4.field_C;
                    stackOut_72_3 = var11 + param4.field_D;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    stackIn_73_2 = stackOut_72_2;
                    stackIn_73_3 = stackOut_72_3;
                    if (var28 != null) {
                      stackOut_74_0 = null;
                      stackOut_74_1 = null;
                      stackOut_74_2 = stackIn_74_2;
                      stackOut_74_3 = stackIn_74_3;
                      stackOut_74_4 = var28.length();
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      stackIn_75_2 = stackOut_74_2;
                      stackIn_75_3 = stackOut_74_3;
                      stackIn_75_4 = stackOut_74_4;
                      break L23;
                    } else {
                      stackOut_73_0 = null;
                      stackOut_73_1 = null;
                      stackOut_73_2 = stackIn_73_2;
                      stackOut_73_3 = stackIn_73_3;
                      stackOut_73_4 = 0;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      stackIn_75_3 = stackOut_73_3;
                      stackIn_75_4 = stackOut_73_4;
                      break L23;
                    }
                  }
                  L24: {
                    new be(stackIn_75_2, stackIn_75_3, stackIn_75_4);
                    var29 = stackIn_75_0;
                    var29.field_c[0] = 0;
                    if (var28 == null) {
                      break L24;
                    } else {
                      L25: {
                        var29.field_c[var28.length()] = param4.a(var28);
                        stackOut_76_0 = (String) var28;
                        stackIn_78_0 = stackOut_76_0;
                        stackIn_77_0 = stackOut_76_0;
                        if (3 != param7) {
                          stackOut_78_0 = (String) (Object) stackIn_78_0;
                          stackOut_78_1 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          break L25;
                        } else {
                          stackOut_77_0 = (String) (Object) stackIn_77_0;
                          stackOut_77_1 = ((sb) this).a(param0, var28, param4.a(var28), (byte) -79);
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_79_1 = stackOut_77_1;
                          break L25;
                        }
                      }
                      dk.a(stackIn_79_0, stackIn_79_1, -25006, var29, param4);
                      break L24;
                    }
                  }
                  var11 = var11 + param1;
                  ((sb) this).field_c[var12] = var29;
                  var12++;
                  continue L22;
                } else {
                  return;
                }
              }
            }
          } else {
            L26: {
              ((sb) this).a((String) null, 49, 18, (ta) null, 83);
              var10 = Math.max(1, param4.a(param2, new int[1], var17));
              if (-4 != ((sb) this).field_p) {
                break L26;
              } else {
                if (-2 == var10) {
                  ((sb) this).field_p = 1;
                  break L26;
                } else {
                  break L26;
                }
              }
            }
            L27: {
              ((sb) this).field_c = new be[var10];
              if (((sb) this).field_p != -1) {
                if (-2 != ((sb) this).field_p) {
                  if (-3 == (((sb) this).field_p ^ -1)) {
                    var11 = ((sb) this).field_k - (param4.field_D - -(var10 * ((sb) this).field_j));
                    break L27;
                  } else {
                    L28: {
                      var12 = (-(var10 * ((sb) this).field_j) + ((sb) this).field_k) / (var10 - -1);
                      if ((var12 ^ -1) > -1) {
                        var12 = 0;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((sb) this).field_j = ((sb) this).field_j + var12;
                    var11 = var12 + param4.field_C;
                    break L27;
                  }
                } else {
                  var11 = param4.field_C + (-(var10 * ((sb) this).field_j) + ((sb) this).field_k >> 1138451105);
                  break L27;
                }
              } else {
                var11 = param4.field_C;
                break L27;
              }
            }
            var12 = 0;
            L29: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L30: {
                  var18 = var16[var12];
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = var11 + -param4.field_C;
                  stackOut_32_3 = var11 + param4.field_D;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  if (var18 != null) {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = var18.length();
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    stackIn_35_4 = stackOut_34_4;
                    break L30;
                  } else {
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = 0;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    break L30;
                  }
                }
                L31: {
                  new be(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                  var19 = stackIn_35_0;
                  var19.field_c[0] = 0;
                  if (var18 == null) {
                    break L31;
                  } else {
                    L32: {
                      var19.field_c[var18.length()] = param4.a(var18);
                      stackOut_36_0 = (String) var18;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (3 != param7) {
                        stackOut_38_0 = (String) (Object) stackIn_38_0;
                        stackOut_38_1 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        break L32;
                      } else {
                        stackOut_37_0 = (String) (Object) stackIn_37_0;
                        stackOut_37_1 = ((sb) this).a(param0, var18, param4.a(var18), (byte) -79);
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        break L32;
                      }
                    }
                    dk.a(stackIn_39_0, stackIn_39_1, -25006, var19, param4);
                    break L31;
                  }
                }
                var11 = var11 + param1;
                ((sb) this).field_c[var12] = var19;
                var12++;
                continue L29;
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2, ta param3, int param4) {
        int var7 = 0;
        be var9 = null;
        be var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        if (param0 != null) {
          if (((sb) this).field_d == param3) {
            if (((sb) this).field_h) {
              L0: {
                if (-2 != (((sb) this).field_g ^ -1)) {
                  break L0;
                } else {
                  if (((sb) this).field_o == null) {
                    break L0;
                  } else {
                    if (!((sb) this).field_o.equals((Object) (Object) param0)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((sb) this).field_g = 1;
              ((sb) this).field_h = true;
              if (param2 != -2713) {
                be discarded$3 = this.a((ta) null, 24, -22, (String) null);
                ((sb) this).field_d = param3;
                var13 = this.a(param3, param4, 124, param0);
                var7 = param3.a(param0);
                var13.field_c[0] = -(var7 >> 564245249) + param1;
                var13.field_c[param0.length()] = param1 + (var7 >> -2005445311);
                dk.a(param0, 0, -25006, var13, param3);
                return;
              } else {
                ((sb) this).field_d = param3;
                var14 = this.a(param3, param4, 124, param0);
                var7 = param3.a(param0);
                var14.field_c[0] = -(var7 >> 564245249) + param1;
                var14.field_c[param0.length()] = param1 + (var7 >> -2005445311);
                dk.a(param0, 0, -25006, var14, param3);
                return;
              }
            } else {
              ((sb) this).field_g = 1;
              ((sb) this).field_h = true;
              if (param2 != -2713) {
                be discarded$4 = this.a((ta) null, 24, -22, (String) null);
                ((sb) this).field_d = param3;
                var11 = this.a(param3, param4, 124, param0);
                var7 = param3.a(param0);
                var11.field_c[0] = -(var7 >> 564245249) + param1;
                var11.field_c[param0.length()] = param1 + (var7 >> -2005445311);
                dk.a(param0, 0, -25006, var11, param3);
                return;
              } else {
                ((sb) this).field_d = param3;
                var12 = this.a(param3, param4, 124, param0);
                var7 = param3.a(param0);
                var12.field_c[0] = -(var7 >> 564245249) + param1;
                var12.field_c[param0.length()] = param1 + (var7 >> -2005445311);
                dk.a(param0, 0, -25006, var12, param3);
                return;
              }
            }
          } else {
            ((sb) this).field_g = 1;
            ((sb) this).field_h = true;
            if (param2 != -2713) {
              be discarded$5 = this.a((ta) null, 24, -22, (String) null);
              ((sb) this).field_d = param3;
              var9 = this.a(param3, param4, 124, param0);
              var7 = param3.a(param0);
              var9.field_c[0] = -(var7 >> 564245249) + param1;
              var9.field_c[param0.length()] = param1 + (var7 >> -2005445311);
              dk.a(param0, 0, -25006, var9, param3);
              return;
            } else {
              ((sb) this).field_d = param3;
              var10 = this.a(param3, param4, 124, param0);
              var7 = param3.a(param0);
              var10.field_c[0] = -(var7 >> 564245249) + param1;
              var10.field_c[param0.length()] = param1 + (var7 >> -2005445311);
              dk.a(param0, 0, -25006, var10, param3);
              return;
            }
          }
        } else {
          ((sb) this).field_c = null;
          return;
        }
    }

    final void a(String param0, int param1, int param2, ta param3, byte param4) {
        be var9 = null;
        be var10 = null;
        be var11 = null;
        be var12 = null;
        be var13 = null;
        be var14 = null;
        if (param0 != null) {
          if (param3 == ((sb) this).field_d) {
            if (((sb) this).field_h) {
              L0: {
                if (((sb) this).field_g != 0) {
                  break L0;
                } else {
                  if (((sb) this).field_o == null) {
                    break L0;
                  } else {
                    if (!((sb) this).field_o.equals((Object) (Object) param0)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((sb) this).field_g = 0;
              ((sb) this).field_d = param3;
              ((sb) this).field_o = param0;
              ((sb) this).field_h = true;
              var13 = this.a(param3, param1, -45, param0);
              var14 = var13;
              var13.field_c[0] = param2;
              var14.field_c[param0.length()] = param3.a(param0) + param2;
              if (param4 > 66) {
                dk.a(param0, 0, -25006, var14, param3);
                return;
              } else {
                ((sb) this).field_h = false;
                dk.a(param0, 0, -25006, var14, param3);
                return;
              }
            } else {
              ((sb) this).field_g = 0;
              ((sb) this).field_d = param3;
              ((sb) this).field_o = param0;
              ((sb) this).field_h = true;
              var11 = this.a(param3, param1, -45, param0);
              var12 = var11;
              var11.field_c[0] = param2;
              var12.field_c[param0.length()] = param3.a(param0) + param2;
              if (param4 > 66) {
                dk.a(param0, 0, -25006, var12, param3);
                return;
              } else {
                ((sb) this).field_h = false;
                dk.a(param0, 0, -25006, var12, param3);
                return;
              }
            }
          } else {
            ((sb) this).field_g = 0;
            ((sb) this).field_d = param3;
            ((sb) this).field_o = param0;
            ((sb) this).field_h = true;
            var9 = this.a(param3, param1, -45, param0);
            var10 = var9;
            var9.field_c[0] = param2;
            var10.field_c[param0.length()] = param3.a(param0) + param2;
            if (param4 > 66) {
              dk.a(param0, 0, -25006, var10, param3);
              return;
            } else {
              ((sb) this).field_h = false;
              dk.a(param0, 0, -25006, var10, param3);
              return;
            }
          }
        } else {
          ((sb) this).field_c = null;
          return;
        }
    }

    final static am a(int param0, String param1) {
        int var2 = 0;
        String var3 = null;
        String var4 = null;
        am var5 = null;
        if (param1 != null) {
          if (0 != param1.length()) {
            var2 = param1.indexOf('@');
            if (0 != (var2 ^ -1)) {
              var3 = param1.substring(0, var2);
              var4 = param1.substring(1 + var2);
              var5 = dd.a(var3, false);
              if (var5 == null) {
                if (param0 != 28079) {
                  field_f = 55;
                  return ne.a(var4, (byte) -98);
                } else {
                  return ne.a(var4, (byte) -98);
                }
              } else {
                return var5;
              }
            } else {
              return si.field_s;
            }
          } else {
            return qb.field_a;
          }
        } else {
          return qb.field_a;
        }
    }

    public static void d(int param0) {
        if (param0 != 12817) {
            return;
        }
        field_q = null;
        field_r = null;
        field_l = null;
        field_m = null;
        field_n = null;
    }

    final static void b(int param0, int param1, int param2) {
        L0: {
          if (null == nc.field_b) {
            nc.field_b = new int[2 * param2];
            break L0;
          } else {
            if (param2 > nc.field_b.length) {
              nc.field_b = new int[2 * param2];
              if (gi.field_e != null) {
                if (gi.field_e.length < param2) {
                  L1: {
                    gi.field_e = new int[param2 * 2];
                    if (param0 == 2) {
                      break L1;
                    } else {
                      am discarded$4 = sb.a(-117, (String) null);
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      if (jc.field_a == null) {
                        break L3;
                      } else {
                        if (jc.field_a.length < param2) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    jc.field_a = new int[param2 * 2];
                    break L2;
                  }
                  L4: {
                    L5: {
                      if (null == hf.field_c) {
                        break L5;
                      } else {
                        if (param2 > hf.field_c.length) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    hf.field_c = new int[2 * param2];
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (null == rb.field_fb) {
                        break L7;
                      } else {
                        if (param2 > rb.field_fb.length) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    rb.field_fb = new int[param2 * 2];
                    break L6;
                  }
                  L8: {
                    L9: {
                      if (cj.field_c == null) {
                        break L9;
                      } else {
                        if (param2 <= cj.field_c.length) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    cj.field_c = new int[param2 * 2];
                    break L8;
                  }
                  L10: {
                    L11: {
                      if (hl.field_f == null) {
                        break L11;
                      } else {
                        if (hl.field_f.length >= param1 + param2) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    hl.field_f = new int[(param2 - -param1) * 2];
                    break L10;
                  }
                  L12: {
                    L13: {
                      if (null == gb.field_h) {
                        break L13;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L12;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                } else {
                  L14: {
                    if (param0 == 2) {
                      break L14;
                    } else {
                      am discarded$5 = sb.a(-117, (String) null);
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      if (jc.field_a == null) {
                        break L16;
                      } else {
                        if (jc.field_a.length < param2) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    jc.field_a = new int[param2 * 2];
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (null == hf.field_c) {
                        break L18;
                      } else {
                        if (param2 > hf.field_c.length) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                    hf.field_c = new int[2 * param2];
                    break L17;
                  }
                  L19: {
                    L20: {
                      if (null == rb.field_fb) {
                        break L20;
                      } else {
                        if (param2 > rb.field_fb.length) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    rb.field_fb = new int[param2 * 2];
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (cj.field_c == null) {
                        break L22;
                      } else {
                        if (param2 <= cj.field_c.length) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    cj.field_c = new int[param2 * 2];
                    break L21;
                  }
                  L23: {
                    L24: {
                      if (hl.field_f == null) {
                        break L24;
                      } else {
                        if (hl.field_f.length >= param1 + param2) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    hl.field_f = new int[(param2 - -param1) * 2];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (null == gb.field_h) {
                        break L26;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L26;
                        } else {
                          break L25;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L25;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                }
              } else {
                L27: {
                  gi.field_e = new int[param2 * 2];
                  if (param0 == 2) {
                    break L27;
                  } else {
                    am discarded$6 = sb.a(-117, (String) null);
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    if (jc.field_a == null) {
                      break L29;
                    } else {
                      if (jc.field_a.length < param2) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  jc.field_a = new int[param2 * 2];
                  break L28;
                }
                L30: {
                  L31: {
                    if (null == hf.field_c) {
                      break L31;
                    } else {
                      if (param2 > hf.field_c.length) {
                        break L31;
                      } else {
                        break L30;
                      }
                    }
                  }
                  hf.field_c = new int[2 * param2];
                  break L30;
                }
                L32: {
                  L33: {
                    if (null == rb.field_fb) {
                      break L33;
                    } else {
                      if (param2 > rb.field_fb.length) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  rb.field_fb = new int[param2 * 2];
                  break L32;
                }
                L34: {
                  L35: {
                    if (cj.field_c == null) {
                      break L35;
                    } else {
                      if (param2 <= cj.field_c.length) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  cj.field_c = new int[param2 * 2];
                  break L34;
                }
                L36: {
                  L37: {
                    if (hl.field_f == null) {
                      break L37;
                    } else {
                      if (hl.field_f.length >= param1 + param2) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  hl.field_f = new int[(param2 - -param1) * 2];
                  break L36;
                }
                L38: {
                  L39: {
                    if (null == gb.field_h) {
                      break L39;
                    } else {
                      if (gb.field_h.length < param2) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  gb.field_h = new boolean[param2 * 2];
                  break L38;
                }
                rh.field_C = 2147483647;
                kj.field_G = -2147483648;
                fe.field_g = -2147483648;
                ah.field_j = 2147483647;
                fd.field_n = 0;
                return;
              }
            } else {
              break L0;
            }
          }
        }
        L40: {
          L41: {
            if (gi.field_e == null) {
              break L41;
            } else {
              if (gi.field_e.length < param2) {
                break L41;
              } else {
                break L40;
              }
            }
          }
          gi.field_e = new int[param2 * 2];
          break L40;
        }
        L42: {
          if (param0 == 2) {
            break L42;
          } else {
            am discarded$7 = sb.a(-117, (String) null);
            break L42;
          }
        }
        L43: {
          L44: {
            if (jc.field_a == null) {
              break L44;
            } else {
              if (jc.field_a.length < param2) {
                break L44;
              } else {
                break L43;
              }
            }
          }
          jc.field_a = new int[param2 * 2];
          break L43;
        }
        L45: {
          L46: {
            if (null == hf.field_c) {
              break L46;
            } else {
              if (param2 > hf.field_c.length) {
                break L46;
              } else {
                break L45;
              }
            }
          }
          hf.field_c = new int[2 * param2];
          break L45;
        }
        L47: {
          L48: {
            if (null == rb.field_fb) {
              break L48;
            } else {
              if (param2 > rb.field_fb.length) {
                break L48;
              } else {
                break L47;
              }
            }
          }
          rb.field_fb = new int[param2 * 2];
          break L47;
        }
        L49: {
          L50: {
            if (cj.field_c == null) {
              break L50;
            } else {
              if (param2 <= cj.field_c.length) {
                break L49;
              } else {
                break L50;
              }
            }
          }
          cj.field_c = new int[param2 * 2];
          break L49;
        }
        if (hl.field_f != null) {
          if (hl.field_f.length < param1 + param2) {
            L51: {
              L52: {
                hl.field_f = new int[(param2 - -param1) * 2];
                if (null == gb.field_h) {
                  break L52;
                } else {
                  if (gb.field_h.length < param2) {
                    break L52;
                  } else {
                    break L51;
                  }
                }
              }
              gb.field_h = new boolean[param2 * 2];
              break L51;
            }
            rh.field_C = 2147483647;
            kj.field_G = -2147483648;
            fe.field_g = -2147483648;
            ah.field_j = 2147483647;
            fd.field_n = 0;
            return;
          } else {
            L53: {
              L54: {
                if (null == gb.field_h) {
                  break L54;
                } else {
                  if (gb.field_h.length < param2) {
                    break L54;
                  } else {
                    break L53;
                  }
                }
              }
              gb.field_h = new boolean[param2 * 2];
              break L53;
            }
            rh.field_C = 2147483647;
            kj.field_G = -2147483648;
            fe.field_g = -2147483648;
            ah.field_j = 2147483647;
            fd.field_n = 0;
            return;
          }
        } else {
          L55: {
            L56: {
              hl.field_f = new int[(param2 - -param1) * 2];
              if (null == gb.field_h) {
                break L56;
              } else {
                if (gb.field_h.length < param2) {
                  break L56;
                } else {
                  break L55;
                }
              }
            }
            gb.field_h = new boolean[param2 * 2];
            break L55;
          }
          rh.field_C = 2147483647;
          kj.field_G = -2147483648;
          fe.field_g = -2147483648;
          ah.field_j = 2147483647;
          fd.field_n = 0;
          return;
        }
    }

    public sb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new le(480, 480);
        field_f = -1;
        field_l = new int[8192];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_n = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
