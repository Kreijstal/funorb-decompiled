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
            this.field_c = new be[]{var7};
            stackOut_0_0 = (be) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("sb.P(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(byte param0, int param1) {
        am discarded$1 = null;
        String var3 = null;
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
          var3 = (String) null;
          discarded$1 = sb.a(-19, (String) null);
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
        be var9 = null;
        if (!(param2 != null)) {
            this.field_c = null;
            return;
        }
        if (param1 == this.field_d) {
            if (this.field_h) {
                if (2 == this.field_g) {
                    if (this.field_o != null) {
                        if (this.field_o.equals(param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_o = param2;
            this.field_g = 2;
            this.field_h = true;
            if (param0 != -82) {
                field_e = 20L;
            }
            this.field_d = param1;
            var8 = this.a(param1, param3, 106, param2);
            var9 = var8;
            var9.field_c[0] = -param1.a(param2) + param4;
            var9.field_c[param2.length()] = param4;
            dk.a(param2, 0, -25006, var9, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sb.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (!param1) {
          b.field_j[1] = new int[]{1, 11, 12, 3, 6};
          if (param0 > 24) {
            return;
          } else {
            discarded$3 = sb.a((byte) -119, -113);
            return;
          }
        } else {
          b.field_j[1] = new int[]{1, 11, 12, 4, 3, 6};
          if (!MonkeyPuzzle2.field_F) {
            if (param0 <= 24) {
              discarded$4 = sb.a((byte) -119, -113);
              return;
            } else {
              return;
            }
          } else {
            b.field_j[1] = new int[]{1, 11, 12, 3, 6};
            if (param0 > 24) {
              return;
            } else {
              discarded$5 = sb.a((byte) -119, -113);
              return;
            }
          }
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
        ta var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        be stackIn_39_0 = null;
        be stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        be stackIn_40_0 = null;
        be stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        be stackIn_41_0 = null;
        be stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        String stackIn_43_0 = null;
        String stackIn_44_0 = null;
        String stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        be stackOut_38_0 = null;
        be stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        be stackOut_40_0 = null;
        be stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        be stackOut_39_0 = null;
        be stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        String stackOut_42_0 = null;
        String stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        String stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
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
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param4 != this.field_d) {
                  break L2;
                } else {
                  if (this.field_h) {
                    break L2;
                  } else {
                    if (param7 != this.field_g) {
                      break L2;
                    } else {
                      if (this.field_p != param3) {
                        break L2;
                      } else {
                        if (this.field_j != param1) {
                          break L2;
                        } else {
                          if (param5 != this.field_k) {
                            break L2;
                          } else {
                            if (param0 != this.field_i) {
                              break L2;
                            } else {
                              if (this.field_o == null) {
                                break L2;
                              } else {
                                if (!this.field_o.equals(param2)) {
                                  break L2;
                                } else {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
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
                this.field_d = param4;
                this.field_o = param2;
                this.field_g = param7;
                this.field_k = param5;
                this.field_i = param0;
                this.field_p = param3;
                this.field_j = param1;
                this.field_h = false;
                var17 = new String[param4.a(param2, param0) - -1];
                var18 = var17;
                if (param6 == 4476) {
                  break L3;
                } else {
                  var16 = (ta) null;
                  this.a((String) null, 49, 18, (ta) null, 83);
                  break L3;
                }
              }
              L4: {
                var10 = Math.max(1, param4.a(param2, new int[]{param0}, var18));
                if (-4 != (this.field_p ^ -1)) {
                  break L4;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_p = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  this.field_c = new be[var10];
                  if (this.field_p != 0) {
                    break L6;
                  } else {
                    var11 = param4.field_C;
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-2 != (this.field_p ^ -1)) {
                    break L7;
                  } else {
                    var11 = param4.field_C + (-(var10 * this.field_j) + this.field_k >> 1138451105);
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (-3 == (this.field_p ^ -1)) {
                    break L8;
                  } else {
                    L9: {
                      var12 = (-(var10 * this.field_j) + this.field_k) / (var10 - -1);
                      if ((var12 ^ -1) > -1) {
                        var12 = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    this.field_j = this.field_j + var12;
                    var11 = var12 + param4.field_C;
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L8;
                    }
                  }
                }
                var11 = this.field_k - (param4.field_D - -(var10 * this.field_j));
                break L5;
              }
              var12 = 0;
              L10: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var13 = var17[var12];
                  if (var15 == 0) {
                    L11: {
                      stackOut_38_0 = null;
                      stackOut_38_1 = null;
                      stackOut_38_2 = var11 + -param4.field_C;
                      stackOut_38_3 = var11 + param4.field_D;
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_40_1 = stackOut_38_1;
                      stackIn_40_2 = stackOut_38_2;
                      stackIn_40_3 = stackOut_38_3;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      stackIn_39_3 = stackOut_38_3;
                      if (var13 != null) {
                        stackOut_40_0 = null;
                        stackOut_40_1 = null;
                        stackOut_40_2 = stackIn_40_2;
                        stackOut_40_3 = stackIn_40_3;
                        stackOut_40_4 = var13.length();
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        stackIn_41_2 = stackOut_40_2;
                        stackIn_41_3 = stackOut_40_3;
                        stackIn_41_4 = stackOut_40_4;
                        break L11;
                      } else {
                        stackOut_39_0 = null;
                        stackOut_39_1 = null;
                        stackOut_39_2 = stackIn_39_2;
                        stackOut_39_3 = stackIn_39_3;
                        stackOut_39_4 = 0;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        stackIn_41_3 = stackOut_39_3;
                        stackIn_41_4 = stackOut_39_4;
                        break L11;
                      }
                    }
                    L12: {
                      var14 = new be(stackIn_41_2, stackIn_41_3, stackIn_41_4);
                      var14.field_c[0] = 0;
                      if (var13 == null) {
                        break L12;
                      } else {
                        L13: {
                          var14.field_c[var13.length()] = param4.a(var13);
                          stackOut_42_0 = (String) (var13);
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_43_0 = stackOut_42_0;
                          if (3 != param7) {
                            stackOut_44_0 = (String) ((Object) stackIn_44_0);
                            stackOut_44_1 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            break L13;
                          } else {
                            stackOut_43_0 = (String) ((Object) stackIn_43_0);
                            stackOut_43_1 = this.a(param0, var13, param4.a(var13), (byte) -79);
                            stackIn_45_0 = stackOut_43_0;
                            stackIn_45_1 = stackOut_43_1;
                            break L13;
                          }
                        }
                        dk.a(stackIn_45_0, stackIn_45_1, -25006, var14, param4);
                        break L12;
                      }
                    }
                    var11 = var11 + param1;
                    this.field_c[var12] = var14;
                    var12++;
                    continue L10;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var9);
            stackOut_48_1 = new StringBuilder().append("sb.S(").append(param0).append(',').append(param1).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L14;
            }
          }
          L15: {
            stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param3).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param4 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L15;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2, ta param3, int param4) {
        be discarded$1 = null;
        RuntimeException var6 = null;
        int var7 = 0;
        String var8 = null;
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
        int decompiledRegionSelector0 = 0;
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
                if (this.field_d != param3) {
                  break L1;
                } else {
                  if (!this.field_h) {
                    break L1;
                  } else {
                    if (-2 != (this.field_g ^ -1)) {
                      break L1;
                    } else {
                      if (this.field_o == null) {
                        break L1;
                      } else {
                        if (!this.field_o.equals(param0)) {
                          break L1;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_g = 1;
                this.field_h = true;
                if (param2 == -2713) {
                  break L2;
                } else {
                  var8 = (String) null;
                  discarded$1 = this.a((ta) null, 24, -22, (String) null);
                  break L2;
                }
              }
              this.field_d = param3;
              var9 = this.a(param3, param4, 124, param0);
              var7 = param3.a(param0);
              var9.field_c[0] = -(var7 >> 564245249) + param1;
              var9.field_c[param0.length()] = param1 + (var7 >> -2005445311);
              dk.a(param0, 0, -25006, var9, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("sb.Q(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2, ta param3, byte param4) {
        be var7 = null;
        be var8 = null;
        if (param0 == null) {
            this.field_c = null;
            return;
        }
        if (param3 == this.field_d) {
            if (this.field_h) {
                if (this.field_g == 0) {
                    if (this.field_o != null) {
                        if (this.field_o.equals(param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_g = 0;
            this.field_d = param3;
            this.field_o = param0;
            this.field_h = true;
            var7 = this.a(param3, param1, -45, param0);
            var8 = var7;
            var7.field_c[0] = param2;
            var8.field_c[param0.length()] = param3.a(param0) + param2;
            if (param4 <= 66) {
                this.field_h = false;
            }
            dk.a(param0, 0, -25006, var8, param3);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sb.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
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
        am stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am stackOut_13_0 = null;
        am stackOut_9_0 = null;
        am stackOut_6_0 = null;
        am stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (0 != (var2_int ^ -1)) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = dd.a(var3, false);
                    if (var5 == null) {
                      L2: {
                        if (param0 == 28079) {
                          break L2;
                        } else {
                          field_f = 55;
                          break L2;
                        }
                      }
                      stackOut_13_0 = ne.a(var4, (byte) -98);
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_9_0 = (am) (var5);
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_6_0 = si.field_s;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = qb.field_a;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("sb.N(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
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
        am discarded$4 = null;
        am discarded$5 = null;
        am discarded$6 = null;
        am discarded$7 = null;
        String var4 = null;
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
                      var4 = (String) null;
                      discarded$4 = sb.a(-117, (String) null);
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
                      var4 = (String) null;
                      discarded$5 = sb.a(-117, (String) null);
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
                    var4 = (String) null;
                    discarded$6 = sb.a(-117, (String) null);
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
        if (param0 == 2) {
          L42: {
            L43: {
              if (jc.field_a == null) {
                break L43;
              } else {
                if (jc.field_a.length < param2) {
                  break L43;
                } else {
                  break L42;
                }
              }
            }
            jc.field_a = new int[param2 * 2];
            break L42;
          }
          L44: {
            L45: {
              if (null == hf.field_c) {
                break L45;
              } else {
                if (param2 > hf.field_c.length) {
                  break L45;
                } else {
                  break L44;
                }
              }
            }
            hf.field_c = new int[2 * param2];
            break L44;
          }
          L46: {
            L47: {
              if (null == rb.field_fb) {
                break L47;
              } else {
                if (param2 > rb.field_fb.length) {
                  break L47;
                } else {
                  break L46;
                }
              }
            }
            rb.field_fb = new int[param2 * 2];
            break L46;
          }
          if (cj.field_c == null) {
            cj.field_c = new int[param2 * 2];
            if (hl.field_f != null) {
              if (hl.field_f.length < param1 + param2) {
                L48: {
                  L49: {
                    hl.field_f = new int[(param2 - -param1) * 2];
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
              } else {
                L50: {
                  L51: {
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
                  hl.field_f = new int[(param2 - -param1) * 2];
                  if (null == gb.field_h) {
                    break L53;
                  } else {
                    if (gb.field_h.length < param2) {
                      break L53;
                    } else {
                      break L52;
                    }
                  }
                }
                gb.field_h = new boolean[param2 * 2];
                break L52;
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
                  L54: {
                    L55: {
                      if (null == gb.field_h) {
                        break L55;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L54;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                } else {
                  L56: {
                    L57: {
                      hl.field_f = new int[(param2 - -param1) * 2];
                      if (null == gb.field_h) {
                        break L57;
                      } else {
                        if (gb.field_h.length < param2) {
                          break L57;
                        } else {
                          break L56;
                        }
                      }
                    }
                    gb.field_h = new boolean[param2 * 2];
                    break L56;
                  }
                  rh.field_C = 2147483647;
                  kj.field_G = -2147483648;
                  fe.field_g = -2147483648;
                  ah.field_j = 2147483647;
                  fd.field_n = 0;
                  return;
                }
              } else {
                L58: {
                  L59: {
                    hl.field_f = new int[(param2 - -param1) * 2];
                    if (null == gb.field_h) {
                      break L59;
                    } else {
                      if (gb.field_h.length < param2) {
                        break L59;
                      } else {
                        break L58;
                      }
                    }
                  }
                  gb.field_h = new boolean[param2 * 2];
                  break L58;
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
            }
          }
        } else {
          L66: {
            L67: {
              var4 = (String) null;
              discarded$7 = sb.a(-117, (String) null);
              if (jc.field_a == null) {
                break L67;
              } else {
                if (jc.field_a.length < param2) {
                  break L67;
                } else {
                  break L66;
                }
              }
            }
            jc.field_a = new int[param2 * 2];
            break L66;
          }
          L68: {
            L69: {
              if (null == hf.field_c) {
                break L69;
              } else {
                if (param2 > hf.field_c.length) {
                  break L69;
                } else {
                  break L68;
                }
              }
            }
            hf.field_c = new int[2 * param2];
            break L68;
          }
          L70: {
            L71: {
              if (null == rb.field_fb) {
                break L71;
              } else {
                if (param2 > rb.field_fb.length) {
                  break L71;
                } else {
                  break L70;
                }
              }
            }
            rb.field_fb = new int[param2 * 2];
            break L70;
          }
          L72: {
            L73: {
              if (cj.field_c == null) {
                break L73;
              } else {
                if (param2 <= cj.field_c.length) {
                  break L72;
                } else {
                  break L73;
                }
              }
            }
            cj.field_c = new int[param2 * 2];
            break L72;
          }
          if (hl.field_f != null) {
            if (hl.field_f.length < param1 + param2) {
              L74: {
                L75: {
                  hl.field_f = new int[(param2 - -param1) * 2];
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
            } else {
              L76: {
                L77: {
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
          } else {
            L78: {
              L79: {
                hl.field_f = new int[(param2 - -param1) * 2];
                if (null == gb.field_h) {
                  break L79;
                } else {
                  if (gb.field_h.length < param2) {
                    break L79;
                  } else {
                    break L78;
                  }
                }
              }
              gb.field_h = new boolean[param2 * 2];
              break L78;
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

    public sb() {
    }

    static {
        field_m = new le(480, 480);
        field_f = -1;
        field_l = new int[8192];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_n = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
