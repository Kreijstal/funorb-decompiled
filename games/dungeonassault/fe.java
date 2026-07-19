/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends l {
    private boolean field_q;
    private String field_l;
    private int field_j;
    static md field_k;
    private int field_m;
    private int field_p;
    private int field_h;
    private se field_i;
    static int[] field_g;
    static String[] field_n;
    private int field_o;

    final void a(int param0, byte param1, String param2, se param3, int param4) {
        tg var7 = null;
        if (!(param2 != null)) {
            this.field_e = null;
            return;
        }
        int var6_int = -118 / ((29 - param1) / 50);
        if (param3 == this.field_i) {
            if (this.field_q) {
                if (2 == this.field_h) {
                    if (this.field_l != null) {
                        if (!(!this.field_l.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_l = param2;
            this.field_q = true;
            this.field_i = param3;
            this.field_h = 2;
            var7 = this.a(param2, param4, param3, 0);
            var7.field_k[0] = param0 + -param3.b(param2);
            var7.field_k[param2.length()] = param0;
            bf.a(param2, var7, 0, param3, 15553);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fe.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, se param2, int param3, int param4) {
        tg var7 = null;
        tg var8 = null;
        if (param0 == null) {
            this.field_e = null;
            return;
        }
        if (param2 == this.field_i) {
            if (this.field_q) {
                if (-1 == (this.field_h ^ -1)) {
                    if (this.field_l != null) {
                        if (!(!this.field_l.equals(param0))) {
                            return;
                        }
                    }
                }
            }
        }
        this.field_h = 0;
        this.field_i = param2;
        this.field_q = true;
        this.field_l = param0;
        if (param1 > -17) {
            return;
        }
        try {
            var7 = this.a(param0, param4, param2, 0);
            var8 = var7;
            var7.field_k[0] = param3;
            var8.field_k[param0.length()] = param3 + param2.b(param0);
            bf.a(param0, var8, 0, param2, 15553);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "fe.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -33) {
            fe.b((byte) -23);
        }
        field_n = null;
        field_g = null;
        field_k = null;
    }

    private final tg a(String param0, int param1, se param2, int param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        tg var6 = null;
        tg stackIn_2_0 = null;
        tg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tg stackOut_3_0 = null;
        tg stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param3 == 0) {
              var6 = new tg(param1 + -param2.field_H, param2.field_E + param1, param0.length());
              var5 = var6;
              this.field_e = new tg[]{var6};
              stackOut_3_0 = (tg) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (tg) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5_ref);
            stackOut_5_1 = new StringBuilder().append("fe.R(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, String param1, se param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        tg var9 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            if (param1 == null) {
              this.field_e = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 != this.field_i) {
                  break L1;
                } else {
                  if (!this.field_q) {
                    break L1;
                  } else {
                    if (-2 != (this.field_h ^ -1)) {
                      break L1;
                    } else {
                      if (null == this.field_l) {
                        break L1;
                      } else {
                        if (!this.field_l.equals(param1)) {
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
              this.field_h = 1;
              this.field_q = true;
              this.field_i = param2;
              var8 = -121 % ((34 - param3) / 47);
              var9 = this.a(param1, param0, param2, 0);
              var7 = param2.b(param1);
              var9.field_k[0] = param4 + -(var7 >> -1014860703);
              var9.field_k[param1.length()] = param4 - -(var7 >> 2067545665);
              bf.a(param1, var9, 0, param2, 15553);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("fe.U(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
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
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ',' + param4 + ')');
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

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, se param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        tg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        tg stackIn_34_0 = null;
        tg stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        tg stackIn_35_0 = null;
        tg stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        tg stackIn_36_0 = null;
        tg stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        String stackIn_39_0 = null;
        tg stackIn_39_1 = null;
        String stackIn_40_0 = null;
        tg stackIn_40_1 = null;
        String stackIn_41_0 = null;
        tg stackIn_41_1 = null;
        int stackIn_41_2 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tg stackOut_33_0 = null;
        tg stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        tg stackOut_35_0 = null;
        tg stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        tg stackOut_34_0 = null;
        tg stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        String stackOut_38_0 = null;
        tg stackOut_38_1 = null;
        String stackOut_40_0 = null;
        tg stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        String stackOut_39_0 = null;
        tg stackOut_39_1 = null;
        int stackOut_39_2 = 0;
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
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (0 != param6) {
                break L1;
              } else {
                param6 = param7.field_R;
                break L1;
              }
            }
            if (param0 == null) {
              this.field_e = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param7 != this.field_i) {
                  break L2;
                } else {
                  if (this.field_q) {
                    break L2;
                  } else {
                    if (param4 != this.field_h) {
                      break L2;
                    } else {
                      if (this.field_p != param2) {
                        break L2;
                      } else {
                        if (this.field_o != param6) {
                          break L2;
                        } else {
                          if (param3 != this.field_m) {
                            break L2;
                          } else {
                            if (this.field_j != param5) {
                              break L2;
                            } else {
                              if (null == this.field_l) {
                                break L2;
                              } else {
                                if (!this.field_l.equals(param0)) {
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
                this.field_p = param2;
                this.field_h = param4;
                this.field_q = false;
                this.field_m = param3;
                this.field_j = param5;
                this.field_o = param6;
                this.field_l = param0;
                this.field_i = param7;
                var16 = new String[param7.c(param0, param5) - -1];
                var17 = var16;
                var10 = Math.max(1, param7.a(param0, new int[]{param5}, var17));
                if (this.field_p != 3) {
                  break L3;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L3;
                  } else {
                    this.field_p = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (this.field_p == param1) {
                  var11 = param7.field_H;
                  break L4;
                } else {
                  if (-2 == (this.field_p ^ -1)) {
                    var11 = (-(this.field_o * var10) + this.field_m >> 494689441) + param7.field_H;
                    break L4;
                  } else {
                    if (-3 != (this.field_p ^ -1)) {
                      L5: {
                        var12 = (this.field_m - this.field_o * var10) / (var10 - -1);
                        if (-1 < (var12 ^ -1)) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_o = this.field_o + var12;
                      var11 = param7.field_H + var12;
                      break L4;
                    } else {
                      var11 = -param7.field_E + this.field_m - var10 * this.field_o;
                      break L4;
                    }
                  }
                }
              }
              this.field_e = new tg[var10];
              var12 = 0;
              L6: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = -param7.field_H + var11;
                    stackOut_33_3 = var11 - -param7.field_E;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    if (var13 == null) {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = 0;
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
                      stackOut_34_4 = var13.length();
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_36_1 = stackOut_34_1;
                      stackIn_36_2 = stackOut_34_2;
                      stackIn_36_3 = stackOut_34_3;
                      stackIn_36_4 = stackOut_34_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new tg(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                    var14.field_k[0] = 0;
                    if (var13 != null) {
                      L9: {
                        var14.field_k[var13.length()] = param7.b(var13);
                        stackOut_38_0 = (String) (var13);
                        stackOut_38_1 = (tg) (var14);
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        if (3 != param4) {
                          stackOut_40_0 = (String) ((Object) stackIn_40_0);
                          stackOut_40_1 = (tg) ((Object) stackIn_40_1);
                          stackOut_40_2 = 0;
                          stackIn_41_0 = stackOut_40_0;
                          stackIn_41_1 = stackOut_40_1;
                          stackIn_41_2 = stackOut_40_2;
                          break L9;
                        } else {
                          stackOut_39_0 = (String) ((Object) stackIn_39_0);
                          stackOut_39_1 = (tg) ((Object) stackIn_39_1);
                          stackOut_39_2 = this.a(var13, param1 + 0, param7.b(var13), param5);
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          break L9;
                        }
                      }
                      bf.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, param7, 15553);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var11 = var11 + param6;
                  this.field_e[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var9);
            stackOut_44_1 = new StringBuilder().append("fe.T(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param7 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
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

    public fe() {
    }

    static {
        field_k = new md();
        field_n = new String[]{"Reconnoitre", "Reveal two rooms at start of game. (Single use)"};
    }
}
