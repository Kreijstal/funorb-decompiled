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
        be var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        be var7 = null;
        be stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        be stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var6 = -30 / ((62 - param2) / 35);
            var7 = new be(-param0.field_C + param1, param0.field_D + param1, param3.length());
            var5 = var7;
            ((sb) this).field_c = new be[]{var7};
            stackOut_0_0 = (be) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("sb.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          L0: {
            if (param1 < 6144) {
              stackOut_7_0 = -tj.field_b[param1 + -4096];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -tj.field_b[-param1 + 8192];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (2048 <= param1) {
              stackOut_3_0 = tj.field_b[-param1 + 4096];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = tj.field_b[param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final void a(byte param0, ta param1, String param2, int param3, int param4) {
        be var8 = null;
        be var9 = null;
        if (!(param2 != null)) {
            ((sb) this).field_c = null;
            return;
        }
        if (param1 == ((sb) this).field_d) {
            if (((sb) this).field_h) {
                if (2 == ((sb) this).field_g) {
                    if (((sb) this).field_o != null) {
                        if (((sb) this).field_o.equals((Object) (Object) param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((sb) this).field_o = param2;
            ((sb) this).field_g = 2;
            ((sb) this).field_h = true;
            if (param0 != -82) {
                field_e = 20L;
            }
            ((sb) this).field_d = param1;
            var8 = this.a(param1, param3, 106, param2);
            var9 = var8;
            var9.field_c[0] = -param1.a(param2) + param4;
            var9.field_c[param2.length()] = param4;
            dk.a(param2, 0, -25006, var9, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param1) {
          b.field_j[1] = new int[6];
          return;
        } else {
          b.field_j[1] = new int[5];
          return;
        }
    }

    final void a(int param0, int param1, String param2, int param3, ta param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        be var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        be stackIn_37_0 = null;
        be stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        be stackIn_38_0 = null;
        be stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        be stackIn_39_0 = null;
        be stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        String stackIn_41_0 = null;
        String stackIn_42_0 = null;
        String stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        be stackOut_36_0 = null;
        be stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        be stackOut_38_0 = null;
        be stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        be stackOut_37_0 = null;
        be stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        String stackOut_40_0 = null;
        String stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        String stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param1) {
                break L1;
              } else {
                param1 = param4.field_t;
                break L1;
              }
            }
            if (param2 == null) {
              ((sb) this).field_c = null;
              return;
            } else {
              L2: {
                if (param4 != ((sb) this).field_d) {
                  break L2;
                } else {
                  if (((sb) this).field_h) {
                    break L2;
                  } else {
                    if (param7 != ((sb) this).field_g) {
                      break L2;
                    } else {
                      if (((sb) this).field_p != param3) {
                        break L2;
                      } else {
                        if (~((sb) this).field_j != ~param1) {
                          break L2;
                        } else {
                          if (param5 != ((sb) this).field_k) {
                            break L2;
                          } else {
                            if (param0 != ((sb) this).field_i) {
                              break L2;
                            } else {
                              if (((sb) this).field_o == null) {
                                break L2;
                              } else {
                                if (!((sb) this).field_o.equals((Object) (Object) param2)) {
                                  break L2;
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
              L3: {
                ((sb) this).field_d = param4;
                ((sb) this).field_o = param2;
                ((sb) this).field_g = param7;
                ((sb) this).field_k = param5;
                ((sb) this).field_i = param0;
                ((sb) this).field_p = param3;
                ((sb) this).field_j = param1;
                ((sb) this).field_h = false;
                var17 = new String[param4.a(param2, param0) - -1];
                var18 = var17;
                if (param6 == 4476) {
                  break L3;
                } else {
                  var16 = null;
                  ((sb) this).a((String) null, 49, 18, (ta) null, 83);
                  break L3;
                }
              }
              L4: {
                var10 = Math.max(1, param4.a(param2, new int[1], var18));
                if (((sb) this).field_p != 3) {
                  break L4;
                } else {
                  if (var10 == 1) {
                    ((sb) this).field_p = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                ((sb) this).field_c = new be[var10];
                if (((sb) this).field_p != 0) {
                  if (((sb) this).field_p != 1) {
                    if (((sb) this).field_p == 2) {
                      var11 = ((sb) this).field_k - (param4.field_D - -(var10 * ((sb) this).field_j));
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(var10 * ((sb) this).field_j) + ((sb) this).field_k) / (var10 - -1);
                        if (var12 < 0) {
                          var12 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((sb) this).field_j = ((sb) this).field_j + var12;
                      var11 = var12 + param4.field_C;
                      break L5;
                    }
                  } else {
                    var11 = param4.field_C + (-(var10 * ((sb) this).field_j) + ((sb) this).field_k >> 1);
                    break L5;
                  }
                } else {
                  var11 = param4.field_C;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var10 <= var12) {
                  break L0;
                } else {
                  L8: {
                    var13 = var17[var12];
                    stackOut_36_0 = null;
                    stackOut_36_1 = null;
                    stackOut_36_2 = var11 + -param4.field_C;
                    stackOut_36_3 = var11 + param4.field_D;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_38_2 = stackOut_36_2;
                    stackIn_38_3 = stackOut_36_3;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    stackIn_37_3 = stackOut_36_3;
                    if (var13 != null) {
                      stackOut_38_0 = null;
                      stackOut_38_1 = null;
                      stackOut_38_2 = stackIn_38_2;
                      stackOut_38_3 = stackIn_38_3;
                      stackOut_38_4 = var13.length();
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      stackIn_39_4 = stackOut_38_4;
                      break L8;
                    } else {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = 0;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      stackIn_39_3 = stackOut_37_3;
                      stackIn_39_4 = stackOut_37_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new be(stackIn_39_2, stackIn_39_3, stackIn_39_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_c[var13.length()] = param4.a(var13);
                        stackOut_40_0 = (String) var13;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (3 != param7) {
                          stackOut_42_0 = (String) (Object) stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L10;
                        } else {
                          stackOut_41_0 = (String) (Object) stackIn_41_0;
                          stackOut_41_1 = ((sb) this).a(param0, var13, param4.a(var13), (byte) -79);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L10;
                        }
                      }
                      dk.a(stackIn_43_0, stackIn_43_1, -25006, var14, param4);
                      break L9;
                    }
                  }
                  var11 = var11 + param1;
                  ((sb) this).field_c[var12] = var14;
                  var12++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var9;
            stackOut_46_1 = new StringBuilder().append("sb.S(").append(param0).append(',').append(param1).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          L12: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param3).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L12;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L12;
            }
          }
          throw la.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(String param0, int param1, int param2, ta param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        be var9 = null;
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
        try {
          L0: {
            if (param0 != null) {
              L1: {
                if (((sb) this).field_d != param3) {
                  break L1;
                } else {
                  if (!((sb) this).field_h) {
                    break L1;
                  } else {
                    if (((sb) this).field_g != 1) {
                      break L1;
                    } else {
                      if (((sb) this).field_o == null) {
                        break L1;
                      } else {
                        if (!((sb) this).field_o.equals((Object) (Object) param0)) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                ((sb) this).field_g = 1;
                ((sb) this).field_h = true;
                if (param2 == -2713) {
                  break L2;
                } else {
                  var8 = null;
                  be discarded$1 = this.a((ta) null, 24, -22, (String) null);
                  break L2;
                }
              }
              ((sb) this).field_d = param3;
              var9 = this.a(param3, param4, 124, param0);
              var7 = param3.a(param0);
              var9.field_c[0] = -(var7 >> 1) + param1;
              var9.field_c[param0.length()] = param1 + (var7 >> 1);
              dk.a(param0, 0, -25006, var9, param3);
              break L0;
            } else {
              ((sb) this).field_c = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("sb.Q(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2, ta param3, byte param4) {
        be var7 = null;
        be var8 = null;
        if (param0 == null) {
            ((sb) this).field_c = null;
            return;
        }
        if (param3 == ((sb) this).field_d) {
            if (((sb) this).field_h) {
                if (((sb) this).field_g == 0) {
                    if (((sb) this).field_o != null) {
                        if (((sb) this).field_o.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((sb) this).field_g = 0;
            ((sb) this).field_d = param3;
            ((sb) this).field_o = param0;
            ((sb) this).field_h = true;
            var7 = this.a(param3, param1, -45, param0);
            var8 = var7;
            var7.field_c[0] = param2;
            var8.field_c[param0.length()] = param3.a(param0) + param2;
            if (param4 <= 66) {
                ((sb) this).field_h = false;
            }
            dk.a(param0, 0, -25006, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sb.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static am a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        am var5 = null;
        am stackIn_4_0 = null;
        am stackIn_7_0 = null;
        am stackIn_10_0 = null;
        am stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_11_0 = null;
        am stackOut_9_0 = null;
        am stackOut_6_0 = null;
        am stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (var2_int != -1) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = dd.a(var3, false);
                    if (var5 == null) {
                      stackOut_11_0 = ne.a(var4, (byte) -98);
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_9_0 = (am) var5;
                      stackIn_10_0 = stackOut_9_0;
                      return stackIn_10_0;
                    }
                  } else {
                    stackOut_6_0 = si.field_s;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = qb.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("sb.N(").append(28079).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    public static void d(int param0) {
        field_q = null;
        field_r = null;
        field_l = null;
        field_m = null;
        field_n = null;
    }

    final static void b(int param0, int param1, int param2) {
        if (null == nc.field_b) {
          nc.field_b = new int[2 * param2];
          if (gi.field_e != null) {
            if (gi.field_e.length < param2) {
              L0: {
                L1: {
                  gi.field_e = new int[param2 * 2];
                  if (jc.field_a == null) {
                    break L1;
                  } else {
                    if (jc.field_a.length < param2) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                jc.field_a = new int[param2 * 2];
                break L0;
              }
              L2: {
                L3: {
                  if (null == hf.field_c) {
                    break L3;
                  } else {
                    if (param2 > hf.field_c.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                hf.field_c = new int[2 * param2];
                break L2;
              }
              L4: {
                L5: {
                  if (null == rb.field_fb) {
                    break L5;
                  } else {
                    if (param2 > rb.field_fb.length) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                rb.field_fb = new int[param2 * 2];
                break L4;
              }
              L6: {
                L7: {
                  if (cj.field_c == null) {
                    break L7;
                  } else {
                    if (param2 <= cj.field_c.length) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                cj.field_c = new int[param2 * 2];
                break L6;
              }
              L8: {
                L9: {
                  if (hl.field_f == null) {
                    break L9;
                  } else {
                    if (hl.field_f.length >= param1 + param2) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                hl.field_f = new int[(param2 - -param1) * 2];
                break L8;
              }
              L10: {
                L11: {
                  if (null == gb.field_h) {
                    break L11;
                  } else {
                    if (gb.field_h.length < param2) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                gb.field_h = new boolean[param2 * 2];
                break L10;
              }
              rh.field_C = 2147483647;
              kj.field_G = -2147483648;
              fe.field_g = -2147483648;
              ah.field_j = 2147483647;
              fd.field_n = 0;
              return;
            } else {
              L12: {
                L13: {
                  if (jc.field_a == null) {
                    break L13;
                  } else {
                    if (jc.field_a.length < param2) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                jc.field_a = new int[param2 * 2];
                break L12;
              }
              L14: {
                L15: {
                  if (null == hf.field_c) {
                    break L15;
                  } else {
                    if (param2 > hf.field_c.length) {
                      break L15;
                    } else {
                      break L14;
                    }
                  }
                }
                hf.field_c = new int[2 * param2];
                break L14;
              }
              L16: {
                L17: {
                  if (null == rb.field_fb) {
                    break L17;
                  } else {
                    if (param2 > rb.field_fb.length) {
                      break L17;
                    } else {
                      break L16;
                    }
                  }
                }
                rb.field_fb = new int[param2 * 2];
                break L16;
              }
              L18: {
                L19: {
                  if (cj.field_c == null) {
                    break L19;
                  } else {
                    if (param2 <= cj.field_c.length) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                cj.field_c = new int[param2 * 2];
                break L18;
              }
              L20: {
                L21: {
                  if (hl.field_f == null) {
                    break L21;
                  } else {
                    if (hl.field_f.length >= param1 + param2) {
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                hl.field_f = new int[(param2 - -param1) * 2];
                break L20;
              }
              L22: {
                L23: {
                  if (null == gb.field_h) {
                    break L23;
                  } else {
                    if (gb.field_h.length < param2) {
                      break L23;
                    } else {
                      break L22;
                    }
                  }
                }
                gb.field_h = new boolean[param2 * 2];
                break L22;
              }
              rh.field_C = 2147483647;
              kj.field_G = -2147483648;
              fe.field_g = -2147483648;
              ah.field_j = 2147483647;
              fd.field_n = 0;
              return;
            }
          } else {
            L24: {
              L25: {
                gi.field_e = new int[param2 * 2];
                if (jc.field_a == null) {
                  break L25;
                } else {
                  if (jc.field_a.length < param2) {
                    break L25;
                  } else {
                    break L24;
                  }
                }
              }
              jc.field_a = new int[param2 * 2];
              break L24;
            }
            L26: {
              L27: {
                if (null == hf.field_c) {
                  break L27;
                } else {
                  if (param2 > hf.field_c.length) {
                    break L27;
                  } else {
                    break L26;
                  }
                }
              }
              hf.field_c = new int[2 * param2];
              break L26;
            }
            L28: {
              L29: {
                if (null == rb.field_fb) {
                  break L29;
                } else {
                  if (param2 > rb.field_fb.length) {
                    break L29;
                  } else {
                    break L28;
                  }
                }
              }
              rb.field_fb = new int[param2 * 2];
              break L28;
            }
            L30: {
              L31: {
                if (cj.field_c == null) {
                  break L31;
                } else {
                  if (param2 <= cj.field_c.length) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
              cj.field_c = new int[param2 * 2];
              break L30;
            }
            L32: {
              L33: {
                if (hl.field_f == null) {
                  break L33;
                } else {
                  if (hl.field_f.length >= param1 + param2) {
                    break L32;
                  } else {
                    break L33;
                  }
                }
              }
              hl.field_f = new int[(param2 - -param1) * 2];
              break L32;
            }
            L34: {
              L35: {
                if (null == gb.field_h) {
                  break L35;
                } else {
                  if (gb.field_h.length < param2) {
                    break L35;
                  } else {
                    break L34;
                  }
                }
              }
              gb.field_h = new boolean[param2 * 2];
              break L34;
            }
            rh.field_C = 2147483647;
            kj.field_G = -2147483648;
            fe.field_g = -2147483648;
            ah.field_j = 2147483647;
            fd.field_n = 0;
            return;
          }
        } else {
          if (param2 > nc.field_b.length) {
            L36: {
              L37: {
                nc.field_b = new int[2 * param2];
                if (gi.field_e == null) {
                  break L37;
                } else {
                  if (gi.field_e.length < param2) {
                    break L37;
                  } else {
                    break L36;
                  }
                }
              }
              gi.field_e = new int[param2 * 2];
              break L36;
            }
            L38: {
              L39: {
                if (jc.field_a == null) {
                  break L39;
                } else {
                  if (jc.field_a.length < param2) {
                    break L39;
                  } else {
                    break L38;
                  }
                }
              }
              jc.field_a = new int[param2 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (null == hf.field_c) {
                  break L41;
                } else {
                  if (param2 > hf.field_c.length) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              hf.field_c = new int[2 * param2];
              break L40;
            }
            L42: {
              L43: {
                if (null == rb.field_fb) {
                  break L43;
                } else {
                  if (param2 > rb.field_fb.length) {
                    break L43;
                  } else {
                    break L42;
                  }
                }
              }
              rb.field_fb = new int[param2 * 2];
              break L42;
            }
            L44: {
              L45: {
                if (cj.field_c == null) {
                  break L45;
                } else {
                  if (param2 <= cj.field_c.length) {
                    break L44;
                  } else {
                    break L45;
                  }
                }
              }
              cj.field_c = new int[param2 * 2];
              break L44;
            }
            if (hl.field_f != null) {
              if (hl.field_f.length < param1 + param2) {
                L46: {
                  L47: {
                    hl.field_f = new int[(param2 - -param1) * 2];
                    if (null == gb.field_h) {
                      break L47;
                    } else {
                      if (gb.field_h.length < param2) {
                        break L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                  gb.field_h = new boolean[param2 * 2];
                  break L46;
                }
                rh.field_C = 2147483647;
                kj.field_G = -2147483648;
                fe.field_g = -2147483648;
                ah.field_j = 2147483647;
                fd.field_n = 0;
                return;
              } else {
                L48: {
                  L49: {
                    if (null == gb.field_h) {
                      break L49;
                    } else {
                      if (gb.field_h.length < param2) {
                        break L49;
                      } else {
                        break L48;
                      }
                    }
                  }
                  gb.field_h = new boolean[param2 * 2];
                  break L48;
                }
                rh.field_C = 2147483647;
                kj.field_G = -2147483648;
                fe.field_g = -2147483648;
                ah.field_j = 2147483647;
                fd.field_n = 0;
                return;
              }
            } else {
              L50: {
                L51: {
                  hl.field_f = new int[(param2 - -param1) * 2];
                  if (null == gb.field_h) {
                    break L51;
                  } else {
                    if (gb.field_h.length < param2) {
                      break L51;
                    } else {
                      break L50;
                    }
                  }
                }
                gb.field_h = new boolean[param2 * 2];
                break L50;
              }
              rh.field_C = 2147483647;
              kj.field_G = -2147483648;
              fe.field_g = -2147483648;
              ah.field_j = 2147483647;
              fd.field_n = 0;
              return;
            }
          } else {
            L52: {
              L53: {
                if (gi.field_e == null) {
                  break L53;
                } else {
                  if (gi.field_e.length < param2) {
                    break L53;
                  } else {
                    break L52;
                  }
                }
              }
              gi.field_e = new int[param2 * 2];
              break L52;
            }
            L54: {
              L55: {
                if (jc.field_a == null) {
                  break L55;
                } else {
                  if (jc.field_a.length < param2) {
                    break L55;
                  } else {
                    break L54;
                  }
                }
              }
              jc.field_a = new int[param2 * 2];
              break L54;
            }
            L56: {
              L57: {
                if (null == hf.field_c) {
                  break L57;
                } else {
                  if (param2 > hf.field_c.length) {
                    break L57;
                  } else {
                    break L56;
                  }
                }
              }
              hf.field_c = new int[2 * param2];
              break L56;
            }
            L58: {
              L59: {
                if (null == rb.field_fb) {
                  break L59;
                } else {
                  if (param2 > rb.field_fb.length) {
                    break L59;
                  } else {
                    break L58;
                  }
                }
              }
              rb.field_fb = new int[param2 * 2];
              break L58;
            }
            if (cj.field_c == null) {
              cj.field_c = new int[param2 * 2];
              if (hl.field_f != null) {
                if (hl.field_f.length < param1 + param2) {
                  L60: {
                    L61: {
                      hl.field_f = new int[(param2 - -param1) * 2];
                      if (null == gb.field_h) {
                        break L61;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L60;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                } else {
                  L62: {
                    L63: {
                      if (null == gb.field_h) {
                        break L63;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L62;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                }
              } else {
                L64: {
                  L65: {
                    hl.field_f = new int[(param2 - -param1) * 2];
                    if (null == gb.field_h) {
                      break L65;
                    } else {
                      if (gb.field_h.length < param2) {
                        break L65;
                      } else {
                        break L64;
                      }
                    }
                  }
                  gb.field_h = new boolean[param2 * 2];
                  break L64;
                }
                rh.field_C = 2147483647;
                kj.field_G = -2147483648;
                fe.field_g = -2147483648;
                ah.field_j = 2147483647;
                fd.field_n = 0;
                return;
              }
            } else {
              if (param2 <= cj.field_c.length) {
                if (hl.field_f != null) {
                  if (hl.field_f.length >= param1 + param2) {
                    L66: {
                      L67: {
                        if (null == gb.field_h) {
                          break L67;
                        } else {
                          if (gb.field_h.length < param2) {
                            break L67;
                          } else {
                            break L66;
                          }
                        }
                      }
                      gb.field_h = new boolean[param2 * 2];
                      break L66;
                    }
                    rh.field_C = 2147483647;
                    kj.field_G = -2147483648;
                    fe.field_g = -2147483648;
                    ah.field_j = 2147483647;
                    fd.field_n = 0;
                    return;
                  } else {
                    L68: {
                      L69: {
                        hl.field_f = new int[(param2 - -param1) * 2];
                        if (null == gb.field_h) {
                          break L69;
                        } else {
                          if (gb.field_h.length < param2) {
                            break L69;
                          } else {
                            break L68;
                          }
                        }
                      }
                      gb.field_h = new boolean[param2 * 2];
                      break L68;
                    }
                    rh.field_C = 2147483647;
                    kj.field_G = -2147483648;
                    fe.field_g = -2147483648;
                    ah.field_j = 2147483647;
                    fd.field_n = 0;
                    return;
                  }
                } else {
                  L70: {
                    L71: {
                      hl.field_f = new int[(param2 - -param1) * 2];
                      if (null == gb.field_h) {
                        break L71;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L71;
                        } else {
                          break L70;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L70;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                }
              } else {
                cj.field_c = new int[param2 * 2];
                if (hl.field_f != null) {
                  if (hl.field_f.length < param1 + param2) {
                    L72: {
                      L73: {
                        hl.field_f = new int[(param2 - -param1) * 2];
                        if (null == gb.field_h) {
                          break L73;
                        } else {
                          if (gb.field_h.length < param2) {
                            break L73;
                          } else {
                            break L72;
                          }
                        }
                      }
                      gb.field_h = new boolean[param2 * 2];
                      break L72;
                    }
                    rh.field_C = 2147483647;
                    kj.field_G = -2147483648;
                    fe.field_g = -2147483648;
                    ah.field_j = 2147483647;
                    fd.field_n = 0;
                    return;
                  } else {
                    L74: {
                      L75: {
                        if (null == gb.field_h) {
                          break L75;
                        } else {
                          if (gb.field_h.length < param2) {
                            break L75;
                          } else {
                            break L74;
                          }
                        }
                      }
                      gb.field_h = new boolean[param2 * 2];
                      break L74;
                    }
                    rh.field_C = 2147483647;
                    kj.field_G = -2147483648;
                    fe.field_g = -2147483648;
                    ah.field_j = 2147483647;
                    fd.field_n = 0;
                    return;
                  }
                } else {
                  L76: {
                    L77: {
                      hl.field_f = new int[(param2 - -param1) * 2];
                      if (null == gb.field_h) {
                        break L77;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L77;
                        } else {
                          break L76;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L76;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                }
              }
            }
          }
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
        field_n = new char[]{'€', ' ', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', ' ', 'Ž', ' ', ' ', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', ' ', 'ž', 'Ÿ'};
    }
}
