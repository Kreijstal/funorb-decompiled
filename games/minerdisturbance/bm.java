/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends nf {
    private int field_s;
    private we field_m;
    private int field_p;
    private int field_j;
    private String field_n;
    private boolean field_t;
    private int field_l;
    static ag field_o;
    private int field_i;
    static String field_k;
    static String field_r;
    static String field_q;

    final static java.applet.Applet c(int param0) {
        if (param0 >= -73) {
            return (java.applet.Applet) null;
        }
        if (of.field_b != null) {
            return of.field_b;
        }
        return (java.applet.Applet) ((Object) j.field_h);
    }

    final void a(int param0, int param1, we param2, String param3, int param4, byte param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        mg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        mg stackIn_36_0 = null;
        mg stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        mg stackIn_37_0 = null;
        mg stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        mg stackIn_38_0 = null;
        mg stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        we stackIn_40_0 = null;
        String stackIn_40_1 = null;
        we stackIn_41_0 = null;
        String stackIn_41_1 = null;
        we stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_42_2 = 0;
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
        mg stackOut_35_0 = null;
        mg stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        mg stackOut_37_0 = null;
        mg stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        mg stackOut_36_0 = null;
        mg stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        we stackOut_39_0 = null;
        String stackOut_39_1 = null;
        we stackOut_41_0 = null;
        String stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        we stackOut_40_0 = null;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
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
        var15 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param6 != 0) {
                break L1;
              } else {
                param6 = param2.field_G;
                break L1;
              }
            }
            if (param3 == null) {
              this.field_f = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 != this.field_m) {
                  break L2;
                } else {
                  if (this.field_t) {
                    break L2;
                  } else {
                    if (this.field_l != param7) {
                      break L2;
                    } else {
                      if (param0 != this.field_j) {
                        break L2;
                      } else {
                        if (this.field_i != param6) {
                          break L2;
                        } else {
                          if (this.field_p != param1) {
                            break L2;
                          } else {
                            if (this.field_s != param4) {
                              break L2;
                            } else {
                              if (this.field_n == null) {
                                break L2;
                              } else {
                                if (this.field_n.equals(param3)) {
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
                this.field_l = param7;
                this.field_n = param3;
                this.field_s = param4;
                this.field_t = false;
                this.field_p = param1;
                this.field_i = param6;
                if (param5 > 61) {
                  break L3;
                } else {
                  field_r = (String) null;
                  break L3;
                }
              }
              L4: {
                this.field_j = param0;
                this.field_m = param2;
                var16 = new String[param2.a(param3, param4) + 1];
                var17 = var16;
                var10 = Math.max(1, param2.a(param3, new int[]{param4}, var17));
                if ((this.field_j ^ -1) != -4) {
                  break L4;
                } else {
                  if (-2 == (var10 ^ -1)) {
                    this.field_j = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                this.field_f = new mg[var10];
                if (this.field_j != 0) {
                  if (this.field_j == 1) {
                    var11 = param2.field_I + (this.field_p + -(this.field_i * var10) >> 1069152065);
                    break L5;
                  } else {
                    if (this.field_j == 2) {
                      var11 = this.field_p + -param2.field_E + -(this.field_i * var10);
                      break L5;
                    } else {
                      L6: {
                        var12 = (-(this.field_i * var10) + this.field_p) / (1 + var10);
                        if (-1 >= (var12 ^ -1)) {
                          break L6;
                        } else {
                          var12 = 0;
                          break L6;
                        }
                      }
                      this.field_i = this.field_i + var12;
                      var11 = var12 + param2.field_I;
                      break L5;
                    }
                  }
                } else {
                  var11 = param2.field_I;
                  break L5;
                }
              }
              var12 = 0;
              L7: while (true) {
                if (var12 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L8: {
                    var13 = var16[var12];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = -param2.field_I + var11;
                    stackOut_35_3 = param2.field_E + var11;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (var13 == null) {
                      stackOut_37_0 = null;
                      stackOut_37_1 = null;
                      stackOut_37_2 = stackIn_37_2;
                      stackOut_37_3 = stackIn_37_3;
                      stackOut_37_4 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      stackIn_38_3 = stackOut_37_3;
                      stackIn_38_4 = stackOut_37_4;
                      break L8;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var13.length();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L8;
                    }
                  }
                  L9: {
                    var14 = new mg(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var14.field_d[0] = 0;
                    if (var13 == null) {
                      break L9;
                    } else {
                      L10: {
                        var14.field_d[var13.length()] = param2.a(var13);
                        stackOut_39_0 = (we) (param2);
                        stackOut_39_1 = (String) (var13);
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if ((param7 ^ -1) == -4) {
                          stackOut_41_0 = (we) ((Object) stackIn_41_0);
                          stackOut_41_1 = (String) ((Object) stackIn_41_1);
                          stackOut_41_2 = this.a(101, var13, param2.a(var13), param4);
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          stackIn_42_2 = stackOut_41_2;
                          break L10;
                        } else {
                          stackOut_40_0 = (we) ((Object) stackIn_40_0);
                          stackOut_40_1 = (String) ((Object) stackIn_40_1);
                          stackOut_40_2 = 0;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          break L10;
                        }
                      }
                      pf.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, -19453, var14);
                      break L9;
                    }
                  }
                  var11 = var11 + param6;
                  this.field_f[var12] = var14;
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
            stackOut_45_1 = new StringBuilder().append("bm.B(").append(param0).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    private final mg a(int param0, String param1, byte param2, we param3) {
        mg var5 = null;
        RuntimeException var5_ref = null;
        mg var6 = null;
        mg stackIn_2_0 = null;
        mg stackIn_4_0 = null;
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
        mg stackOut_3_0 = null;
        mg stackOut_1_0 = null;
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
            var6 = new mg(param0 - param3.field_I, param0 + param3.field_E, param1.length());
            var5 = var6;
            this.field_f = new mg[]{var6};
            if (param2 >= 18) {
              stackOut_3_0 = (mg) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (mg) null;
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
            stackOut_5_1 = new StringBuilder().append("bm.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
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
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, String param2, we param3, int param4) {
        mg var8 = null;
        mg var9 = null;
        if (!(param2 != null)) {
            this.field_f = null;
            return;
        }
        if (param3 == this.field_m) {
            if (this.field_t) {
                if (-3 == (this.field_l ^ -1)) {
                    if (this.field_n != null) {
                        if (!(!this.field_n.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_l = 2;
            this.field_n = param2;
            this.field_t = true;
            this.field_m = param3;
            var8 = this.a(param4, param2, (byte) 51, param3);
            var9 = var8;
            var9.field_d[0] = param1 + -param3.a(param2);
            var9.field_d[param2.length()] = param1;
            pf.a(param3, param2, param0, -19453, var9);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_o = (ag) null;
        }
        field_r = null;
        field_q = null;
        field_k = null;
        field_o = null;
    }

    final void a(int param0, we param1, String param2, int param3, int param4) {
        mg var7 = null;
        mg var8 = null;
        if (!(param2 != null)) {
            this.field_f = null;
            return;
        }
        if (param1 == this.field_m) {
            if (this.field_t) {
                if (this.field_l == 0) {
                    if (this.field_n != null) {
                        if (!(!this.field_n.equals(param2))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_m = param1;
            this.field_n = param2;
            this.field_l = 0;
            this.field_t = true;
            var7 = this.a(param4, param2, (byte) 19, param1);
            var8 = var7;
            if (param3 <= 62) {
                this.field_n = (String) null;
            }
            var7.field_d[0] = param0;
            var8.field_d[param2.length()] = param1.a(param2) + param0;
            pf.a(param1, param2, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public bm() {
    }

    final void a(String param0, int param1, int param2, we param3, int param4) {
        mg var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_f = null;
            return;
        }
        if (param3 == this.field_m) {
            if (this.field_t) {
                if (this.field_l == 1) {
                    if (null != this.field_n) {
                        if (this.field_n.equals(param0)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_t = true;
            this.field_m = param3;
            this.field_l = 1;
            var8 = this.a(param2, param0, (byte) 87, param3);
            var7 = param3.a(param0);
            var8.field_d[0] = param4 + -(var7 >> -1445522975);
            if (param1 != 27994) {
                this.field_l = 113;
            }
            var8.field_d[param0.length()] = param4 - -(var7 >> -45995743);
            pf.a(param3, param0, 0, -19453, var8);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "bm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_o = new ag();
        field_k = "Change display name";
        field_r = "Player";
    }
}
