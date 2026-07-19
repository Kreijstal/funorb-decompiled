/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends bja {
    static String field_i;
    private int field_f;
    private boolean field_h;
    static nh field_l;
    private il field_j;
    private String field_k;
    private int field_e;
    private int field_n;
    private int field_g;
    private int field_m;

    final static int a(int param0, int param1, int param2, byte param3, g[] param4) {
        g var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = param4[param1];
            csa.a(param0, 2097152, param1, param4);
            var6 = param2;
            if (param3 == -65) {
              var7 = param2;
              L1: while (true) {
                L2: {
                  if (param0 <= var7) {
                    stackOut_10_0 = param0;
                    stackOut_10_1 = param3 ^ -2097217;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L2;
                  } else {
                    stackOut_6_0 = param4[var7].field_e.b((byte) -98);
                    stackOut_6_1 = var5.field_e.b((byte) -105);
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_11_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (stackIn_7_0 > stackIn_7_1) {
                          break L3;
                        } else {
                          csa.a(var6, 2097152, var7, param4);
                          var6++;
                          break L3;
                        }
                      }
                      var7++;
                      continue L1;
                    }
                  }
                }
                csa.a(stackIn_11_0, stackIn_11_1, var6, param4);
                stackOut_11_0 = var6;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 30;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5_ref);
            stackOut_13_1 = new StringBuilder().append("po.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(il param0, byte param1, String param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kha var14 = null;
        int var15 = 0;
        String var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        kha stackIn_35_0 = null;
        kha stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        kha stackIn_36_0 = null;
        kha stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        kha stackIn_37_0 = null;
        kha stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        int stackIn_37_4 = 0;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        il stackIn_39_2 = null;
        kha stackIn_39_3 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        il stackIn_40_2 = null;
        kha stackIn_40_3 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        il stackIn_41_2 = null;
        kha stackIn_41_3 = null;
        int stackIn_41_4 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kha stackOut_34_0 = null;
        kha stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        kha stackOut_36_0 = null;
        kha stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        kha stackOut_35_0 = null;
        kha stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        il stackOut_38_2 = null;
        kha stackOut_38_3 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        il stackOut_40_2 = null;
        kha stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        il stackOut_39_2 = null;
        kha stackOut_39_3 = null;
        int stackOut_39_4 = 0;
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
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param0.field_m;
                break L1;
              }
            }
            if (param2 != null) {
              L2: {
                if (this.field_j != param0) {
                  break L2;
                } else {
                  if (this.field_h) {
                    break L2;
                  } else {
                    if (this.field_m != param6) {
                      break L2;
                    } else {
                      if (this.field_e != param4) {
                        break L2;
                      } else {
                        if (this.field_g != param7) {
                          break L2;
                        } else {
                          if (this.field_f != param5) {
                            break L2;
                          } else {
                            if (param3 != this.field_n) {
                              break L2;
                            } else {
                              if (this.field_k == null) {
                                break L2;
                              } else {
                                if (!this.field_k.equals(param2)) {
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
                this.field_n = param3;
                this.field_e = param4;
                this.field_j = param0;
                this.field_k = param2;
                this.field_m = param6;
                this.field_g = param7;
                this.field_f = param5;
                this.field_h = false;
                var17 = new String[param0.a(param2, param3) + 1];
                var18 = var17;
                var10 = Math.max(1, param0.a(param2, new int[]{param3}, var18));
                if (3 != this.field_e) {
                  break L3;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_e = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (0 != this.field_e) {
                    break L5;
                  } else {
                    var11 = param0.field_w;
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if ((this.field_e ^ -1) == -2) {
                    break L6;
                  } else {
                    L7: {
                      if ((this.field_e ^ -1) == -3) {
                        break L7;
                      } else {
                        L8: {
                          var12 = (this.field_f - var10 * this.field_g) / (1 + var10);
                          if (var12 < 0) {
                            var12 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var11 = var12 + param0.field_w;
                        this.field_g = this.field_g + var12;
                        if (var15 == 0) {
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var11 = this.field_f + (-param0.field_k + -(this.field_g * var10));
                    if (var15 == 0) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                var11 = (this.field_f + -(var10 * this.field_g) >> -864694431) + param0.field_w;
                break L4;
              }
              this.field_c = new kha[var10];
              var12 = 0;
              L9: while (true) {
                L10: {
                  if (var12 >= var10) {
                    if (param1 == -49) {
                      break L10;
                    } else {
                      var16 = (String) null;
                      this.a(58, (il) null, 24, (String) null, -110);
                      return;
                    }
                  } else {
                    var13 = var17[var12];
                    if (var15 != 0) {
                      break L10;
                    } else {
                      L11: {
                        stackOut_34_0 = null;
                        stackOut_34_1 = null;
                        stackOut_34_2 = var11 + -param0.field_w;
                        stackOut_34_3 = var11 - -param0.field_k;
                        stackIn_36_0 = stackOut_34_0;
                        stackIn_36_1 = stackOut_34_1;
                        stackIn_36_2 = stackOut_34_2;
                        stackIn_36_3 = stackOut_34_3;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        stackIn_35_3 = stackOut_34_3;
                        if (var13 == null) {
                          stackOut_36_0 = null;
                          stackOut_36_1 = null;
                          stackOut_36_2 = stackIn_36_2;
                          stackOut_36_3 = stackIn_36_3;
                          stackOut_36_4 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          stackIn_37_2 = stackOut_36_2;
                          stackIn_37_3 = stackOut_36_3;
                          stackIn_37_4 = stackOut_36_4;
                          break L11;
                        } else {
                          stackOut_35_0 = null;
                          stackOut_35_1 = null;
                          stackOut_35_2 = stackIn_35_2;
                          stackOut_35_3 = stackIn_35_3;
                          stackOut_35_4 = var13.length();
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_37_1 = stackOut_35_1;
                          stackIn_37_2 = stackOut_35_2;
                          stackIn_37_3 = stackOut_35_3;
                          stackIn_37_4 = stackOut_35_4;
                          break L11;
                        }
                      }
                      L12: {
                        var14 = new kha(stackIn_37_2, stackIn_37_3, stackIn_37_4);
                        var14.field_c[0] = 0;
                        if (var13 == null) {
                          break L12;
                        } else {
                          L13: {
                            var14.field_c[var13.length()] = param0.b(var13);
                            stackOut_38_0 = param1 ^ -2097201;
                            stackOut_38_1 = (String) (var13);
                            stackOut_38_2 = (il) (param0);
                            stackOut_38_3 = (kha) (var14);
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            stackIn_40_2 = stackOut_38_2;
                            stackIn_40_3 = stackOut_38_3;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            stackIn_39_3 = stackOut_38_3;
                            if ((param6 ^ -1) != -4) {
                              stackOut_40_0 = stackIn_40_0;
                              stackOut_40_1 = (String) ((Object) stackIn_40_1);
                              stackOut_40_2 = (il) ((Object) stackIn_40_2);
                              stackOut_40_3 = (kha) ((Object) stackIn_40_3);
                              stackOut_40_4 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              stackIn_41_2 = stackOut_40_2;
                              stackIn_41_3 = stackOut_40_3;
                              stackIn_41_4 = stackOut_40_4;
                              break L13;
                            } else {
                              stackOut_39_0 = stackIn_39_0;
                              stackOut_39_1 = (String) ((Object) stackIn_39_1);
                              stackOut_39_2 = (il) ((Object) stackIn_39_2);
                              stackOut_39_3 = (kha) ((Object) stackIn_39_3);
                              stackOut_39_4 = this.a(0, var13, param3, param0.b(var13));
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              stackIn_41_3 = stackOut_39_3;
                              stackIn_41_4 = stackOut_39_4;
                              break L13;
                            }
                          }
                          jh.a(stackIn_41_0, stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4);
                          break L12;
                        }
                      }
                      var11 = var11 + param7;
                      this.field_c[var12] = var14;
                      var12++;
                      continue L9;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var9);
            stackOut_46_1 = new StringBuilder().append("po.G(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L14;
            }
          }
          L15: {
            stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param2 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L15;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(int param0, il param1, int param2, String param3, int param4) {
        kha var8 = null;
        kha var9 = null;
        if (param3 == null) {
            this.field_c = null;
            return;
        }
        if (this.field_j == param1) {
            if (this.field_h) {
                if (-3 == (this.field_m ^ -1)) {
                    if (this.field_k != null) {
                        if (this.field_k.equals(param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = 2;
            this.field_k = param3;
            this.field_h = true;
            this.field_j = param1;
            var8 = this.a(param1, 0, param3, param2);
            var9 = var8;
            var9.field_c[param0] = param4 + -param1.b(param3);
            var9.field_c[param3.length()] = param4;
            jh.a(2097152, param3, param1, var9, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final kha a(il param0, int param1, String param2, int param3) {
        kha var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        kha var7 = null;
        kha stackIn_3_0 = null;
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
        kha stackOut_2_0 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                var6 = (String) null;
                this.a(114, -55, (il) null, (String) null, -39);
                break L1;
              }
            }
            var7 = new kha(param3 - param0.field_w, param0.field_k + param3, param2.length());
            var5 = var7;
            this.field_c = new kha[]{var7};
            stackOut_2_0 = (kha) (var5);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, il param2, String param3, byte param4) {
        kha var7 = null;
        int var8 = 0;
        int var6_int = 38 / ((param4 - 5) / 54);
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_j == param2) {
            if (this.field_h) {
                if (1 == this.field_m) {
                    if (this.field_k != null) {
                        if (this.field_k.equals(param3)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_j = param2;
            this.field_h = true;
            this.field_m = 1;
            var7 = this.a(param2, 0, param3, param0);
            var8 = param2.b(param3);
            var7.field_c[0] = param1 - (var8 >> -2066817311);
            var7.field_c[param3.length()] = (var8 >> -409961023) + param1;
            jh.a(2097152, param3, param2, var7, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, il param2, String param3, int param4) {
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_j) {
            if (this.field_h) {
                if (0 == this.field_m) {
                    if (this.field_k != null) {
                        if (!(!this.field_k.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        this.field_j = param2;
        this.field_h = true;
        this.field_k = param3;
        this.field_m = 0;
        kha var7 = this.a(param2, 0, param3, param1);
        kha var8 = var7;
        var7.field_c[0] = param4;
        var8.field_c[param3.length()] = param2.b(param3) + param4;
        if (param0 != 16512) {
            return;
        }
        try {
            jh.a(param0 ^ 2113664, param3, param2, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "po.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
            return;
        }
        field_l = null;
    }

    public po() {
    }

    static {
        field_i = "Back";
    }
}
