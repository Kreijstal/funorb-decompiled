/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static String field_h;
    static String field_e;
    private int field_a;
    static int[] field_d;
    private int field_f;
    private int[] field_j;
    static String field_g;
    static int[] field_i;
    static String field_b;
    private boolean field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = 1;
          if (param0 <= 102) {
            stackIn_3_0 = 73;
            return stackIn_3_0;
          }
          while (param1 > 1) {
            if ((param1 & 1) != 0) {
              var3_int = var3_int * param2;
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
          }
          if (1 == param1) {
            stackIn_13_0 = param2 * var3_int;
            return stackIn_13_0;
          }
          stackIn_15_0 = var3_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "wd.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param1 >= 0 &&
          param1 <= this.field_a) {
          if (param0 != -84) {
            return;
          }
          if (this.field_a != param1) {
            qb.a(this.field_j, 1 + param1, this.field_j, param1, -param1 + this.field_a);
          }
          this.field_a = this.field_a - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private final void a(int param0, byte param1, int param2) {
        if (this.field_a < param0) {
          this.field_a = param0;
        }
        if (param0 >= this.field_j.length) {
          this.a(-114, param0);
        }
        this.field_j[param0] = param2;
        int var4 = -53 / ((-28 - param1) / 42);
    }

    final int c(int param0, int param1) {
        if (param1 >= -50) {
          field_d = (int[]) null;
        }
        if (this.field_a < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        return this.field_j[param0];
    }

    final static int b(int param0, int param1) {
        if (param1 != 0) {
          return -64;
        }
        return ja.field_h[param0 & 2047];
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int[] param9) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 >= -108) {
            field_i = (int[]) null;
          }
          var11 = -param3;
          while (true) {
            if (var11 >= 0) {
              return;
            }
            var12 = param7 + param5;
            {
              while (!(var12 <= param5)) {
                if (param0[param5] != 16711935) {
                  param6++;
                  param5++;
                  continue;
                }
                incrementValue$0 = param6;
                param6++;
                var10_int = param9[incrementValue$0] & 255;
                incrementValue$1 = param5;
                param5++;
                param0[incrementValue$1] = bq.a(cm.a(var10_int * cm.a(param2, 16711935) >> 8, 16711935), cm.a(16711802, var10_int * cm.a(param2, 65280)) >> 8);
              }
              {
                param5 = param5 + param8;
                param6 = param6 + param4;
                var11++;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_14_0 = var10;
          stackIn_14_1 = new StringBuilder().append("wd.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(ak param0, boolean param1) {
        ak var4 = null;
        ak var5 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        try {
          var4 = (ak) (param0.field_L.c(1504642273));
          ak var2 = var4;
          while (var4 != null) {
            var4.field_Z = 0;
            var4.field_wb = 0;
            var4.field_nb = 0;
            var4.field_S = 0;
            var5 = (ak) (param0.field_L.f(1504642273));
            var5 = var5;
          }
          param0.field_wb = 0;
          if (param1) {
            field_d = (int[]) null;
          }
          param0.field_nb = 0;
          param0.field_S = 0;
          param0.field_Z = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wd.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          wd.a(23);
        }
        field_e = null;
        field_h = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_d = null;
    }

    final void a(boolean param0, int param1) {
        this.a(1 + this.field_a, (byte) 41, param1);
        if (!param0) {
          this.a((byte) -113, 40);
        }
    }

    private final int a(int param0, byte param1) {
        int var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var3 = this.field_j.length;
        while (param0 >= var3) {
          if (!this.field_c) {
            var3 = var3 + this.field_f;
            continue;
          }
          if (var3 == 0) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_f;
        }
        if (param1 > 119) {
          return var3;
        }
        return -50;
    }

    private final void a(int param0, int param1) {
        int[] var5 = new int[this.a(param1, (byte) 120)];
        int[] var3 = var5;
        int var4 = 66 % ((55 - param0) / 63);
        qb.a(this.field_j, 0, var5, 0, this.field_j.length);
        this.field_j = var5;
    }

    final int b(int param0) {
        if (param0 != 1) {
          this.a(false, -127);
        }
        return 1 + this.field_a;
    }

    private wd() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "You cannot add yourself!";
        field_d = new int[256];
        field_i = new int[8192];
        field_g = "Spectate";
        field_e = "Off";
        field_b = "Please wait...";
    }
}
