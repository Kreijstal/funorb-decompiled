/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static int field_d;
    private jl field_e;
    static sq field_g;
    static mi field_f;
    private r field_h;
    private r field_b;
    static long field_a;
    private jl field_c;

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        if (param1 == 1342181375) {
          return qn.field_t[var4];
        }
        field_g = (sq) null;
        return qn.field_t[var4];
    }

    final static void a(int param0) {
        if (sq.field_c) {
          mg.field_O = true;
          pm.a((byte) 52, true);
          int var1 = 39 % ((param0 - 88) / 32);
          hn.field_w = 0;
          return;
        }
        throw new IllegalStateException();
    }

    final static boolean a(mi param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -31980) {
            field_g = (sq) null;
          }
          stackIn_5_0 = (param0.c((byte) -109, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("id.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final ae a(boolean param0, int[] param1, int param2) {
        ae discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b.c(-1) == 1) {
            stackIn_3_0 = this.a(param1, 120, param2, 0);
            return stackIn_3_0;
          }
          if (1 == this.field_b.b(param2, (byte) -73)) {
            stackIn_7_0 = this.a(param1, 124, 0, param2);
            return stackIn_7_0;
          }
          if (param0) {
            var5 = (int[]) null;
            discarded$1 = this.a((int[]) null, 126, -12, -30);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("id.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(int param0, short param1, short param2, lg param3, boolean param4, short param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        byte stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param3.field_p[param1] + param3.field_p[param5] >> 1;
          var7 = param3.field_D[param1] + param3.field_D[param5] >> 1;
          var8 = param3.field_i[param1] + param3.field_i[param5] >> 1;
          param2 = (short)param3.a(var6_int + (param3.field_p[param2] - var6_int) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param2] - var7) / (64 - param0), var8 + 64 * (-var8 + param3.field_i[param2]) / (64 - param0));
          param1 = (short)param3.a(var6_int + (-var6_int + param3.field_p[param1]) * 64 / (-param0 + 64), var7 + 64 * (param3.field_D[param1] - var7) / (-param0 + 64), var8 + (-var8 + param3.field_i[param1]) * 64 / (-param0 + 64));
          if (param4) {
            stackIn_2_0 = -5;
            return stackIn_2_0;
          }
          param5 = (short)param3.a(var6_int + 64 * (param3.field_p[param5] - var6_int) / (-param0 + 64), var7 + (-var7 + param3.field_D[param5]) * 64 / (-param0 + 64), var8 + 64 * (-var8 + param3.field_i[param5]) / (64 - param0));
          stackIn_4_0 = param3.a(param2, param1, param5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("id.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 76) {
          field_g = (sq) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final ae a(int[] param0, int param1, int param2) {
        ae discarded$1 = null;
        RuntimeException var4 = null;
        int[] var5 = null;
        ae stackIn_3_0 = null;
        ae stackIn_6_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.c(-1) == 1) {
            stackIn_3_0 = this.b(param0, 0, -127, param2);
            return stackIn_3_0;
          }
          if (this.field_h.b(param2, (byte) -94) == 1) {
            stackIn_6_0 = this.b(param0, param2, -128, 0);
            return stackIn_6_0;
          }
          if (param1 != 64) {
            var5 = (int[]) null;
            discarded$1 = this.a((int[]) null, -38, -61, 48);
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("id.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final ae a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        hp var9 = null;
        ae var10 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae var8Lifetime1;
        try {
          var5_int = (param3 >>> 12 | (param3 & 1342181375) << 4) ^ param2;
          var5_int = var5_int | param3 << 16;
          if (param1 <= 119) {
            this.field_e = (jl) null;
          }
          var6 = (long)var5_int;
          var8 = (ae) (this.field_c.a(var6, (byte) 64));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_9_0 = null;
            return (ae) (stackIn_9_0);
          }
          var9 = hp.a(this.field_b, param3, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.a();
          var8Lifetime1 = var10;
          this.field_c.a(var8Lifetime1, var6, false);
          if (param0 != null) {
            param0[0] = param0[0] - var10.field_s.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("id.J(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static qi a(int param0, int param1, byte param2, int param3, jj param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        qi var7 = null;
        java.awt.Frame var8 = null;
        qi stackIn_2_0 = null;
        qi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 94) {
            stackIn_2_0 = (qi) null;
            return stackIn_2_0;
          }
          var8 = oc.a(param5, param1, param0, param4, param3, 54);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new qi();
          var7.field_c = var8;
          var7.field_c.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param3, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("id.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    private final ae b(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        ae var8 = null;
        vh var9 = null;
        ae stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ae stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae var8Lifetime1;
        try {
          var5_int = (param1 >>> 12 | (-1879044097 & param1) << 4) ^ param3;
          var5_int = var5_int | param1 << 16;
          if (param2 > -125) {
            field_a = 53L;
          }
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (ae) (this.field_c.a(var6, (byte) 64));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            stackIn_9_0 = null;
            return (ae) (stackIn_9_0);
          }
          var9 = (vh) (this.field_e.a(var6, (byte) 64));
          if (var9 == null) {
            var9 = vh.a(this.field_h, param1, param3);
            if (var9 == null) {
              return null;
            }
            this.field_e.a(var9, var6, false);
          }
          var8Lifetime1 = var9.a(param0);
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.c(2);
          this.field_c.a(var8Lifetime1, var6, false);
          stackIn_20_0 = var8Lifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("id.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    id(r param0, r param1) {
        this.field_e = new jl(256);
        this.field_c = new jl(256);
        try {
          this.field_b = param0;
          this.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "id.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new sq();
    }
}
