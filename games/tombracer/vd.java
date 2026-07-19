/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends nv {
    static int field_p;
    private fsa field_r;
    private int field_v;
    private fsa field_A;
    private int field_s;
    private fsa field_o;
    private int field_q;
    private int field_y;
    private boolean field_u;
    private int field_x;
    static boolean field_n;
    private int field_t;
    private hj field_z;
    private int field_w;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (this.field_u) {
              if (null == this.field_z) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var8_int = this.field_g.d(3) - this.field_g.c(-29) / 2;
                  var9 = this.field_g.e(9648) + -(this.field_g.a((byte) 55) / 2);
                  param3 = param3 - (this.field_y + param1 / 2);
                  param4 = param4 - (this.field_w + param0 / 2);
                  var10 = -var8_int + param3;
                  var11 = param1 + (param3 + -var8_int);
                  var12 = -var9 + param4;
                  var13 = -var9 + (param4 + param0);
                  if (0 > var10) {
                    var10 = var10 - (this.field_t - 1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if ((var12 ^ -1) <= -1) {
                    break L2;
                  } else {
                    var12 = var12 - (this.field_t - 1);
                    break L2;
                  }
                }
                L3: {
                  if ((var11 ^ -1) > -1) {
                    var11 = var11 - (this.field_t + -1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var12 = var12 / this.field_t;
                  var10 = var10 / this.field_t;
                  if (0 <= var13) {
                    break L4;
                  } else {
                    var13 = var13 - (-1 + this.field_t);
                    break L4;
                  }
                }
                var11 = var11 / this.field_t;
                var13 = var13 / this.field_t;
                var10 = za.a(0, (byte) 113, this.field_z.field_f - param2, var10);
                var11 = za.a(0, (byte) 99, this.field_z.field_f + -1, var11);
                var14 = var10;
                L5: while (true) {
                  stackOut_19_0 = var11 ^ -1;
                  stackIn_20_0 = stackOut_19_0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (stackIn_20_0 > (var14 ^ -1)) {
                          break L8;
                        } else {
                          stackOut_21_0 = var12;
                          stackIn_34_0 = stackOut_21_0;
                          stackIn_22_0 = stackOut_21_0;
                          if (var16 != 0) {
                            break L7;
                          } else {
                            var15 = stackIn_22_0;
                            L9: while (true) {
                              L10: {
                                if (var13 < var15) {
                                  break L10;
                                } else {
                                  stackOut_24_0 = this.field_z.a(var14, var15, (byte) -128);
                                  stackIn_20_0 = stackOut_24_0 ? 1 : 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  if (var16 != 0) {
                                    continue L6;
                                  } else {
                                    L11: {
                                      L12: {
                                        if (stackIn_25_0) {
                                          break L12;
                                        } else {
                                          if (var16 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      if ((this.field_z.b((byte) -5, var15, var14) ^ -1) >= -1) {
                                        break L11;
                                      } else {
                                        stackOut_29_0 = 1;
                                        stackIn_30_0 = stackOut_29_0;
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      }
                                    }
                                    var15++;
                                    if (var16 == 0) {
                                      continue L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var14++;
                              if (var16 == 0) {
                                continue L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      stackOut_33_0 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      break L7;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var8 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var8);
            stackOut_35_1 = new StringBuilder().append("vd.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param6 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L13;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_34_0 != 0;
            } else {
              return stackIn_30_0 != 0;
            }
          }
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (-5 < (this.b(true).field_E ^ -1)) {
                param1.h(4, 0);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vd.Q(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int b(int param0, int param1) {
        if (!((param1 ^ -1) <= -1)) {
            param1 = -param1;
        }
        int var2 = 0;
        if (!((param1 ^ -1) >= -65536)) {
            var2 = var2 | 16;
            param1 = param1 >>> 16;
        }
        if (!(-256 <= (param1 ^ -1))) {
            param1 = param1 >>> 8;
            var2 = var2 | 8;
        }
        if (param1 > 15) {
            var2 = var2 | 4;
            param1 = param1 >>> 4;
        }
        if (param1 > 3) {
            var2 = var2 | 2;
            param1 = param1 >>> 2;
        }
        if (param1 > param0) {
            var2 = var2 | 1;
            param1 = param1 >>> 1;
        }
        return var2;
    }

    final void a(fsa param0, byte param1) {
        try {
            this.field_r = param0;
            int var3_int = -100 % ((param1 - -10) / 56);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vd.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(fsa param0, int param1) {
        if (param1 != 2) {
            return;
        }
        try {
            this.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vd.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.field_t = 114;
        }
        return 11;
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, pc param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7_int = 16;
            if (!param0) {
              var8 = hm.a(param4.field_a, (byte) -15, param2, param2 + param5, param1 + param3, var7_int, param4.field_e, param4.field_k, param4.field_d, param3);
              if ((var8 ^ -1) >= -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                var9 = wm.a(1 << var7_int, var8, -75);
                param4.a(var9, (byte) 47);
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var7);
            stackOut_8_1 = new StringBuilder().append("vd.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0 != 0;
          }
        }
    }

    private final boolean a(pc param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        nf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = this.field_g.d(param1 + 4) + -(this.field_g.c(param1 + -54) / 2);
              var4 = this.field_g.e(9648) - this.field_g.a((byte) 55) / 2;
              var5 = -this.field_y + (-var3_int + param0.field_d);
              var6 = param0.field_e + -var3_int - this.field_y;
              var7 = param0.field_k - (this.field_w + var4);
              var8 = param0.field_a + -this.field_w + -var4;
              if (param1 == -1) {
                break L1;
              } else {
                discarded$1 = this.a(10, -109, (pc) null, 116);
                break L1;
              }
            }
            var9 = new nf();
            var9.a(var6, var7, this.field_z.field_a, this.field_t, var5, 0, this.field_z.field_f, var8);
            L2: while (true) {
              L3: {
                L4: {
                  if (var9.field_d) {
                    break L4;
                  } else {
                    var10 = var9.b((byte) 75);
                    var11 = var9.b(2);
                    stackOut_5_0 = this.field_z.b((byte) -5, var11, var10);
                    stackIn_13_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var17 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 <= 0) {
                          break L5;
                        } else {
                          var12 = 16;
                          var13 = this.field_t * var10;
                          var14 = this.field_t * var11;
                          var15 = hm.a(var8, (byte) -15, var13, this.field_t + var13, var14 + this.field_t, var12, var6, var7, var5, var14);
                          if ((var15 ^ -1) < -1) {
                            var16 = wm.a(1 << var12, var15, -51);
                            param0.a(var16, (byte) 47);
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9.d(param1 ^ -102);
                      if (var17 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("vd.DA(");
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
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            this.field_x = 97;
        }
        this.field_v = param1;
    }

    private final void c(int param0) {
        qea var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        loa var12_ref_loa = null;
        int var12 = 0;
        int[][] var13_ref_int____ = null;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        av var23 = null;
        int[][] var24 = null;
        la var25 = null;
        kh var26 = null;
        kh var27 = null;
        kh var28 = null;
        int[][] var31 = null;
        int[][] var36 = null;
        int[][] var37 = null;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        var22 = TombRacer.field_G ? 1 : 0;
        if (this.field_g == null) {
          return;
        } else {
          L0: {
            var25 = this.b(true);
            var3 = this.o((byte) 46);
            var4 = this.field_g.c(-34) / this.field_t;
            var5 = this.field_g.a((byte) 55) / this.field_t;
            if ((var4 / 2 * 2 ^ -1) != (var4 ^ -1)) {
              break L0;
            } else {
              var4--;
              break L0;
            }
          }
          L1: {
            if ((var5 ^ -1) == (2 * (var5 / 2) ^ -1)) {
              var5--;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (!this.field_u) {
              break L2;
            } else {
              if ((this.field_t * var4 ^ -1) >= (this.field_g.c(-109) - 2097152 ^ -1)) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            var6 = var4 / 2;
            var7 = -2 + var5;
            if ((var6 ^ -1) == (2 * (var6 / 2) ^ -1)) {
              L4: {
                if (this.b(true).h((byte) -77)) {
                  break L4;
                } else {
                  var6--;
                  if (var22 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var6++;
              break L3;
            } else {
              break L3;
            }
          }
          var8 = 1;
          if (param0 > 123) {
            if (-4 < (var4 ^ -1)) {
              return;
            } else {
              if (-4 < (var5 ^ -1)) {
                return;
              } else {
                var9 = 0;
                var10 = 0;
                var11 = null;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (var9 != 0) {
                        break L7;
                      } else {
                        var12_ref_loa = lba.a((byte) 27, var3, this.field_s);
                        this.field_z = var12_ref_loa.a(var5, var6, var4, -122, var8);
                        this.field_z.a(1 + var7, 0, 0, var6);
                        this.field_z.a(0, 0, 0, var6);
                        var23 = new av(this.field_z);
                        var11 = var23;
                        var23.a(var7 - -1, 0, var6, 124, var6);
                        var31 = var23.b((byte) 125);
                        var24 = var31;
                        var13_ref_int____ = var24;
                        if (var22 != 0) {
                          break L6;
                        } else {
                          if (var13_ref_int____ == null) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                L10: {
                                  if (var5 < 5) {
                                    break L10;
                                  } else {
                                    if (5 > var4) {
                                      break L10;
                                    } else {
                                      if (var5 >= var31.length) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  if (0 == this.field_x) {
                                    break L11;
                                  } else {
                                    if (var31.length < -(var10 * 2) + this.field_x) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (0 == this.field_q) {
                                    break L12;
                                  } else {
                                    if ((var10 * 2 + this.field_q ^ -1) < (var31.length ^ -1)) {
                                      break L12;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var9 = 1;
                                if (var22 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                              var9 = 0;
                              break L8;
                            }
                            var10++;
                            if (var22 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    this.field_y = (this.field_g.c(-30) + -(this.field_t * this.field_z.field_f)) / 2;
                    this.field_w = (this.field_g.a((byte) 55) + -(this.field_z.field_a * this.field_t)) / 2;
                    break L6;
                  }
                  var12 = this.field_y + -(this.field_g.c(-12) / 2) + this.field_t / 2;
                  var13 = this.field_w + -(this.field_g.a((byte) 55) / 2) - -(this.field_t / 2);
                  if (!this.field_u) {
                    L13: {
                      var14 = var25.field_E;
                      var25.field_E = 26;
                      var15 = null;
                      var16 = null;
                      var17 = null;
                      if (this.field_r == null) {
                        break L13;
                      } else {
                        if (!this.field_r.J(90)) {
                          var26 = new kh(30000);
                          var15 = var26;
                          var26.i(8);
                          this.field_r.a(var26, 125);
                          var26.k(-1826190686);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (null == this.field_A) {
                        break L14;
                      } else {
                        if (!this.field_A.J(51)) {
                          var27 = new kh(30000);
                          var16 = var27;
                          var27.i(8);
                          this.field_A.a(var27, 84);
                          var27.k(-1826190686);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (null == this.field_o) {
                        break L15;
                      } else {
                        if (!this.field_o.J(73)) {
                          var28 = new kh(30000);
                          var17 = var28;
                          var28.i(8);
                          this.field_o.a(var28, -112);
                          var28.k(-1826190686);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var18 = 0;
                    L16: while (true) {
                      stackOut_57_0 = this.field_z.field_f;
                      stackOut_57_1 = var18;
                      stackIn_58_0 = stackOut_57_0;
                      stackIn_58_1 = stackOut_57_1;
                      L17: while (true) {
                        L18: {
                          L19: {
                            if (stackIn_58_0 <= stackIn_58_1) {
                              break L19;
                            } else {
                              stackOut_59_0 = 0;
                              stackIn_70_0 = stackOut_59_0;
                              stackIn_60_0 = stackOut_59_0;
                              if (var22 != 0) {
                                break L18;
                              } else {
                                var19 = stackIn_60_0;
                                L20: while (true) {
                                  L21: {
                                    if (this.field_z.field_a <= var19) {
                                      break L21;
                                    } else {
                                      stackOut_62_0 = -1;
                                      stackOut_62_1 = this.field_z.b((byte) -5, var19, var18) ^ -1;
                                      stackIn_58_0 = stackOut_62_0;
                                      stackIn_58_1 = stackOut_62_1;
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      if (var22 != 0) {
                                        continue L17;
                                      } else {
                                        L22: {
                                          L23: {
                                            if (stackIn_63_0 > stackIn_63_1) {
                                              break L23;
                                            } else {
                                              this.a(var18, var13, var19, -44, (kh) (var16), var12);
                                              if (var22 == 0) {
                                                break L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          this.a(var18, var13, var19, -58, (kh) (var15), var12);
                                          break L22;
                                        }
                                        var19++;
                                        if (var22 == 0) {
                                          continue L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                  var18++;
                                  if (var22 == 0) {
                                    continue L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_69_0 = this.field_v;
                          stackIn_70_0 = stackOut_69_0;
                          break L18;
                        }
                        L24: {
                          L25: {
                            if (stackIn_70_0 > 0) {
                              var36 = ((av) (var11)).a((byte) -72);
                              var37 = new int[this.field_v][2];
                              var20 = 0;
                              L26: while (true) {
                                L27: {
                                  L28: {
                                    if ((var20 ^ -1) <= (this.field_v ^ -1)) {
                                      break L28;
                                    } else {
                                      stackOut_74_0 = var36.length;
                                      stackOut_74_1 = var20;
                                      stackIn_107_0 = stackOut_74_0;
                                      stackIn_107_1 = stackOut_74_1;
                                      stackIn_75_0 = stackOut_74_0;
                                      stackIn_75_1 = stackOut_74_1;
                                      if (var22 != 0) {
                                        L29: while (true) {
                                          if (stackIn_107_0 <= stackIn_107_1) {
                                            break L25;
                                          } else {
                                            this.a(var37[var20][0], var13, var37[var20][1], -113, (kh) (var17), var12);
                                            var20++;
                                            if (var22 != 0) {
                                              break L24;
                                            } else {
                                              if (var22 == 0) {
                                                stackOut_109_0 = this.field_v;
                                                stackOut_109_1 = var20;
                                                stackIn_107_0 = stackOut_109_0;
                                                stackIn_107_1 = stackOut_109_1;
                                                continue L29;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L30: {
                                          L31: {
                                            if (stackIn_75_0 <= stackIn_75_1) {
                                              L32: while (true) {
                                                if (0 == this.field_z.b((byte) -5, var37[var20][1], var37[var20][0])) {
                                                  break L31;
                                                } else {
                                                  var37[var20][0] = 1 - -var3.a(-2 + this.field_z.field_f, 0);
                                                  var37[var20][1] = 1 - -var3.a(-2 + this.field_z.field_a, 0);
                                                  if (var22 != 0) {
                                                    break L30;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L32;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var21 = var3.a(var36.length, 0);
                                              L33: while (true) {
                                                L34: {
                                                  L35: {
                                                    if ((var36[var21][0] ^ -1) != 0) {
                                                      break L35;
                                                    } else {
                                                      var21++;
                                                      if (var21 < var36.length) {
                                                        continue L33;
                                                      } else {
                                                        var21 = 0;
                                                        if (var22 != 0) {
                                                          break L34;
                                                        } else {
                                                          if (var22 == 0) {
                                                            continue L33;
                                                          } else {
                                                            break L35;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var37[var20][0] = var36[var21][0];
                                                  var37[var20][1] = var36[var21][1];
                                                  var36[var21][0] = -1;
                                                  break L34;
                                                }
                                                if (var22 == 0) {
                                                  break L31;
                                                } else {
                                                  L36: while (true) {
                                                    if (0 == this.field_z.b((byte) -5, var37[var20][1], var37[var20][0])) {
                                                      break L31;
                                                    } else {
                                                      var37[var20][0] = 1 - -var3.a(-2 + this.field_z.field_f, 0);
                                                      var37[var20][1] = 1 - -var3.a(-2 + this.field_z.field_a, 0);
                                                      if (var22 != 0) {
                                                        break L30;
                                                      } else {
                                                        if (var22 == 0) {
                                                          continue L36;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var20++;
                                          break L30;
                                        }
                                        if (var22 == 0) {
                                          continue L26;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                  }
                                  var20 = 0;
                                  L37: while (true) {
                                    if (this.field_v <= var20) {
                                      break L25;
                                    } else {
                                      this.a(var37[var20][0], var13, var37[var20][1], -113, (kh) (var17), var12);
                                      var20++;
                                      if (var22 != 0) {
                                        break L24;
                                      } else {
                                        if (var22 == 0) {
                                          continue L37;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                  }
                                }
                                break L25;
                              }
                            } else {
                              break L25;
                            }
                          }
                          var25.field_E = var14;
                          break L24;
                        }
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    vd(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = false;
        this.field_t = 2097152;
        try {
            this.field_r = new fsa(param0, false);
            wd.a((byte) -98, 1, true, param0, this.field_r, false);
            this.field_r.b(false, 11468);
            this.field_A = new fsa(param0, false);
            this.field_o = new fsa(param0, false);
            this.d(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.field_u) {
              if (null == this.field_z) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  var5_int = 0;
                  if (0 >= this.field_y) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var6 = this.field_g.d(3) - this.field_g.c(-49) / 2;
                        var7 = this.field_g.e(9648) - (this.field_g.a((byte) 55) / 2 - this.field_w);
                        var8 = this.field_t * this.field_z.field_f;
                        var9 = this.field_z.field_a * this.field_t;
                        var10 = this.field_y + var8;
                        if (this.a(false, var9, var6, var7, param2, this.field_y)) {
                          break L3;
                        } else {
                          if (var5_int == 0) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var5_int = stackIn_13_0;
                        if (this.a(false, var9, var10 + var6, var7, param2, this.field_g.c(-45) + -var10)) {
                          break L5;
                        } else {
                          if (var5_int == 0) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                    var5_int = stackIn_18_0;
                    break L1;
                  }
                }
                L6: {
                  if (param1 == 1) {
                    break L6;
                  } else {
                    discarded$1 = this.a(-49, 56, -14, 110, -69, 19, (ffa) null);
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if (this.a(param2, param1 ^ -2)) {
                      break L8;
                    } else {
                      if (var5_int == 0) {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackOut_24_0 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  break L7;
                }
                var5_int = stackIn_26_0;
                stackOut_26_0 = var5_int;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("vd.K(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_27_0 != 0;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, kh param4, int param5) {
        fsa var8 = null;
        if (!(param4 != null)) {
            return;
        }
        la var7 = this.b(true);
        param4.field_h = 0;
        if (param3 >= -41) {
            return;
        }
        try {
            param4.h((byte) 123);
            var8 = new fsa(var7, param4, true);
            param4.i((byte) 98);
            var8.d((byte) -97, true);
            var8.m(1, param5 - -(this.field_t * param0));
            var8.c(param1 + this.field_t * param2, -19879);
            this.field_g.a(-97, var8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vd.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    vd(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_u = false;
        this.field_t = 2097152;
        try {
          L0: {
            L1: {
              L2: {
                this.field_s = param1.b((byte) 44, 2);
                if ((param0.field_E ^ -1) <= -5) {
                  break L2;
                } else {
                  this.field_t = 2097152;
                  this.field_u = true;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                this.field_t = param1.b((byte) 44, 10) << 1083569648;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (1 == param1.b((byte) 44, 1)) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((vd) (this)).field_u = stackIn_6_1 != 0;
              break L1;
            }
            L4: {
              if (-12 < (param0.field_E ^ -1)) {
                break L4;
              } else {
                this.field_x = param1.b((byte) 44, 7);
                this.field_q = param1.b((byte) 44, 7);
                this.field_v = param1.b((byte) 44, 3);
                break L4;
              }
            }
            L5: {
              L6: {
                this.field_o = null;
                if (this.field_u) {
                  break L6;
                } else {
                  this.field_r = new fsa(param0, param1, false);
                  this.field_A = new fsa(param0, param1, false);
                  if ((this.field_v ^ -1) >= -1) {
                    break L5;
                  } else {
                    if (14 > param0.field_E) {
                      break L5;
                    } else {
                      this.field_o = new fsa(param0, param1, false);
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              this.field_r = new fsa(param0, false);
              wd.a((byte) -120, 1, true, param0, this.field_r, false);
              this.field_A = new fsa(param0, false);
              break L5;
            }
            L7: {
              if (this.field_o != null) {
                break L7;
              } else {
                this.field_o = new fsa(param0, false);
                wd.a((byte) -93, 7, true, param0, this.field_o, false);
                break L7;
              }
            }
            this.d(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("vd.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    private final void d(boolean param0) {
        if (1048576 > this.field_t) {
            this.field_t = 1048576;
        }
        this.field_r.c((byte) 77, false);
        this.field_r.b((byte) -11, this.field_t, this.field_t);
        this.field_A.c((byte) 59, false);
        this.field_A.b((byte) -11, this.field_t, this.field_t);
        if (!param0) {
            this.field_o = (fsa) null;
        }
    }

    final void a(byte param0, fsa param1) {
        if (param0 > -115) {
            return;
        }
        try {
            this.field_A = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_s = param1;
        if (param0) {
            this.n((byte) 51);
        }
    }

    final void h(int param0) {
        super.h(param0);
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
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
              super.a(param0, param1);
              param1.a((byte) -41, this.field_s, 2);
              param1.a((byte) 42, this.field_t >> 1444174896, 10);
              stackOut_0_0 = (kh) (param1);
              stackOut_0_1 = 125;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!this.field_u) {
                stackOut_2_0 = (kh) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (kh) ((Object) stackIn_1_0);
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              L3: {
                ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
                param1.a((byte) -128, this.field_x, 7);
                param1.a((byte) 113, this.field_q, 7);
                param1.a((byte) -127, this.field_v, 3);
                if (this.field_u) {
                  break L3;
                } else {
                  this.field_r.a(param1, 85);
                  this.field_A.a(param1, 126);
                  if ((this.field_v ^ -1) >= -1) {
                    break L3;
                  } else {
                    this.field_o.a(param1, -10);
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("vd.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void b(byte param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (param0 < 60) {
            this.field_A = (fsa) null;
        }
    }

    final static void b(int param0) {
        if (!una.a((byte) 105)) {
            return;
        }
        qna.a(param0, false, 4);
    }

    final void k(int param0) {
        boolean discarded$0 = false;
        if (param0 != 5418) {
            discarded$0 = this.a(false, -81, 38, -44, (pc) null, -15);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            this.field_A = (fsa) null;
        }
        return param0;
    }

    final void n(byte param0) {
        super.n((byte) 105);
        this.c(127);
        if (param0 <= 68) {
            this.field_r = (fsa) null;
        }
    }

    static {
    }
}
