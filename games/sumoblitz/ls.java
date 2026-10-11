/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_k;
    static ls field_b;
    int field_i;
    private int field_f;
    private io field_m;
    static ls field_c;
    static ls field_g;
    static ls field_j;
    static ls field_e;
    static ls field_d;
    static ls field_a;
    static int field_h;
    static String field_l;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = Sumoblitz.field_L ? 1 : 0;
        int var1_intLifetime1;
        try {
          jl.field_a.b((byte) 105);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            gd.field_k[var1_int] = 0L;
          }
          for (var1_intLifetime1 = param0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            fa.field_a[var1_intLifetime1] = 0L;
          }
          vt.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ls.A(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        if (param0 != -62) {
          return (String) null;
        }
        return ig.field_a.d(-1);
    }

    final static void a(int param0, int param1, int param2) {
        wr.field_F = param2;
        if (param1 > -42) {
          return;
        }
        ha.field_b = param0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static ls a(int param0, byte param1) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0;
        if (var2 == 0) {
          return field_b;
        }
        if (var2 == 1) {
          return field_c;
        }
        if (var2 == 2) {
          return field_g;
        }
        if (var2 == 3) {
          return field_j;
        }
        if (var2 == 4) {
          return field_e;
        }
        if (var2 == 5) {
          return field_d;
        }
        if (var2 == 6) {
          return field_a;
        }
        if (param1 <= -77) {
          return null;
        }
        ls.a(88, 28, 105);
        return null;
    }

    final static void a(float param0, float param1, int param2, int param3, byte[] param4, int param5, float param6, int param7, int param8, int param9, int param10, float param11, ab param12, float param13) {
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var16 = 0;
        int var17 = 0;
        int var19 = 0;
        int var20 = 0;
        float[] var24 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param8 > -59) {
            field_g = (ls) null;
          }
          var14_int = param3 * param9;
          var24 = new float[var14_int];
          for (var16 = 0; var16 < param10; var16++) {
            param12.a(param1 / (float)param9, 0, param11 / (float)param3, param0 / (float)param7, param5, param7, 1, var24, param9, param6 * 127.0f, param3);
            var17 = param2;
            for (var18 = 0; var14_int > var18; var18++) {
              param4[var17] = (byte)(int)((float)param4[var17] + var24[var18]);
              var17++;
            }
            param6 = param6 * param13;
            param1 = param1 * 2.0f;
            param0 = param0 * 2.0f;
            param11 = param11 * 2.0f;
          }
          var20 = param2;
          var16Lifetime1 = var20;
          for (var17Lifetime1 = 0; var14_int > var17Lifetime1; var17Lifetime1++) {
            param4[var20] = (byte)(param4[var20] + 127);
            var20++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_15_0 = var14;
          stackIn_15_1 = new StringBuilder().append("ls.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param13).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_b = null;
        field_l = null;
        field_e = null;
        field_c = null;
        field_j = null;
        field_a = null;
        if (param0 != 2) {
          ab var2 = (ab) null;
          ls.a(0.4216335117816925f, -2.271651268005371f, -82, -112, (byte[]) null, 106, 0.32911431789398193f, -52, -122, -66, 54, 0.6878315806388855f, (ab) null, -1.019270896911621f);
        }
    }

    private ls(int param0, int param1, io param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m = param2;
          this.field_f = param1;
          this.field_i = param0;
          this.field_k = this.field_m.field_j * this.field_f;
          if (this.field_i < 16) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("ls.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_b = new ls(0, 3, io.field_d);
        field_c = new ls(1, 3, io.field_d);
        field_g = new ls(2, 4, io.field_g);
        field_j = new ls(3, 1, io.field_d);
        field_e = new ls(4, 2, io.field_d);
        field_d = new ls(5, 3, io.field_d);
        field_a = new ls(6, 4, io.field_d);
        field_h = mr.a(16, (byte) -115);
        field_l = "Continue";
    }
}
