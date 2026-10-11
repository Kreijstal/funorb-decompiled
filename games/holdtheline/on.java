/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends ln {
    int[] field_o;
    static hj field_t;
    static boolean field_s;
    static int[][] field_v;
    private int[][] field_q;
    private String[] field_u;
    static String field_p;
    static int field_r;
    private int[] field_w;

    final void g(int param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 > -54) {
          this.g(85);
        }
        if (this.field_o != null) {
          for (var2 = 0; var2 < this.field_o.length; var2++) {
            this.field_o[var2] = kc.a(this.field_o[var2], 32768);
          }
        }
    }

    final void a(int param0, th param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 < 90) {
            field_r = -69;
          }
          while (true) {
            var3_int = param1.f((byte) -70);
            if (var3_int == 0) {
              return;
            }
            this.a(109, param1, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("on.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, th param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        e var7 = null;
        int var9 = 0;
        th var10 = null;
        var9 = HoldTheLine.field_D;
        try {
          if (param0 < 93) {
            var10 = (th) null;
            this.a(53, (th) null, -28);
          }
          if (param2 == 1) {
            this.field_u = fl.a(param1.j(-1231), (byte) -29, '<');
          } else {
            if (param2 == 2) {
              var4_int = param1.f((byte) -111);
              this.field_o = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_o[var5] = param1.k(72);
              }
            } else if (param2 == 3) {
              var4_int = param1.f((byte) -95);
              this.field_w = new int[var4_int];
              this.field_q = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param1.k(120);
                var7 = ln.a(var6, (byte) -96);
                if (var7 != null) {
                  this.field_w[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_q[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_c; var8++) {
                    this.field_q[var5][var8] = param1.k(98);
                  }
                }
              }
            } else {
              if (param2 != 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("on.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_t = null;
        if (param0 < 103) {
          field_v = (int[][]) null;
        }
        field_v = (int[][]) null;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = 56 % ((param2 + 43) / 41);
        int var4 = param1 >> 16;
        int var5 = 65535 & param1;
        int var6 = param0 >> 16;
        int var7 = 65535 & param0;
        return (var7 * var5 >> 16) + (param0 * var4 + var6 * var5);
    }

    on() {
    }

    final String f(int param0) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = HoldTheLine.field_D;
        StringBuilder var6 = new StringBuilder(80);
        var6 = var6;
        if (null == this.field_u) {
          return "";
        }
        StringBuilder discarded$0 = var6.append(this.field_u[0]);
        int var3 = 1;
        if (param0 != 245197136) {
          this.field_w = (int[]) null;
        }
        while (this.field_u.length > var3) {
          discarded$1 = var6.append("...");
          discarded$2 = var6.append(this.field_u[var3]);
          var3++;
        }
        return var6.toString();
    }

    static {
        field_p = "<col=2>--</col>";
    }
}
