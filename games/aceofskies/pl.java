/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private long field_a;
    private int field_b;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var5 = gi.field_i;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "pl.C(" + param0 + ')');
        }
    }

    final rl b(int param0, int param1) {
        int var3 = -83 % ((param1 + 62) / 63);
        return rl.a(this.a(param0, -5825), (byte) -101);
    }

    private final int a(int param0, int param1) {
        if (param1 == -5825) {
          return 15 & (int)(this.field_a >> rl.field_e * param0);
        }
        this.b(-43, -86);
        return 15 & (int)(this.field_a >> rl.field_e * param0);
    }

    private final void a(rl param0, int param1) {
        int fieldTemp$0 = 0;
        int discarded$1 = 0;
        try {
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          this.field_a = this.field_a | (long)(param0.field_f << rl.field_e * fieldTemp$0);
          if (param1 != 15258) {
            discarded$1 = this.a(45, 78);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0, int param1) {
        int var3 = 0;
        ga var4 = null;
        uc var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4 = (ga) (tq.field_d.first(268435455));
          while (var4 != null) {
            ac.a(0, param0, var4);
            var4 = (ga) (tq.field_d.next((byte) 103));
          }
          if (param1 != 0) {
            return;
          }
          var5 = (uc) (nh.field_g.first(268435455));
          while (var5 != null) {
            ag.a(param0, 5, var5);
            var5 = (uc) (nh.field_g.next((byte) 103));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pl.F(" + param0 + ',' + param1 + ')');
        }
    }

    pl(rl param0) {
        try {
          this.field_b = 1;
          this.field_a = (long)param0.field_f;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, boolean param15) {
        int var17;
        var17 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (param1 >= param8) {
          if (param4 > param1) {
            Aircraft.a(param4, param9, param6, param10, param3, vp.field_j, param0, param11, param2, param12, param14, param5, param13, param7, param1, param8, (byte) -120);
          } else {
            if (param8 >= param4) {
              Aircraft.a(param1, param0, param12, param13, param14, vp.field_j, param11, param9, param3, param5, param2, param6, param7, param10, param8, param4, (byte) -46);
            } else {
              Aircraft.a(param1, param0, param6, param7, param3, vp.field_j, param9, param11, param14, param5, param2, param12, param13, param10, param4, param8, (byte) -24);
            }
          }
        } else {
          if (param4 > param8) {
            Aircraft.a(param4, param9, param5, param13, param2, vp.field_j, param11, param0, param3, param12, param14, param6, param10, param7, param8, param1, (byte) -70);
          } else {
            if (param1 < param4) {
              Aircraft.a(param8, param11, param5, param7, param2, vp.field_j, param9, param0, param14, param6, param3, param12, param10, param13, param4, param1, (byte) -65);
            } else {
              Aircraft.a(param8, param11, param12, param10, param14, vp.field_j, param0, param9, param2, param6, param3, param5, param7, param13, param1, param4, (byte) -102);
            }
          }
        }
        if (!param15) {
          return;
        }
        pl.c(70, -13);
    }

    pl(rl[] param0) {
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.a(param0[var2_int], 15258);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("pl.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != 90) {
          this.field_a = 34L;
          return this.field_b;
        }
        return this.field_b;
    }

    final static String b(int param0) {
        int var1 = 123 % ((param0 + 43) / 56);
        return IntKeyLookup.field_c.h(-17883);
    }

    static {
    }
}
