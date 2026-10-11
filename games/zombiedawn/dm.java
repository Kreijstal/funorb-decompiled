/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends nb {
    static String field_q;
    static String field_s;
    int[] field_u;
    private String[] field_t;
    static int[] field_r;
    private int[] field_v;
    private int[][] field_w;
    static int[] field_p;

    final void a(de param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawn.field_J;
        try {
          if (param1 != 0) {
            this.field_t = (String[]) null;
          }
          while (true) {
            var3_int = param0.d((byte) -120);
            if (0 == var3_int) {
              return;
            }
            this.a(param0, var3_int, -9604);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("dm.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        if (this.field_u != null) {
          for (var2 = 0; this.field_u.length > var2; var2++) {
            this.field_u[var2] = hi.a(this.field_u[var2], 32768);
          }
        }
        if (param0 != -76) {
          field_s = (String) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 80) {
          field_q = (String) null;
        }
        uo.a(true, param0 - 28598, param1);
    }

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ZombieDawn.field_J;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (this.field_t == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_t[0]);
        for (var3 = 1; var3 < this.field_t.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_t[var3]);
        }
        return var2.toString();
    }

    dm() {
    }

    public static void d(int param0) {
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0 != 3) {
          dm.$cfr$intArgs$a$7ffe4b125357(-123, false);
        }
        field_p = null;
    }

    private final void a(de param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        cg var7 = null;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          if (param2 != -9604) {
            this.e(58);
          }
          if (param1 == 1) {
            this.field_t = de.a('<', param0.a(true), -123);
          } else {
            if (param1 == 2) {
              var4_int = param0.d((byte) -122);
              this.field_u = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_u[var5] = param0.f(2);
              }
            } else {
              if (param1 == 3) {
                var4_int = param0.d((byte) -127);
                this.field_v = new int[var4_int];
                this.field_w = new int[var4_int][];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param0.f(param2 ^ -9602);
                  var7 = cj.a(var6, 0);
                  if (var7 != null) {
                    this.field_v[var5] = var6;
                    array$0 = new int[var7.field_a];
                    this.field_w[var5] = array$0;
                    for (var8 = 0; var7.field_a > var8; var8++) {
                      this.field_w[var5][var8] = param0.f(rd.b(param2, -9602));
                    }
                  }
                }
              } else {
                if (param1 != 4) {
                  return;
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("dm.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_s = "SHOCKWAVE";
        field_q = "Previous";
        field_p = new int[256];
        field_r = new int[256];
        for (var0 = 0; field_p.length > var0; var0++) {
          field_p[var0] = hi.a(field_p[var0], var0 << 16);
          field_p[var0] = hi.a(field_p[var0], var0 / 3 << 8);
        }
        int var1 = 0;
        var0Lifetime1 = var1;
        while (field_r.length > var1) {
          field_r[var1] = hi.a(field_r[var1], var1 << 16);
          field_r[var1] = hi.a(field_r[var1], var1 << 8);
          field_r[var1] = hi.a(field_r[var1], var1);
          var1++;
        }
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$7ffe4b125357(int param0, boolean param1) {
        if (param0 != 80) {
          field_q = (String) null;
        }
        uo.a(true, param0 - 28598, param1);
    }
}
