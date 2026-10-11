/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    private ad field_h;
    static int field_b;
    static int field_a;
    private ad field_c;
    static int field_d;
    private cg field_g;
    static String[] field_e;
    private cg field_f;

    final td a(int param0, int param1, int param2) {
        if (param0 == -18480) {
          return this.a((byte) -108, param2, (int[]) null, param1);
        }
        this.field_f = (cg) null;
        return this.a((byte) -108, param2, (int[]) null, param1);
    }

    public static void b(int param0) {
        if (param0 > -58) {
          return;
        }
        field_e = null;
    }

    private final td a(int param0, int[] param1, String param2) {
        td discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        td stackIn_3_0 = null;
        td stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c.b("", (byte) 8)) {
            stackIn_3_0 = this.a(1620678500, "", param1, param2);
            return stackIn_3_0;
          }
          if (param0 != 24002) {
            var5 = (String) null;
            discarded$1 = this.a(-78, (int[]) null, (String) null);
          }
          stackIn_7_0 = this.a(1620678500, param2, param1, "");
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ud.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final td a(byte param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        td var8 = null;
        g var9 = null;
        int var10 = 0;
        td var11 = null;
        td stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        td stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        td var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | param3 << 4 & 65528) ^ param1;
          var5_int = var5_int | param3 << 16;
          var6 = (long)var5_int;
          var8 = (td) (this.field_f.a((byte) 125, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param2 != null &&
            0 >= param2[0]) {
            return null;
          }
          var9 = g.a(this.field_c, param3, param1);
          if (var9 == null) {
            stackIn_10_0 = null;
            return (td) (stackIn_10_0);
          }
          var11 = var9.b();
          var8Lifetime1 = var11;
          this.field_f.a(var8Lifetime1, var6, (byte) -36);
          if (param2 != null) {
            param2[0] = param2[0] - var11.field_j.length;
          }
          var10 = 23 % ((-33 - param0) / 40);
          stackIn_14_0 = var8Lifetime1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("ud.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final td a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        td stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 127 / ((param1 - 41) / 53);
          stackIn_1_0 = this.a(24002, (int[]) null, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ud.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final td a(int param0, int param1, boolean param2) {
        if (param2) {
          return this.a((int[]) null, 34, param0, param1);
        }
        this.a(-109, -44, false);
        return this.a((int[]) null, 34, param0, param1);
    }

    final static void a(int param0) {
        ff.a(true, -125, ac.field_c, v.field_b);
        ja.field_F = true;
        if (param0 < 42) {
          field_a = 104;
        }
    }

    private final td a(int[] param0, int param1, int param2, int param3) {
        td stackIn_2_0 = null;
        td stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        td var8 = null;
        sf var9 = null;
        td var8Lifetime1;
        try {
          var5_int = (param3 << 4 & 65526 | param3 >>> 12) ^ param2;
          var5_int = var5_int | param3 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (td) (this.field_f.a((byte) 114, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            0 >= param0[0]) {
            return null;
          }
          if (param1 <= 7) {
            this.field_c = (ad) null;
          }
          var9 = (sf) (this.field_g.a((byte) 127, var6));
          if (var9 == null) {
            var9 = sf.a(this.field_h, param3, param2);
            if (var9 == null) {
              return null;
            }
            this.field_g.a(var9, var6, (byte) -36);
          }
          var8Lifetime1 = var9.a(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(-19822);
          this.field_f.a(var8Lifetime1, var6, (byte) -36);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ud.H(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final td a(int param0, String param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        td stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_c.c(param1, (byte) -105);
          if (var5_int < 0) {
            stackIn_2_0 = null;
            return (td) (stackIn_2_0);
          }
          var6 = this.field_c.a(param3, var5_int, -28459);
          if (var6 < 0) {
            stackIn_5_0 = null;
            return (td) (stackIn_5_0);
          }
          if (param0 != 1620678500) {
            this.field_f = (cg) null;
          }
          stackIn_9_0 = this.a((byte) 13, var6, param2, var5_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ud.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    ud(ad param0, ad param1) {
        this.field_g = new cg(256);
        this.field_f = new cg(256);
        try {
          this.field_h = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 500;
    }
}
