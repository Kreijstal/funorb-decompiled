/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends hc {
    int field_R;
    static ea[] field_L;
    int field_M;
    int field_S;
    static String field_T;
    int field_K;
    static ac field_O;
    int field_J;
    static int field_Q;
    int field_N;
    static int[] field_I;
    static bj field_P;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 == -27911) {
              mb.field_b.a(true, da.field_d, mg.field_a, 0);
              mb.field_b.o(param0 + 27655);
              L1: while (true) {
                if (!mm.b((byte) 76)) {
                  if (0 != (dm.field_j ^ -1)) {
                    var1_int = dm.field_j;
                    oj.a(-1, 3);
                    stackIn_10_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!wc.field_b) {
                      if (bd.field_h != ci.field_e) {
                        if (!wm.field_f.a(0)) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ic.field_l != ci.field_e) {
                            stackIn_25_0 = -1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackIn_23_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_16_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_13_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  mb.field_b.a((byte) -65, lj.field_t, ud.field_c);
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 65;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "s.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return stackIn_25_0;
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_17_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var8_int = param0 - this.field_M - this.field_u - param6;
              var9 = -this.field_t - param1 - (this.field_R - param3);
              if (var8_int * var8_int - -(var9 * var9) < this.field_J * this.field_J) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - mh.field_a;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_N;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)this.field_N;
                    break L1;
                  }
                }
                this.field_S = (int)((double)this.field_N * var10 / 6.283185307179586);
                L2: while (true) {
                  if (this.field_N > this.field_S) {
                    L3: while (true) {
                      if ((this.field_S ^ -1) <= -1) {
                        stackIn_15_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_S = this.field_S + this.field_N;
                        continue L3;
                      }
                    }
                  } else {
                    this.field_S = this.field_S - this.field_N;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("s.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = MinerDisturbance.field_ab;
        if (param1 == -1) {
          param4--;
          L0: while (true) {
            if ((param4 ^ -1) > -1) {
              return;
            } else {
              try {
                L1: {
                  var9 = param0;
                  var5 = var9;
                  var6 = param2;
                  var7 = param3;
                  var9[var6] = (c.a(16711422, var9[var6]) >> -1952707967) + var7;
                  param2++;
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var5_ref = decompiledCaughtException;
                  stackIn_10_0 = (RuntimeException) (var5_ref);

                  stackIn_10_1 = new StringBuilder().append("s.A(");

                  if (param0 == null) {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    break L2;
                  } else {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "{...}";
                    break L2;
                  }
                }
                throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
              }
              param4--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private s() throws Throwable {
        throw new Error();
    }

    public static void m(int param0) {
        field_O = null;
        field_I = null;
        if (param0 >= -113) {
            return;
        }
        field_P = null;
        field_L = null;
        field_T = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_T = "Unpacking levels";
        field_I = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * 3 / 2 - -var0;
            if (255 < var1) {
                var1 = 255;
            }
            field_I[var0] = c.a(var1 << 629166896, 16754509);
            field_I[var0] = hi.a(field_I[var0], c.a(var0 * var0 >> -1129210203 << 1099502600, 65366));
        }
    }
}
