/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends pe implements qd {
    static int field_G;
    private String field_I;
    static boolean field_M;
    private mh field_L;
    private int[] field_E;
    static ta field_K;
    private vd field_J;
    private int field_H;
    private pl[] field_F;

    final pl a(int param0, String param1, ce param2) {
        pl var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        pl stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        pl stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4 = new pl(param1, param2);
            var4.field_w = (bf) ((Object) new jl());
            var5 = -2 + this.field_n;
            this.a(param0 ^ 111, 0, this.field_n - -34, this.field_r, param0);
            var4.a(110, var5, 30, this.field_r - 14, 7);
            this.a((ub) (var4), (byte) 98);
            stackOut_0_0 = (pl) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("vc.HA(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0, String param1, int param2) {
        int var4_int = 0;
        try {
            if (param0 != -31) {
                this.field_E = (int[]) null;
            }
            var4_int = this.field_H;
            this.a(1 + var4_int, (byte) 109);
            this.field_F[var4_int] = this.a(0, param1, (ce) (this));
            this.field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "vc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 + 0, param2, param3);
        int discarded$0 = this.field_J.a(this.field_I, param0 - -this.field_o - -14, this.field_l + (param3 + 10), this.field_r - 28, this.field_n, 16777215, -1, param1, 0, this.field_J.field_M);
    }

    public static void d(boolean param0) {
        field_K = null;
        if (param0) {
            field_K = (ta) null;
        }
    }

    vc(mh param0, vd param1, String param2) {
        super(0, 0, 288, 0, (bf) null);
        int var4_int = 0;
        this.field_H = 0;
        try {
            this.field_I = param2;
            this.field_L = param0;
            this.field_J = param1;
            var4_int = this.field_I != null ? this.field_J.a(this.field_I, 260, this.field_J.field_M) : 0;
            this.a(123, 0, 22 - -var4_int, 288, 0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "vc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
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
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == -18905) {
                break L1;
              } else {
                this.field_L = (mh) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                if (this.field_H <= var6_int) {
                  break L3;
                } else {
                  if (param1 != this.field_F[var6_int]) {
                    var6_int++;
                    continue L2;
                  } else {
                    var7 = this.field_E[var6_int];
                    if (-1 != var7) {
                      jc.a((byte) 94, this.field_E[var6_int]);
                      break L3;
                    } else {
                      this.field_L.l(param0 ^ 9704);
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
            stackOut_11_1 = new StringBuilder().append("vc.DA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = wizardrun.field_H;
        bh.field_a = null;
        cf.field_i = false;
        if (param0 != 260) {
            field_M = false;
        }
        if (wi.field_J) {
            aa.field_lb.n(8);
        } else {
            var1 = ei.field_t;
            if (-1 > (var1 ^ -1)) {
                if ((var1 ^ -1) == -2) {
                    bh.field_a = ib.field_d;
                } else {
                    bh.field_a = di.a(new String[]{Integer.toString(var1)}, (byte) 46, of.field_m);
                }
                bh.field_a = ol.a(new CharSequence[]{(CharSequence) ((Object) bh.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) pf.field_c)}, 550);
            }
            aa.field_lb.l(-27697);
            uh.a((byte) 125);
        }
    }

    private final void a(int param0, byte param1) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        if (this.field_H >= param0) {
            return;
        }
        pl[] var8 = new pl[param0];
        pl[] var3 = var8;
        int var4 = 125 % ((param1 - 8) / 33);
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < this.field_H; var6++) {
            var8[var6] = this.field_F[var6];
            var5[var6] = this.field_E[var6];
        }
        this.field_F = var3;
        this.field_H = param0;
        this.field_E = var5;
    }

    final static void a(int param0, String param1) {
        try {
            va.a(-2, param1);
            if (param0 >= -67) {
                field_G = -79;
            }
            fc.a(sd.field_c, false, -120);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "vc.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = 4;
    }
}
