/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends si {
    private int field_I;
    private rf field_Q;
    private boolean field_P;
    private int field_O;
    private int field_K;
    static vi field_H;
    static he[] field_S;
    static String field_J;
    private String field_L;
    static he[] field_R;
    static lh field_N;
    static int field_M;

    dh(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, rf param8, int param9, String param10) {
        super(param0, param1, param2, param3, (cg) null, (fd) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((dh) (this)).field_P = stackIn_4_1 != 0;
              this.field_K = param6;
              this.field_L = param10;
              this.field_Q = param8;
              this.field_O = param9;
              this.field_I = param7;
              this.field_z = param4;
              var12_int = -this.field_I + this.field_K;
              var13 = this.field_Q.a(param10, var12_int, this.field_Q.field_x) - -(2 * this.field_I);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                this.a(param1, var13, param0, 16535, param2);
                break L2;
              }
            }
            L3: {
              if (this.field_P) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = this.field_K - -(2 * this.field_I);
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_z.a((var13 - param3 >> 284774497) + this.field_I, param3 + -(this.field_I * 2), var14, 16535, -(3 * this.field_I) + (-this.field_K + param2));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var12);
            stackOut_12_1 = new StringBuilder().append("dh.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    public static void j(int param0) {
        field_H = null;
        field_S = null;
        if (param0 != 3) {
            field_M = 63;
        }
        field_N = null;
        field_R = null;
        field_J = null;
    }

    final static void k(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        lh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        je var11 = null;
        lh var12 = null;
        f var13 = null;
        int[] var14 = null;
        f var15 = null;
        int[] var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                field_J = (String) null;
                break L1;
              }
            }
            L2: {
              var12 = field_N;
              var2 = var12.l(param0 ^ -31763);
              if (-1 == (var2 ^ -1)) {
                var10 = lk.c((byte) 8);
                var16 = var10;
                var14 = var16;
                var3 = var14;
                var9 = var10;
                var4 = var9;
                var5 = var12;
                var6 = ((od) ((Object) var5)).l(31760);
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var6) {
                    var15 = (f) ((Object) ql.field_i.h(param0 + -11148));
                    if (var15 == null) {
                      eg.a((byte) 126);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var15.field_l = true;
                      var15.field_j = var16[0];
                      var15.field_k = var3;
                      var15.a(-16175);
                      break L2;
                    }
                  } else {
                    var9[var7] = ((od) ((Object) var5)).h(qk.a(param0, -2));
                    var7++;
                    continue L3;
                  }
                }
              } else {
                if (1 == var2) {
                  var11 = (je) ((Object) aa.field_e.h(-11151));
                  if (var11 != null) {
                    var11.a(-16175);
                    break L2;
                  } else {
                    eg.a((byte) 126);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if ((var2 ^ -1) == -3) {
                    var13 = (f) ((Object) ql.field_i.h(-11151));
                    if (var13 != null) {
                      var13.field_k = lk.c((byte) 8);
                      var13.field_l = true;
                      var13.field_j = var13.field_k[0];
                      var13.a(-16175);
                      break L2;
                    } else {
                      eg.a((byte) 126);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    gb.a((Throwable) null, "A1: " + al.a(-99), 10);
                    eg.a((byte) 126);
                    break L2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "dh.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 <= 0) {
            return;
        }
        kf.a(param1, true, (byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.field_o;
        int var6 = this.field_m - -param3;
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = !this.field_P ? 0 : -this.field_K + this.field_w + -(2 * this.field_I);
        int discarded$0 = this.field_Q.a(this.field_L, this.field_I + var5 + var7, this.field_I + var6, this.field_K + -this.field_I, this.field_k + -(this.field_I * 2), this.field_O, -1, !this.field_P ? 2 : 0, 1, this.field_Q.field_x);
    }

    final String e(int param0) {
        int var2 = this.field_z.field_n ? 1 : 0;
        this.field_z.field_n = this.field_n;
        String var3 = this.field_z.e(-76);
        if (param0 >= -39) {
            field_N = (lh) null;
        }
        this.field_z.field_n = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(int param0, int param1) {
        cl.field_o = 3 & param0 >> -1569715708;
        q.field_c = (12 & param0) >> -240116734;
        if ((cl.field_o ^ -1) < -3) {
            cl.field_o = 2;
        }
        int var2 = -12 % ((-62 - param1) / 40);
        pa.field_f = 3 & param0;
        if (!(-3 <= (q.field_c ^ -1))) {
            q.field_c = 2;
        }
        if (!(-3 <= (pa.field_f ^ -1))) {
            pa.field_f = 2;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if (param0 < 8) {
                field_N = (lh) null;
            }
            if (-12 == (af.field_b ^ -1)) {
                wa.a((byte) -43);
            }
            gm.a((byte) 32, oe.field_d, rh.field_d, kl.field_S);
            DrPhlogistonSavesTheEarth.a(0, -118, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_H = new vi();
        field_R = new he[4];
    }
}
