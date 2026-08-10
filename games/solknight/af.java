/*
 * Decompiled by CFR-JS 0.4.0.
 */
class af implements j, eg {
    int field_j;
    int field_n;
    int field_f;
    int field_g;
    int field_b;
    private boolean field_i;
    int field_o;
    int field_e;
    int field_m;
    int field_a;
    mg field_l;
    private int field_k;
    static int[] field_h;
    int field_d;
    static da field_c;

    private final int c(int param0, rc param1) {
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
              if (param0 == 3) {
                break L1;
              } else {
                this.field_b = 126;
                break L1;
              }
            }
            stackIn_3_0 = -this.field_j + -this.field_d + param1.field_x;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.V(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(boolean param0, rc param1) {
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
            if (param0) {
              this.a(-21480, param1);
              stackIn_4_0 = param1.field_h.b(62) + (this.field_a + this.field_n);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -119;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("af.A(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(rc param0, int param1, int param2, int param3) {
        try {
            this.a(param1, param2, -3, 0, this.field_o, this.field_k, param0, 0);
            int var5_int = -24 % ((param3 - -6) / 63);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, rc param3, int param4) {
        jf var13 = null;
        jf var14 = null;
        int var7 = 0;
        le var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 != 1) {
            return;
        }
        try {
            if (param3.b(true)) {
                var13 = this.a(-21480, param3);
                var14 = var13;
                var7 = var14.a((byte) -94, param0);
                var8 = var13.field_c[var7];
                var9 = var14.a(0, param0);
                var10 = this.a(param3, param4, var9, (byte) 78);
                var11 = this.a(param3, false, param1) + Math.max(0, var8.field_g);
                var12 = this.a(param3, false, param1) - -Math.min(this.c(param2 ^ 2, param3), Math.min(var8.field_e, var14.field_c.length <= 1 + var7 ? var8.field_e : var13.field_c[var7 + 1].field_g));
                kf.a((byte) 97, param4 + param3.field_m, param3.field_j + param1, param3.field_t + param3.field_m + param4, param3.field_x + param1 - -param3.field_j);
                ph.field_f.a((byte) -67, var11, var12, var10, this.field_m, var10);
                mf.e(param2 + 4095);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, rc param3) {
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
            if (param1 == -5) {
              stackIn_4_0 = param0 + (param3.field_q + (param3.field_j + param2) - -this.field_d);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -87;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("af.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == -3) {
          L0: {
            L1: {
              if (vg.field_J == null) {
                break L1;
              } else {
                if (vg.field_J.d((byte) 125) == null) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rc param6, int param7) {
        int discarded$0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rc var14 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              kf.a((byte) 97, param6.field_m + param0, param1 + param6.field_j, param6.field_m + (param0 + param6.field_t), param6.field_j + param1 + param6.field_x);
              var9_int = this.b(param2 ^ -268, param6);
              if (param2 == -3) {
                break L1;
              } else {
                var14 = (rc) null;
                discarded$0 = this.c(124, (rc) null);
                break L1;
              }
            }
            L2: {
              var10 = this.c(param2 + 6, param6);
              if (!this.field_i) {
                L3: {
                  var12 = this.field_b;
                  if (-1 == (var12 ^ -1)) {
                    var11 = this.field_l.field_F;
                    break L3;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      L4: {
                        if (var12 == 3) {
                          break L4;
                        } else {
                          if (1 != var12) {
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 = (-this.field_l.field_F + var10 - this.field_l.field_s >> 1126916097) + this.field_l.field_F;
                      break L3;
                    } else {
                      var11 = -this.field_l.field_s + var10;
                      break L3;
                    }
                  }
                }
                L5: {
                  var12 = this.field_g;
                  if (var12 != 0) {
                    if (var12 == 3) {
                      break L5;
                    } else {
                      if (1 == var12) {
                        this.field_l.a(this.b(param6, 0), (var9_int >> -2083757599) + this.a(param6, param0, param3, (byte) 78), this.a(param7, param2 + -2, param1, param6) - -var11, param4, param5);
                        break L2;
                      } else {
                        if ((var12 ^ -1) != -3) {
                          break L2;
                        } else {
                          this.field_l.b(this.b(param6, 0), var9_int + this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6) - -var11, param4, param5);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_l.c(this.b(param6, param2 + 3), this.a(param6, param0, param3, (byte) 78), var11 + this.a(param7, -5, param1, param6), param4, param5);
                break L2;
              } else {
                this.field_l.a(this.b(param6, 0), this.a(param6, param0, param3, (byte) 78), this.a(param7, -5, param1, param6), var9_int, var10, param4, param5, this.field_g, this.field_b, this.field_f);
                break L2;
              }
            }
            mf.e(4096);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var9);

            stackIn_27_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param7 + ')');
        }
    }

    public final void a(int param0, rc param1, int param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jf var17 = null;
        jf var18 = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != param2) {
              L1: {
                if (param1.b(true)) {
                  L2: {
                    var17 = this.a(-21480, param1);
                    var18 = var17;
                    if (param0 < param2) {
                      var9 = param2;
                      var8 = param0;
                      break L2;
                    } else {
                      var9 = param0;
                      var8 = param2;
                      break L2;
                    }
                  }
                  var10 = var18.a((byte) -106, var8);
                  var11 = var18.a((byte) -121, var9);
                  kf.a((byte) 97, param5 - -param1.field_m, param4 + param1.field_j, param1.field_m + param5 + param1.field_t, param1.field_x + (param1.field_j + param4));
                  var12 = var10;
                  L3: while (true) {
                    if (var12 > var11) {
                      mf.e(4096);
                      break L1;
                    } else {
                      L4: {
                        var13 = var17.field_c[var12];
                        if ((var12 ^ -1) == (var10 ^ -1)) {
                          stackIn_13_0 = var18.a(0, var8);
                          break L4;
                        } else {
                          stackIn_13_0 = var13.field_c[0];
                          break L4;
                        }
                      }
                      L5: {
                        var14 = stackIn_13_0;
                        if (var11 != var12) {
                          if (var13 == null) {
                            stackIn_18_0 = 0;
                            break L5;
                          } else {
                            stackIn_18_0 = var13.field_c[var13.field_c.length - 1];
                            break L5;
                          }
                        } else {
                          stackIn_18_0 = var18.a(0, var9);
                          break L5;
                        }
                      }
                      var15 = stackIn_18_0;
                      ph.field_f.a(var13.field_g + (this.field_d + param1.field_j + (param4 - -param1.field_q)), this.field_e >>> -574782696, var15 - var14, this.field_e, 1, var13.field_e, this.a(param1, param5, var14, (byte) 78));
                      var12++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var7_int = -39 % ((param3 - 34) / 46);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("af.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, boolean param1, int param2) {
        RuntimeException var4 = null;
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
              if (!param1) {
                break L1;
              } else {
                this.field_n = 98;
                break L1;
              }
            }
            stackIn_3_0 = this.a(0, -5, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("af.P(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0, rc param1, int param2) {
        RuntimeException var4 = null;
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
              if (param2 == 0) {
                break L1;
              } else {
                this.field_f = 89;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param0, 0, (byte) 78);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("af.U(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final int b(int param0, rc param1) {
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
              if (param0 == 265) {
                break L1;
              } else {
                this.field_j = 108;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_t - (this.field_a - -this.field_n);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.K(").append(param0).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        if (!(null != this.field_l)) {
            return;
        }
        try {
            this.a(param4, param3, param1, -117);
            if (param0 < 113) {
                af var7 = (af) null;
                this.a((af) null, 127);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(rc param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
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
            if (param1 == 0) {
              this.a(param1 ^ -21480, param0);
              stackIn_4_0 = param0.field_h.a(-2592, param3 + -this.a(param0, false, param4), param2 + -this.a(param5, param0, param1 + 0));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -113;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("af.O(");

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
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final jf a(int param0, rc param1) {
        RuntimeException var3 = null;
        rc var4 = null;
        jf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_h != null) {
                break L1;
              } else {
                param1.field_h = (jf) ((Object) new vk());
                break L1;
              }
            }
            L2: {
              if (param0 == -21480) {
                break L2;
              } else {
                var4 = (rc) null;
                this.a(-117, (rc) null);
                break L2;
              }
            }
            L3: {
              if (this.field_i) {
                ((vk) ((Object) param1.field_h)).a(this.b(param1, 0), this.field_f, this.field_g, 127, this.field_l, this.b(265, param1), this.c(3, param1), this.field_b);
                break L3;
              } else {
                this.a(param1, (byte) 93);
                break L3;
              }
            }
            stackIn_8_0 = param1.field_h;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("af.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_h = null;
    }

    final void a(af param0, int param1) {
        try {
            param0.field_n = this.field_n;
            param0.field_b = this.field_b;
            param0.field_g = this.field_g;
            param0.field_f = this.field_f;
            param0.field_o = this.field_o;
            param0.field_l = this.field_l;
            param0.field_a = this.field_a;
            if (param1 != 6935) {
                this.field_j = 86;
            }
            param0.field_d = this.field_d;
            param0.field_m = this.field_m;
            param0.field_e = this.field_e;
            param0.field_j = this.field_j;
            param0.field_k = this.field_k;
            param0.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(rc param0, byte param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param0.field_h) {
                break L1;
              } else {
                param0.field_h = (jf) ((Object) new vk());
                break L1;
              }
            }
            var3_int = this.b(265, param0);
            if (param1 > 81) {
              L2: {
                var4 = this.c(3, param0);
                var6 = this.field_b;
                if (var6 == 0) {
                  var5 = this.field_l.field_F;
                  break L2;
                } else {
                  if (var6 != 2) {
                    L3: {
                      if (var6 != 3) {
                        if (1 == var6) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5 = this.field_l.field_F + (-this.field_l.field_s + -this.field_l.field_F + var4 >> 649083393);
                    break L2;
                  } else {
                    var5 = -this.field_l.field_s + var4;
                    break L2;
                  }
                }
              }
              L4: {
                L5: {
                  L6: {
                    var6 = this.field_g;
                    if (var6 != 0) {
                      if ((var6 ^ -1) == -4) {
                        break L6;
                      } else {
                        if (-2 == (var6 ^ -1)) {
                          if (param0.field_h instanceof vk) {
                            ((vk) ((Object) param0.field_h)).a(var3_int >> 521286561, 0, var5, this.field_l, this.b(param0, 0));
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          if ((var6 ^ -1) != -3) {
                            break L5;
                          } else {
                            if (param0.field_h instanceof vk) {
                              ((vk) ((Object) param0.field_h)).a(-13323, this.field_l, var5, this.b(param0, 0), var3_int);
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (!(param0.field_h instanceof vk)) {
                    break L5;
                  } else {
                    ((vk) ((Object) param0.field_h)).a(this.field_l, (byte) -111, 0, var5, this.b(param0, 0));
                    break L4;
                  }
                }
                break L4;
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
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("af.M(");

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
          throw fc.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(rc param0, int param1) {
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
            var3_int = 28 % ((-60 - param1) / 61);
            this.a(-21480, param0);
            stackIn_1_0 = param0.field_h.a((byte) 121) + (this.field_d + this.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("af.J(");

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
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(rc param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
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
              if (param3 == 78) {
                break L1;
              } else {
                this.field_n = -51;
                break L1;
              }
            }
            stackIn_3_0 = param2 + (param0.field_k + (this.field_a + param1 - -param0.field_m));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("af.S(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(int param0) {
        if (param0 != 3) {
            return -52;
        }
        return this.field_l.field_s + this.field_l.field_F;
    }

    String b(rc param0, int param1) {
        RuntimeException var3 = null;
        rc var4 = null;
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
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (rc) null;
                this.a((byte) -115, 127, false, 29, (rc) null);
                break L1;
              }
            }
            stackIn_3_0 = param0.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("af.B(");

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(dl param0, gb param1, byte param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            StringBuilder stackIn_43_1 = null;
            StringBuilder stackIn_44_1 = null;
            String stackIn_44_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            di var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                var18 = new di();
                var18.field_h = param1.j(255);
                var18.field_o = param1.e(true);
                var18.field_k = new nj[var18.field_h];
                var18.field_s = new nj[var18.field_h];
                var18.field_m = new int[var18.field_h];
                var18.field_q = new byte[var18.field_h][][];
                var18.field_p = new int[var18.field_h];
                var18.field_r = new int[var18.field_h];
                var5 = 0;
                L1: while (true) {
                  if (var18.field_h <= var5) {
                    L2: {
                      if (param2 < -94) {
                        break L2;
                      } else {
                        field_h = (int[]) null;
                        break L2;
                      }
                    }
                    ga.field_E.a(var18, -7044);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param1.j(255);
                            if ((var6_int ^ -1) == -1) {
                              break L5;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L5;
                              } else {
                                if ((var6_int ^ -1) != -3) {
                                  L6: {
                                    if (var6_int == 3) {
                                      break L6;
                                    } else {
                                      if ((var6_int ^ -1) == -5) {
                                        break L6;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var20 = param1.h(123);
                                  var8 = param1.h(11);
                                  var9 = param1.j(255);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param1.e(true);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param1.a(var13, 0, -113, var21[var12_int]);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_r[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var9 <= var17) {
                                          var18.field_s[var5] = param0.a((byte) 113, var8, var12, k.a(var20, (byte) -101));
                                          var18.field_q[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = k.a(var10[var17], (byte) -106);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.h(19);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L11: {
                            var15 = param1.h(94);
                            var7 = var15;
                            var16 = param1.h(36);
                            var8 = var16;
                            var9 = 0;
                            if (-2 == (var6_int ^ -1)) {
                              var9 = param1.e(true);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_r[var5] = var6_int;
                          var18.field_m[var5] = var9;
                          var18.field_k[var5] = param0.a(0, k.a(var15, (byte) -115), var16);
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -2;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -3;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_p[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_40_0 = (RuntimeException) (var4);

                stackIn_40_1 = new StringBuilder().append("af.C(");

                if (param0 == null) {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L17;
                } else {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

                if (param1 == null) {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackIn_44_2 = "null";
                  break L18;
                } else {
                  stackIn_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackIn_44_2 = "{...}";
                  break L18;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_41_0), stackIn_44_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected af() {
    }

    af(mg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_j = param4;
            this.field_g = param7;
            this.field_i = param12 ? true : false;
            this.field_m = param10;
            this.field_n = param2;
            this.field_e = param11;
            this.field_l = param0;
            this.field_f = param9;
            this.field_o = param5;
            this.field_d = param3;
            this.field_k = param6;
            this.field_b = param8;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
