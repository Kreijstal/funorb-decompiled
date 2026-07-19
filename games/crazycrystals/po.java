/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends tb {
    private int field_i;
    private int field_j;
    private String field_n;
    private int field_o;
    private boolean field_m;
    private int field_l;
    private vc field_p;
    private int field_k;

    final void a(byte param0, String param1, vc param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        bh var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        bh stackIn_35_0 = null;
        bh stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        bh stackIn_36_0 = null;
        bh stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        bh stackIn_37_0 = null;
        bh stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        bh stackIn_40_0 = null;
        bh stackIn_41_0 = null;
        bh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_34_0 = null;
        bh stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        bh stackOut_36_0 = null;
        bh stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        bh stackOut_35_0 = null;
        bh stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        bh stackOut_39_0 = null;
        bh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        bh stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var15 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param2.field_y;
                break L1;
              }
            }
            if (param1 == null) {
              this.field_h = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 != this.field_p) {
                  break L2;
                } else {
                  if (this.field_m) {
                    break L2;
                  } else {
                    if (param6 != this.field_k) {
                      break L2;
                    } else {
                      if (this.field_j != param3) {
                        break L2;
                      } else {
                        if (param7 != this.field_l) {
                          break L2;
                        } else {
                          if (this.field_i != param4) {
                            break L2;
                          } else {
                            if (param5 != this.field_o) {
                              break L2;
                            } else {
                              if (this.field_n == null) {
                                break L2;
                              } else {
                                if (this.field_n.equals(param1)) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L2;
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
                this.field_i = param4;
                this.field_n = param1;
                this.field_j = param3;
                this.field_o = param5;
                this.field_k = param6;
                if (param0 == 28) {
                  break L3;
                } else {
                  this.field_i = 24;
                  break L3;
                }
              }
              L4: {
                this.field_m = false;
                this.field_l = param7;
                var16 = new String[param2.a(param1, param5) - -1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param1, new int[]{param5}, var17));
                if (-4 != (this.field_j ^ -1)) {
                  break L4;
                } else {
                  if (-2 != (var10 ^ -1)) {
                    break L4;
                  } else {
                    this.field_j = 1;
                    break L4;
                  }
                }
              }
              L5: {
                if (0 == this.field_j) {
                  var11 = param2.field_o;
                  break L5;
                } else {
                  if (-2 == (this.field_j ^ -1)) {
                    var11 = param2.field_o + (this.field_i + -(var10 * this.field_l) >> 241330401);
                    break L5;
                  } else {
                    if (2 == this.field_j) {
                      var11 = this.field_i + (-param2.field_u + -(var10 * this.field_l));
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(this.field_l * var10) + this.field_i) / (1 + var10);
                        if (0 <= var12) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      var11 = var12 + param2.field_o;
                      this.field_l = this.field_l + var12;
                      break L5;
                    }
                  }
                }
              }
              this.field_h = new bh[var10];
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = -param2.field_o + var11;
                    stackOut_34_3 = var11 - -param2.field_u;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    stackIn_35_2 = stackOut_34_2;
                    stackIn_35_3 = stackOut_34_3;
                    if (var13 != null) {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var13.length();
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      stackIn_37_2 = stackOut_36_2;
                      stackIn_37_3 = stackOut_36_3;
                      stackIn_37_4 = stackOut_36_4;
                      break L8;
                    } else {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = stackIn_35_3;
                      stackOut_35_4 = 0;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_37_4 = stackOut_35_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new bh(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                    var14.field_e[0] = 0;
                    if (var13 != null) {
                      L10: {
                        var14.field_e[var13.length()] = param2.a(var13);
                        stackOut_39_0 = (bh) (var14);
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_40_0 = stackOut_39_0;
                        if (-4 == (param6 ^ -1)) {
                          stackOut_41_0 = (bh) ((Object) stackIn_41_0);
                          stackOut_41_1 = this.a((byte) 79, param5, var13, param2.a(var13));
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          break L10;
                        } else {
                          stackOut_40_0 = (bh) ((Object) stackIn_40_0);
                          stackOut_40_1 = 0;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          break L10;
                        }
                      }
                      te.a(stackIn_42_0, stackIn_42_1, var13, (byte) -95, param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.field_h[var12] = var14;
                  var11 = var11 + param7;
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
            stackOut_45_0 = (RuntimeException) (var9);
            stackOut_45_1 = new StringBuilder().append("po.A(").append(param0).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param1 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          L12: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
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
              break L12;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L12;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, vc param1, int param2, int param3, boolean param4) {
        bh var8 = null;
        int var7 = 0;
        if (!(param0 != null)) {
            this.field_h = null;
            return;
        }
        if (this.field_p == param1) {
            if (this.field_m) {
                if ((this.field_k ^ -1) == -2) {
                    if (this.field_n != null) {
                        if (!(!this.field_n.equals(param0))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_k = 1;
            this.field_m = true;
            this.field_p = param1;
            var8 = this.a(param1, param0, param3, (byte) 13);
            var7 = param1.a(param0);
            if (param4) {
                this.field_m = true;
            }
            var8.field_e[0] = param2 - (var7 >> 1472485633);
            var8.field_e[param0.length()] = param2 - -(var7 >> -1103898463);
            te.a(var8, 0, param0, (byte) -95, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "po.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(byte param0, String param1, int param2, int param3, vc param4) {
        RuntimeException var6 = null;
        vc var7 = null;
        bh var9 = null;
        bh var10 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param1 == null) {
              this.field_h = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param4 != this.field_p) {
                  break L1;
                } else {
                  if (!this.field_m) {
                    break L1;
                  } else {
                    if (this.field_k != 2) {
                      break L1;
                    } else {
                      if (this.field_n == null) {
                        break L1;
                      } else {
                        if (this.field_n.equals(param1)) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              L2: {
                this.field_n = param1;
                this.field_k = 2;
                if (param0 >= 95) {
                  break L2;
                } else {
                  var7 = (vc) null;
                  this.a(-121, (String) null, 97, 102, (vc) null);
                  break L2;
                }
              }
              this.field_m = true;
              this.field_p = param4;
              var9 = this.a(param4, param1, param3, (byte) 13);
              var10 = var9;
              var10.field_e[0] = -param4.a(param1) + param2;
              var10.field_e[param1.length()] = param2;
              te.a(var10, 0, param1, (byte) -95, param4);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("po.D(").append(param0).append(',');
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
          L4: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
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

    private final bh a(vc param0, String param1, int param2, byte param3) {
        bh var5 = null;
        RuntimeException var5_ref = null;
        vc var6 = null;
        bh var7 = null;
        bh stackIn_3_0 = null;
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
        bh stackOut_2_0 = null;
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
              var7 = new bh(-param0.field_o + param2, param2 + param0.field_u, param1.length());
              var5 = var7;
              this.field_h = new bh[]{var7};
              if (param3 == 13) {
                break L1;
              } else {
                var6 = (vc) null;
                this.a((byte) 12, (String) null, -102, 101, (vc) null);
                break L1;
              }
            }
            stackOut_2_0 = (bh) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("po.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, String param1, int param2, int param3, vc param4) {
        bh var7 = null;
        bh var8 = null;
        if (!(param1 != null)) {
            this.field_h = null;
            return;
        }
        if (param4 == this.field_p) {
            if (this.field_m) {
                if (this.field_k == 0) {
                    if (this.field_n != null) {
                        if (this.field_n.equals(param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = true;
            this.field_n = param1;
            this.field_k = param2;
            this.field_p = param4;
            var7 = this.a(param4, param1, param0, (byte) 13);
            var8 = var7;
            var7.field_e[0] = param3;
            var8.field_e[param1.length()] = param4.a(param1) + param3;
            te.a(var8, 0, param1, (byte) -95, param4);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "po.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public po() {
    }

    static {
    }
}
