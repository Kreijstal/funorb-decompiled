/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qm {
    static oa field_c;
    static int[] field_i;
    int field_f;
    int field_h;
    private static long[] field_d;
    static String field_g;
    static String field_a;
    static vn field_e;
    static int field_b;

    public static void a(int param0) {
        if (param0 != -22525) {
          return;
        }
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    final static void a(hj param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          var3_int = 0;
          if (param2 != -1) {
            field_c = (oa) null;
          }
          while (param0.field_s * param0.field_y > var3_int) {
            var4 = param0.field_z[var3_int];
            var5 = 16711935 & var4;
            var5 = var5 * param1;
            var4 = var4 & 65280;
            var4 = var4 * param1;
            var5 = var5 & -16711936;
            var4 = var4 & 16711680;
            var4 = var4 | var5;
            param0.field_z[var3_int] = var4 >>> 8;
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qm.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (0 > param0 ||
          param0 >= 65536) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param1 > -60) {
          qm.a(29, (byte) -27);
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final void a(in param0, byte param1) {
        if (param1 <= 84) {
          return;
        }
        try {
          this.field_f = (int)((float)this.field_f + param0.field_g);
          this.field_h = (int)((float)this.field_h + param0.field_j);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "qm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, ei param1, int param2, qm param3, qm param4) {
        int var8 = 0;
        int var10 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int var6 = 0;
        lb var7 = null;
        ei var9 = null;
        lb var11 = null;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          var5_float = 0.0f;
          var6 = 0;
          var7 = new lb(param3, param4, 0, false, true);
          for (var8 = 0; var8 < param1.field_e; var8++) {
            var9 = (ei) (param1.field_b[var8]);
            for (var10 = 0; var9.field_e > var10; var10++) {
              var11 = (lb) (var9.field_b[var10]);
              if ((param0 - 1) <= var11.field_k &&
                param0 + 1 >= var11.field_k &&
                th.a(-1, var7, var11)) {
                if (var5_float > mm.field_d ||
                  var6 == 0) {
                  var5_float = mm.field_d;
                }
                var6 = 1;
              }
            }
          }
          if (param2 != -20484) {
            qm.a(-86, (byte) 69);
          }
          mm.field_d = var5_float;
          stackIn_24_0 = var6;
          return stackIn_24_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("qm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(in param0, int param1) {
        this.field_f = (int)((float)this.field_f - param0.field_g);
        if (param1 != -13201) {
          return;
        }
        try {
          this.field_h = (int)((float)this.field_h - param0.field_j);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "qm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qm(int param0, int param1) {
        this.field_h = param0;
        this.field_f = param1;
    }

    qm(qm param0) {
        try {
          this.field_f = param0.field_f;
          this.field_h = param0.field_h;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "qm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_d = new long[256];
        field_i = new int[]{65280, 16760703, 16777215, 4144959};
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_d[var2] = var0;
        }
        field_g = "Demolition";
        field_a = "<img=5>";
    }
}
