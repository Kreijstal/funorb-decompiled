/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends lc implements rc {
    private wd field_z;
    private wd field_A;
    static bc field_B;
    private wd field_F;
    static int field_C;
    static String field_E;
    static int field_D;
    static volatile boolean field_H;

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != 98) {
                if (-100 == (param2 ^ -1)) {
                  stackIn_10_0 = this.a(param0, 19755);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a((byte) -71, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("k.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            if (param0 >= 6) {
              if (this.field_A == param4) {
                hc.a(0);
                return;
              } else {
                if (this.field_z != param4) {
                  if (this.field_F == param4) {
                    u.a((byte) -10);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ii.n(8);
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("k.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    public k() {
        super(0, 0, 476, 225, (fc) null);
        this.field_z = new wd(gk.field_m, (sk) null);
        this.field_A = new wd(rg.field_e, (sk) null);
        this.field_F = new wd(bi.field_i, (sk) null);
        jh var1 = new jh();
        this.field_z.field_j = (fc) ((Object) var1);
        this.field_A.field_j = (fc) ((Object) var1);
        this.field_F.field_j = (fc) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1780193409;
        this.field_A.b(30, 80, var4, -var3 + this.field_k >> -731097023, this.field_m - (48 + var2));
        this.field_F.b(30, 80, var4, var4 + (this.field_k + -var3 >> -531429759) - -var2, -var2 + -48 + this.field_m);
        this.field_z.b(30, 80, var3, this.field_k - var3 >> 388466433, -(2 * var2) + (-78 + this.field_m));
        this.field_A.field_n = (sk) (this);
        this.field_z.field_n = (sk) (this);
        this.field_z.field_q = ge.field_a;
        this.field_F.field_n = (sk) (this);
        this.field_F.field_q = nf.field_a;
        this.b(this.field_A, true);
        this.b(this.field_z, true);
        this.b(this.field_F, true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        var5 = param3 + this.field_r;
        var6 = param1 + this.field_i;
        if (param2 < 33) {
          return;
        } else {
          sg.field_a.a(r.field_d, 20 + var5, var6 + 20, this.field_k + -40, this.field_m - 50, 16777215, -1, 1, 0, sg.field_a.field_s);
          super.a(param0, param1, 50, param3);
          return;
        }
    }

    public static void e(byte param0) {
        if (param0 != -81) {
            k.e((byte) 88);
            field_B = null;
            field_E = null;
            return;
        }
        field_B = null;
        field_E = null;
    }

    static {
        field_B = new bc();
        field_C = 0;
        field_E = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_H = true;
    }
}
