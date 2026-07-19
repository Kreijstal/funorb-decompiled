/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends mp {
    private int field_j;
    private int field_m;
    static boolean field_h;
    private boolean field_o;
    private fm field_f;
    static int field_g;
    private int field_n;
    private int field_k;
    private int field_l;
    private String field_i;

    private final td a(fm param0, String param1, int param2, int param3) {
        td var5 = null;
        RuntimeException var5_ref = null;
        td var6 = null;
        td stackIn_3_0 = null;
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
        td stackOut_2_0 = null;
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
              if (param3 == 1) {
                break L1;
              } else {
                this.field_j = -34;
                break L1;
              }
            }
            var6 = new td(param2 - param0.field_C, param2 + param0.field_r, param1.length());
            var5 = var6;
            this.field_e = new td[]{var6};
            stackOut_2_0 = (td) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("sp.L(");
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, String param3, fm param4) {
        td var8 = null;
        td var9 = null;
        if (param3 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param4) {
            if (this.field_o) {
                if ((this.field_m ^ -1) == -3) {
                    if (this.field_i != null) {
                        if (!(!this.field_i.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = 2;
            this.field_o = param2 ? true : false;
            this.field_i = param3;
            this.field_f = param4;
            var8 = this.a(param4, param3, param1, 1);
            var9 = var8;
            var9.field_e[0] = -param4.a(param3) + param0;
            var9.field_e[param3.length()] = param0;
            qd.a(param4, 0, param3, 109, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, fm param2, String param3, int param4) {
        td var8 = null;
        td var9 = null;
        if (!(param3 != null)) {
            this.field_e = null;
            return;
        }
        if (param2 == this.field_f) {
            if (this.field_o) {
                if (-1 == (this.field_m ^ -1)) {
                    if (this.field_i != null) {
                        if (!(!this.field_i.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_o = true;
            this.field_m = 0;
            this.field_i = param3;
            int var7 = -125 / ((-24 - param1) / 46);
            this.field_f = param2;
            var8 = this.a(param2, param3, param4, 1);
            var9 = var8;
            var8.field_e[0] = param0;
            var9.field_e[param3.length()] = param0 - -param2.a(param3);
            qd.a(param2, 0, param3, 116, var9);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        java.awt.Frame var2 = null;
        L0: {
          nb.field_a.h(param0 ^ -123);
          if (pj.field_I == null) {
            pj.field_I = new ta(nb.field_a, pm.field_P);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          var2 = (java.awt.Frame) null;
          sp.a((go) null, -50, (java.awt.Frame) null);
          nb.field_a.b(param0 + 3016, pj.field_I);
          return;
        } else {
          nb.field_a.b(param0 + 3016, pj.field_I);
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6, fm param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        td var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        td stackIn_38_0 = null;
        td stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        td stackIn_39_0 = null;
        td stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        td stackIn_40_0 = null;
        td stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        fm stackIn_43_0 = null;
        fm stackIn_44_0 = null;
        fm stackIn_45_0 = null;
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
        td stackOut_37_0 = null;
        td stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        td stackOut_39_0 = null;
        td stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        td stackOut_38_0 = null;
        td stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        fm stackOut_42_0 = null;
        fm stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        fm stackOut_43_0 = null;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param4 <= -16) {
              L1: {
                if (param3 != 0) {
                  break L1;
                } else {
                  param3 = param7.field_w;
                  break L1;
                }
              }
              if (param0 == null) {
                this.field_e = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (param7 != this.field_f) {
                    break L2;
                  } else {
                    if (this.field_o) {
                      break L2;
                    } else {
                      if (this.field_m != param1) {
                        break L2;
                      } else {
                        if (this.field_j != param5) {
                          break L2;
                        } else {
                          if (this.field_n != param3) {
                            break L2;
                          } else {
                            if (param2 != this.field_l) {
                              break L2;
                            } else {
                              if (param6 != this.field_k) {
                                break L2;
                              } else {
                                if (null == this.field_i) {
                                  break L2;
                                } else {
                                  if (this.field_i.equals(param0)) {
                                    decompiledRegionSelector0 = 2;
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
                  this.field_l = param2;
                  this.field_j = param5;
                  this.field_k = param6;
                  this.field_f = param7;
                  this.field_i = param0;
                  this.field_n = param3;
                  this.field_o = false;
                  this.field_m = param1;
                  var16 = new String[param7.b(param0, param6) + 1];
                  var17 = var16;
                  var10 = Math.max(1, param7.a(param0, new int[]{param6}, var17));
                  if ((this.field_j ^ -1) != -4) {
                    break L3;
                  } else {
                    if (-2 == (var10 ^ -1)) {
                      this.field_j = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    this.field_e = new td[var10];
                    if (this.field_j == 0) {
                      break L5;
                    } else {
                      L6: {
                        if (this.field_j != 1) {
                          break L6;
                        } else {
                          var11 = param7.field_C + (this.field_l + -(var10 * this.field_n) >> -1852565727);
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (2 != this.field_j) {
                          break L7;
                        } else {
                          var11 = -(this.field_n * var10) + -param7.field_r + this.field_l;
                          if (var15 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        var12 = (-(this.field_n * var10) + this.field_l) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L8;
                        } else {
                          var12 = 0;
                          break L8;
                        }
                      }
                      this.field_n = this.field_n + var12;
                      var11 = param7.field_C + var12;
                      if (var15 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param7.field_C;
                  break L4;
                }
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var10) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var13 = var16[var12];
                    if (var15 == 0) {
                      L10: {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = -param7.field_C + var11;
                        stackOut_37_3 = var11 + param7.field_r;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_39_3 = stackOut_37_3;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        if (var13 != null) {
                          stackOut_39_0 = null;
                          stackOut_39_1 = null;
                          stackOut_39_2 = stackIn_39_2;
                          stackOut_39_3 = stackIn_39_3;
                          stackOut_39_4 = var13.length();
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          stackIn_40_4 = stackOut_39_4;
                          break L10;
                        } else {
                          stackOut_38_0 = null;
                          stackOut_38_1 = null;
                          stackOut_38_2 = stackIn_38_2;
                          stackOut_38_3 = stackIn_38_3;
                          stackOut_38_4 = 0;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          stackIn_40_4 = stackOut_38_4;
                          break L10;
                        }
                      }
                      L11: {
                        var14 = new td(stackIn_40_2, stackIn_40_3, stackIn_40_4);
                        var14.field_e[0] = 0;
                        if (var13 != null) {
                          L12: {
                            var14.field_e[var13.length()] = param7.a(var13);
                            stackOut_42_0 = (fm) (param7);
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if ((param1 ^ -1) != -4) {
                              stackOut_44_0 = (fm) ((Object) stackIn_44_0);
                              stackOut_44_1 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              break L12;
                            } else {
                              stackOut_43_0 = (fm) ((Object) stackIn_43_0);
                              stackOut_43_1 = this.a(var13, 0, param7.a(var13), param6);
                              stackIn_45_0 = stackOut_43_0;
                              stackIn_45_1 = stackOut_43_1;
                              break L12;
                            }
                          }
                          qd.a(stackIn_45_0, stackIn_45_1, var13, 120, var14);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      this.field_e[var12] = var14;
                      var11 = var11 + param3;
                      var12++;
                      continue L9;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var9);
            stackOut_48_1 = new StringBuilder().append("sp.O(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L13;
            } else {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L13;
            }
          }
          L14: {
            stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param7 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(fm param0, String param1, int param2, byte param3, int param4) {
        td var8 = null;
        int var7 = 0;
        if (param1 == null) {
            this.field_e = null;
            return;
        }
        if (this.field_f == param0) {
            if (this.field_o) {
                if (this.field_m == 1) {
                    if (this.field_i != null) {
                        if (!(!this.field_i.equals(param1))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = 1;
            this.field_f = param0;
            this.field_o = true;
            if (param3 != 65) {
                this.field_o = false;
            }
            var8 = this.a(param0, param1, param2, 1);
            var7 = param0.a(param1);
            var8.field_e[0] = param4 + -(var7 >> 1001919233);
            var8.field_e[param1.length()] = param4 - -(var7 >> 1668492769);
            qd.a(param0, 0, param1, param3 ^ 61, var8);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sp.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(go param0, int param1, java.awt.Frame param2) {
        RuntimeException runtimeException = null;
        di var3 = null;
        int var4 = 0;
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
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(param2, true);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (0 != var3.field_f) {
                        break L5;
                      } else {
                        vd.a(false, 10L);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (1 != var3.field_f) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    vd.a(false, 100L);
                    break L4;
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
                if (param1 == 1) {
                  param2.setVisible(false);
                  param2.dispose();
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("sp.N(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public sp() {
    }

    static {
        field_h = true;
    }
}
