/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends pj implements ke {
    private int field_J;
    private hf[] field_Q;
    static int field_N;
    private int[] field_M;
    private String field_L;
    static int field_K;
    private ma field_P;
    private rf field_O;

    dj(ma param0, rf param1, String param2) {
        super(0, 0, 288, 0, (cg) null);
        int var4_int = 0;
        this.field_J = 0;
        try {
            this.field_P = param0;
            this.field_O = param1;
            this.field_L = param2;
            var4_int = null == this.field_L ? 0 : this.field_O.a(this.field_L, 260, this.field_O.field_x);
            this.a(0, var4_int + 22, 0, 16535, 288);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(this.field_J < param0)) {
            return;
        }
        if (param1 != -38) {
            this.field_Q = (hf[]) null;
        }
        hf[] var7 = new hf[param0];
        hf[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < this.field_J; var5++) {
            var7[var5] = this.field_Q[var5];
            var4[var5] = this.field_M[var5];
        }
        this.field_M = var4;
        this.field_Q = var3;
        this.field_J = param0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = this.field_O.a(this.field_L, param0 - (-this.field_o + -14), this.field_m + (param3 - -10), this.field_w - 28, this.field_k, 16777215, -1, 0, 0, this.field_O.field_x);
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5 = 0;
        L0: {
          var5 = param2 * 5;
          if (var5 >= 0) {
            break L0;
          } else {
            var5 = 0;
            break L0;
          }
        }
        if (!param3) {
          L1: {
            if (param0 < var5) {
              var5 = param0;
              break L1;
            } else {
              break L1;
            }
          }
          wj.f(-var5 + 311, param4, 18 + 2 * var5, param1, 13875857, 15987691);
          wj.e(-var5 + 311, param4, 2 * (var5 + 9), 0, 25);
          wj.e(-var5 + 311, param4 + param1, var5 * 2 - -18, 0, 25);
          ek.field_m.a(0, -10 + param4, -var5 + 253, ek.field_m.field_c);
          ek.field_m.a(388 + var5, param4 - 10, 253, ek.field_m.field_c);
          ek.field_m.a(0, -70 + (param1 + param4), 253 + -var5, ek.field_m.field_c);
          ek.field_m.a(388 + var5, -70 + (param4 + param1), 261, ek.field_m.field_c);
          t.field_a.a(253 - var5, -10 + param4);
          bb.field_b.a(var5 + 388 - la.field_a.field_h, -10 + param4);
          la.field_a.a(-var5 + 253, -51 + param4 - -param1);
          ri.field_o.a(-ri.field_o.field_h + var5 + 388, -51 + param4 + param1);
          cl.field_t.a(-var5 + 253, 54 + param4, cl.field_t.field_h, param1 - 105);
          tb.field_d.a(-la.field_a.field_h + 388 - -var5, 54 + param4, cl.field_t.field_h, param1 + -105);
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        nl var4 = null;
        h var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = (nl) ((Object) gf.field_A.h(-11151));
              if (!param0) {
                break L1;
              } else {
                field_N = -49;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 == null) {
                var5 = (h) ((Object) eg.field_c.h(-11151));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    bj.a(param1, -81, var5);
                    var5 = (h) ((Object) eg.field_c.e(0));
                    continue L3;
                  }
                }
              } else {
                fc.a(-105, var4, param1);
                var4 = (nl) ((Object) gf.field_A.e(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "dj.F(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                this.a(37, (byte) -128);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (this.field_J <= var6_int) {
                  break L3;
                } else {
                  if (param3 != this.field_Q[var6_int]) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = this.field_M[var6_int];
                    if (0 != (var7 ^ -1)) {
                      sf.a(this.field_M[var6_int], 11649);
                      break L3;
                    } else {
                      this.field_P.d(true);
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("dj.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = this.field_J;
            if (param0) {
                this.a(-94, -80, (byte) -32, 127);
            }
            this.a(var4_int + 1, (byte) -38);
            this.field_Q[var4_int] = this.a(param1, param0, (fd) (this));
            this.field_M[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final hf a(String param0, boolean param1, fd param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hf stackIn_2_0 = null;
        hf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_3_0 = null;
        hf stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4 = new hf(param0, param2);
            var4.field_l = (cg) ((Object) new ie());
            if (!param1) {
              var5 = -2 + this.field_k;
              this.a(0, 34 + this.field_k, 0, 16535, this.field_w);
              var4.a(var5, 30, 7, 16535, -14 + this.field_w);
              this.b(var4, (byte) 102);
              stackOut_3_0 = (hf) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (hf) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4_ref);
            stackOut_5_1 = new StringBuilder().append("dj.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_N = -1;
    }
}
