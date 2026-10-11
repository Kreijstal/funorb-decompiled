/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    static String field_h;
    private int field_b;
    static int[] field_e;
    private int[] field_f;
    private boolean field_a;
    static int field_d;
    private int field_g;
    static String field_c;

    private final int c(int param0, int param1) {
        int var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param1 != -13676) {
          this.b(-126, 111);
        }
        var3 = this.field_f.length;
        while (var3 <= param0) {
          if (!this.field_a) {
            var3 = var3 + this.field_g;
            continue;
          }
          if (0 != var3) {
            var3 = var3 * this.field_g;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          return;
        }
        if (this.field_b < param0) {
          this.field_b = param0;
        }
        if (this.field_f.length <= param0) {
          this.d(-93, param0);
        }
        this.field_f[param0] = param2;
    }

    private final void d(int param0, int param1) {
        int[] var5 = new int[this.c(param1, -13676)];
        int[] var3 = var5;
        int var4 = -83 / ((param0 - 57) / 59);
        cj.a(this.field_f, 0, var5, 0, this.field_f.length);
        this.field_f = var5;
    }

    final static um a(int param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ha var4 = null;
        ha stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -123 % ((-9 - param1) / 37);
          var4 = new ha();
          ((um) ((Object) var4)).field_f = param0;
          ((um) ((Object) var4)).field_a = param2;
          stackIn_1_0 = var4;
          return (um) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bp.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(int param0, cn param1, int param2, byte param3) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        try {
          param2 = param2 + param1.field_w;
          param0 = param0 + param1.field_A;
          if (param3 != 99) {
            return;
          }
          var4_int = param2 + param0 * gf.field_i;
          var5 = 0;
          var6 = param1.field_v;
          var7 = param1.field_y;
          var8 = gf.field_i - var7;
          if (gf.field_f > param0) {
            var10 = -param0 + gf.field_f;
            var5 = var5 + var7 * var10;
            param0 = gf.field_f;
            var6 = var6 - var10;
            var4_int = var4_int + var10 * gf.field_i;
          }
          var9 = 0;
          if (var6 + param0 > gf.field_e) {
            var6 = var6 - (-gf.field_e + param0 + var6);
          }
          if (gf.field_j > param2) {
            var10Lifetime1 = gf.field_j - param2;
            var7 = var7 - var10Lifetime1;
            param2 = gf.field_j;
            var9 = var9 + var10Lifetime1;
            var8 = var8 + var10Lifetime1;
            var5 = var5 + var10Lifetime1;
            var4_int = var4_int + var10Lifetime1;
          }
          if (gf.field_h < param2 + var7) {
            var10Lifetime2 = param2 + (var7 - gf.field_h);
            var8 = var8 + var10Lifetime2;
            var7 = var7 - var10Lifetime2;
            var9 = var9 + var10Lifetime2;
          }
          if (var7 > 0 &&
            var6 > 0) {
            id.a(var4_int, 0, (byte) 104, var6, var9, param1.field_B, var5, var7, gf.field_b, var8);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("bp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (0 > param0 ||
          this.field_b < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.field_b) {
          cj.a(this.field_f, param0 + 1, this.field_f, param0, -param0 + this.field_b);
        }
        int var3 = 125 / ((param1 - 16) / 53);
        this.field_b = this.field_b - 1;
    }

    final static void a(cn param0, byte param1, String param2) {
        try {
          lg.field_m = param2;
          rf.field_Q = param0;
          if (param1 != 51) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "bp.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -814) {
          return 73;
        }
        if (param1 > this.field_b) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_f[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        if (param0 != -1) {
          cn var2 = (cn) null;
          bp.a(-29, (cn) null, 36, (byte) -4);
        }
    }

    final int a(byte param0) {
        if (param0 > -36) {
          return 3;
        }
        return 1 + this.field_b;
    }

    final void e(int param0, int param1) {
        if (param1 > -66) {
          String var4 = (String) null;
          bp.a((cn) null, (byte) 50, (String) null);
        }
        this.a(1 + this.field_b, 0, param0);
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = DungeonAssault.field_K;
        try {
          var1 = in.field_C;
          synchronized (var1) {
            hl.field_g = hl.field_g + 1;
            je.field_i = pj.field_x;
            if (0 > ia.field_M) {
              for (var2 = 0; var2 < 112; var2++) {
                qk.field_e[var2] = false;
              }
              ia.field_M = dl.field_b;
            } else {
              while (dl.field_b != ia.field_M) {
                var2 = ih.field_r[dl.field_b];
                dl.field_b = 127 & dl.field_b + 1;
                if (0 <= var2) {
                  qk.field_e[var2] = true;
                  continue;
                }
                qk.field_e[~var2] = false;
              }
            }
            if (param0 <= 28) {
              return;
            }
            pj.field_x = ka.field_c;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1_ref), "bp.B(" + param0 + ')');
        }
    }

    private bp() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "Treasure: <col=DB0100><%0></col>";
        field_c = "Your raider was trapped and incapacitated.";
        field_e = wa.b(-1);
    }
}
