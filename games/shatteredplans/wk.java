/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_b;
    private int field_i;
    private boolean field_f;
    private int field_c;
    private int field_d;
    bi field_g;
    static String[] field_a;
    private int field_j;
    bi[] field_h;
    private int field_e;

    final wk a(bi[] param0, int param1) {
        RuntimeException var3 = null;
        wk stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_h = param0;
            if (param1 <= -62) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wk.D(");

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
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (wk) (this);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -11 % ((-6 - param0) / 63);
    }

    final static void a(boolean param0, boolean param1) {
        wa.a((byte) 109, param1, param0);
    }

    final wk a(byte param0, int param1) {
        if (param0 <= 47) {
            return (wk) null;
        }
        this.field_c = param1;
        return (wk) (this);
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-3 < (param0 ^ -1)) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = -2 % ((param2 - 69) / 57);
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var7) {
                      stackIn_42_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        L4: {
                          var10 = param1.charAt(var9);
                          if (-1 == (var9 ^ -1)) {
                            if (var10 != 45) {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param3) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (65 > var10) {
                              break L7;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var10 < 97) {
                            stackIn_25_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (122 >= var10) {
                              var10 -= 87;
                              break L5;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param0 <= var10) {
                          stackIn_31_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L8: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var11 = var6 * param0 - -var10;
                          if (var11 / param0 != var6) {
                            stackIn_38_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var11;
                            var5 = 1;
                            break L3;
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("wk.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L9;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    final wk a(int param0, boolean param1) {
        if (param1) {
            this.field_e = 102;
        }
        this.field_j = param0;
        return (wk) (this);
    }

    final static int a(int param0, String param1, nq param2, int[] param3) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (rm.field_g != null) {
                break L1;
              } else {
                rm.field_g = new String[32];
                break L1;
              }
            }
            L2: while (true) {
              try {
                L3: {
                  var4_int = param2.a(param1, param3, rm.field_g);
                  decompiledRegionSelector0 = 0;
                  break L3;
                }
              } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  if (-1025 < (rm.field_g.length ^ -1)) {
                    rm.field_g = new String[rm.field_g.length << 1699380865];
                    decompiledRegionSelector0 = 1;
                    break L4;
                  } else {
                    stackIn_6_0 = -1;
                    return stackIn_6_0;
                  }
                }
              }
              if (decompiledRegionSelector0 == 0) {
                if (param0 == -9615) {
                  stackIn_12_0 = var4_int;
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackIn_10_0 = 47;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              } else {
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("wk.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(vg param0, wk param1, gn param2, int param3, int param4, int param5) {
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
              if (!this.field_f) {
                break L1;
              } else {
                param1.a(param3, true, param0, param5, param2);
                param1.a(false);
                break L1;
              }
            }
            L2: {
              if (null != this.field_g) {
                param1.field_g = this.field_g;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_e ^ -1) > param4) {
                break L3;
              } else {
                param1.field_e = this.field_e;
                break L3;
              }
            }
            L4: {
              if (this.field_h != null) {
                param1.field_h = this.field_h;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (this.field_c >= -1) {
                param1.field_c = this.field_c;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-2147483648 != this.field_i) {
                param1.field_i = this.field_i;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (-2147483648 == this.field_j) {
                break L7;
              } else {
                param1.field_j = this.field_j;
                break L7;
              }
            }
            L8: {
              if (-2147483648 != this.field_d) {
                param1.field_d = this.field_d;
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

            stackIn_24_1 = new StringBuilder().append("wk.J(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0) {
        this.field_h = null;
        if (param0) {
            this.a(15, true);
        }
        this.field_c = 0;
        this.field_g = null;
        this.field_e = -1;
        this.field_i = 0;
        this.field_j = 0;
        this.field_d = 256;
    }

    final void a(byte param0, wk param1) {
        try {
            param1.field_j = this.field_j;
            param1.field_h = this.field_h;
            param1.field_d = this.field_d;
            param1.field_g = this.field_g;
            param1.field_f = this.field_f;
            param1.field_e = this.field_e;
            if (param0 <= 39) {
                this.field_i = 24;
            }
            param1.field_i = this.field_i;
            param1.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener(pd.field_j);
        if (param0 != -58) {
            return;
        }
        try {
            param1.addMouseMotionListener(pd.field_j);
            param1.addFocusListener(pd.field_j);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wk a(boolean param0, int param1) {
        if (param1 != -28639) {
            this.field_h = (bi[]) null;
        }
        this.field_f = param0 ? true : false;
        return (wk) (this);
    }

    final wk a(int param0, int param1) {
        this.field_e = param0;
        if (param1 != 1) {
            gn var4 = (gn) null;
            this.a(-68, false, (vg) null, 40, (gn) null);
        }
        return (wk) (this);
    }

    final void a(int param0, boolean param1, vg param2, int param3, gn param4) {
        nq stackIn_21_0 = null;
        String stackIn_21_1 = null;
        nq stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
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
              em.a(param2.field_n, param2.field_x, 7, param2.field_q + param3, this.field_h, param2.field_m + param0);
              if (null != this.field_g) {
                L2: {
                  var6_int = param0 + (param2.field_m + this.field_i);
                  if ((param4.field_r ^ -1) != -2) {
                    break L2;
                  } else {
                    var6_int = var6_int + (-this.field_g.field_o + param2.field_x) / 2;
                    break L2;
                  }
                }
                L3: {
                  var7 = param2.field_q + param3 + this.field_j;
                  if (2 == param4.field_r) {
                    var6_int = var6_int + (-this.field_g.field_o + param2.field_x);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param4.field_l == 1) {
                    var7 = var7 + (-this.field_g.field_p + param2.field_n) / 2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (2 == param4.field_l) {
                    var7 = var7 + (param2.field_n + -this.field_g.field_p);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                this.field_g.f(var6_int, var7);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              L6: {
                var6 = param4.b(param1, param2);
                if (var6 == null) {
                  break L6;
                } else {
                  if (param4.field_c == null) {
                    break L6;
                  } else {
                    if ((this.field_c ^ -1) > -1) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_21_0 = param4.field_c;

                        stackIn_21_1 = (String) (var6);

                        if (2147483647 == (this.field_i ^ -1)) {
                          stackIn_22_0 = (nq) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = 0;
                          break L7;
                        } else {
                          stackIn_22_0 = (nq) ((Object) stackIn_21_0);
                          stackIn_22_1 = (String) ((Object) stackIn_21_1);
                          stackIn_22_2 = this.field_i;
                          break L7;
                        }
                      }
                      L8: {




                        stackIn_24_2 = stackIn_22_2 + (param4.field_o + param0) + param2.field_m;

                        stackIn_24_3 = param3;

                        stackIn_24_4 = -param2.field_q;

                        stackIn_24_5 = -param4.field_b;

                        if (2147483647 == (this.field_j ^ -1)) {
                          stackIn_22_0 = (nq) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = 0;
                          break L8;
                        } else {
                          stackIn_22_0 = (nq) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);
                          stackIn_25_2 = stackIn_24_2;
                          stackIn_25_3 = stackIn_24_3;
                          stackIn_25_4 = stackIn_24_4;
                          stackIn_25_5 = stackIn_24_5;
                          stackIn_25_6 = this.field_j;
                          break L8;
                        }
                      }
                      L9: {






                        stackIn_27_3 = stackIn_25_3 - (stackIn_25_4 + (stackIn_25_5 - stackIn_25_6));

                        stackIn_27_4 = -param4.field_g + (param2.field_x - param4.field_o);

                        stackIn_27_5 = param2.field_n + -param4.field_b - param4.field_f;

                        stackIn_27_6 = this.field_c;

                        stackIn_27_7 = this.field_e;

                        if (2147483647 == (this.field_d ^ -1)) {
                          stackIn_22_0 = (nq) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = 256;
                          break L9;
                        } else {
                          stackIn_22_0 = (nq) ((Object) stackIn_22_0);
                          stackIn_22_1 = (String) ((Object) stackIn_22_1);

                          stackIn_28_3 = stackIn_27_3;
                          stackIn_28_4 = stackIn_27_4;
                          stackIn_28_5 = stackIn_27_5;
                          stackIn_28_6 = stackIn_27_6;
                          stackIn_28_7 = stackIn_27_7;
                          stackIn_28_8 = this.field_d;
                          break L9;
                        }
                      }
                      ((nq) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, param4.field_r, param4.field_l, param4.field_j);
                      break L6;
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

            stackIn_32_1 = new StringBuilder().append("wk.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final wk a(int param0, byte param1) {
        this.field_i = param0;
        if (param1 <= 86) {
            this.field_f = true;
        }
        return (wk) (this);
    }

    wk() {
        this.field_c = -2;
        this.field_j = -2147483648;
        this.field_f = false;
        this.field_d = -2147483648;
        this.field_i = -2147483648;
        this.field_g = null;
        this.field_e = -2;
        this.field_h = null;
    }

    static {
        field_b = "Ignore";
        field_a = new String[]{"(Old) Standard", "(Old) Cautious", "Tutorial", "Standard", "Aggressive", "Reckless", "Isolationist", "Defensive", "Task"};
    }
}
