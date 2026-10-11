/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends l {
    int[] field_q;
    boolean field_w;
    char[] field_s;
    String field_x;
    static bn field_v;
    char[] field_r;
    int[] field_t;
    static boolean field_u;

    final void f(int param0) {
        int var5 = 0;
        int var2 = 0;
        int var3 = Chess.field_G;
        int var2Lifetime1;
        if (this.field_t != null) {
          for (var2 = 0; var2 < this.field_t.length; var2++) {
            this.field_t[var2] = s.a(this.field_t[var2], 32768);
          }
        }
        if (param0 != 0) {
          p var4 = (p) null;
          this.a((p) null, -30);
        }
        if (null != this.field_q) {
          var5 = 0;
          var2Lifetime1 = var5;
          while (var5 < this.field_q.length) {
            this.field_q[var5] = s.a(this.field_q[var5], 32768);
            var5++;
          }
        }
    }

    public static void d(byte param0) {
        int var1 = -87 % ((-44 - param0) / 39);
        field_v = null;
    }

    private final void a(int param0, p param1, boolean param2) {
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char stackIn_12_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char stackIn_20_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          if (!param2) {
            j.d((byte) 104);
          }
          if (param0 != 1) {
            if (param0 == 2) {
              var4_int = param1.i(-116);
              this.field_q = new int[var4_int];
              this.field_r = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_q[var5] = param1.f(674914976);
                var6 = param1.g(0);
                stackIn_19_0 = this.field_r;
                stackIn_19_1 = var5;
                if (0 == var6) {
                  stackIn_20_2 = (char)0;
                } else {
                  stackIn_20_2 = vm.a(123, (byte) var6);
                }
                stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              }
            } else if (param0 == 3) {
              var4_int = param1.i(-120);
              this.field_s = new char[var4_int];
              this.field_t = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_t[var5] = param1.f(674914976);
                var6 = param1.g(0);
                stackIn_11_0 = this.field_s;
                stackIn_11_1 = var5;
                if (var6 == 0) {
                  stackIn_12_2 = (char)0;
                } else {
                  stackIn_12_2 = vm.a(117, (byte) var6);
                }
                stackIn_11_0[stackIn_11_1] = stackIn_12_2;
              }
            } else {
              if (param0 == 4) {
                this.field_w = true;
                return;
              }
            }
          } else {
            this.field_x = param1.d(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("j.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(p param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Chess.field_G;
        try {
          if (param1 != 0) {
            j.d((byte) 71);
          }
          while (true) {
            var3_int = param0.i(-96);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, param0, true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("j.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    j() {
        this.field_w = false;
    }

    static {
    }
}
