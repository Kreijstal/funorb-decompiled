/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends uj {
    private String field_d;
    static int field_m;
    private int field_i;
    private int field_e;
    static String field_j;
    private uc field_g;
    static int field_n;
    private int field_f;
    private int field_o;
    static String field_k;
    private int field_h;
    private boolean field_l;

    final void a(int param0, int param1, uc param2, int param3, String param4) {
        kp var8 = null;
        int var7 = 0;
        if (param4 == null) {
            this.field_c = null;
            return;
        }
        if (this.field_g == param2 && this.field_l && this.field_e == 1 && null != this.field_d) {
            if (!(!this.field_d.equals(param4))) {
                return;
            }
        }
        try {
            this.field_e = 1;
            this.field_l = true;
            this.field_g = param2;
            var8 = this.a(param2, param3, param4, param1 ^ 1);
            var7 = param2.a(param4);
            var8.field_b[param1] = -(var7 >> -1117462303) + param0;
            var8.field_b[param4.length()] = (var7 >> 1015020929) + param0;
            rd.a(param2, param1 + 10580, 0, param4, var8);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "cm.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, uc param1, byte param2, int param3, int param4, String param5, int param6, int param7) {
        kp stackIn_37_0;
        kp stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        kp stackIn_38_0 = null;
        kp stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        int stackIn_38_4 = 0;
        uc stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        uc stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        kp var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        var15 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                param0 = param1.field_q;
                break L1;
              }
            }
            if (param5 != null) {
              L2: {
                if (param1 != this.field_g) {
                  break L2;
                } else {
                  if (this.field_l) {
                    break L2;
                  } else {
                    if (param6 != this.field_e) {
                      break L2;
                    } else {
                      if (param7 != this.field_o) {
                        break L2;
                      } else {
                        if (param0 != this.field_f) {
                          break L2;
                        } else {
                          if (param3 != this.field_h) {
                            break L2;
                          } else {
                            if (this.field_i != param4) {
                              break L2;
                            } else {
                              if (this.field_d == null) {
                                break L2;
                              } else {
                                if (!this.field_d.equals(param5)) {
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
              this.field_h = param3;
              if (param2 == 26) {
                L3: {
                  this.field_l = false;
                  this.field_f = param0;
                  this.field_e = param6;
                  this.field_o = param7;
                  this.field_g = param1;
                  this.field_d = param5;
                  this.field_i = param4;
                  var16 = new String[1 + param1.c(param5, param4)];
                  var17 = var16;
                  var10 = Math.max(1, param1.a(param5, new int[]{param4}, var17));
                  if (this.field_o != 3) {
                    break L3;
                  } else {
                    if (var10 == 1) {
                      this.field_o = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  this.field_c = new kp[var10];
                  if (this.field_o != 0) {
                    if (this.field_o != 1) {
                      if (this.field_o != 2) {
                        L5: {
                          var12 = (this.field_h + -(var10 * this.field_f)) / (var10 - -1);
                          if (-1 < (var12 ^ -1)) {
                            var12 = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_f = this.field_f + var12;
                        var11 = var12 + param1.field_x;
                        break L4;
                      } else {
                        var11 = -param1.field_t + this.field_h + -(var10 * this.field_f);
                        break L4;
                      }
                    } else {
                      var11 = (this.field_h + -(var10 * this.field_f) >> -700734943) + param1.field_x;
                      break L4;
                    }
                  } else {
                    var11 = param1.field_x;
                    break L4;
                  }
                }
                var12 = 0;
                L6: while (true) {
                  if (var12 >= var10) {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L7: {
                      var13 = var16[var12];
                      stackIn_37_0 = null;

                      stackIn_37_1 = null;

                      stackIn_37_2 = var11 + -param1.field_x;

                      stackIn_37_3 = param1.field_t + var11;

                      if (var13 != null) {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = var13.length();
                        break L7;
                      } else {
                        stackIn_38_0 = null;
                        stackIn_38_1 = null;
                        stackIn_38_2 = stackIn_37_2;
                        stackIn_38_3 = stackIn_37_3;
                        stackIn_38_4 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      var14 = new kp(stackIn_38_2, stackIn_38_3, stackIn_38_4);
                      var14.field_b[0] = 0;
                      if (var13 != null) {
                        L9: {
                          var14.field_b[var13.length()] = param1.a(var13);
                          stackIn_42_0 = (uc) (param1);

                          stackIn_42_1 = 10580;

                          if ((param6 ^ -1) != -4) {
                            stackIn_43_0 = (uc) ((Object) stackIn_42_0);
                            stackIn_43_1 = stackIn_42_1;
                            stackIn_43_2 = 0;
                            break L9;
                          } else {
                            stackIn_43_0 = (uc) ((Object) stackIn_42_0);
                            stackIn_43_1 = stackIn_42_1;
                            stackIn_43_2 = this.a(-127, param1.a(var13), var13, param4);
                            break L9;
                          }
                        }
                        rd.a(stackIn_43_0, stackIn_43_1, stackIn_43_2, var13, var14);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    this.field_c[var12] = var14;
                    var11 = var11 + param0;
                    var12++;
                    continue L6;
                  }
                }
              } else {
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
          L10: {
            var9 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var9);

            stackIn_48_1 = new StringBuilder().append("cm.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L10;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L11;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param6 + ',' + param7 + ')');
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

    final static int a(int param0, int param1) {
        int var2 = (param1 * param1 >> -792541108) * param1 >> 116629388;
        int var3 = param1 * 6 + -61440;
        if (param0 < 27) {
            field_m = -76;
        }
        int var4 = (var3 * param1 >> -1307584404) + 40960;
        return var2 * var4 >> 2091207020;
    }

    public static void a(int param0) {
        field_j = null;
        field_k = null;
        if (param0 != 31003) {
            field_j = (String) null;
        }
    }

    private final kp a(uc param0, int param1, String param2, int param3) {
        kp var5 = null;
        RuntimeException var5_ref = null;
        kp var6 = null;
        kp stackIn_2_0 = null;
        kp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == 1) {
              var6 = new kp(-param0.field_x + param1, param0.field_t + param1, param2.length());
              var5 = var6;
              this.field_c = new kp[]{var6};
              stackIn_4_0 = (kp) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("cm.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, String param1) {
        try {
            wb.a(param1, 390);
            jk.a(ii.field_m, (byte) -79, false);
            if (param0 != -21) {
                field_k = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "cm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, uc param2, String param3, int param4) {
        kp var8 = null;
        kp var9 = null;
        if (!(param3 != null)) {
            this.field_c = null;
            return;
        }
        if (param1 != -22746) {
            this.field_l = true;
        }
        if (param2 == this.field_g && this.field_l && (this.field_e ^ -1) == -3 && this.field_d != null && this.field_d.equals(param3)) {
            return;
        }
        try {
            this.field_l = true;
            this.field_d = param3;
            this.field_e = 2;
            this.field_g = param2;
            var8 = this.a(param2, param0, param3, 1);
            var9 = var8;
            var9.field_b[0] = param4 + -param2.a(param3);
            var9.field_b[param3.length()] = param4;
            rd.a(param2, param1 ^ -29070, 0, param3, var9);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "cm.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(String param0, byte param1, uc param2, int param3, int param4) {
        kp var8 = null;
        kp var9 = null;
        if (param0 == null) {
            this.field_c = null;
            return;
        }
        if (param2 == this.field_g && this.field_l && this.field_e == 0 && this.field_d != null && this.field_d.equals(param0)) {
            return;
        }
        try {
            this.field_e = 0;
            this.field_d = param0;
            this.field_l = true;
            this.field_g = param2;
            var8 = this.a(param2, param3, param0, 1);
            var9 = var8;
            int var7 = -83 / ((param1 - -22) / 59);
            var8.field_b[0] = param4;
            var9.field_b[param0.length()] = param2.a(param0) + param4;
            rd.a(param2, 10580, 0, param0, var9);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "cm.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public cm() {
    }

    static {
        field_n = 20;
        field_j = "Resume Game";
        field_k = "Go Back";
    }
}
