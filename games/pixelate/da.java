/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends jj {
    private vn[] field_n;
    static ea field_o;
    static int field_m;

    final static void a(tf[] param0, int param1, tf[] param2, int param3, jl param4, int param5, int param6, jl param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, tf[] param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          vc.a(param17, param12, param9, new sb(param2), param14, new sb(param16), param8, param11, param13, param7, param5, param18, param3, new sb(param0), param19, param4, (byte) 119, param15, param20, param6, param1);
          var21_int = -40 / ((-41 - param10) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("da.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    da(String param0, tf[] param1) {
        super(param0, param1);
        try {
          this.d(-14116);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var5 = kb.field_N;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (param0 >= -87) {
            field_m = -103;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "da.F(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -13) {
          da.b((byte) 16);
          field_o = null;
          return;
        }
        field_o = null;
    }

    final void a(boolean param0) {
        vn[] var2;
        int var3;
        vn var4;
        int var5;
        vn[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        jg.field_H.f(0, 0);
        var6 = this.field_n;
        var2 = var6;
        if (!param0) {
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.a((byte) 123);
          }
        } else {
          field_m = -17;
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            var4.a((byte) 123);
          }
        }
    }

    final void c(int param0) {
        int var3 = 0;
        vn[] var2;
        vn var4;
        int var5;
        vn[] var6;
        var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        var6 = this.field_n;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.a(param0 + 127);
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        this.field_n = new vn[5];
        var2 = 0;
        if (param0 == -14116) {
          while (this.field_n.length > var2) {
            this.field_n[var2] = new vn(100 * var2);
            var2++;
          }
        } else {
          field_o = (ea) null;
          while (this.field_n.length > var2) {
            this.field_n[var2] = new vn(100 * var2);
            var2++;
          }
        }
    }

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var4_int = -1;
          var5 = param2;
          if (param1 < 98) {
            stackIn_3_0 = -86;
            return stackIn_3_0;
          }
          while (param3 > var5) {
            var4_int = var4_int >>> 8 ^ dm.field_zb[255 & (var4_int ^ param0[var5])];
            var5++;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("da.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_o = new ea(0);
    }
}
