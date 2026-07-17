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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
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
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != 98) {
                if (param2 == 99) {
                  stackOut_9_0 = ((k) this).a(param0, 19755);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((k) this).a((byte) -71, param0);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("k.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        int var7 = 0;
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
        var7 = Bounce.field_N;
        try {
          if (param0 >= 6) {
            if (((k) this).field_A == param4) {
              int discarded$6 = 0;
              hc.a();
              return;
            } else {
              if (((k) this).field_z != param4) {
                if (((k) this).field_F == param4) {
                  int discarded$7 = -10;
                  u.a();
                  return;
                } else {
                  return;
                }
              } else {
                int discarded$8 = 8;
                ii.n();
                return;
              }
            }
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("k.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public k() {
        super(0, 0, 476, 225, (fc) null);
        ((k) this).field_z = new wd(gk.field_m, (sk) null);
        ((k) this).field_A = new wd(rg.field_e, (sk) null);
        ((k) this).field_F = new wd(bi.field_i, (sk) null);
        jh var1 = new jh();
        ((k) this).field_z.field_j = (fc) (Object) var1;
        ((k) this).field_A.field_j = (fc) (Object) var1;
        ((k) this).field_F.field_j = (fc) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        ((k) this).field_A.b(30, 80, var4, -var3 + ((k) this).field_k >> 1, ((k) this).field_m - (48 + var2));
        ((k) this).field_F.b(30, 80, var4, var4 + (((k) this).field_k + -var3 >> 1) - -var2, -var2 + -48 + ((k) this).field_m);
        ((k) this).field_z.b(30, 80, var3, ((k) this).field_k - var3 >> 1, -(2 * var2) + (-78 + ((k) this).field_m));
        ((k) this).field_A.field_n = (sk) this;
        ((k) this).field_z.field_n = (sk) this;
        ((k) this).field_z.field_q = ge.field_a;
        ((k) this).field_F.field_n = (sk) this;
        ((k) this).field_F.field_q = nf.field_a;
        ((k) this).b((lk) (Object) ((k) this).field_A, true);
        ((k) this).b((lk) (Object) ((k) this).field_z, true);
        ((k) this).b((lk) (Object) ((k) this).field_F, true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = param3 + ((k) this).field_r;
        var6 = param1 + ((k) this).field_i;
        if (param2 < 33) {
          return;
        } else {
          int discarded$2 = sg.field_a.a(r.field_d, 20 + var5, var6 + 20, ((k) this).field_k + -40, ((k) this).field_m - 50, 16777215, -1, 1, 0, sg.field_a.field_s);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new bc();
        field_C = 0;
        field_E = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_H = true;
    }
}
