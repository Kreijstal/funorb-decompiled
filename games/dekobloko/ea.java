/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends cf {
    private boolean field_w;
    private int field_B;
    static int field_p;
    private int field_s;
    static w field_A;
    static String field_u;
    private int field_v;
    private String field_m;
    static int field_n;
    static java.math.BigInteger field_k;
    static int field_r;
    static ck field_l;
    static w field_D;
    private mm field_o;
    static int field_t;
    private int field_z;
    private int field_q;
    static String field_y;
    static String field_C;
    static cd field_x;

    final void a(int param0, int param1, String param2, byte param3, mm param4) {
        ck[] discarded$1 = null;
        RuntimeException var6 = null;
        int var7 = 0;
        nf var8 = null;
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
            if (param2 != null) {
              L1: {
                if (param4 != this.field_o) {
                  break L1;
                } else {
                  if (!this.field_w) {
                    break L1;
                  } else {
                    if ((this.field_s ^ -1) != -2) {
                      break L1;
                    } else {
                      if (null == this.field_m) {
                        break L1;
                      } else {
                        if (!this.field_m.equals(param2)) {
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
                this.field_o = param4;
                this.field_s = 1;
                if (param3 == 8) {
                  break L2;
                } else {
                  discarded$1 = ea.a(54, 119, -124, -51, 32, 28);
                  break L2;
                }
              }
              this.field_w = true;
              var8 = this.a(-95, param0, param4, param2);
              var7 = param4.a(param2);
              var8.field_a[0] = param1 - (var7 >> -385423935);
              var8.field_a[param2.length()] = param1 - -(var7 >> -862867359);
              hm.a(var8, param4, 0, param2, param3 ^ -9);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("ea.M(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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

    final static boolean c(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 < -23) {
          if (hc.field_d >= 10) {
            if (v.field_d) {
              return false;
            } else {
              L0: {
                if (si.c(-12851)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              return stackIn_8_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ck var9 = null;
        ck var10 = null;
        ck var11 = null;
        ck var12 = null;
        ck var13 = null;
        Object var14 = null;
        int[] var15 = null;
        ck var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var18 = hk.field_l;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = hk.field_j;
        var8 = hk.field_i;
        var9 = new ck(param2, param3 - param2 * 2);
        var9.a();
        hk.d(0, 0, param2, param3 + -(2 * param2), param5, param4);
        var10 = new ck(param2, param2);
        var10.a();
        hk.a(0, 0, param2, param2, param5);
        var11 = new ck(16, param2);
        if (param1 != -20982) {
          return (ck[]) null;
        } else {
          L0: {
            var11.a();
            hk.a(0, 0, 16, param2, param5);
            var12 = new ck(param2, param2);
            var12.a();
            hk.a(0, 0, param2, param2, param4);
            var13 = new ck(16, param2);
            var13.a();
            hk.a(0, 0, 16, param2, param4);
            var14 = null;
            if (param0 > 0) {
              var16 = new ck(16, 16);
              var14 = var16;
              var16.a();
              hk.a(0, 0, 16, 16, param0);
              break L0;
            } else {
              break L0;
            }
          }
          hk.a(var18, var7, var8);
          return new ck[]{var10, var11, var10, var9, (ck) (var14), var9, var12, var13, var12};
        }
    }

    final void a(int param0, mm param1, String param2, int param3, int param4) {
        nf var7 = null;
        nf var8 = null;
        if (!(param2 != null)) {
            this.field_a = null;
            return;
        }
        if (param4 <= 11) {
            field_r = -109;
        }
        if (param1 == this.field_o) {
            if (this.field_w) {
                if (this.field_s == 0) {
                    if (null != this.field_m) {
                        if (!(!this.field_m.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_w = true;
            this.field_o = param1;
            this.field_m = param2;
            this.field_s = 0;
            var7 = this.a(-27, param3, param1, param2);
            var8 = var7;
            var7.field_a[0] = param0;
            var8.field_a[param2.length()] = param1.a(param2) + param0;
            hm.a(var8, param1, 0, param2, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ea.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, mm param2, int param3, int param4, int param5, int param6, int param7) {
        String discarded$1 = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        nf var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        nf stackIn_38_0 = null;
        nf stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        nf stackIn_39_0 = null;
        nf stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        int stackIn_39_3 = 0;
        nf stackIn_40_0 = null;
        nf stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        nf stackIn_43_0 = null;
        mm stackIn_43_1 = null;
        nf stackIn_44_0 = null;
        mm stackIn_44_1 = null;
        nf stackIn_45_0 = null;
        mm stackIn_45_1 = null;
        int stackIn_45_2 = 0;
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
        nf stackOut_37_0 = null;
        nf stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        nf stackOut_39_0 = null;
        nf stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        nf stackOut_38_0 = null;
        nf stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        nf stackOut_42_0 = null;
        mm stackOut_42_1 = null;
        nf stackOut_44_0 = null;
        mm stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        nf stackOut_43_0 = null;
        mm stackOut_43_1 = null;
        int stackOut_43_2 = 0;
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
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 == 0) {
                param7 = param2.field_S;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 != null) {
              L2: {
                if (this.field_o != param2) {
                  break L2;
                } else {
                  if (this.field_w) {
                    break L2;
                  } else {
                    if (this.field_s != param5) {
                      break L2;
                    } else {
                      if (this.field_q != param1) {
                        break L2;
                      } else {
                        if (param7 != this.field_B) {
                          break L2;
                        } else {
                          if (this.field_v != param4) {
                            break L2;
                          } else {
                            if (param3 != this.field_z) {
                              break L2;
                            } else {
                              if (null == this.field_m) {
                                break L2;
                              } else {
                                if (!this.field_m.equals(param0)) {
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
                this.field_B = param7;
                this.field_m = param0;
                this.field_q = param1;
                this.field_z = param3;
                this.field_o = param2;
                this.field_v = param4;
                this.field_w = false;
                this.field_s = param5;
                var16 = new String[param2.a(param0, param3) + 1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param0, new int[]{param3}, var17));
                if ((this.field_q ^ -1) != -4) {
                  break L3;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_q = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param6 >= 8) {
                  break L4;
                } else {
                  discarded$1 = ea.b(true);
                  break L4;
                }
              }
              L5: {
                L6: {
                  this.field_a = new nf[var10];
                  if (this.field_q != 0) {
                    break L6;
                  } else {
                    var11 = param2.field_R;
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (this.field_q == 1) {
                    break L7;
                  } else {
                    L8: {
                      if (this.field_q == 2) {
                        break L8;
                      } else {
                        L9: {
                          var12 = (-(var10 * this.field_B) + this.field_v) / (1 + var10);
                          if (-1 >= (var12 ^ -1)) {
                            break L9;
                          } else {
                            var12 = 0;
                            break L9;
                          }
                        }
                        var11 = var12 + param2.field_R;
                        this.field_B = this.field_B + var12;
                        if (var15 == 0) {
                          break L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var11 = -(this.field_B * var10) + -param2.field_K + this.field_v;
                    if (var15 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                var11 = (-(var10 * this.field_B) + this.field_v >> -531200703) + param2.field_R;
                break L5;
              }
              var12 = 0;
              L10: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var13 = var16[var12];
                  if (var15 == 0) {
                    L11: {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = -param2.field_R + var11;
                      stackOut_37_3 = param2.field_K + var11;
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
                        break L11;
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
                        break L11;
                      }
                    }
                    L12: {
                      var14 = new nf(stackIn_40_2, stackIn_40_3, stackIn_40_4);
                      var14.field_a[0] = 0;
                      if (var13 != null) {
                        L13: {
                          var14.field_a[var13.length()] = param2.a(var13);
                          stackOut_42_0 = (nf) (var14);
                          stackOut_42_1 = (mm) (param2);
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_44_1 = stackOut_42_1;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          if ((param5 ^ -1) == -4) {
                            stackOut_44_0 = (nf) ((Object) stackIn_44_0);
                            stackOut_44_1 = (mm) ((Object) stackIn_44_1);
                            stackOut_44_2 = this.a((byte) 64, param2.a(var13), var13, param3);
                            stackIn_45_0 = stackOut_44_0;
                            stackIn_45_1 = stackOut_44_1;
                            stackIn_45_2 = stackOut_44_2;
                            break L13;
                          } else {
                            stackOut_43_0 = (nf) ((Object) stackIn_43_0);
                            stackOut_43_1 = (mm) ((Object) stackIn_43_1);
                            stackOut_43_2 = 0;
                            stackIn_45_0 = stackOut_43_0;
                            stackIn_45_1 = stackOut_43_1;
                            stackIn_45_2 = stackOut_43_2;
                            break L13;
                          }
                        }
                        hm.a(stackIn_45_0, stackIn_45_1, stackIn_45_2, var13, -1);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    this.field_a[var12] = var14;
                    var11 = var11 + param7;
                    var12++;
                    continue L10;
                  } else {
                    return;
                  }
                }
              }
            } else {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var9 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) (var9);
            stackOut_48_1 = new StringBuilder().append("ea.R(");
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
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',').append(param1).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static String b(boolean param0) {
        String discarded$6 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        if (!wd.field_d) {
          if (jc.field_g >= o.field_b) {
            if (he.field_gb + o.field_b <= jc.field_g) {
              if (param0) {
                return null;
              } else {
                discarded$6 = ea.b(true);
                return null;
              }
            } else {
              return k.field_e;
            }
          } else {
            if (param0) {
              return null;
            } else {
              discarded$7 = ea.b(true);
              return null;
            }
          }
        } else {
          if (param0) {
            return null;
          } else {
            discarded$8 = ea.b(true);
            return null;
          }
        }
    }

    final void a(int param0, mm param1, int param2, int param3, String param4) {
        nf var8 = null;
        nf var9 = null;
        if (!(param4 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_o == param1) {
            if (this.field_w) {
                if ((this.field_s ^ -1) == -3) {
                    if (this.field_m != null) {
                        if (this.field_m.equals(param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = param4;
            this.field_o = param1;
            this.field_w = true;
            this.field_s = 2;
            var8 = this.a(88, param3, param1, param4);
            var9 = var8;
            var9.field_a[param0] = -param1.a(param4) + param2;
            var9.field_a[param4.length()] = param2;
            hm.a(var9, param1, 0, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ea.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -37) {
          return;
        } else {
          field_y = null;
          field_x = null;
          field_u = null;
          field_k = null;
          field_A = null;
          field_l = null;
          field_D = null;
          field_C = null;
          return;
        }
    }

    public ea() {
    }

    private final nf a(int param0, int param1, mm param2, String param3) {
        nf var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        nf var7 = null;
        nf stackIn_1_0 = null;
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
        nf stackOut_0_0 = null;
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
            var7 = new nf(param1 + -param2.field_R, param1 - -param2.field_K, param3.length());
            var5 = var7;
            var6 = -31 / ((27 - param0) / 34);
            this.field_a = new nf[]{var7};
            stackOut_0_0 = (nf) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("ea.L(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean d(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 > 34) {
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_y = (String) null;
          if (w.field_H == null) {
            if (!qd.e(-6)) {
              if (pd.field_f == null) {
                if (ab.c(48)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_n = 0;
        field_u = "Invite players";
        field_y = "Under the Sea";
        field_t = 0;
        field_p = 360;
        field_C = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_k = new java.math.BigInteger("65537");
    }
}
