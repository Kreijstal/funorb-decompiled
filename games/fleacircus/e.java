/*
 * Decompiled by CFR-JS 0.4.0.
 */
class e implements ch, eg {
    private boolean field_l;
    static String field_g;
    int field_d;
    int field_i;
    fa field_j;
    int field_n;
    private int field_a;
    int field_h;
    int field_f;
    int field_k;
    int field_o;
    int field_c;
    int field_p;
    int field_m;
    static int field_b;
    static int field_e;

    final static String a(CharSequence param0, boolean param1, int param2) {
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
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3 = fi.a(param0, param1, (byte) 124);
            if (var3 == null) {
              var4 = param2;
              L1: while (true) {
                if (param0.length() > var4) {
                  if (!gi.a(45, param0.charAt(var4))) {
                    stackIn_10_0 = sd.field_b;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L1;
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
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("e.U(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_10_0;
        }
    }

    private final void a(int param0, int param1, int param2, qa param3, int param4, int param5, int param6, int param7) {
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
        int var14 = 0;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = -16 / ((54 - param2) / 63);
              mi.a((byte) -52, param3.field_u + (param3.field_y + param1), param1 + param3.field_y, param3.field_j + (param3.field_z + param5), param3.field_z + param5);
              var9_int = this.b(param3, (byte) -50);
              var11 = this.a(param3, 122);
              if (this.field_l) {
                this.field_j.a(this.c(66, param3), this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3), var9_int, var11, param7, param6, this.field_i, this.field_h, this.field_d);
                break L1;
              } else {
                L2: {
                  var13 = this.field_h;
                  if (var13 != 0) {
                    if ((var13 ^ -1) == -3) {
                      var12 = var11 + -this.field_j.field_K;
                      break L2;
                    } else {
                      L3: {
                        if (3 != var13) {
                          if ((var13 ^ -1) != -2) {
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var12 = (-this.field_j.field_H + var11 + -this.field_j.field_K >> 1041347137) + this.field_j.field_H;
                      break L2;
                    }
                  } else {
                    var12 = this.field_j.field_H;
                    break L2;
                  }
                }
                L4: {
                  var13 = this.field_i;
                  if (var13 != 0) {
                    if ((var13 ^ -1) == -4) {
                      break L4;
                    } else {
                      if (-2 == (var13 ^ -1)) {
                        this.field_j.a(this.c(45, param3), (var9_int >> -970278207) + this.a(param3, param4, true, param1), this.a(param3, param5, param0, -3) + var12, param7, param6);
                        break L1;
                      } else {
                        if (-3 == (var13 ^ -1)) {
                          this.field_j.b(this.c(90, param3), this.a(param3, param4, true, param1) + var9_int, var12 + this.a(param3, param5, param0, -3), param7, param6);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                this.field_j.c(this.c(31, param3), this.a(param3, param4, true, param1), var12 + this.a(param3, param5, param0, -3), param7, param6);
                break L1;
              }
            }
            ia.a(-99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var9);

            stackIn_26_1 = new StringBuilder().append("e.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final int b(qa param0, byte param1) {
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
            if (param1 < -37) {
              stackIn_4_0 = -this.field_o + (-this.field_n + param0.field_u);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 126;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("e.E(");

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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(qa param0, int param1, int param2, int param3) {
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
            if (param3 == -3) {
              stackIn_4_0 = param0.field_z + (param1 + (this.field_m + (param0.field_n + param2)));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 119;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("e.S(");

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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(qa param0, int param1, int param2, byte param3) {
        try {
            if (param3 > -26) {
                qa var6 = (qa) null;
                this.a(-19, (qa) null);
            }
            this.a(0, param1, 120, param0, 0, param2, this.field_a, this.field_f);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, e param1) {
        try {
            param1.field_m = this.field_m;
            param1.field_k = this.field_k;
            if (param0 != 2) {
                qa var4 = (qa) null;
                this.c((qa) null, (byte) 95);
            }
            param1.field_a = this.field_a;
            param1.field_o = this.field_o;
            param1.field_l = this.field_l;
            param1.field_c = this.field_c;
            param1.field_n = this.field_n;
            param1.field_f = this.field_f;
            param1.field_p = this.field_p;
            param1.field_j = this.field_j;
            param1.field_i = this.field_i;
            param1.field_h = this.field_h;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, qa param2, int param3, int param4) {
        ne var14 = null;
        ne var15 = null;
        int var7 = 0;
        pi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
            if (param1 != 0) {
                qa var13 = (qa) null;
                this.a(67, (qa) null);
            }
            if (param2.e(1)) {
                var14 = this.a(param2, (byte) -35);
                var15 = var14;
                var7 = var15.b(param3, -1);
                var8 = var14.field_c[var7];
                var9 = var15.c(-1, param3);
                var10 = this.a(param2, var9, true, param4);
                var11 = this.a(param0, param2, (byte) 60) - -Math.max(0, var8.field_a);
                var12 = this.a(param0, param2, (byte) -82) + Math.min(this.a(param2, -21), Math.min(var8.field_c, 1 + var7 >= var15.field_c.length ? var8.field_c : var14.field_c[1 + var7].field_a));
                mi.a((byte) -52, param2.field_u + (param4 + param2.field_y), param4 - -param2.field_y, param0 - (-param2.field_z - param2.field_j), param0 - -param2.field_z);
                nf.field_M.a(param1 ^ 4, var10, var11, var12, this.field_c, var10);
                ia.a(-69);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(byte param0) {
        int discarded$1 = 0;
        qa var3;
        if (param0 != 127) {
          var3 = (qa) null;
          discarded$1 = this.a((qa) null, -117);
          return this.field_j.field_H - -this.field_j.field_K;
        } else {
          return this.field_j.field_H - -this.field_j.field_K;
        }
    }

    public final void a(qa param0, int param1, int param2, int param3, int param4, int param5) {
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
        pi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ne var17 = null;
        ne var18 = null;
        var16 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param4 == -30298) {
              if (param1 != param3) {
                if (param0.e(1)) {
                  L1: {
                    var17 = this.a(param0, (byte) -35);
                    var18 = var17;
                    if (param1 > param3) {
                      var8 = param3;
                      var9 = param1;
                      break L1;
                    } else {
                      var9 = param3;
                      var8 = param1;
                      break L1;
                    }
                  }
                  var10 = var18.b(var8, -1);
                  var11 = var18.b(var9, -1);
                  mi.a((byte) -52, param0.field_u + param5 + param0.field_y, param5 - -param0.field_y, param0.field_z + param2 - -param0.field_j, param2 - -param0.field_z);
                  var12 = var10;
                  L2: while (true) {
                    if (var11 < var12) {
                      ia.a(-69);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L3: {
                        var13 = var17.field_c[var12];
                        if (var12 == var10) {
                          stackIn_15_0 = var18.c(-1, var8);
                          break L3;
                        } else {
                          stackIn_15_0 = var13.field_d[0];
                          break L3;
                        }
                      }
                      L4: {
                        var14 = stackIn_15_0;
                        if (var11 == var12) {
                          stackIn_20_0 = var18.c(-1, var9);
                          break L4;
                        } else {
                          if (var13 != null) {
                            stackIn_20_0 = var13.field_d[-1 + var13.field_d.length];
                            break L4;
                          } else {
                            stackIn_20_0 = 0;
                            break L4;
                          }
                        }
                      }
                      var15 = stackIn_20_0;
                      nf.field_M.a(this.field_p >>> -259099560, var15 + -var14, false, this.field_p, var13.field_c, this.field_m + param2 - -param0.field_z + (param0.field_n - -var13.field_a), this.a(param0, var14, true, param5));
                      var12++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var7);

            stackIn_25_1 = new StringBuilder().append("e.J(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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

    public final int a(boolean param0, int param1, qa param2) {
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
              if (!param0) {
                break L1;
              } else {
                this.field_d = 20;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, 0, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("e.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final ne a(qa param0, byte param1) {
        RuntimeException var3 = null;
        ne stackIn_8_0 = null;
        ne stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == param0.field_w) {
                param0.field_w = (ne) ((Object) new j());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_l) {
                ((j) ((Object) param0.field_w)).a(true, this.field_d, this.field_i, this.field_j, this.c(param1 ^ -93, param0), this.b(param0, (byte) -98), this.field_h, this.a(param0, 122));
                break L2;
              } else {
                this.c(param0, (byte) 64);
                break L2;
              }
            }
            if (param1 == -35) {
              stackIn_10_0 = param0.field_w;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = (ne) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("e.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    public final int a(int param0, qa param1) {
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
            if (param0 <= -84) {
              this.a(param1, (byte) -35);
              stackIn_4_0 = param1.field_w.b((byte) 97) - (-this.field_n - this.field_o);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("e.I(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(qa param0, int param1) {
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
            var3_int = -90 / ((57 - param1) / 61);
            stackIn_1_0 = -this.field_m + param0.field_j - this.field_k;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("e.AA(");

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
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public final int a(int param0, qa param1, byte param2, int param3, int param4, int param5) {
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
            this.a(param1, (byte) -35);
            if (param2 > 18) {
              stackIn_4_0 = param1.field_w.a(-this.a(false, param3, param1) + param5, param0 + -this.a(param4, param1, (byte) 125), (byte) -116);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -15;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("e.C(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public void a(int param0, int param1, boolean param2, qa param3, int param4) {
        if (param0 > -36) {
            this.field_c = 31;
        }
        if (!(null != this.field_j)) {
            return;
        }
        try {
            this.a(param3, param1, param4, (byte) -34);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int a(int param0, qa param1, byte param2) {
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
            var4_int = 124 % ((param2 - -3) / 53);
            stackIn_1_0 = this.a(param1, param0, 0, -3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("e.H(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void c(qa param0, byte param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0.field_w == null) {
                param0.field_w = (ne) ((Object) new j());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.b(param0, (byte) -117);
              var4 = this.a(param0, -13);
              var6 = this.field_h;
              if (0 == var6) {
                var5 = this.field_j.field_H;
                break L2;
              } else {
                if (var6 != 2) {
                  L3: {
                    if (3 == var6) {
                      break L3;
                    } else {
                      if ((var6 ^ -1) == -2) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5 = (-this.field_j.field_K + var4 - this.field_j.field_H >> -2130555647) + this.field_j.field_H;
                  break L2;
                } else {
                  var5 = var4 + -this.field_j.field_K;
                  break L2;
                }
              }
            }
            L4: {
              if (param1 == 64) {
                break L4;
              } else {
                field_b = 28;
                break L4;
              }
            }
            L5: {
              L6: {
                var6 = this.field_i;
                if (var6 != 0) {
                  if ((var6 ^ -1) == -4) {
                    break L6;
                  } else {
                    if (var6 != 1) {
                      if ((var6 ^ -1) == -3) {
                        if (!(param0.field_w instanceof j)) {
                          break L5;
                        } else {
                          ((j) ((Object) param0.field_w)).a(var3_int, var5, param1 + -64, this.c(58, param0), this.field_j);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (!(param0.field_w instanceof j)) {
                        break L5;
                      } else {
                        ((j) ((Object) param0.field_w)).a(this.field_j, param1 ^ 4, this.c(param1 + 46, param0), var3_int >> 1194439969, var5);
                        return;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (!(param0.field_w instanceof j)) {
                break L5;
              } else {
                ((j) ((Object) param0.field_w)).a(this.c(93, param0), 0, this.field_j, true, var5);
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("e.CA(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
    }

    public final int b(int param0, qa param1) {
        RuntimeException var3 = null;
        qa var4 = null;
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
              this.a(param1, (byte) -35);
              if (param0 <= -25) {
                break L1;
              } else {
                var4 = (qa) null;
                this.a((qa) null, -4, 97, -107, -121, 31);
                break L1;
              }
            }
            stackIn_3_0 = param1.field_w.a(true) - (-this.field_m + -this.field_k);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("e.F(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    protected e() {
    }

    e(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_d = param9;
            this.field_n = param1;
            this.field_p = param11;
            this.field_m = param3;
            this.field_l = param12 ? true : false;
            this.field_k = param4;
            this.field_a = param6;
            this.field_j = param0;
            this.field_o = param2;
            this.field_f = param5;
            this.field_i = param7;
            this.field_h = param8;
            this.field_c = param10;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    private final int a(qa param0, int param1, boolean param2, int param3) {
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
            if (param2) {
              stackIn_4_0 = param0.field_y + (param3 + (this.field_n - -param0.field_r) - -param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 64;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("e.BA(");

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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        if (param0 != -92) {
            field_g = (String) null;
        }
    }

    String c(int param0, qa param1) {
        RuntimeException var3 = null;
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
              if (param0 > 21) {
                break L1;
              } else {
                this.field_n = 77;
                break L1;
              }
            }
            stackIn_3_0 = param1.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("e.DA(").append(param0).append(',');

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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_g = "OK";
        field_b = 0;
    }
}
