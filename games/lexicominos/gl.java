/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    static sh field_a;
    static int[] field_e;
    private int field_g;
    private int field_f;
    static String field_b;
    private int[] field_d;
    private boolean field_c;

    final static nc a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        nc var9 = null;
        RuntimeException var9_ref = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new nc(param1, param0, param4, param2, param6, param8, param7);
          ok.field_b.b(114, var9);
          ga.a(var9, param3, 104);
          if (param5 != 56) {
            field_b = (String) null;
          }
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param8).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 == this.field_f) {
          var3 = 36 % ((53 - param1) / 55);
          this.field_f = this.field_f - 1;
          return;
        }
        o.a(this.field_d, 1 + param0, this.field_d, param0, -param0 + this.field_f);
        var3Lifetime1 = 36 % ((53 - param1) / 55);
        this.field_f = this.field_f - 1;
    }

    final static void a(le param0, int param1, int param2, int param3, int param4, int param5, wh param6, int param7, le param8, wh param9, int param10, int param11, int param12, int param13, int param14, int param15, wh param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          ng.a(param5, param8, (byte) 115, param0);
          if (param12 != 0) {
            field_b = (String) null;
          }
          vc.a(-5094, param20, param10, param15, param2);
          Lexicominos.a(param7, param12 ^ 102, param18);
          tg.a(param6, param11, param16, param13, -109, param4);
          ph.a(param14, (byte) 126, param1, param9);
          sc.a(param12 - 72, param3, param17, param19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("gl.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param9 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != -110) {
          this.a(34, (byte) 74);
          return this.field_f + 1;
        }
        return this.field_f + 1;
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_f < param1) {
          this.field_f = param1;
        }
        if (this.field_d.length <= param1) {
          this.a(param1, false);
        }
        this.field_d[param1] = param2;
        if (param0 < -25) {
          return;
        }
        this.a(-31, -120, -39);
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == 12359) {
          var3 = this.field_d.length;
          while (param0 >= var3) {
            if (!this.field_c) {
              var3 = var3 + this.field_g;
              continue;
            }
            if (var3 == 0) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_g;
          }
          return var3;
        }
        this.a(90, true);
        var3Lifetime1 = this.field_d.length;
        while (param0 >= var3Lifetime1) {
          if (!this.field_c) {
            var3Lifetime1 = var3Lifetime1 + this.field_g;
            continue;
          }
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_g;
        }
        return var3Lifetime1;
    }

    final void c(int param0, int param1) {
        this.a(-53, this.field_f + param1, param0);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -90) {
          return;
        }
        field_a = null;
        field_e = null;
    }

    final int a(int param0, int param1) {
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 <= -105) {
          return this.field_d[param0];
        }
        this.field_c = true;
        return this.field_d[param0];
    }

    private final void a(int param0, boolean param1) {
        int[] var4 = new int[this.b(param0, 12359)];
        int[] var3 = var4;
        o.a(this.field_d, 0, var4, 0, this.field_d.length);
        this.field_d = var4;
        if (!param1) {
          return;
        }
        this.c(-2, 38);
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
    }
}
