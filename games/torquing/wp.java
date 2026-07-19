/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends am {
    private int field_s;
    static int field_w;
    private int field_z;
    private int field_x;
    private int[] field_u;
    static t[] field_v;
    private int[] field_t;
    static int field_y;

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              L1: {
                var4_int = param2;
                if (-1 == (var4_int ^ -1)) {
                  this.field_x = param0.i((byte) -101);
                  break L1;
                } else {
                  if ((var4_int ^ -1) != -2) {
                    if (-3 == (var4_int ^ -1)) {
                      this.field_z = param0.i((byte) -101);
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_s = param0.i(param1 ^ 7059);
                    break L1;
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("wp.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static da b(int param0) {
        if (param0 >= -51) {
            return (da) null;
        }
        return new da(of.d((byte) -77), sd.b(2));
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, t[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param5 == null) {
                break L1;
              } else {
                if (0 < param2) {
                  L2: {
                    var6_int = param5[0].field_w;
                    var7 = param5[2].field_w;
                    var8 = param5[1].field_w;
                    param5[0].c(param4, param0, param1);
                    param5[2].c(param2 + param4 - var7, param0, param1);
                    ph.b(lj.field_c);
                    ph.f(var6_int + param4, param0, -var7 + param4 + param2, param0 + param5[1].field_u);
                    var9 = var6_int + param4;
                    var10 = -var7 + (param4 - -param2);
                    param4 = var9;
                    if (!param3) {
                      break L2;
                    } else {
                      field_v = (t[]) null;
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var10 <= param4) {
                      ph.a(lj.field_c);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param5[1].c(param4, param0, param1);
                      param4 = param4 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("wp.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void g(byte param0) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        this.field_u = new int[1 + this.field_x];
        int var2 = 0;
        this.field_t = new int[this.field_x + 1];
        int var3 = 4096 / this.field_x;
        int var4 = this.field_s * var3 >> -657712948;
        for (var5 = 0; this.field_x > var5; var5++) {
            this.field_t[var5] = var2;
            this.field_u[var5] = var2 - -var4;
            var2 = var2 + var3;
        }
        this.field_t[this.field_x] = 4096;
        this.field_u[this.field_x] = 4096 - -this.field_u[0];
        if (param0 != 39) {
            this.a((byte) 98);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var10 = Torquing.field_u;
          var13 = this.field_l.a(param1, 25657);
          var12 = var13;
          var3 = var12;
          if (param0 >= 86) {
            break L0;
          } else {
            this.field_z = -102;
            break L0;
          }
        }
        L1: {
          if (!this.field_l.field_b) {
            break L1;
          } else {
            var4 = dp.field_a[param1];
            if (this.field_z == 0) {
              var5 = 0;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var6 >= this.field_x) {
                    break L3;
                  } else {
                    if (var4 >= this.field_t[var6]) {
                      if (this.field_t[var6 - -1] > var4) {
                        if (var4 < this.field_u[var6]) {
                          var5 = 4096;
                          break L3;
                        } else {
                          dk.a(var13, 0, ci.field_c, var5);
                          return var3;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                dk.a(var13, 0, ci.field_c, var5);
                break L1;
              }
            } else {
              var5 = 0;
              L4: while (true) {
                if (ci.field_c <= var5) {
                  break L1;
                } else {
                  L5: {
                    var6 = 0;
                    var7 = 0;
                    var8 = q.field_b[var5];
                    var9 = this.field_z;
                    if ((var9 ^ -1) == -2) {
                      var6 = var8;
                      break L5;
                    } else {
                      if (var9 != 2) {
                        if ((var9 ^ -1) != -4) {
                          break L5;
                        } else {
                          var6 = (var8 + -var4 >> 611861953) + 2048;
                          break L5;
                        }
                      } else {
                        var6 = (var4 + -4096 + var8 >> -149594879) + 2048;
                        break L5;
                      }
                    }
                  }
                  var11 = 0;
                  var9 = var11;
                  L6: while (true) {
                    L7: {
                      if (var11 >= this.field_x) {
                        break L7;
                      } else {
                        if (this.field_t[var11] <= var6) {
                          if (var6 < this.field_t[var11 + 1]) {
                            if (var6 >= this.field_u[var11]) {
                              break L7;
                            } else {
                              var7 = 4096;
                              break L7;
                            }
                          } else {
                            var11++;
                            continue L6;
                          }
                        } else {
                          var11++;
                          continue L6;
                        }
                      }
                    }
                    var13 = var12;
                    var13[var5] = var7;
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(byte param0) {
        if (param0 <= 123) {
            this.field_s = 91;
        }
        this.g((byte) 39);
    }

    public wp() {
        super(0, true);
        this.field_z = 0;
        this.field_s = 2048;
        this.field_x = 10;
    }

    public static void a(boolean param0) {
        da discarded$0 = null;
        field_v = null;
        if (!param0) {
            discarded$0 = wp.b(110);
        }
    }

    static {
    }
}
