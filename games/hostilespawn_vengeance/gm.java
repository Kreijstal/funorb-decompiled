/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static int field_f;
    static vl field_d;
    private boolean field_b;
    bd[] field_c;
    private int field_i;
    static String[] field_k;
    bd field_a;
    private int field_h;
    static bd field_j;
    static int field_m;
    private int field_l;
    private int field_e;
    private int field_g;

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var6 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              od.field_I = ee.field_b;
              if (255 != param3) {
                if ((param3 ^ -1) > -101) {
                  wj.field_H = an.a(param3, -10, param1);
                  break L1;
                } else {
                  if ((param3 ^ -1) >= -106) {
                    wj.field_H = vf.a(param2, true);
                    break L1;
                  } else {
                    wj.field_H = an.a(param3, -10, param1);
                    break L1;
                  }
                }
              } else {
                L2: {
                  if ((ia.field_h ^ -1) <= -14) {
                    stackIn_5_0 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = 1;
                    break L2;
                  }
                }
                wj.field_H = qi.a(stackIn_5_0 != 0, false);
                break L1;
              }
            }
            if (param0 == 26991) {
              break L0;
            } else {
              var6 = (String[]) null;
              gm.a(58, (String) null, (String[]) null, -3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gm.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static int a(CharSequence param0, char param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = param0.length();
              if (param2 == 125) {
                break L1;
              } else {
                var7 = (CharSequence) null;
                gm.a((CharSequence) null, '7', (byte) 37);
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var4 <= var5) {
                stackIn_11_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param1 == param0.charAt(var5)) {
                    var3_int++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("gm.J(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final void b(int param0) {
        this.field_g = 0;
        this.field_l = -1;
        this.field_c = null;
        this.field_e = 256;
        this.field_i = 0;
        this.field_a = null;
        if (param0 < 121) {
          this.field_e = 19;
          this.field_h = 0;
          return;
        } else {
          this.field_h = 0;
          return;
        }
    }

    final gm a(boolean param0, bd[] param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
              if (!param0) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                gm.a((CharSequence) null, 89, true);
                break L1;
              }
            }
            this.field_c = param1;
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gm.L(").append(param0).append(',');

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
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (gm) (this);
    }

    final gm a(int param0, boolean param1) {
        this.field_i = param0;
        if (!param1) {
            return (gm) null;
        }
        return (gm) (this);
    }

    final void a(ha param0, int param1, int param2, ag param3, int param4) {
        vm stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        vm stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              hm.a(param3.field_s, this.field_c, false, param3.field_x, param3.field_m + param4, param2 + param3.field_v);
              if (null != this.field_a) {
                L2: {
                  var6_int = this.field_h + (param2 - -param3.field_v);
                  if (param0.field_k != 1) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_a.field_u + param3.field_s) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = this.field_g + param4 - -param3.field_m;
                  if (-3 != (param0.field_k ^ -1)) {
                    break L3;
                  } else {
                    var6_int = var6_int + (-this.field_a.field_u + param3.field_s);
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_b == 1) {
                    var7 = var7 + (param3.field_x - this.field_a.field_r) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-3 == (param0.field_b ^ -1)) {
                    var7 = var7 + (param3.field_x + -this.field_a.field_r);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_a.e(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 >= 118) {
              L6: {
                var6 = param0.c(param3, 3);
                if (var6 == null) {
                  break L6;
                } else {
                  if (null == param0.field_g) {
                    break L6;
                  } else {
                    if (this.field_i >= 0) {
                      L7: {
                        stackIn_21_0 = param0.field_g;

                        stackIn_21_1 = (String) (var6);

                        stackIn_21_2 = param2 + (param3.field_v + param0.field_q);

                        if (2147483647 == (this.field_h ^ -1)) {
                          stackIn_22_0 = (vm) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = 0;
                          break L7;
                        } else {
                          stackIn_22_0 = (vm) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = stackIn_21_2;
                          stackIn_22_3 = this.field_h;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 - -stackIn_22_3;

                        if (2147483647 != (this.field_g ^ -1)) {
                          stackIn_22_0 = (vm) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = this.field_g;
                          break L8;
                        } else {
                          stackIn_22_0 = (vm) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = 0;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 + (param0.field_n + param4) + param3.field_m;

                        stackIn_27_4 = -param0.field_p + param3.field_s - param0.field_q;

                        stackIn_27_5 = param3.field_x - (param0.field_n + param0.field_i);

                        stackIn_27_6 = this.field_i;

                        stackIn_27_7 = this.field_l;

                        if (2147483647 != (this.field_e ^ -1)) {
                          stackIn_22_0 = (vm) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_e;
                          break L9;
                        } else {
                          stackIn_22_0 = (vm) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L9;
                        }
                      }
                      ((vm) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param0.field_k, param0.field_b, param0.field_a);
                      break L6;
                    } else {
                      return;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("gm.G(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ag param0, gm param1, byte param2, ha param3, int param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (!this.field_b) {
                break L1;
              } else {
                param1.a(param3, 126, param5, param0, param4);
                param1.b(125);
                break L1;
              }
            }
            L2: {
              if (-2147483648 != this.field_e) {
                param1.field_e = this.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 > 40) {
                break L3;
              } else {
                this.field_g = 72;
                break L3;
              }
            }
            L4: {
              if (2147483647 == (this.field_h ^ -1)) {
                break L4;
              } else {
                param1.field_h = this.field_h;
                break L4;
              }
            }
            L5: {
              if (null != this.field_a) {
                param1.field_a = this.field_a;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (this.field_c != null) {
                param1.field_c = this.field_c;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-1 <= this.field_l) {
                param1.field_l = this.field_l;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if ((this.field_g ^ -1) == 2147483647) {
                break L8;
              } else {
                param1.field_g = this.field_g;
                break L8;
              }
            }
            if (-1 > this.field_i) {
              break L0;
            } else {
              param1.field_i = this.field_i;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("gm.F(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(gm param0, byte param1) {
        try {
            param0.field_g = this.field_g;
            param0.field_b = this.field_b;
            param0.field_i = this.field_i;
            param0.field_l = this.field_l;
            param0.field_e = this.field_e;
            param0.field_h = this.field_h;
            param0.field_a = this.field_a;
            if (param1 != 33) {
                field_m = 89;
            }
            param0.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "gm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final gm a(int param0, int param1) {
        if (param0 != -2147483648) {
            field_f = -11;
            this.field_l = param1;
            return (gm) (this);
        }
        this.field_l = param1;
        return (gm) (this);
    }

    public static void a(int param0) {
        field_j = null;
        field_d = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        CharSequence var2 = (CharSequence) null;
        gm.a((CharSequence) null, 54, false);
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3 = tb.a(param0, -24224, param2);
            if (var3 == null) {
              L1: {
                var4 = 0;
                if (param1 < -115) {
                  break L1;
                } else {
                  gm.a(-73);
                  break L1;
                }
              }
              L2: while (true) {
                if (param0.length() > var4) {
                  if (aa.a(param0.charAt(var4), (byte) 108)) {
                    var4++;
                    continue L2;
                  } else {
                    stackIn_10_0 = wk.field_e;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("gm.I(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    final gm a(byte param0, int param1) {
        this.field_g = param1;
        if (param0 < 23) {
            this.a((byte) 13, false);
            return (gm) (this);
        }
        return (gm) (this);
    }

    final gm b(int param0, int param1) {
        this.field_h = param0;
        if (param1 != 16802) {
            this.a(107, -107);
            return (gm) (this);
        }
        return (gm) (this);
    }

    final gm a(byte param0, boolean param1) {
        CharSequence var4;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        ((gm) (this)).field_b = stackIn_3_1 != 0;
        if (param0 > -26) {
          var4 = (CharSequence) null;
          gm.a((CharSequence) null, '\'', (byte) -41);
          return (gm) (this);
        } else {
          return (gm) (this);
        }
    }

    gm() {
        this.field_b = false;
        this.field_i = -2;
        this.field_c = null;
        this.field_h = -2147483648;
        this.field_a = null;
        this.field_l = -2;
        this.field_e = -2147483648;
        this.field_g = -2147483648;
    }

    static {
        field_f = 0;
        field_k = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
