/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends em {
    private boolean field_p;
    private int field_m;
    private int field_i;
    static vj field_l;
    static String field_n;
    private int field_q;
    private int field_g;
    static String field_f;
    private String field_j;
    static int[] field_k;
    private rf field_o;
    private int field_h;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-11 < (hj.field_f ^ -1)) {
                L2: {
                  var3_int = 0;
                  if (eh.field_a) {
                    var3_int = 1;
                    eh.field_a = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                t.a(var3_int != 0, mg.a(true), tb.b((byte) -81), 2, qe.field_g);
                break L1;
              } else {
                if (!s.a((byte) -81)) {
                  wj.c();
                  ik.a(param1 + 11435, 320, 240);
                  DrPhlogistonSavesTheEarth.a(0, param1 + -423, param2, 0);
                  break L1;
                } else {
                  if (af.field_b != 0) {
                    dh.a(107, param2);
                    break L1;
                  } else {
                    kf.a(param0, false, (byte) -125);
                    DrPhlogistonSavesTheEarth.a(0, -120, param2, 0);
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param1 == 320) {
                break L3;
              } else {
                field_l = (vj) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("o.A(").append(param0).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 99) {
            o.a((byte) 0);
        }
        field_f = null;
        field_l = null;
        field_n = null;
        field_k = null;
    }

    final void a(rf param0, int param1, int param2, int param3, int param4, String param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        mi var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        mi stackIn_36_0 = null;
        mi stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        mi stackIn_37_0 = null;
        mi stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        mi stackIn_38_0 = null;
        mi stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
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
        mi stackOut_35_0 = null;
        mi stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        mi stackOut_37_0 = null;
        mi stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        mi stackOut_36_0 = null;
        mi stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        int stackOut_36_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
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
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 == (param4 ^ -1)) {
                param4 = param0.field_E;
                break L1;
              } else {
                break L1;
              }
            }
            if (param5 == null) {
              this.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (this.field_o != param0) {
                  break L2;
                } else {
                  if (this.field_p) {
                    break L2;
                  } else {
                    if (this.field_h != param2) {
                      break L2;
                    } else {
                      if (param6 != this.field_q) {
                        break L2;
                      } else {
                        if (param4 != this.field_i) {
                          break L2;
                        } else {
                          if (this.field_g != param7) {
                            break L2;
                          } else {
                            if (param1 != this.field_m) {
                              break L2;
                            } else {
                              if (null == this.field_j) {
                                break L2;
                              } else {
                                if (this.field_j.equals(param5)) {
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
                this.field_o = param0;
                this.field_j = param5;
                this.field_h = param2;
                this.field_i = param4;
                this.field_g = param7;
                this.field_q = param6;
                this.field_m = param1;
                this.field_p = false;
                var17 = new String[param0.a(param5, param1) - -1];
                var18 = var17;
                var11 = -79 % ((-53 - param3) / 42);
                var10 = Math.max(1, param0.a(param5, new int[]{param1}, var18));
                if (-4 != (this.field_q ^ -1)) {
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
                this.field_a = new mi[var10];
                if (this.field_q != 0) {
                  if (-2 == (this.field_q ^ -1)) {
                    var12 = (-(this.field_i * var10) + this.field_g >> -1702148447) + param0.field_x;
                    break L4;
                  } else {
                    if ((this.field_q ^ -1) != -3) {
                      L5: {
                        var13 = (-(var10 * this.field_i) + this.field_g) / (1 + var10);
                        if ((var13 ^ -1) > -1) {
                          var13 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.field_i = this.field_i + var13;
                      var12 = param0.field_x - -var13;
                      break L4;
                    } else {
                      var12 = this.field_g + (-param0.field_S + -(this.field_i * var10));
                      break L4;
                    }
                  }
                } else {
                  var12 = param0.field_x;
                  break L4;
                }
              }
              var13 = 0;
              L6: while (true) {
                if (var13 >= var10) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var14 = var17[var13];
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = var12 + -param0.field_x;
                    stackOut_35_3 = var12 + param0.field_S;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_37_2 = stackOut_35_2;
                    stackIn_37_3 = stackOut_35_3;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    if (var14 == null) {
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
                      break L7;
                    } else {
                      stackOut_36_0 = null;
                      stackOut_36_1 = null;
                      stackOut_36_2 = stackIn_36_2;
                      stackOut_36_3 = stackIn_36_3;
                      stackOut_36_4 = var14.length();
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      stackIn_38_3 = stackOut_36_3;
                      stackIn_38_4 = stackOut_36_4;
                      break L7;
                    }
                  }
                  L8: {
                    var15 = new mi(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                    var15.field_a[0] = 0;
                    if (var14 != null) {
                      L9: {
                        var15.field_a[var14.length()] = param0.b(var14);
                        stackOut_40_0 = 0;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if ((param2 ^ -1) != -4) {
                          stackOut_42_0 = stackIn_42_0;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L9;
                        } else {
                          stackOut_41_0 = stackIn_41_0;
                          stackOut_41_1 = this.a(param1, var14, param0.b(var14), 0);
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L9;
                        }
                      }
                      dc.a(stackIn_43_0 != 0, stackIn_43_1, var14, param0, var15);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  this.field_a[var13] = var15;
                  var12 = var12 + param4;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) (var9);
            stackOut_46_1 = new StringBuilder().append("o.C(");
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
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L10;
            }
          }
          L11: {
            stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L11;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L11;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param6 + ',' + param7 + ')');
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

    final void a(rf param0, String param1, int param2, int param3, int param4) {
        mi var7 = null;
        mi var8 = null;
        if (!(param1 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_o == param0) {
            if (this.field_p) {
                if (this.field_h == 0) {
                    if (this.field_j != null) {
                        if (this.field_j.equals(param1)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_h = param4;
            this.field_p = true;
            this.field_o = param0;
            this.field_j = param1;
            var7 = this.a(param0, (byte) 76, param3, param1);
            var8 = var7;
            var7.field_a[0] = param2;
            var8.field_a[param1.length()] = param0.b(param1) + param2;
            dc.a(false, 0, param1, param0, var8);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "o.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(rf param0, int param1, int param2, String param3, boolean param4) {
        mi var8 = null;
        int var7 = 0;
        if (param3 == null) {
            this.field_a = null;
            return;
        }
        if (param0 == this.field_o) {
            if (this.field_p) {
                if (-2 == (this.field_h ^ -1)) {
                    if (this.field_j != null) {
                        if (!(!this.field_j.equals(param3))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_h = 1;
            this.field_p = true;
            this.field_o = param0;
            if (param4) {
                this.field_i = 109;
            }
            var8 = this.a(param0, (byte) 76, param2, param3);
            var7 = param0.b(param3);
            var8.field_a[0] = -(var7 >> -917468959) + param1;
            var8.field_a[param3.length()] = (var7 >> 1339919489) + param1;
            dc.a(param4, 0, param3, param0, var8);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "o.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(rf param0, int param1, boolean param2, int param3, String param4) {
        mi var8 = null;
        mi var9 = null;
        if (!(param4 != null)) {
            this.field_a = null;
            return;
        }
        if (this.field_o == param0) {
            if (this.field_p) {
                if (2 == this.field_h) {
                    if (null != this.field_j) {
                        if (this.field_j.equals(param4)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_j = param4;
            this.field_o = param0;
            this.field_h = 2;
            this.field_p = true;
            var8 = this.a(param0, (byte) 76, param3, param4);
            var9 = var8;
            var9.field_a[0] = -param0.b(param4) + param1;
            var9.field_a[param4.length()] = param1;
            dc.a(param2, 0, param4, param0, var9);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "o.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final mi a(rf param0, byte param1, int param2, String param3) {
        mi var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        mi var7 = null;
        mi stackIn_3_0 = null;
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
        mi stackOut_2_0 = null;
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
              if (param1 == 76) {
                break L1;
              } else {
                var6 = (String) null;
                this.a((rf) null, -123, false, -9, (String) null);
                break L1;
              }
            }
            var7 = new mi(param2 + -param0.field_x, param0.field_S + param2, param3.length());
            var5 = var7;
            this.field_a = new mi[]{var7};
            stackOut_2_0 = (mi) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("o.D(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public o() {
    }

    static {
        field_n = "Previous";
        field_k = new int[]{10, 3, 5, 2, 3, 6, 1, 1, 7, 8, 9, 6, 3, 1, 5, 1, 5, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 3, 1, 3, 5, 2, 10, 3, 1, 3, 3, 3, 5, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
