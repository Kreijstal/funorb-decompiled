/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    boolean field_a;
    private int[][] field_i;
    private int[] field_f;
    static int field_h;
    int[] field_c;
    int[] field_e;
    static String field_d;
    static String field_g;
    int field_j;
    int field_b;

    final int a(byte param0, boolean param1) {
        int var6 = 0;
        int var7 = 0;
        int var3;
        int var4;
        int var5;
        int var8;
        int stackIn_3_0 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = 0;
        var4 = 0;
        if (param1) {
          stackIn_3_0 = 1;
        } else {
          stackIn_3_0 = this.field_j;
        }
        var5 = stackIn_3_0;
        if (param0 > -114) {
          go.b(-19);
        }
        for (var6 = 0; var6 < var5; var6++) {
          for (var7 = var4; var7 < this.field_e.length; var7++) {
            var3 = var3 + this.field_e[var7];
          }
          if (this.field_b > 0) {
            var4 = this.field_b;
          }
        }
        return var3;
    }

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 < 13) {
            return;
          }
          var5 = oq.field_F;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
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
          throw wn.a((Throwable) ((Object) var1_ref), "go.C(" + param0 + ')');
        }
    }

    private final void a(int param0, ed param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ed var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.h(-11);
            if (0 != var3_int) {
              this.a(var3_int, param1, (byte) -121);
              continue;
            }
            break;
          }
          if (param0 < 108) {
            var5 = (ed) null;
            this.a(-60, (ed) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("go.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private go(r param0, int param1, String param2) {
        this(param0, param1, param0.a(param1, param2, 111));
    }

    go(r param0, String param1, String param2) {
        this(param0, param0.a((byte) 122, param1), param2);
    }

    private final void a(int param0, ed param1, byte param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = 124 / ((param2 - 4) / 62);
          if (param0 == 1) {
            var5 = param1.a((byte) -11);
            this.field_e = new int[var5];
            for (var6 = 0; var6 < var5; var6++) {
              this.field_e[var6] = param1.a((byte) -11);
            }
            this.field_c = new int[var5];
            for (var6 = 0; var5 > var6; var6++) {
              this.field_c[var6] = param1.a((byte) -11);
            }
            for (var6 = 0; var6 < var5; var6++) {
              this.field_c[var6] = (param1.a((byte) -11) << 16) + this.field_c[var6];
            }
          } else {
            if (param0 == 2) {
              this.field_b = param1.a((byte) -11);
              return;
            }
            if (param0 == 3) {
              var5 = param1.h(-11);
              this.field_f = new int[1 + var5];
              for (var6 = 0; var6 < var5; var6++) {
                this.field_f[var6] = param1.h(-11);
              }
              this.field_f[var5] = 9999999;
              return;
            }
            if (param0 == 5) {
              param1.h(-11);
              return;
            }
            if (param0 == 6) {
              param1.a((byte) -11);
              return;
            }
            if (param0 == 7) {
              param1.a((byte) -11);
              return;
            }
            if (8 == param0) {
              this.field_j = param1.h(-11);
              this.field_a = false;
              return;
            }
            if (param0 == 9) {
              param1.h(-11);
              return;
            }
            if (param0 == 10) {
              param1.h(-11);
              return;
            }
            if (11 == param0) {
              param1.h(-11);
              return;
            }
            if (12 == param0) {
              var5 = param1.h(-11);
              for (var6 = 0; var6 < var5; var6++) {
                param1.a((byte) -11);
              }
              for (var6 = 0; var6 < var5; var6++) {
                param1.a((byte) -11);
              }
            } else if (param0 == 13) {
              var5 = param1.a((byte) -11);
              this.field_i = new int[var5][];
              for (var6 = 0; var6 < var5; var6++) {
                var7 = param1.h(-11);
                if (0 < var7) {
                  array$0 = new int[var7];
                  this.field_i[var6] = array$0;
                  this.field_i[var6][0] = param1.m(0);
                  for (var8 = 1; var8 < var7; var8++) {
                    this.field_i[var6][var8] = param1.a((byte) -11);
                  }
                }
              }
            } else {
              if (14 != param0 &&
                param0 != 15 &&
                param0 != 16 &&
                param0 != 18) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_56_0 = var4;
          stackIn_56_1 = new StringBuilder().append("go.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = 40 % ((param0 + 63) / 61);
        field_g = null;
    }

    private go(r param0, int param1, int param2) {
        int var7 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var6Lifetime1;
        this.field_j = 0;
        this.field_b = -1;
        try {
          this.field_a = true;
          var11 = param0.a(param1, param2, (byte) -79);
          var10 = var11;
          var9 = var10;
          var4 = var9;
          if (var9 != null) {
            this.a(121, new ed(var11));
          }
          var5 = 0;
          for (var6 = 0; var6 < this.field_c.length; var6++) {
            if (var5 < this.field_c[var6]) {
              var5 = this.field_c[var6];
            }
          }
          var6Lifetime1 = 0;
          for (var7 = 0; var7 < this.field_e.length; var7++) {
            if (this.field_e[var7] > var6Lifetime1) {
              var6Lifetime1 = this.field_e[var7];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("go.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_d = "Oh dear, you failed Co-op mode. Better luck next time.";
        field_h = 2;
    }
}
