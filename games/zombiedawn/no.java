/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends fb {
    static int[] field_G;
    private int field_F;
    private int field_D;
    static String field_E;

    no(int param0, int param1) {
        super(param0, param1, 0);
        this.field_F = 0;
    }

    final static void f(byte param0) {
        sl.field_d = null;
        bo.field_o = null;
        j.field_a = null;
        vj.field_m = (byte[][]) null;
        bn.field_c = null;
        if (param0 >= -15) {
            return;
        }
        uf.field_n = null;
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = param1.a(this.a(true), (byte) -91);
            var4 = param1.a(this.f(237239984), 0) + -183;
            if (0 == this.field_F) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = fb.a(1311979239, (int)(3L * tp.field_p << 1634640069)) >> 1144700303;
              var6 = 7;
              var7 = -var6 + var3_int;
              var8 = -1 + (var3_int - -var6);
              g.a(var4, (byte) 99, 3 + var8, var4 - -this.field_F, -2 + var7);
              var9 = 0;
              bi.e(var7, var4, -var5 + var7, -2 + (var4 - -this.field_F), var9);
              bi.e(var7 - -1, var4, 1 + (-var5 + var7), this.field_F + var4, var9);
              bi.e(var7 + 2, var4, 2 + (var7 + -var5), -2 + var4 + this.field_F, var9);
              bi.e(var8, var4, var8 - var5, -2 + (var4 - -this.field_F), var9);
              bi.e(var8 - 1, var4, -var5 + var8 + -1, this.field_F + var4, var9);
              bi.e(var8 - 2, var4, var8 + (-var5 + -2), -2 + this.field_F + var4, var9);
              var10 = -3 + this.field_F + var4;
              L1: while (true) {
                if (var4 > var10) {
                  pa.a(-21189);
                  if (param0 <= -76) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    no.f((byte) -110);
                    return;
                  }
                } else {
                  bi.b(var7 - -2, var10, -3 + 2 * var6, var9);
                  var10 -= 7;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("no.B(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(boolean param0) {
        field_G = null;
        if (!param0) {
            no.b(false);
            field_E = null;
            return;
        }
        field_E = null;
    }

    final void g(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 >= 95) {
          if (hp.field_A.a(true) > 18 + this.a(true)) {
            if (159 > this.field_F) {
              fieldTemp$4 = this.field_D - 1;
              this.field_D = this.field_D - 1;
              if (-1 > (fieldTemp$4 ^ -1)) {
                return;
              } else {
                this.field_F = this.field_F + 1;
                this.field_D = 1;
                return;
              }
            } else {
              return;
            }
          } else {
            fieldTemp$5 = this.field_D - 1;
            this.field_D = this.field_D - 1;
            if (fieldTemp$5 > 0) {
              return;
            } else {
              hp.field_A.field_x = hp.field_A.field_x - 65536;
              this.field_F = this.field_F - 1;
              this.field_D = 1;
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        field_G = new int[]{230, 150, 180, 100};
        field_E = "Checking";
    }
}
