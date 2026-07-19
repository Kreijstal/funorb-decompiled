/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends v implements pi {
    static int field_L;
    static int[] field_I;
    private rm field_K;
    static char field_M;
    static h field_N;
    static lo field_G;
    private rm field_P;
    private rm field_F;
    static va field_O;
    static fg field_H;
    static String field_J;

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (param1 != 98) {
                if (param1 != 99) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.b(param0, param2 ^ -51);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.c(param0, -1);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("pk.T(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public pk() {
        super(0, 0, 476, 225, (dh) null);
        this.field_K = new rm(fo.field_m, (tb) null);
        this.field_P = new rm(um.field_c, (tb) null);
        this.field_F = new rm(ue.field_a, (tb) null);
        mo var1 = new mo();
        this.field_K.field_l = (dh) ((Object) var1);
        this.field_P.field_l = (dh) ((Object) var1);
        this.field_F.field_l = (dh) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -420194047;
        this.field_P.a(-var3 + this.field_x >> 242728801, (byte) 122, -var2 + (-48 + this.field_u), 30, var4);
        this.field_F.a((-var3 + this.field_x >> 1029805697) - -var4 + var2, (byte) 122, -48 + (this.field_u - var2), 30, var4);
        this.field_K.a(this.field_x + -var3 >> -283029759, (byte) 122, -(2 * var2) + -78 + this.field_u, 30, var3);
        this.field_P.field_t = (tb) (this);
        this.field_K.field_t = (tb) (this);
        this.field_K.field_z = ml.field_b;
        this.field_F.field_t = (tb) (this);
        this.field_F.field_z = wc.field_j;
        this.a(true, this.field_P);
        this.a(true, this.field_K);
        this.a(true, this.field_F);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_k - -param2;
        int var6 = param1 + this.field_o;
        int discarded$0 = hl.field_g.a(de.field_P, var5 - -20, 20 + var6, this.field_x - 40, this.field_u - 50, 16777215, -1, 1, 0, hl.field_g.field_G);
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -25335) {
            return;
        }
        field_N = null;
        field_H = null;
        field_O = null;
        field_G = null;
        field_J = null;
        field_I = null;
    }

    final static sh a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sh stackIn_4_0 = null;
        sh stackIn_8_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_3_0 = null;
        sh stackOut_7_0 = null;
        sh stackOut_19_0 = null;
        sh stackOut_16_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param1.length();
            if (0 == var2_int) {
              stackOut_3_0 = fo.field_k;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (63 < var2_int) {
                stackOut_7_0 = wb.field_h;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                var4 = 43 / ((param0 - -45) / 35);
                L1: while (true) {
                  if (var2_int > var3) {
                    L2: {
                      var5 = param1.charAt(var3);
                      if (45 != var5) {
                        if (0 != (rc.field_e.indexOf(var5) ^ -1)) {
                          break L2;
                        } else {
                          stackOut_19_0 = qj.field_F;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (-1 + var2_int == var3) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_16_0 = qj.field_F;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("pk.D(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            if (param2 == -4) {
              if (param1 != this.field_P) {
                if (param1 == this.field_K) {
                  qj.h((byte) 83);
                  return;
                } else {
                  if (param1 != this.field_F) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    rl.h(0);
                    return;
                  }
                }
              } else {
                rm.h(param2 + 88);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("pk.M(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_I = new int[128];
        field_N = new h();
        field_J = "Email is valid";
    }
}
