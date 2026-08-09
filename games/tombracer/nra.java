/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nra implements bo {
    static int[][] field_g;
    private long field_l;
    private int field_f;
    private long field_e;
    private int field_k;
    private int field_m;
    private int field_i;
    private long field_b;
    static jea field_c;
    static jea field_a;
    private long field_n;
    private int field_d;
    private int field_h;
    private long field_j;

    public final void a(int param0, kh param1) {
        param1.a(1736565456, this.field_j);
        param1.f(param0 ^ -1477662080, this.field_m);
        param1.i(this.field_f, 0);
        param1.a(this.field_h, (byte) -84);
        param1.a(this.field_d, (byte) -117);
        param1.a(this.field_i, (byte) -109);
        param1.a(this.field_k, (byte) 4);
        param1.a(1736565456, this.field_e);
        param1.a(1736565456, this.field_n);
        param1.a(param0 ^ 1736565272, this.field_b);
        if (param0 != 200) {
            return;
        }
        try {
            param1.a(param0 ^ 1736565272, this.field_l);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nra.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kh param0, byte param1) {
        this.field_j = param0.b(290646880);
        this.field_m = param0.d(122);
        this.field_f = param0.h(param1 + 274);
        if (param1 != -19) {
            return;
        }
        try {
            this.field_h = param0.e(-126);
            this.field_d = param0.e(-51);
            this.field_i = param0.e(-25);
            this.field_k = param0.e(100);
            this.field_e = param0.b(290646880);
            this.field_n = param0.b(param1 + 290646899);
            this.field_b = param0.b(param1 ^ -290646899);
            this.field_l = param0.b(290646880);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nra.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 27) {
            return;
        }
        field_g = (int[][]) null;
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int[] param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param4--;
            param2--;
            var5_int = param2 + -7;
            if (param0 == -55) {
              L1: while (true) {
                if (param4 >= var5_int) {
                  L2: while (true) {
                    if (param4 >= param2) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param4++;
                      param3[param4] = param1;
                      continue L2;
                    }
                  }
                } else {
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  param4++;
                  param3[param4] = param1;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("nra.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, long param1) {
        this.field_j = param1;
        if (param0 == -7) {
            return;
        }
        this.field_k = -64;
    }

    final void a(long param0, long param1, boolean param2, long param3, long param4) {
        kh var11;
        this.field_e = param3;
        this.field_l = param0;
        if (param2) {
          var11 = (kh) null;
          this.a((kh) null, (byte) -83);
          this.field_n = param1;
          this.field_b = param4;
          return;
        } else {
          this.field_n = param1;
          this.field_b = param4;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_i = param2;
        this.field_h = param0;
        this.field_d = param3;
        this.field_k = param1;
        int var6 = -68 % ((-66 - param4) / 36);
    }

    final void b(int param0, int param1) {
        int var3 = -109 % ((87 - param0) / 38);
        this.field_f = param1;
    }

    final void a(int param0, int param1) {
        if (param1 > -69) {
            this.field_e = 126L;
            this.field_m = param0;
            return;
        }
        this.field_m = param0;
    }

    static {
    }
}
