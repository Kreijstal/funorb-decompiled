/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    private mh field_d;
    private ki field_b;
    static String field_f;
    private ki field_c;
    static String[] field_e;
    static mg field_a;
    private mh field_g;

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = OrbDefence.field_D ? 1 : 0;
        int var1_intLifetime1;
        try {
          ge.field_g.b(0);
          if (param0 <= 23) {
            String var3 = (String) null;
            vd.a(true, -101, (String) null);
          }
          for (var1_int = 0; var1_int < 32; var1_int++) {
            jl.field_b[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            qf.field_o[var1_intLifetime1] = 0L;
          }
          m.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vd.G(" + param0 + ')');
        }
    }

    final dl a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        dl stackIn_3_0 = null;
        dl stackIn_6_0 = null;
        dl stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.a((byte) 117) == 1) {
            stackIn_3_0 = this.a(param2, param0, param1 - 219, 0);
            return stackIn_3_0;
          }
          if (param1 != 92) {
            stackIn_6_0 = (dl) null;
            return stackIn_6_0;
          }
          if (this.field_c.a((byte) 104, param0) != 1) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(param2, 0, param1 - 220, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("vd.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final dl a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        dl stackIn_2_0 = null;
        dl stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.a((byte) 122) == 1) {
            stackIn_2_0 = this.a(65527, param1, param0, 0);
            return stackIn_2_0;
          }
          if (param2 <= 73) {
            vd.a(56);
          }
          if (1 != this.field_b.a((byte) 119, param0)) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.a(65527, param1, 0, param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final dl a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        dl var8 = null;
        cm var9 = null;
        int var10 = 0;
        dl var11 = null;
        dl stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        dl stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl var8Lifetime1;
        try {
          var5_int = param1 ^ ((-536866817 & param3) << 4 | param3 >>> 12);
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (dl) (this.field_g.a(var6, -1));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param0 != null &&
            0 >= param0[0]) {
            return null;
          }
          var9 = cm.a(this.field_c, param3, param1);
          var10 = -10 / ((param2 + 57) / 57);
          if (var9 == null) {
            stackIn_10_0 = null;
            return (dl) (stackIn_10_0);
          }
          var11 = var9.a();
          var8Lifetime1 = var11;
          this.field_g.a(var6, (byte) -91, var8Lifetime1);
          if (param0 != null) {
            param0[0] = param0[0] - var11.field_g.length;
          }
          stackIn_15_0 = var8Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("vd.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final dl a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        dl var8 = null;
        nj var9 = null;
        dl stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        dl stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        dl var8Lifetime1;
        try {
          var5_int = (param0 & param3 << 4 | param3 >>> 12) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (dl) (this.field_g.a(var6, -1));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param1 != null &&
            param1[0] <= 0) {
            return null;
          }
          var9 = (nj) (this.field_d.a(var6, param0 - 65528));
          if (var9 == null) {
            var9 = nj.a(this.field_b, param3, param2);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (dl) (stackIn_11_0);
            }
            this.field_d.a(var6, (byte) -93, var9);
          }
          var8Lifetime1 = var9.a(param1);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.b(57);
          this.field_g.a(var6, (byte) 117, var8Lifetime1);
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("vd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 != 13461) {
          String var2 = (String) null;
          vd.a(true, -19, (String) null);
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
          jc.field_j = param0;
          if (param1 != -536866817) {
            field_e = (String[]) null;
          }
          oe.field_p = true;
          oj.field_q = new dh(bm.field_d, qc.field_b, param2, vh.field_j, jc.field_j);
          bm.field_d.b((byte) 74, (pj) (oj.field_q));
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    vd(ki param0, ki param1) {
        this.field_d = new mh(256);
        this.field_g = new mh(256);
        try {
          this.field_c = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Create";
    }
}
