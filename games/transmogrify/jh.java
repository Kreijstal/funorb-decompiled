/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends ue {
    static ti field_h;
    private String field_d;
    static pd field_n;
    private int field_e;
    private int field_j;
    private boolean field_f;
    private int field_i;
    private int field_m;
    static String field_g;
    private kg field_k;
    private int field_l;

    final void a(kg param0, int param1, byte param2, String param3, int param4) {
        ol var9 = null;
        ol var10 = null;
        if (!(param3 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_k == param0) {
            if (this.field_f) {
                if (this.field_l == 2) {
                    if (this.field_d != null) {
                        if (!(!this.field_d.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_d = param3;
            this.field_f = true;
            if (param2 >= -63) {
                kg var7 = (kg) null;
                this.a((String) null, (byte) -90, (kg) null, -10, 16);
            }
            this.field_l = 2;
            this.field_k = param0;
            var9 = this.a((byte) 107, param4, param0, param3);
            var10 = var9;
            var10.field_g[0] = param1 - param0.a(param3);
            var10.field_g[param3.length()] = param1;
            eh.a(var10, (byte) 79, param3, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          if (null == el.field_n) {
            return;
          } else {
            var1 = el.field_n;
            synchronized (var1) {
              L0: {
                el.field_n = null;
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, kg param3, String param4) {
        ol var8 = null;
        int var7 = 0;
        if (param4 == null) {
            this.field_b = null;
            return;
        }
        if (param3 == this.field_k) {
            if (this.field_f) {
                if ((this.field_l ^ -1) == -2) {
                    if (null != this.field_d) {
                        if (this.field_d.equals(param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_l = 1;
            this.field_f = true;
            this.field_k = param3;
            var8 = this.a((byte) 34, param2, param3, param4);
            var7 = param3.a(param4);
            if (param1 != 7531) {
                this.field_i = 41;
            }
            var8.field_g[0] = param0 + -(var7 >> 1558484161);
            var8.field_g[param4.length()] = (var7 >> 953290081) + param0;
            eh.a(var8, (byte) 79, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4, kg param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ol var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        ol stackIn_36_0 = null;
        ol stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        ol stackIn_37_0 = null;
        ol stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        ol stackIn_38_0 = null;
        ol stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        ol stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_40_2 = null;
        kg stackIn_40_3 = null;
        ol stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_41_2 = null;
        kg stackIn_41_3 = null;
        ol stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        String stackIn_42_2 = null;
        kg stackIn_42_3 = null;
        int stackIn_42_4 = 0;
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
        ol stackOut_35_0 = null;
        ol stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        ol stackOut_37_0 = null;
        ol stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        ol stackOut_36_0 = null;
        ol stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        ol stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        String stackOut_39_2 = null;
        kg stackOut_39_3 = null;
        ol stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        String stackOut_41_2 = null;
        kg stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        ol stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        String stackOut_40_2 = null;
        kg stackOut_40_3 = null;
        int stackOut_40_4 = 0;
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
        var16 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param2 ^ -1)) {
                break L1;
              } else {
                param2 = param5.field_C;
                break L1;
              }
            }
            if (param4 == null) {
              this.field_b = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param5 != this.field_k) {
                  break L2;
                } else {
                  if (this.field_f) {
                    break L2;
                  } else {
                    if (this.field_l != param1) {
                      break L2;
                    } else {
                      if (param7 != this.field_i) {
                        break L2;
                      } else {
                        if (this.field_m != param2) {
                          break L2;
                        } else {
                          if (param6 != this.field_e) {
                            break L2;
                          } else {
                            if (param3 != this.field_j) {
                              break L2;
                            } else {
                              if (this.field_d == null) {
                                break L2;
                              } else {
                                if (this.field_d.equals(param4)) {
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
                this.field_m = param2;
                this.field_d = param4;
                this.field_i = param7;
                this.field_e = param6;
                this.field_k = param5;
                this.field_f = false;
                this.field_l = param1;
                this.field_j = param3;
                var17 = new String[1 + param5.b(param4, param3)];
                var18 = var17;
                var10 = Math.max(1, param5.a(param4, new int[]{param3}, var18));
                var11 = -73 / ((-6 - param0) / 50);
                if ((this.field_i ^ -1) != -4) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    this.field_i = 1;
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  this.field_b = new ol[var10];
                  if (this.field_i == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (1 == this.field_i) {
                        break L6;
                      } else {
                        L7: {
                          if (2 == this.field_i) {
                            break L7;
                          } else {
                            L8: {
                              var13 = (-(var10 * this.field_m) + this.field_e) / (1 + var10);
                              if (0 > var13) {
                                var13 = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var12 = var13 + param5.field_y;
                            this.field_m = this.field_m + var13;
                            if (var16 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var12 = -param5.field_t + this.field_e - this.field_m * var10;
                        if (var16 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var12 = param5.field_y + (-(this.field_m * var10) + this.field_e >> 1969747265);
                    if (var16 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var12 = param5.field_y;
                break L4;
              }
              var13 = 0;
              L9: while (true) {
                if (var13 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var14 = var17[var13];
                  if (var16 == 0) {
                    L10: {
                      stackOut_35_0 = null;
                      stackOut_35_1 = null;
                      stackOut_35_2 = var12 - param5.field_y;
                      stackOut_35_3 = var12 + param5.field_t;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      stackIn_37_2 = stackOut_35_2;
                      stackIn_37_3 = stackOut_35_3;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      if (var14 != null) {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = stackIn_37_2;
                        stackOut_37_3 = stackIn_37_3;
                        stackOut_37_4 = var14.length();
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        stackIn_38_4 = stackOut_37_4;
                        break L10;
                      } else {
                        stackOut_36_0 = null;
                        stackOut_36_1 = null;
                        stackOut_36_2 = stackIn_36_2;
                        stackOut_36_3 = stackIn_36_3;
                        stackOut_36_4 = 0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_38_4 = stackOut_36_4;
                        break L10;
                      }
                    }
                    L11: {
                      var15 = new ol(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var15.field_g[0] = 0;
                      if (var14 == null) {
                        break L11;
                      } else {
                        L12: {
                          var15.field_g[var14.length()] = param5.a(var14);
                          stackOut_39_0 = (ol) (var15);
                          stackOut_39_1 = 79;
                          stackOut_39_2 = (String) (var14);
                          stackOut_39_3 = (kg) (param5);
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_41_2 = stackOut_39_2;
                          stackIn_41_3 = stackOut_39_3;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          if (-4 != (param1 ^ -1)) {
                            stackOut_41_0 = (ol) ((Object) stackIn_41_0);
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = (String) ((Object) stackIn_41_2);
                            stackOut_41_3 = (kg) ((Object) stackIn_41_3);
                            stackOut_41_4 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            stackIn_42_2 = stackOut_41_2;
                            stackIn_42_3 = stackOut_41_3;
                            stackIn_42_4 = stackOut_41_4;
                            break L12;
                          } else {
                            stackOut_40_0 = (ol) ((Object) stackIn_40_0);
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = (String) ((Object) stackIn_40_2);
                            stackOut_40_3 = (kg) ((Object) stackIn_40_3);
                            stackOut_40_4 = this.a(param3, var14, param5.a(var14), 12);
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            stackIn_42_3 = stackOut_40_3;
                            stackIn_42_4 = stackOut_40_4;
                            break L12;
                          }
                        }
                        eh.a(stackIn_42_0, (byte) stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4);
                        break L11;
                      }
                    }
                    this.field_b[var13] = var15;
                    var12 = var12 + param2;
                    var13++;
                    continue L9;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var9);
            stackOut_45_1 = new StringBuilder().append("jh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param4 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L13;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L13;
            }
          }
          L14: {
            stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
            stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param5 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param6 + ',' + param7 + ')');
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

    final void a(String param0, byte param1, kg param2, int param3, int param4) {
        ol var7 = null;
        if (!(param0 != null)) {
            this.field_b = null;
            return;
        }
        if (this.field_k == param2) {
            if (this.field_f) {
                if (this.field_l == 0) {
                    if (this.field_d != null) {
                        if (this.field_d.equals(param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_l = 0;
            this.field_f = true;
            this.field_k = param2;
            this.field_d = param0;
            int var6_int = -37 / ((param1 - -50) / 49);
            var7 = this.a((byte) 52, param3, param2, param0);
            var7.field_g[0] = param4;
            var7.field_g[param0.length()] = param2.a(param0) + param4;
            eh.a(var7, (byte) 79, param0, param2, 0);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jh.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 != -1) {
            field_h = (ti) null;
            field_g = null;
            field_h = null;
            return;
        }
        field_g = null;
        field_h = null;
    }

    private final ol a(byte param0, int param1, kg param2, String param3) {
        ol var5 = null;
        RuntimeException var5_ref = null;
        ol var6 = null;
        ol stackIn_2_0 = null;
        ol stackIn_4_0 = null;
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
        ol stackOut_3_0 = null;
        ol stackOut_1_0 = null;
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
            if (param0 > 17) {
              var6 = new ol(-param2.field_y + param1, param1 + param2.field_t, param3.length());
              var5 = var6;
              this.field_b = new ol[]{var6};
              stackOut_3_0 = (ol) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ol) null;
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
            stackOut_5_1 = new StringBuilder().append("jh.M(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(sg param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sg var3 = null;
        int var4 = 0;
        sg var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      if (-1 != (param0.field_l ^ -1)) {
                        break L4;
                      } else {
                        if (param0.field_f != 0) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 0;
                    L5: while (true) {
                      if (q.field_b <= var2_int) {
                        break L3;
                      } else {
                        var3 = eg.field_a[var2_int];
                        var7 = var3.field_i;
                        var6 = 2;
                        if (var4 != 0) {
                          if (var6 >= var7) {
                            break L1;
                          } else {
                            break L2;
                          }
                        } else {
                          L6: {
                            if (var6 != var7) {
                              break L6;
                            } else {
                              if (var3.field_l != param0.field_l) {
                                break L6;
                              } else {
                                if (param0.field_f == var3.field_f) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (param1 >= 11) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
                var5 = (sg) null;
                jh.a((sg) null, -103);
                break L1;
              }
              L7: {
                if (param0.field_j == null) {
                  break L7;
                } else {
                  break L7;
                }
              }
              mh.a(-27968, param0);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("jh.N(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
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

    public jh() {
    }

    static {
        field_n = new pd();
    }
}
