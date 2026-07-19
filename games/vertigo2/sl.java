/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ro {
    static String[] field_q;
    static String field_x;
    static String field_s;
    private String field_r;
    private int field_t;
    static boolean[] field_m;
    private cc field_p;
    static long field_w;
    private int field_j;
    private int field_k;
    static int field_l;
    private int field_n;
    private int field_v;
    static lg field_u;
    private boolean field_o;

    final void a(int param0, cc param1, String param2, int param3, int param4) {
        lq var8 = null;
        int var7 = 0;
        if (param3 != -12558) {
            return;
        }
        if (!(param2 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_p == param1) {
            if (this.field_o) {
                if (this.field_n == 1) {
                    if (null != this.field_r) {
                        if (this.field_r.equals(param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_n = 1;
            this.field_p = param1;
            this.field_o = true;
            var8 = this.a(param2, (byte) 45, param1, param0);
            var7 = param1.c(param2);
            var8.field_c[0] = param4 - (var7 >> 1649810497);
            var8.field_c[param2.length()] = param4 - -(var7 >> -1854206975);
            tn.a(var8, param2, param1, (byte) 28, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean b(int param0) {
        int var1 = -92 / ((param0 - 49) / 40);
        return dc.field_L != null ? true : uj.field_g;
    }

    final void b(int param0, cc param1, String param2, int param3, int param4) {
        lq var7 = null;
        lq var8 = null;
        if (param2 == null) {
            this.field_c = null;
            return;
        }
        if (param1 == this.field_p) {
            if (this.field_o) {
                if (0 == this.field_n) {
                    if (null != this.field_r) {
                        if (this.field_r.equals(param2)) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_o = true;
            this.field_r = param2;
            this.field_n = 0;
            this.field_p = param1;
            if (param0 >= -84) {
                this.field_j = -69;
            }
            var7 = this.a(param2, (byte) 45, param1, param3);
            var8 = var7;
            var7.field_c[0] = param4;
            var8.field_c[param2.length()] = param1.c(param2) + param4;
            tn.a(var8, param2, param1, (byte) 17, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sl.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_q = null;
        field_u = null;
        field_x = null;
        field_m = null;
        field_s = null;
        if (param0 <= 25) {
            field_s = (String) null;
        }
    }

    final void a(int param0, String param1, int param2, cc param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        lq var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        lq stackIn_33_0 = null;
        lq stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        lq stackIn_34_0 = null;
        lq stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        lq stackIn_35_0 = null;
        lq stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        lq stackIn_37_0 = null;
        String stackIn_37_1 = null;
        cc stackIn_37_2 = null;
        int stackIn_37_3 = 0;
        lq stackIn_38_0 = null;
        String stackIn_38_1 = null;
        cc stackIn_38_2 = null;
        int stackIn_38_3 = 0;
        lq stackIn_39_0 = null;
        String stackIn_39_1 = null;
        cc stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        int stackIn_39_4 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        lq stackOut_32_0 = null;
        lq stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        lq stackOut_34_0 = null;
        lq stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        lq stackOut_33_0 = null;
        lq stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        lq stackOut_36_0 = null;
        String stackOut_36_1 = null;
        cc stackOut_36_2 = null;
        int stackOut_36_3 = 0;
        lq stackOut_38_0 = null;
        String stackOut_38_1 = null;
        cc stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        int stackOut_38_4 = 0;
        lq stackOut_37_0 = null;
        String stackOut_37_1 = null;
        cc stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        int stackOut_37_4 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param7) {
                break L1;
              } else {
                param7 = param3.field_D;
                break L1;
              }
            }
            if (param1 != null) {
              L2: {
                if (this.field_p != param3) {
                  break L2;
                } else {
                  if (this.field_o) {
                    break L2;
                  } else {
                    if (this.field_n != param4) {
                      break L2;
                    } else {
                      if (this.field_j != param0) {
                        break L2;
                      } else {
                        if (this.field_t != param7) {
                          break L2;
                        } else {
                          if (param5 != this.field_k) {
                            break L2;
                          } else {
                            if (param6 != this.field_v) {
                              break L2;
                            } else {
                              if (null == this.field_r) {
                                break L2;
                              } else {
                                if (!this.field_r.equals(param1)) {
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
                this.field_v = param6;
                this.field_p = param3;
                this.field_o = false;
                this.field_r = param1;
                this.field_k = param5;
                this.field_n = param4;
                this.field_j = param0;
                this.field_t = param7;
                var16 = new String[param2 + param3.b(param1, param6)];
                var17 = var16;
                var10 = Math.max(1, param3.a(param1, new int[]{param6}, var17));
                if (3 != this.field_j) {
                  break L3;
                } else {
                  if (1 != var10) {
                    break L3;
                  } else {
                    this.field_j = 1;
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != this.field_j) {
                  if (-2 != (this.field_j ^ -1)) {
                    if (2 == this.field_j) {
                      var11 = -(var10 * this.field_t) + (-param3.field_M + this.field_k);
                      break L4;
                    } else {
                      L5: {
                        var12 = (this.field_k - this.field_t * var10) / (var10 + 1);
                        if ((var12 ^ -1) > -1) {
                          var12 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var11 = var12 + param3.field_z;
                      this.field_t = this.field_t + var12;
                      break L4;
                    }
                  } else {
                    var11 = (this.field_k + -(var10 * this.field_t) >> -1621733695) + param3.field_z;
                    break L4;
                  }
                } else {
                  var11 = param3.field_z;
                  break L4;
                }
              }
              this.field_c = new lq[var10];
              var12 = 0;
              L6: while (true) {
                if (var10 <= var12) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L7: {
                    var13 = var16[var12];
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = var11 + -param3.field_z;
                    stackOut_32_3 = param3.field_M + var11;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    if (var13 == null) {
                      stackOut_34_0 = null;
                      stackOut_34_1 = null;
                      stackOut_34_2 = stackIn_34_2;
                      stackOut_34_3 = stackIn_34_3;
                      stackOut_34_4 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      stackIn_35_2 = stackOut_34_2;
                      stackIn_35_3 = stackOut_34_3;
                      stackIn_35_4 = stackOut_34_4;
                      break L7;
                    } else {
                      stackOut_33_0 = null;
                      stackOut_33_1 = null;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = var13.length();
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      stackIn_35_2 = stackOut_33_2;
                      stackIn_35_3 = stackOut_33_3;
                      stackIn_35_4 = stackOut_33_4;
                      break L7;
                    }
                  }
                  L8: {
                    var14 = new lq(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                    var14.field_c[0] = 0;
                    if (var13 == null) {
                      break L8;
                    } else {
                      L9: {
                        var14.field_c[var13.length()] = param3.c(var13);
                        stackOut_36_0 = (lq) (var14);
                        stackOut_36_1 = (String) (var13);
                        stackOut_36_2 = (cc) (param3);
                        stackOut_36_3 = 83;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_38_2 = stackOut_36_2;
                        stackIn_38_3 = stackOut_36_3;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        stackIn_37_2 = stackOut_36_2;
                        stackIn_37_3 = stackOut_36_3;
                        if (-4 == (param4 ^ -1)) {
                          stackOut_38_0 = (lq) ((Object) stackIn_38_0);
                          stackOut_38_1 = (String) ((Object) stackIn_38_1);
                          stackOut_38_2 = (cc) ((Object) stackIn_38_2);
                          stackOut_38_3 = stackIn_38_3;
                          stackOut_38_4 = this.a(var13, false, param3.c(var13), param6);
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          stackIn_39_3 = stackOut_38_3;
                          stackIn_39_4 = stackOut_38_4;
                          break L9;
                        } else {
                          stackOut_37_0 = (lq) ((Object) stackIn_37_0);
                          stackOut_37_1 = (String) ((Object) stackIn_37_1);
                          stackOut_37_2 = (cc) ((Object) stackIn_37_2);
                          stackOut_37_3 = stackIn_37_3;
                          stackOut_37_4 = 0;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          stackIn_39_3 = stackOut_37_3;
                          stackIn_39_4 = stackOut_37_4;
                          break L9;
                        }
                      }
                      tn.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, (byte) stackIn_39_3, stackIn_39_4);
                      break L8;
                    }
                  }
                  var11 = var11 + param7;
                  this.field_c[var12] = var14;
                  var12++;
                  continue L6;
                }
              }
            } else {
              this.field_c = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var9);
            stackOut_42_1 = new StringBuilder().append("sl.D(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(int param0, byte param1, cc param2, int param3, String param4) {
        lq var8 = null;
        lq var9 = null;
        if (param1 <= 83) {
            field_l = 50;
        }
        if (!(param4 != null)) {
            this.field_c = null;
            return;
        }
        if (this.field_p == param2) {
            if (this.field_o) {
                if (this.field_n == 2) {
                    if (this.field_r != null) {
                        if (!(!this.field_r.equals(param4))) {
                            return;
                        }
                    }
                }
            }
        }
        try {
            this.field_o = true;
            this.field_r = param4;
            this.field_n = 2;
            this.field_p = param2;
            var8 = this.a(param4, (byte) 45, param2, param3);
            var9 = var8;
            var9.field_c[0] = -param2.c(param4) + param0;
            var9.field_c[param4.length()] = param0;
            tn.a(var9, param4, param2, (byte) 119, 0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "sl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public sl() {
    }

    private final lq a(String param0, byte param1, cc param2, int param3) {
        lq var5 = null;
        RuntimeException var5_ref = null;
        lq var6 = null;
        lq stackIn_2_0 = null;
        lq stackIn_4_0 = null;
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
        lq stackOut_3_0 = null;
        lq stackOut_1_0 = null;
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
            var6 = new lq(param3 - param2.field_z, param2.field_M + param3, param0.length());
            var5 = var6;
            if (param1 == 45) {
              this.field_c = new lq[]{var6};
              stackOut_3_0 = (lq) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (lq) null;
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
            stackOut_5_1 = new StringBuilder().append("sl.A(");
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
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_x = "Return to Main Menu";
        field_s = "Add name";
        field_w = 20000000L;
    }
}
