/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ek implements ci, ne {
    int field_i;
    int field_h;
    int field_b;
    int field_j;
    private int field_d;
    int field_o;
    ee field_c;
    static int field_e;
    int field_l;
    int field_k;
    private boolean field_g;
    int field_m;
    int field_f;
    static String[] field_a;
    int field_n;

    private final void a(lk param0, boolean param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lk var8 = null;
        var7 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var8 = (lk) null;
                this.a(-100, -38, -40, 81, (lk) null, 47);
                break L1;
              }
            }
            L2: {
              if (null != param0.field_s) {
                break L2;
              } else {
                param0.field_s = (mj) ((Object) new ub());
                break L2;
              }
            }
            L3: {
              var3_int = this.a(param0, 0);
              var4 = this.b(param0, -32260);
              var6 = this.field_f;
              if (var6 == 0) {
                var5 = this.field_c.field_s;
                break L3;
              } else {
                if (var6 == 2) {
                  var5 = var4 + -this.field_c.field_x;
                  break L3;
                } else {
                  L4: {
                    if (var6 != 3) {
                      if (1 == var6) {
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = (-this.field_c.field_x + var4 - this.field_c.field_s >> 1669038433) + this.field_c.field_s;
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var6 = this.field_i;
                if (-1 != (var6 ^ -1)) {
                  if (-4 == (var6 ^ -1)) {
                    break L6;
                  } else {
                    if (1 != var6) {
                      if ((var6 ^ -1) == -3) {
                        if (param0.field_s instanceof ub) {
                          ((ub) ((Object) param0.field_s)).a(this.b(69, param0), (byte) -109, var5, this.field_c, var3_int);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      if (!(param0.field_s instanceof ub)) {
                        break L5;
                      } else {
                        ((ub) ((Object) param0.field_s)).a(this.field_c, var5, this.b(-123, param0), -102, var3_int >> -1115151007);
                        break L5;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (param0.field_s instanceof ub) {
                ((ub) ((Object) param0.field_s)).a(this.b(96, param0), 1, this.field_c, var5, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("ek.Q(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, lk param1, int param2, int param3) {
        int discarded$0 = 0;
        try {
            if (param3 != 2) {
                lk var6 = (lk) null;
                discarded$0 = this.b((lk) null, -123, -52, -32);
            }
            this.a(0, 0, (byte) 108, this.field_h, param2, param0, this.field_d, param1);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ek.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(ek param0, byte param1) {
        try {
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_d = this.field_d;
            param0.field_f = this.field_f;
            param0.field_n = this.field_n;
            param0.field_h = this.field_h;
            param0.field_m = this.field_m;
            param0.field_b = this.field_b;
            param0.field_l = this.field_l;
            int var3_int = 55 / ((-24 - param1) / 33);
            param0.field_j = this.field_j;
            param0.field_o = this.field_o;
            param0.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ek.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        vj.d(param7, param4, param8, param1);
        vj.c(param7, 1 + param4, param6 + -1, param1);
        if (param0 != 92) {
            field_a = (String[]) null;
        }
        vj.d(param7 + 1, param4 - -1, param8 - 2, param5);
        vj.c(param7 + 1, 2 + param4, -3 + param6, param5);
        vj.c(-2 + (param8 + param7), 2 + param4, param6 + -3, param3);
        vj.d(2 + param7, -2 + param4 + param6, -2 + param8, param3);
        vj.c(-1 + param7 + param8, param4 - -1, param6 - 1, param2);
        vj.d(1 + param7, param6 + param4 + -1, -2 + param8, param2);
    }

    String b(int param0, lk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 87 / ((param0 - -48) / 42);
            stackIn_1_0 = param1.field_r;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ek.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(lk param0, byte param1, int param2, int param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        di var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mj var17 = null;
        mj var18 = null;
        var16 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 >= 37) {
                break L1;
              } else {
                this.field_k = -120;
                break L1;
              }
            }
            if (param5 != param4) {
              L2: {
                if (param0.d(69)) {
                  L3: {
                    var17 = this.a((byte) -63, param0);
                    var18 = var17;
                    if (param4 > param5) {
                      var8 = param5;
                      var9 = param4;
                      break L3;
                    } else {
                      var9 = param5;
                      var8 = param4;
                      break L3;
                    }
                  }
                  var10 = var18.a(-13453, var8);
                  var11 = var18.a(-13453, var9);
                  ek.a(param0.field_i + param2, param3 - (-param0.field_o - param0.field_h), param0.field_o + param3, (byte) 125, param2 - -param0.field_i + param0.field_q);
                  var12 = var10;
                  L4: while (true) {
                    if (var12 > var11) {
                      gg.a(14756);
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_d[var12];
                        if (var10 == var12) {
                          stackIn_15_0 = var18.a(true, var8);
                          break L5;
                        } else {
                          stackIn_15_0 = var13.field_a[0];
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_15_0;
                        if (var11 == var12) {
                          stackIn_20_0 = var18.a(true, var9);
                          break L6;
                        } else {
                          if (var13 != null) {
                            stackIn_20_0 = var13.field_a[-1 + var13.field_a.length];
                            break L6;
                          } else {
                            stackIn_20_0 = 0;
                            break L6;
                          }
                        }
                      }
                      var15 = stackIn_20_0;
                      pj.field_a.a(this.field_o, 10066329, this.a(param0, var14, param3, -3), param2 - (-param0.field_i - (this.field_m - -param0.field_m) - var13.field_b), var13.field_c, var15 + -var14, this.field_o >>> -2137256488);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  break L2;
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
          L7: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("ek.J(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int b(lk param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -32260) {
                break L1;
              } else {
                this.field_j = -40;
                break L1;
              }
            }
            stackIn_3_0 = param0.field_q + -this.field_m - this.field_j;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ek.CA(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, byte param3, lk param4) {
        int var7 = 0;
        di var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mj var13 = null;
        mj var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_0;
        int stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param3 >= 26) {
              L1: {
                if (param4.d(111)) {
                  L2: {
                    var13 = this.a((byte) -74, param4);
                    var14 = var13;
                    var7 = var14.a(-13453, param1);
                    var8 = var13.field_d[var7];
                    var9 = var14.a(true, param1);
                    var10 = this.a(param4, var9, param0, -3);
                    var11 = this.a(param4, -1815612287, param2) + Math.max(0, var8.field_b);
                    stackIn_6_0 = this.a(param4, -1815612287, param2);

                    stackIn_6_1 = this.b(param4, -32260);

                    stackIn_6_2 = var8.field_c;

                    if (var14.field_d.length > 1 + var7) {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = stackIn_6_2;
                      stackIn_7_3 = var13.field_d[1 + var7].field_b;
                      break L2;
                    } else {
                      stackIn_7_0 = stackIn_6_0;
                      stackIn_7_1 = stackIn_6_1;
                      stackIn_7_2 = stackIn_6_2;
                      stackIn_7_3 = var8.field_c;
                      break L2;
                    }
                  }
                  var12 = stackIn_7_0 + Math.min(stackIn_7_1, Math.min(stackIn_7_2, stackIn_7_3));
                  ek.a(param2 - -param4.field_i, param0 - (-param4.field_o - param4.field_h), param4.field_o + param0, (byte) 55, param2 - -param4.field_i + param4.field_q);
                  pj.field_a.a(var11, var10, var10, this.field_l, 0, var12);
                  gg.a(14756);
                  break L1;
                } else {
                  break L1;
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
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("ek.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(lk param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 91 / ((param1 - -70) / 40);
            this.a((byte) 42, param0);
            stackIn_1_0 = param0.field_s.b((byte) -5) + (this.field_k + this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ek.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(lk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        lk var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -3) {
                break L1;
              } else {
                var6 = (lk) null;
                this.b(-108, (lk) null);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_o + (param2 - (-this.field_k - param0.field_l) - -param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ek.V(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, lk param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Main.field_T;
        try {
          L0: {
            L1: {
              ek.a(param7.field_i + param5, param4 + (param7.field_o - -param7.field_h), param4 + param7.field_o, (byte) 61, param5 - (-param7.field_i + -param7.field_q));
              var9_int = this.a(param7, 0);
              var10 = this.b(param7, -32260);
              if (param2 == 108) {
                break L1;
              } else {
                field_e = -11;
                break L1;
              }
            }
            L2: {
              if (this.field_g) {
                this.field_c.a(this.b(11, param7), this.a(param7, param0, param4, -3), this.b(param7, 116, param5, param1), var9_int, var10, param3, param6, this.field_i, this.field_f, this.field_b);
                break L2;
              } else {
                L3: {
                  var12 = this.field_f;
                  if (0 == var12) {
                    var11 = this.field_c.field_s;
                    break L3;
                  } else {
                    if (2 != var12) {
                      L4: {
                        if ((var12 ^ -1) == -4) {
                          break L4;
                        } else {
                          if ((var12 ^ -1) == -2) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = (-this.field_c.field_x + (-this.field_c.field_s + var10) >> 298623745) + this.field_c.field_s;
                      break L3;
                    } else {
                      var11 = var10 + -this.field_c.field_x;
                      break L3;
                    }
                  }
                }
                L5: {
                  var12 = this.field_i;
                  if (var12 == 0) {
                    break L5;
                  } else {
                    if (3 == var12) {
                      break L5;
                    } else {
                      if (var12 == 1) {
                        this.field_c.a(this.b(param2 + 1, param7), (var9_int >> -1815612287) + this.a(param7, param0, param4, param2 + -111), this.b(param7, 126, param5, param1) + var11, param3, param6);
                        break L2;
                      } else {
                        if (2 == var12) {
                          this.field_c.c(this.b(95, param7), this.a(param7, param0, param4, -3) + var9_int, this.b(param7, 116, param5, param1) + var11, param3, param6);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                this.field_c.b(this.b(11, param7), this.a(param7, param0, param4, param2 + -111), this.b(param7, param2 ^ 22, param5, param1) - -var11, param3, param6);
                break L2;
              }
            }
            gg.a(14756);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("ek.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    public final int a(lk param0, int param1, int param2) {
        RuntimeException var4 = null;
        lk var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1815612287) {
                break L1;
              } else {
                var5 = (lk) null;
                this.a(5, (lk) null, -31, -114, false);
                break L1;
              }
            }
            stackIn_3_0 = this.b(param0, 115, param2, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ek.K(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        if (param0 != 61) {
            field_a = (String[]) null;
        }
        field_a = null;
    }

    public final mj a(byte param0, lk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 38 % ((-8 - param0) / 49);
              if (param1.field_s == null) {
                param1.field_s = (mj) ((Object) new ub());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.field_g) {
                this.a(param1, true);
                break L2;
              } else {
                ((ub) ((Object) param1.field_s)).a(this.b(param1, -32260), 841570337, this.field_f, this.a(param1, 0), this.field_c, this.field_i, this.b(75, param1), this.field_b);
                break L2;
              }
            }
            stackIn_7_0 = param1.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ek.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public final int a(lk param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        lk var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (lk) null;
                discarded$1 = this.a((lk) null, 75, 43, -98);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_h - (this.field_k + this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ek.B(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ek(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int b(lk param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        lk var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 113) {
                break L1;
              } else {
                var6 = (lk) null;
                this.a((lk) null, false);
                break L1;
              }
            }
            stackIn_3_0 = this.field_m + param0.field_i + (param2 + param0.field_m + param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ek.W(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, int param1, int param2, int param3, lk param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -10989) {
                break L1;
              } else {
                this.field_j = 28;
                break L1;
              }
            }
            this.a((byte) -109, param4);
            stackIn_3_0 = param4.field_s.a(param5 - this.a(param4, -1815612287, param1), -this.a(param3, (byte) -77, param4) + param0, param2 ^ 10969);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("ek.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public void a(int param0, lk param1, int param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        lk var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_c) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param3, param1, param0, param2 ^ 11445);
                if (param2 == 11447) {
                  break L1;
                } else {
                  var7 = (lk) null;
                  discarded$1 = this.a((lk) null, -92, 108, -40);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ek.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, lk param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a((byte) -99, param1);
            if (param0 == -2) {
              stackIn_4_0 = param1.field_s.b(param0 ^ -2) - -this.field_m + this.field_j;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ek.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 < 15) {
            ek.a((byte) 49);
        }
        ji.a(true);
        vj.f(param2, param0, param1, param4);
    }

    public final int a(int param0, byte param1, lk param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 55 / ((param1 - 51) / 35);
            stackIn_1_0 = this.a(param2, 0, param0, -3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ek.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(int param0) {
        if (param0 != -1) {
            return -67;
        }
        return this.field_c.field_x + this.field_c.field_s;
    }

    protected ek() {
    }

    ek(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_i = param7;
            this.field_n = param2;
            this.field_m = param3;
            this.field_k = param1;
            this.field_j = param4;
            this.field_d = param6;
            this.field_b = param9;
            this.field_c = param0;
            this.field_h = param5;
            this.field_o = param11;
            this.field_f = param8;
            this.field_l = param10;
            this.field_g = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_e = 50;
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
