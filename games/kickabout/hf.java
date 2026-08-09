/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static hh field_a;
    private int field_f;
    private int field_i;
    ut[] field_g;
    private int field_h;
    private int field_b;
    static bu field_e;
    private boolean field_d;
    ut field_j;
    private int field_c;

    final void a(int param0) {
        this.field_h = 0;
        this.field_i = 256;
        this.field_j = null;
        this.field_g = null;
        this.field_b = 0;
        if (param0 != -13136) {
            return;
        }
        this.field_f = 0;
        this.field_c = -1;
    }

    final hf a(boolean param0, ut[] param1) {
        RuntimeException var3 = null;
        hf var4 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var4 = (hf) null;
                this.a((hf) null, -70);
                break L1;
              }
            }
            this.field_g = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (hf) (this);
    }

    final hf b(byte param0, int param1) {
        if (param0 < 89) {
            hf.a(true);
        }
        this.field_h = param1;
        return (hf) (this);
    }

    final hf a(int param0, boolean param1) {
        if (!param1) {
            this.field_j = (ut) null;
        }
        this.field_c = param0;
        return (hf) (this);
    }

    final static String a(byte param0, int param1, int param2, byte[] param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        String var10 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var12 = new char[param1];
            var11 = var12;
            var4 = var11;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (param1 <= var6) {
                L2: {
                  if (param0 < -119) {
                    break L2;
                  } else {
                    var10 = (String) null;
                    hf.a((String) null, 99);
                    break L2;
                  }
                }
                stackIn_16_0 = new String(var12, 0, var5);
                break L0;
              } else {
                L3: {
                  var7 = param3[param2 + var6] & 255;
                  if (-1 != (var7 ^ -1)) {
                    L4: {
                      if (-129 < (var7 ^ -1)) {
                        break L4;
                      } else {
                        if ((var7 ^ -1) <= -161) {
                          break L4;
                        } else {
                          L5: {
                            var8 = ts.field_c[var7 - 128];
                            if (var8 != 0) {
                              break L5;
                            } else {
                              var8 = 63;
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        }
                      }
                    }
                    incrementValue$0 = var5;
                    var5++;
                    var4[incrementValue$0] = (char)var7;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_e = (bu) null;
        }
        field_e = null;
        field_a = null;
    }

    final hf a(byte param0, int param1) {
        this.field_b = param1;
        if (param0 >= -26) {
            this.field_d = true;
        }
        return (hf) (this);
    }

    final hf a(boolean param0, byte param1) {
        int var3 = 19 / ((41 - param1) / 47);
        this.field_d = param0 ? true : false;
        return (hf) (this);
    }

    final void a(int param0, int param1, id param2, fd param3, int param4, hf param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (this.field_d) {
                param5.a(param3, param2, param0, param4, 0);
                param5.a(-13136);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_i != param1) {
                param5.field_i = this.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_g != null) {
                param5.field_g = this.field_g;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (this.field_c < -1) {
                break L4;
              } else {
                param5.field_c = this.field_c;
                break L4;
              }
            }
            L5: {
              if (this.field_j == null) {
                break L5;
              } else {
                param5.field_j = this.field_j;
                break L5;
              }
            }
            L6: {
              if (2147483647 != (this.field_h ^ -1)) {
                param5.field_h = this.field_h;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_f < -1) {
                break L7;
              } else {
                param5.field_f = this.field_f;
                break L7;
              }
            }
            L8: {
              if (2147483647 != (this.field_b ^ -1)) {
                param5.field_b = this.field_b;
                break L8;
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("hf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ')');
        }
    }

    final hf b(int param0, int param1) {
        if (param0 != -2) {
            return (hf) null;
        }
        this.field_f = param1;
        return (hf) (this);
    }

    final void a(hf param0, int param1) {
        try {
            param0.field_h = this.field_h;
            param0.field_b = this.field_b;
            param0.field_d = this.field_d;
            param0.field_g = this.field_g;
            param0.field_j = this.field_j;
            param0.field_c = this.field_c;
            if (param1 != -2147483648) {
                this.field_i = -81;
            }
            param0.field_i = this.field_i;
            param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "hf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == -3) {
                break L1;
              } else {
                hf.a(false);
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= param0.length()) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (se.a((byte) -113, (char) var3)) {
                    break L3;
                  } else {
                    if (gn.a(12105, (char) var3)) {
                      break L3;
                    } else {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("hf.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static int a(int param0, nu param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (1 != param0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if (param2 >= 26) {
                break L2;
              } else {
                var9 = (String) null;
                hf.a((String) null, 97);
                break L2;
              }
            }
            L3: {
              if (var3_int != 0) {
                stackIn_9_0 = -1;
                break L3;
              } else {
                stackIn_9_0 = 1345;
                break L3;
              }
            }
            var4 = stackIn_9_0;
            var5 = -1;
            var6 = 1;
            L4: while (true) {
              if (5 <= var6) {
                stackIn_21_0 = var5;
                break L0;
              } else {
                L5: {
                  L6: {
                    L7: {
                      var7 = param1.field_P[param0][var6].a(true);
                      if (var3_int == 0) {
                        break L7;
                      } else {
                        if (var7 >= var4) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var3_int == 0) {
                      if (var4 >= var7) {
                        break L6;
                      } else {
                        break L5;
                      }
                    } else {
                      var6++;
                      continue L4;
                    }
                  }
                  var4 = var7;
                  var5 = var6;
                  break L5;
                }
                var6++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("hf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(fd param0, id param1, int param2, int param3, int param4) {
        hu stackIn_21_0;
        String stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        hu stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        hf var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == 0) {
                break L1;
              } else {
                var8 = (hf) null;
                this.a((hf) null, 96);
                break L1;
              }
            }
            L2: {
              ea.a(param2 + param0.field_g, param0.field_i, param0.field_t + param3, (byte) 79, this.field_g, param0.field_n);
              if (null != this.field_j) {
                L3: {
                  var6_int = this.field_b + param0.field_t + param3;
                  if (-2 == (param1.field_e ^ -1)) {
                    var6_int = var6_int + (-this.field_j.field_o + param0.field_n) / 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var7 = param2 - -param0.field_g - -this.field_h;
                  if (1 != param1.field_m) {
                    break L4;
                  } else {
                    var7 = var7 + (-this.field_j.field_v + param0.field_i) / 2;
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param1.field_e ^ -1)) {
                    var6_int = var6_int + (param0.field_n + -this.field_j.field_o);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((param1.field_m ^ -1) != -3) {
                    break L6;
                  } else {
                    var7 = var7 + (param0.field_i - this.field_j.field_v);
                    break L6;
                  }
                }
                this.field_j.c(var6_int, var7);
                break L2;
              } else {
                break L2;
              }
            }
            L7: {
              L8: {
                var6 = param1.b((byte) -83, param0);
                if (var6 == null) {
                  break L8;
                } else {
                  if (null == param1.field_a) {
                    break L8;
                  } else {
                    if ((this.field_f ^ -1) <= -1) {
                      L9: {
                        stackIn_21_0 = param1.field_a;

                        stackIn_21_1 = (String) (var6);

                        stackIn_21_2 = param1.field_h;

                        stackIn_21_3 = param0.field_t;

                        stackIn_21_4 = param3;

                        if (this.field_b != -2147483648) {
                          stackIn_22_0 = (hu) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = stackIn_21_3;
                          stackIn_22_4 = stackIn_21_4;
                          stackIn_22_5 = this.field_b;
                          break L9;
                        } else {
                          stackIn_22_0 = (hu) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = stackIn_21_3;
                          stackIn_22_4 = stackIn_21_4;
                          stackIn_22_5 = 0;
                          break L9;
                        }
                      }
                      L10: {




                        stackIn_24_2 = stackIn_22_2 + (stackIn_22_3 + (stackIn_22_4 - -stackIn_22_5));

                        stackIn_24_3 = param1.field_q + param0.field_g + param2;

                        if (-2147483648 != this.field_h) {
                          stackIn_22_0 = (hu) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = this.field_h;
                          break L10;
                        } else {
                          stackIn_22_0 = (hu) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = 0;
                          break L10;
                        }
                      }
                      L11: {






                        stackIn_27_3 = stackIn_25_3 - -stackIn_25_4;

                        stackIn_27_4 = -param1.field_l + (param0.field_n + -param1.field_h);

                        stackIn_27_5 = -param1.field_o + (param0.field_i - param1.field_q);

                        stackIn_27_6 = this.field_f;

                        stackIn_27_7 = this.field_c;

                        if (-2147483648 == this.field_i) {
                          stackIn_22_0 = (hu) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L11;
                        } else {
                          stackIn_22_0 = (hu) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_i;
                          break L11;
                        }
                      }
                      ((hu) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param1.field_e, param1.field_m, param1.field_p);
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              break L7;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("hf.J(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L13;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L13;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    hf() {
        this.field_i = -2147483648;
        this.field_f = -2;
        this.field_d = false;
        this.field_h = -2147483648;
        this.field_b = -2147483648;
        this.field_g = null;
        this.field_c = -2;
        this.field_j = null;
    }

    static {
        field_a = new hh();
    }
}
