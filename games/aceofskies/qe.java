/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    nr[] field_c;
    nr[] field_h;
    static ej field_e;
    sr field_b;
    boolean field_d;
    sr field_j;
    static int[] field_f;
    sr field_g;
    static float[] field_i;
    static float[] field_a;
    static int field_k;

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_f = null;
        if (param0 != 5575) {
            field_f = (int[]) null;
        }
        field_e = null;
    }

    qe(wl param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        sr var4 = null;
        cs var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
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
        this.field_c = null;
        this.field_b = null;
        this.field_j = null;
        this.field_h = null;
        this.field_g = null;
        try {
          L0: {
            L1: {
              this.field_d = param0.field_G;
              nb.a(8, param0);
              if (!this.field_d) {
                this.field_h = new nr[16];
                var2_int = 0;
                L2: while (true) {
                  if (16 <= var2_int) {
                    this.field_c = new nr[16];
                    var2_int = 0;
                    L3: while (true) {
                      if (-17 >= (var2_int ^ -1)) {
                        break L1;
                      } else {
                        var24 = cs.a(false, var2_int * 32768, 32768, mq.field_e);
                        this.field_c[var2_int] = new nr(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var23 = cs.a(false, var2_int * 32768, 32768, wl.field_Kb);
                    this.field_h[var2_int] = new nr(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                var20 = rb.a(false, wl.field_Kb, 50);
                this.field_j = new sr(param0, 6410, 128, 128, 16, var20, 6410);
                var21 = rb.a(false, mq.field_e, -77);
                this.field_g = new sr(param0, 6410, 128, 128, 16, var21, 6410);
                var10 = param0.field_cc;
                if (!var10.b(true)) {
                  break L1;
                } else {
                  L4: {
                    var22 = rb.a(false, ho.field_a, -88);
                    this.field_b = new sr(param0, 6408, 128, 128, 16);
                    var4 = new sr(param0, 6409, 128, 128, 16, var22, 6409);
                    if (var10.a((byte) 97, this.field_b, var4, 2.0f)) {
                      discarded$1 = this.field_b.a(false);
                      break L4;
                    } else {
                      this.field_b.b((byte) -50);
                      this.field_b = null;
                      break L4;
                    }
                  }
                  var4.b((byte) -67);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("qe.<init>(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        int var2 = 0;
        field_f = new int[]{1, 2, 5, 2, 2, 10, 3, 10, 10};
        field_e = new ej(6, 0, 4, 2);
        field_a = new float[16384];
        field_i = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; (var2 ^ -1) > -16385; var2++) {
            field_i[var2] = (float)Math.sin(var0 * (double)var2);
            field_a[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}
