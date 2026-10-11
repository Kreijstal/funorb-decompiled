/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static hl field_e;
    static int field_d;
    private ue field_h;
    private ue field_b;
    static String field_g;
    private ih field_f;
    static n field_c;
    private ih field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = nd.field_m;
          if (param2 <= 91) {
            stackIn_2_0 = 72;
            return stackIn_2_0;
          }
          while (var3_int < uh.field_h.length) {
            var5 = eg.field_a[var3_int];
            if (0 > var5) {
              var4 = var4 + sg.field_e;
            } else {
              var6 = fb.$cfr$intArgs$a$1694234bddb3(uh.field_h[var3_int], 26, true);
              var4 = var4 + mc.field_h;
              var7 = ee.field_b - (var6 >> 1);
              if (rh.a(pk.field_c + (kc.field_S << 1), param1, (rh.field_i << 1) + var6, -rh.field_i + var7, var4, param0, -89)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (pk.field_c + mc.field_h + (kc.field_S << 1));
            }
            var3_int++;
          }
          stackIn_12_0 = -1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "ja.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final ud a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        aj var9 = null;
        ud var10 = null;
        ud stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ud stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | (param3 & -805302273) << 4) ^ param1;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (ud) (this.field_a.a(var6, (byte) 111));
          if (param2 != 0) {
            this.field_h = (ue) null;
          }
          if (var8 != null) {
            stackIn_4_0 = var8;
            return stackIn_4_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_8_0 = null;
            return (ud) (stackIn_8_0);
          }
          var9 = aj.a(this.field_h, param3, param1);
          if (var9 == null) {
            return null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_a.a(var6, (byte) -100, var8Lifetime1);
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_i.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ja.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final ud a(int param0, int param1, byte param2) {
        if (param2 != 41) {
          return (ud) null;
        }
        return this.a(param1, (byte) 127, param0, (int[]) null);
    }

    public static void a(byte param0) {
        if (param0 <= 67) {
          return;
        }
        field_e = null;
        field_c = null;
        field_g = null;
    }

    private final ud a(int param0, byte param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ud var8 = null;
        nj var9 = null;
        ud stackIn_2_0 = null;
        ud stackIn_15_0 = null;
        ud stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud var8Lifetime1;
        try {
          var5_int = param0 ^ (param2 >>> 12 | 65521 & param2 << 4);
          var5_int = var5_int | param2 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (ud) (this.field_a.a(var6, (byte) 60));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param3 != null &&
            0 >= param3[0]) {
            return null;
          }
          var9 = (nj) (this.field_f.a(var6, (byte) 42));
          if (var9 == null) {
            var9 = nj.a(this.field_b, param2, param0);
            if (var9 == null) {
              return null;
            }
            this.field_f.a(var6, (byte) -100, var9);
          }
          if (param1 <= 120) {
            stackIn_15_0 = (ud) null;
            return stackIn_15_0;
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.b(4);
          this.field_a.a(var6, (byte) -100, var8Lifetime1);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ja.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final ud b(int param0, int param1, int param2) {
        if (param2 < 87) {
          field_g = (String) null;
        }
        return this.a((int[]) null, param0, 0, param1);
    }

    ja(ue param0, ue param1) {
        this.field_f = new ih(256);
        this.field_a = new ih(256);
        try {
          this.field_b = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Orb coins: <%0>";
        field_c = new n(1);
    }
}
