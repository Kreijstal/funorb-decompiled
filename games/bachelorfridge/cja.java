/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja extends bca {
    int field_u;
    int field_s;
    static int field_v;
    static String field_r;
    int field_q;
    static String field_t;

    final void a(op param0, int param1) {
        try {
          int var3_int = -69 % ((param1 - 12) / 35);
          this.a(param0, (byte) -2);
          param0.b((byte) -64, this.field_q, this.field_s, this.field_u);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cja.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cja(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
          this.field_k = param0.e((byte) 105);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (0 > var2_int) {
              break;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
          this.field_s = param0.b(16711935);
          this.field_u = param0.b(16711935);
          this.field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_t = null;
        if (param0 != -23353) {
          field_v = 32;
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        lu var4 = null;
        mm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (lu) null;
            cja.a((uha) null, (lu) null, 81, true);
          }
          stackIn_3_0 = new mm(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cja.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    cja(int param0, nq param1) {
        super(param0, param1);
    }

    final static void a(int param0, kv param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        try {
          param4 = param4 + param1.field_u;
          param3 = param3 + param1.field_t;
          var5_int = param3 + param4 * dg.field_i;
          var6 = 0;
          var7 = param1.field_p;
          var8 = param1.field_q;
          var9 = -var8 + dg.field_i;
          if (dg.field_j > param4) {
            var11 = -param4 + dg.field_j;
            var7 = var7 - var11;
            var6 = var6 + var8 * var11;
            param4 = dg.field_j;
            var5_int = var5_int + dg.field_i * var11;
          }
          var10 = 0;
          if (param3 < dg.field_f) {
            var11Lifetime1 = -param3 + dg.field_f;
            var6 = var6 + var11Lifetime1;
            var9 = var9 + var11Lifetime1;
            var8 = var8 - var11Lifetime1;
            var10 = var10 + var11Lifetime1;
            param3 = dg.field_f;
            var5_int = var5_int + var11Lifetime1;
          }
          if (dg.field_k < var7 + param4) {
            var7 = var7 - (-dg.field_k + (param4 + var7));
          }
          if (dg.field_h < var8 + param3) {
            var11Lifetime2 = -dg.field_h + (var8 + param3);
            var9 = var9 + var11Lifetime2;
            var8 = var8 - var11Lifetime2;
            var10 = var10 + var11Lifetime2;
          }
          if (var8 > 0 &&
            0 < var7) {
            if (param2 > -103) {
              return;
            }
            el.a(var8, var6, var9, var5_int, 125, param0, dg.field_e, param1.field_v, var10, var7);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("cja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(uha param0, lu param1, int param2, boolean param3) {
        int var8 = 0;
        uha stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        uha stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        uha stackIn_12_0 = null;
        int stackIn_13_1 = 0;
        uha stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        uha stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        uha stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          if (param3) {
            param0.field_Rb = param1.b(16711935);
          }
          param0.field_Pb = param1.b(16711935);
          param0.field_Kb = param1.b(16711935);
          var4_int = param1.b(16711935);
          stackIn_6_0 = (uha) (param0);
          stackIn_7_1 = (0 != (128 & var4_int));
          stackIn_6_0.field_Bb = stackIn_7_1;
          stackIn_9_0 = (uha) (param0);
          stackIn_10_1 = ((32 & var4_int) != 0);
          stackIn_9_0.field_dc = stackIn_10_1;
          stackIn_12_0 = (uha) (param0);
          if ((16 & var4_int) != 0) {
            stackIn_13_1 = 2;
          } else {
            stackIn_13_1 = 1;
          }
          stackIn_12_0.field_Lb = stackIn_13_1;
          stackIn_15_0 = (uha) (param0);
          stackIn_16_1 = (0 != (var4_int & 64));
          stackIn_15_0.field_Zb = stackIn_16_1;
          if (param2 < 47) {
            return;
          }
          stackIn_21_0 = (uha) (param0);
          stackIn_22_1 = (param0.field_Bb) && (param0.field_Pb > param0.field_Rb);
          stackIn_21_0.field_zb = stackIn_22_1;
          stackIn_24_0 = (uha) (param0);
          stackIn_25_1 = ((var4_int & 8) != 0);
          stackIn_24_0.field_Fb = stackIn_25_1;
          stackIn_28_0 = (0 == (var4_int & 4)) ? 0 : 1;
          var5 = stackIn_28_0;
          stackIn_31_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var6 = stackIn_31_0;
          param1.a(param0.field_Eb, param0.field_Eb.length, 128, 0);
          param0.field_bc = param1.e((byte) 64);
          param0.field_Ob = f.b((byte) 73) - (long)param1.f(-124);
          if (var5 == 0) {
            param0.field_Nb = -1;
          } else {
            param0.field_Nb = param1.f(51);
          }
          param0.field_Sb = param1.c(-120);
          var7 = param1.field_g;
          param0.field_Jb = param1.g(-87);
          if (var6 == 0) {
            param0.field_Cb = null;
            return;
          }
          param0.field_Cb = new String[param0.field_Rb];
          param1.field_g = var7;
          for (var8 = 0; param0.field_Rb > var8; var8++) {
            param0.field_Cb[var8] = param1.g(-88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("cja.B(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, lu param1) {
        super.a((byte) -47, param1);
        param1.d(this.field_s, 0);
        param1.d(this.field_u, 0);
        if (param0 > -12) {
          return;
        }
        try {
          param1.d(this.field_q, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "cja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Lobby";
        field_v = 22;
        field_t = "Fruit & Veg";
    }
}
