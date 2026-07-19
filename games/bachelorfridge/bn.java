/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bn extends kj {
    private eaa field_g;
    static ee field_h;
    private int field_f;
    static ee field_i;

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        if (param0 <= 93) {
            field_i = (ee) null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_h = (ee) null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (lk.field_r >= 10) {
                if (!ad.d((byte) 27)) {
                  dg.d();
                  rha.a(240, false, 320);
                  av.a(0, -83, param1, 0);
                  break L1;
                } else {
                  if (0 == jv.field_j) {
                    rda.a(0, param2, false);
                    av.a(0, -76, param1, 0);
                    break L1;
                  } else {
                    jq.a(param1, -128);
                    break L1;
                  }
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (nf.field_K) {
                    nf.field_K = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                lha.a(kla.f(param0 + -10284), dea.field_o, wea.b(false), var3_int != 0, 3);
                break L1;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                var5 = (java.awt.Canvas) null;
                bn.a(-46, (java.awt.Canvas) null, false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("bn.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    bn(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_f = 128;
            this.field_g = new eaa();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.a(34, true, 68);
        }
        rea.a(this.field_g, 65280, param2, (byte) 118, 10, param0);
    }

    final static kv a(vr param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kv stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (g.a(param3, param2, -30744, param0)) {
              var4_int = -101 / ((-66 - param1) / 41);
              stackOut_3_0 = nja.a(true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("bn.D(");
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kv) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final boolean b(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rea var9 = null;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        var10 = BachelorFridge.field_y;
        int fieldTemp$4 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        if (-1 == (fieldTemp$4 ^ -1)) {
          return true;
        } else {
          L0: {
            if (127 < this.field_f) {
              break L0;
            } else {
              if (64 <= this.field_f) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 1) {
                    break L0;
                  } else {
                    var3 = this.field_f;
                    var3 += 16;
                    var4 = kla.a(96, this.field_e.field_h.field_w, -2147483648);
                    var5 = kla.a(48, this.field_e.field_h.field_w, -2147483648);
                    discarded$5 = kla.a(50, this.field_e.field_h.field_w, -2147483648);
                    var6 = 128 + var4;
                    var7 = 64 + var5;
                    var8 = (int)(Math.sin((double)var3 * 300.0) * 100.0) * 0;
                    var9 = new rea(var6, var8, var7, kla.a(3, this.field_e.field_h.field_w, -2147483648));
                    discarded$6 = kla.a(3, this.field_e.field_h.field_w, -2147483648);
                    discarded$7 = kla.a(5000, this.field_e.field_h.field_w, -2147483648);
                    var9.field_o = (double)(-kla.a(2, this.field_e.field_h.field_w, -2147483648) + -1);
                    var9.field_n = 64;
                    var9.field_h = -1;
                    this.field_g.a(var9, true);
                    var2++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            dha.a(this.field_g, this.field_f, this.field_e.field_h.field_w, 75);
            if (param0 >= 21) {
              break L2;
            } else {
              var11 = (java.awt.Canvas) null;
              bn.a(101, (java.awt.Canvas) null, false);
              break L2;
            }
          }
          return false;
        }
    }

    static {
    }
}
