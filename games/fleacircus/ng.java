/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private rh field_b;
    static dd[] field_h;
    private rh field_d;
    static String[] field_g;
    static int field_c;
    private hc field_e;
    static int[] field_a;
    private hc field_f;

    final sf a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        sf stackIn_3_0 = null;
        sf stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.d((byte) -111) == 1) {
            stackIn_3_0 = this.a(0, param0, (byte) 85, param2);
            return stackIn_3_0;
          }
          if (!param1) {
            field_c = 28;
          }
          if (this.field_b.a(param0, (byte) -105) != 1) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(param0, 0, (byte) 79, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ng.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final sf a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sf var8 = null;
        qf var9 = null;
        sf var10 = null;
        sf stackIn_2_0 = null;
        sf stackIn_6_0 = null;
        sf stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf var8Lifetime1;
        try {
          if (param3 <= 7) {
            stackIn_2_0 = (sf) null;
            return stackIn_2_0;
          }
          var5_int = (param1 >>> 12 | (-1879044097 & param1) << 4) ^ param0;
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int;
          var8 = (sf) (this.field_f.a(var6, -1110));
          if (var8 != null) {
            stackIn_6_0 = var8;
            return stackIn_6_0;
          }
          if (param2 != null &&
            param2[0] <= 0) {
            return null;
          }
          var9 = qf.a(this.field_d, param1, param0);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_f.a(var8Lifetime1, true, var6);
          if (param2 != null) {
            param2[0] = param2[0] - var10.field_l.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ng.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7) {
            return false;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_4_0 = ma.field_a.equals(uk.a(98, var3));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ng.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final sf a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        sf stackIn_3_0 = null;
        sf stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.d((byte) 60) == 1) {
            stackIn_3_0 = this.a(param1, 0, param0, 95);
            return stackIn_3_0;
          }
          if (1 == this.field_d.a(param1, (byte) -116)) {
            stackIn_6_0 = this.a(0, param1, param0, param2 ^ 29055);
            return stackIn_6_0;
          }
          if (param2 != 29037) {
            ng.a(-126);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ng.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 != 0) {
          ng.a(110);
        }
    }

    private final sf a(int param0, int param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sf var8 = null;
        hk var9 = null;
        sf stackIn_2_0 = null;
        Object stackIn_17_0 = null;
        sf stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        sf var8Lifetime1;
        try {
          var5_int = ((-1879044097 & param0) << 4 | param0 >>> 12) ^ param1;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (sf) (this.field_f.a(var6, -1110));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          if (param2 < 59) {
            field_c = 19;
          }
          var9 = (hk) (this.field_e.a(var6, -1110));
          if (var9 == null) {
            var9 = hk.a(this.field_b, param0, param1);
            if (var9 == null) {
              return null;
            }
            this.field_e.a(var9, true, var6);
          }
          var8Lifetime1 = var9.a(param3);
          if (var8Lifetime1 == null) {
            stackIn_17_0 = null;
            return (sf) (stackIn_17_0);
          }
          var9.c(-1);
          this.field_f.a(var8Lifetime1, true, var6);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ng.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    ng(rh param0, rh param1) {
        this.field_e = new hc(256);
        this.field_f = new hc(256);
        try {
          this.field_d = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = new int[4];
    }
}
