/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends lg {
    static int[][] field_m;
    static int field_j;
    static ka field_q;
    static int field_t;
    static int field_g;
    private int field_r;
    private int field_o;
    private boolean field_s;
    static int[] field_h;
    private String field_i;
    private int field_l;
    private eg field_p;
    private int field_k;
    private int field_n;

    final void a(eg param0, String param1, int param2, byte param3, int param4) {
        qi var8 = null;
        qi var9 = null;
        if (!(param1 != null)) {
            ((fa) this).field_a = null;
            return;
        }
        if (param0 == ((fa) this).field_p) {
            if (((fa) this).field_s) {
                if (((fa) this).field_n == 2) {
                    if (null != ((fa) this).field_i) {
                        if (((fa) this).field_i.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((fa) this).field_p = param0;
        ((fa) this).field_i = param1;
        if (param3 != -9) {
            return;
        }
        try {
            ((fa) this).field_n = 2;
            ((fa) this).field_s = true;
            var8 = this.a(param3 ^ -1063303658, param1, param4, param0);
            var9 = var8;
            var9.field_g[0] = param2 - param0.a(param1);
            var9.field_g[param1.length()] = param2;
            ua.a(0, (byte) -113, param0, param1, var9);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "fa.Q(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final qi a(int param0, String param1, int param2, eg param3) {
        qi var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        qi var7 = null;
        qi stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              var7 = new qi(-param3.field_x + param2, param3.field_K + param2, param1.length());
              var5 = var7;
              if (param0 == 1063303649) {
                break L1;
              } else {
                var6 = null;
                qi discarded$2 = this.a(-1, (String) null, 18, (eg) null);
                break L1;
              }
            }
            ((fa) this).field_a = new qi[]{var7};
            stackOut_2_0 = (qi) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("fa.R(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, String param3, eg param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        qi var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        qi stackIn_34_0 = null;
        qi stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        qi stackIn_35_0 = null;
        qi stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        qi stackIn_36_0 = null;
        qi stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        qi stackOut_33_0 = null;
        qi stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        qi stackOut_35_0 = null;
        qi stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        qi stackOut_34_0 = null;
        qi stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (~param1 == param6) {
                param1 = param4.field_G;
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 != null) {
              L2: {
                if (param4 != ((fa) this).field_p) {
                  break L2;
                } else {
                  if (((fa) this).field_s) {
                    break L2;
                  } else {
                    if (param2 != ((fa) this).field_n) {
                      break L2;
                    } else {
                      if (((fa) this).field_l != param7) {
                        break L2;
                      } else {
                        if (param1 != ((fa) this).field_k) {
                          break L2;
                        } else {
                          if (param5 != ((fa) this).field_r) {
                            break L2;
                          } else {
                            if (param0 != ((fa) this).field_o) {
                              break L2;
                            } else {
                              if (((fa) this).field_i == null) {
                                break L2;
                              } else {
                                if (!((fa) this).field_i.equals((Object) (Object) param3)) {
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
                ((fa) this).field_k = param1;
                ((fa) this).field_s = false;
                ((fa) this).field_r = param5;
                ((fa) this).field_o = param0;
                ((fa) this).field_i = param3;
                ((fa) this).field_n = param2;
                ((fa) this).field_p = param4;
                ((fa) this).field_l = param7;
                var16 = new String[param4.a(param3, param0) + 1];
                var17 = var16;
                var10 = Math.max(1, param4.a(param3, new int[1], var17));
                if (((fa) this).field_l != 3) {
                  break L3;
                } else {
                  if (var10 == 1) {
                    ((fa) this).field_l = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != ((fa) this).field_l) {
                  if (1 != ((fa) this).field_l) {
                    if (((fa) this).field_l != 2) {
                      L5: {
                        var12 = (-(((fa) this).field_k * var10) + ((fa) this).field_r) / (1 + var10);
                        if (0 <= var12) {
                          break L5;
                        } else {
                          var12 = 0;
                          break L5;
                        }
                      }
                      var11 = var12 + param4.field_x;
                      ((fa) this).field_k = ((fa) this).field_k + var12;
                      break L4;
                    } else {
                      var11 = -param4.field_K + ((fa) this).field_r + -(((fa) this).field_k * var10);
                      break L4;
                    }
                  } else {
                    var11 = param4.field_x + (-(((fa) this).field_k * var10) + ((fa) this).field_r >> 1);
                    break L4;
                  }
                } else {
                  var11 = param4.field_x;
                  break L4;
                }
              }
              ((fa) this).field_a = new qi[var10];
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = -param4.field_x + var11;
                    stackOut_33_3 = param4.field_K + var11;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    if (var13 != null) {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = var13.length();
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      stackIn_36_4 = stackOut_35_4;
                      break L7;
                    } else {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = 0;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new qi(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_g[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_g[var13.length()] = param4.a(var13);
                        if (3 != param2) {
                          stackOut_40_0 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          break L9;
                        } else {
                          stackOut_39_0 = ((fa) this).a(var13, param0, (byte) 19, param4.a(var13));
                          stackIn_41_0 = stackOut_39_0;
                          break L9;
                        }
                      }
                      ua.a(stackIn_41_0, (byte) -113, param4, var13, var14);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((fa) this).field_a[var12] = var14;
                  var11 = var11 + param1;
                  var12++;
                  continue L6;
                }
              }
            } else {
              ((fa) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var9;
            stackOut_44_1 = new StringBuilder().append("fa.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param4 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void b(eg param0, String param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        qi var8 = null;
        qi var9 = null;
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
            if (param1 == null) {
              ((fa) this).field_a = null;
              return;
            } else {
              L1: {
                if (param0 != ((fa) this).field_p) {
                  break L1;
                } else {
                  if (!((fa) this).field_s) {
                    break L1;
                  } else {
                    if (((fa) this).field_n != 0) {
                      break L1;
                    } else {
                      if (((fa) this).field_i == null) {
                        break L1;
                      } else {
                        if (((fa) this).field_i.equals((Object) (Object) param1)) {
                          return;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                ((fa) this).field_i = param1;
                ((fa) this).field_n = 0;
                ((fa) this).field_s = true;
                ((fa) this).field_p = param0;
                var8 = this.a(1063303649, param1, param2, param0);
                var9 = var8;
                var8.field_g[0] = param4;
                var9.field_g[param1.length()] = param0.a(param1) + param4;
                ua.a(0, (byte) -113, param0, param1, var9);
                if (param3 <= -62) {
                  break L2;
                } else {
                  var7 = null;
                  qi discarded$2 = this.a(107, (String) null, -69, (eg) null);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("fa.P(");
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(int param0) {
        field_q = null;
        field_h = null;
        if (param0 != -3) {
            fa.b(-61);
        }
        field_m = null;
    }

    final void a(eg param0, String param1, int param2, int param3, int param4) {
        qi var8 = null;
        int var7 = 0;
        if (param3 != -25602) {
            return;
        }
        if (!(param1 != null)) {
            ((fa) this).field_a = null;
            return;
        }
        if (((fa) this).field_p == param0) {
            if (((fa) this).field_s) {
                if (((fa) this).field_n == 1) {
                    if (null != ((fa) this).field_i) {
                        if (((fa) this).field_i.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            ((fa) this).field_p = param0;
            ((fa) this).field_n = 1;
            ((fa) this).field_s = true;
            var8 = this.a(1063303649, param1, param4, param0);
            var7 = param0.a(param1);
            var8.field_g[0] = param2 - (var7 >> 1);
            var8.field_g[param1.length()] = param2 + (var7 >> 1);
            ua.a(0, (byte) -113, param0, param1, var8);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "fa.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public fa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[][]{new int[1], new int[1], new int[1], new int[1], new int[1]};
        field_h = new int[8192];
        field_t = -1;
    }
}
