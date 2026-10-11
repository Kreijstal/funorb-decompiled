/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends wb {
    static int field_s;
    static String field_u;
    char[] field_p;
    String field_v;
    static ml field_t;
    boolean field_o;
    char[] field_r;
    int[] field_w;
    static int[] field_q;
    int[] field_x;

    final void d(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        int var2Lifetime1;
        if (null != this.field_w) {
          for (var2 = 0; this.field_w.length > var2; var2++) {
            this.field_w[var2] = oh.a(this.field_w[var2], 32768);
          }
        }
        if (this.field_x != null) {
          var4 = 0;
          var2Lifetime1 = var4;
          while (this.field_x.length > var4) {
            this.field_x[var4] = oh.a(this.field_x[var4], 32768);
            var4++;
          }
        }
        if (param0 != 3818) {
          u.b((byte) 57);
        }
    }

    public static void b(byte param0) {
        field_q = null;
        field_u = null;
        if (param0 != -11) {
          u.b((byte) -54);
        }
        field_t = null;
    }

    private final void a(int param0, jc param1, int param2) {
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        char stackIn_11_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -4) {
            return;
          }
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param1.g(11132);
              this.field_x = new int[var4_int];
              this.field_p = new char[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_x[var5] = param1.c((byte) 125);
                var6 = param1.a((byte) 77);
                stackIn_10_0 = this.field_p;
                stackIn_10_1 = var5;
                if (var6 == 0) {
                  stackIn_11_2 = (char)0;
                } else {
                  stackIn_11_2 = mm.a(100, (byte) var6);
                }
                stackIn_10_0[stackIn_10_1] = stackIn_11_2;
              }
            } else if (param2 == 3) {
              var4_int = param1.g(11132);
              this.field_w = new int[var4_int];
              this.field_r = new char[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_w[var5] = param1.c((byte) -88);
                var6 = param1.a((byte) 47);
                stackIn_17_0 = this.field_r;
                stackIn_17_1 = var5;
                if (0 != var6) {
                  stackIn_18_2 = mm.a(param0 + 97, (byte) var6);
                } else {
                  stackIn_18_2 = 0;
                }
                stackIn_17_0[stackIn_17_1] = (char) stackIn_18_2;
              }
            } else {
              if (param2 == 4) {
                this.field_o = true;
                return;
              }
            }
          } else {
            this.field_v = param1.h(param0 - 121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("u.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, jc param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 11693) {
            return;
          }
          while (true) {
            var3_int = param1.g(param0 - 561);
            if (var3_int == 0) {
              return;
            }
            this.a(-4, param1, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("u.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    u() {
        this.field_o = false;
    }

    static {
        field_q = new int[8192];
        field_u = "You are offering an unrated rematch.";
    }
}
