/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vf implements io, ak {
    static int field_d;
    int field_l;
    int field_o;
    int field_n;
    static int field_k;
    int field_a;
    static int field_f;
    int field_g;
    static fn field_c;
    int field_i;
    private boolean field_e;
    int field_j;
    private int field_q;
    int field_p;
    rb field_m;
    int field_b;
    int field_h;

    public final vg a(int param0, ga param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        vg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_t == null) {
                param1.field_t = (vg) ((Object) new ad());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_e) {
                ((ad) ((Object) param1.field_t)).a(this.b(12307, param1), (byte) -106, this.a(param1, -23803), this.field_m, this.field_n, this.field_i, this.field_h, this.a((byte) 127, param1));
                break L2;
              } else {
                this.c(26289, param1);
                break L2;
              }
            }
            var3_int = -7 % ((param0 - 25) / 63);
            stackIn_7_0 = param1.field_t;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("vf.W(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public final int a(ga param0, int param1, int param2) {
        RuntimeException var4 = null;
        ga var5 = null;
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
              if (param1 == 1) {
                break L1;
              } else {
                var5 = (ga) null;
                this.a((byte) -2, (ga) null);
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, 0, (byte) 24, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("vf.K(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    vf(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int b(ga param0, int param1, int param2) {
        RuntimeException var4 = null;
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
            if (param1 == 128) {
              stackIn_4_0 = this.a(true, param0, 0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -51;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("vf.O(");

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
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6, int param7) {
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
        ga var14 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              g.a(param2 - -param6.field_j, (byte) 99, param6.field_i + (param4 + param6.field_k), param6.field_n + (param6.field_j + param2), param4 - -param6.field_k);
              if (param7 >= 3) {
                break L1;
              } else {
                var14 = (ga) null;
                this.b((ga) null, 57, -8);
                break L1;
              }
            }
            L2: {
              var9_int = this.a((byte) 123, param6);
              var10 = this.a(param6, -23803);
              if (!this.field_e) {
                L3: {
                  var12 = this.field_i;
                  if (var12 == 0) {
                    var11 = this.field_m.field_I;
                    break L3;
                  } else {
                    if (var12 == 2) {
                      var11 = var10 - this.field_m.field_x;
                      break L3;
                    } else {
                      L4: {
                        if ((var12 ^ -1) == -4) {
                          break L4;
                        } else {
                          if (var12 != 1) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = this.field_m.field_I + (-this.field_m.field_I + var10 + -this.field_m.field_x >> -1748455487);
                      break L3;
                    }
                  }
                }
                L5: {
                  var12 = this.field_h;
                  if (-1 == (var12 ^ -1)) {
                    break L5;
                  } else {
                    if (-4 != (var12 ^ -1)) {
                      if (-2 == (var12 ^ -1)) {
                        this.field_m.a(this.b(12307, param6), (var9_int >> -1882848191) + this.a(true, param6, param0, param4), var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
                        break L2;
                      } else {
                        if (var12 != 2) {
                          break L2;
                        } else {
                          this.field_m.b(this.b(12307, param6), this.a(true, param6, param0, param4) - -var9_int, var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
                          break L2;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                this.field_m.c(this.b(12307, param6), this.a(true, param6, param0, param4), var11 + this.a(param6, param1, (byte) 24, param2), param3, param5);
                break L2;
              } else {
                this.field_m.a(this.b(12307, param6), this.a(true, param6, param0, param4), this.a(param6, param1, (byte) 24, param2), var9_int, var10, param3, param5, this.field_h, this.field_i, this.field_n);
                break L2;
              }
            }
            pa.a(-21189);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("vf.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param7 + ')');
        }
    }

    String b(int param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 12307) {
                break L1;
              } else {
                var4 = (ga) null;
                this.b((byte) 77, (ga) null);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_o;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.B(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        if (param0 != 5) {
            return -34;
        }
        return this.field_m.field_I - -this.field_m.field_x;
    }

    final static void a(int param0, String param1) {
        try {
            int var2_int = 90 / ((-63 - param0) / 58);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "vf.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, ga param3, int param4, int param5) {
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        oe var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vg var17 = null;
        vg var18 = null;
        var16 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 != param5) {
              L1: {
                if (!param3.e(-17741)) {
                  break L1;
                } else {
                  L2: {
                    var17 = this.a(104, param3);
                    var18 = var17;
                    if (param5 > param1) {
                      var8 = param1;
                      var9 = param5;
                      break L2;
                    } else {
                      var8 = param5;
                      var9 = param1;
                      break L2;
                    }
                  }
                  var10 = var18.a(104, var8);
                  var11 = var18.a(-71, var9);
                  g.a(param2 + param3.field_j, (byte) 99, param4 + (param3.field_k - -param3.field_i), param3.field_n + (param3.field_j + param2), param4 - -param3.field_k);
                  var12 = var10;
                  L3: while (true) {
                    if (var11 < var12) {
                      pa.a(-21189);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_b[var12];
                        if ((var10 ^ -1) != (var12 ^ -1)) {
                          stackIn_12_0 = var13.field_e[0];
                          break L4;
                        } else {
                          stackIn_12_0 = var18.a((byte) -72, var8);
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_12_0;
                        if (var12 == var11) {
                          stackIn_17_0 = var18.a((byte) -72, var9);
                          break L5;
                        } else {
                          if (var13 == null) {
                            stackIn_17_0 = 0;
                            break L5;
                          } else {
                            stackIn_17_0 = var13.field_e[-1 + var13.field_e.length];
                            break L5;
                          }
                        }
                      }
                      var15 = stackIn_17_0;
                      se.field_j.a(var13.field_b + param3.field_p + (param3.field_j + param2 - -this.field_b), var13.field_g, var15 + -var14, this.a(true, param3, var14, param4), this.field_j >>> -1775469576, (byte) -90, this.field_j);
                      var12++;
                      continue L3;
                    }
                  }
                }
              }
              L6: {
                if (param0 < -99) {
                  break L6;
                } else {
                  vf.b(-125);
                  break L6;
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
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("vf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == this.field_m) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(param2, (byte) 119, param4, param3);
                if (param0 == 16777215) {
                  break L1;
                } else {
                  this.field_m = (rb) null;
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

            stackIn_8_1 = new StringBuilder().append("vf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(boolean param0, ga param1) {
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
            if (!param0) {
              this.a(114, param1);
              stackIn_4_0 = param1.field_t.a((byte) -38) - -this.field_b + this.field_p;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -79;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("vf.G(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, vn[] param1, int param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  if (-1 > (param5 ^ -1)) {
                    L2: {
                      if (null == param1[3]) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = param1[3].field_r;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param1[5]) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = param1[5].field_r;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null == param1[1]) {
                        stackIn_16_0 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = param1[1].field_q;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (null == param1[7]) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = param1[7].field_q;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param2 + param4;
                      var11 = param0 - -param5;
                      var12 = param2 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = var8 + param0;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 <= var17) {
                        break L6;
                      } else {
                        var17 = var6_int * param4 / (var6_int - -var7) + param2;
                        var16 = var6_int * param4 / (var6_int - -var7) + param2;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = param5 * var8 / (var8 - -var9) + param0;
                        var18 = param5 * var8 / (var8 - -var9) + param0;
                        break L7;
                      }
                    }
                    L8: {
                      bi.b(dd.field_c);
                      if (param1[0] != null) {
                        bi.c(param2, param0, var16, var18);
                        param1[0].b(param2, param0);
                        bi.a(dd.field_c);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param1[2]) {
                        break L9;
                      } else {
                        bi.c(var17, param0, var10, var18);
                        param1[2].b(var13, param0);
                        bi.a(dd.field_c);
                        break L9;
                      }
                    }
                    L10: {
                      if (param1[6] == null) {
                        break L10;
                      } else {
                        bi.c(param2, var19, var16, var11);
                        param1[6].b(param2, var15);
                        bi.a(dd.field_c);
                        break L10;
                      }
                    }
                    L11: {
                      if (param1[8] == null) {
                        break L11;
                      } else {
                        bi.c(var17, var19, var10, var11);
                        param1[8].b(var13, var15);
                        bi.a(dd.field_c);
                        break L11;
                      }
                    }
                    L12: {
                      if (null == param1[1]) {
                        break L12;
                      } else {
                        if (0 == param1[1].field_r) {
                          break L12;
                        } else {
                          bi.c(var16, param0, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var20 >= var13) {
                              bi.a(dd.field_c);
                              break L12;
                            } else {
                              param1[1].b(var20, param0);
                              var20 = var20 + param1[1].field_r;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (param1[7] == null) {
                        break L14;
                      } else {
                        if (-1 != (param1[7].field_r ^ -1)) {
                          bi.c(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              bi.a(dd.field_c);
                              break L14;
                            } else {
                              param1[7].b(var20, var15);
                              var20 = var20 + param1[7].field_r;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (null == param1[param3]) {
                        break L16;
                      } else {
                        if (0 != param1[3].field_q) {
                          bi.c(param2, var18, var16, var19);
                          var20 = var14;
                          L17: while (true) {
                            if (var20 >= var15) {
                              bi.a(dd.field_c);
                              break L16;
                            } else {
                              param1[3].b(param2, var20);
                              var20 = var20 + param1[3].field_q;
                              continue L17;
                            }
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      if (param1[5] == null) {
                        break L18;
                      } else {
                        if (-1 == (param1[5].field_q ^ -1)) {
                          break L18;
                        } else {
                          bi.c(var17, var18, var10, var19);
                          var20 = var14;
                          L19: while (true) {
                            if (var20 >= var15) {
                              bi.a(dd.field_c);
                              break L18;
                            } else {
                              param1[5].b(var13, var20);
                              var20 = var20 + param1[5].field_q;
                              continue L19;
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      if (null == param1[4]) {
                        break L20;
                      } else {
                        if (param1[4].field_r == 0) {
                          break L20;
                        } else {
                          if (0 == param1[4].field_q) {
                            break L20;
                          } else {
                            bi.c(var16, var18, var17, var19);
                            var20 = var14;
                            L21: while (true) {
                              if (var15 <= var20) {
                                bi.a(dd.field_c);
                                break L20;
                              } else {
                                var21 = var12;
                                L22: while (true) {
                                  if (var21 >= var13) {
                                    var20 = var20 + param1[4].field_q;
                                    continue L21;
                                  } else {
                                    param1[4].b(var21, var20);
                                    var21 = var21 + param1[4].field_r;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var6);

            stackIn_71_1 = new StringBuilder().append("vf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L23;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L23;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_72_0), stackIn_72_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    final void a(vf param0, byte param1) {
        try {
            param0.field_h = this.field_h;
            param0.field_i = this.field_i;
            param0.field_q = this.field_q;
            param0.field_g = this.field_g;
            param0.field_m = this.field_m;
            int var3_int = 111 / ((39 - param1) / 44);
            param0.field_l = this.field_l;
            param0.field_e = this.field_e;
            param0.field_p = this.field_p;
            param0.field_a = this.field_a;
            param0.field_n = this.field_n;
            param0.field_o = this.field_o;
            param0.field_j = this.field_j;
            param0.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "vf.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int a(byte param0, ga param1) {
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
              if (param0 >= 111) {
                break L1;
              } else {
                this.field_a = -122;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_o + (-this.field_g + param1.field_i);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.BA(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(ga param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
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
            if (param2 == 24) {
              stackIn_4_0 = param0.field_p + param0.field_j + (param3 - -this.field_b) + param1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 54;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vf.J(");

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
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(ga param0, int param1) {
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
            if (param1 == -23803) {
              stackIn_4_0 = -this.field_p + param0.field_n - this.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 117;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("vf.P(");

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
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, byte param1, int param2, ga param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(0, 0, param0, this.field_l, param2, this.field_q, param3, 72);
              if (param1 > 42) {
                break L1;
              } else {
                this.field_p = -124;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("vf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final int b(byte param0, ga param1) {
        RuntimeException var3 = null;
        ga var4 = null;
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
              if (param0 < -31) {
                break L1;
              } else {
                var4 = (ga) null;
                this.a(62, 84, 6, -2, (ga) null);
                break L1;
              }
            }
            this.a(106, param1);
            stackIn_3_0 = param1.field_t.b((byte) 63) + (this.field_g - -this.field_o);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vf.T(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void c(int param0, ga param1) {
        int discarded$0 = 0;
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
        ga var8 = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (null == param1.field_t) {
                param1.field_t = (vg) ((Object) new ad());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.a((byte) 112, param1);
              var4 = this.a(param1, -23803);
              var6 = this.field_i;
              if (-1 != (var6 ^ -1)) {
                if ((var6 ^ -1) != -3) {
                  L3: {
                    if (var6 == 3) {
                      break L3;
                    } else {
                      if (-2 == (var6 ^ -1)) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = (-this.field_m.field_x + (-this.field_m.field_I + var4) >> -1820286431) + this.field_m.field_I;
                  break L2;
                } else {
                  var5 = var4 - this.field_m.field_x;
                  break L2;
                }
              } else {
                var5 = this.field_m.field_I;
                break L2;
              }
            }
            L4: {
              L5: {
                var6 = this.field_h;
                if (0 != var6) {
                  if (var6 == 3) {
                    break L5;
                  } else {
                    if (-2 == (var6 ^ -1)) {
                      if (!(param1.field_t instanceof ad)) {
                        break L4;
                      } else {
                        ((ad) ((Object) param1.field_t)).a(var3_int >> 1469870017, 91, var5, this.b(param0 ^ 22178, param1), this.field_m);
                        break L4;
                      }
                    } else {
                      if (var6 == 2) {
                        if (!(param1.field_t instanceof ad)) {
                          break L4;
                        } else {
                          ((ad) ((Object) param1.field_t)).a(this.b(param0 + -13982, param1), var5, this.field_m, (byte) 83, var3_int);
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              if (param1.field_t instanceof ad) {
                ((ad) ((Object) param1.field_t)).a(95, this.field_m, this.b(param0 + -13982, param1), 0, var5);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (param0 == 26289) {
                break L6;
              } else {
                var8 = (ga) null;
                discarded$0 = this.a((ga) null, 125);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("vf.R(").append(param0).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, ga param4) {
        vg var13 = null;
        vg var14 = null;
        int var7 = 0;
        oe var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            if (!(!param4.e(-17741))) {
                var13 = this.a(-66, param4);
                var14 = var13;
                var7 = var14.a(124, param0);
                var8 = var13.field_b[var7];
                var9 = var14.a((byte) -72, param0);
                var10 = this.a(true, param4, var9, param1);
                var11 = this.a(param4, 1, param2) - -Math.max(0, var8.field_b);
                var12 = this.a(param4, 1, param2) + Math.min(this.a(param4, -23803), Math.min(var8.field_g, var7 + 1 >= var14.field_b.length ? var8.field_g : var13.field_b[1 + var7].field_b));
                g.a(param4.field_j + param2, (byte) 99, param4.field_i + (param4.field_k + param1), param4.field_n + (param2 + param4.field_j), param4.field_k + param1);
                se.field_j.a(var12, this.field_a, (byte) -14, var10, var11, var10);
                pa.a(-21189);
            }
            int var6_int = -62 % ((param3 - 37) / 55);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "vf.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 4056) {
            field_k = 76;
        }
    }

    private final int a(boolean param0, ga param1, int param2, int param3) {
        RuntimeException var5 = null;
        ga var6 = null;
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
              if (param0) {
                break L1;
              } else {
                var6 = (ga) null;
                this.a(-121, false, -32, (ga) null, -20);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_u + (param3 + param1.field_k - -this.field_g + param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("vf.Q(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    protected vf() {
    }

    vf(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_q = param6;
            this.field_n = param9;
            this.field_i = param8;
            this.field_e = param12 ? true : false;
            this.field_a = param10;
            this.field_p = param4;
            this.field_g = param1;
            this.field_m = param0;
            this.field_j = param11;
            this.field_h = param7;
            this.field_o = param2;
            this.field_b = param3;
            this.field_l = param5;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int a(ga param0, int param1, int param2, int param3, int param4, int param5) {
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
              if (param1 == -1) {
                break L1;
              } else {
                this.field_q = -68;
                break L1;
              }
            }
            this.a(-52, param0);
            stackIn_3_0 = param0.field_t.a(param3 + -this.b(param0, 128, param5), -this.a(param0, param1 ^ -2, param2) + param4, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("vf.M(");

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_k = 250;
        field_d = 33;
        field_c = null;
    }
}
