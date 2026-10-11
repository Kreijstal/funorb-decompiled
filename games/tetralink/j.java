/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends gb {
    static int[] field_x;
    static int field_u;
    private int[] field_y;
    private int[][] field_z;
    static String field_t;
    int[] field_v;
    private String[] field_w;

    public static void f(int param0) {
        if (param0 != 4) {
          field_u = 52;
        }
        field_x = null;
        field_t = null;
    }

    private final void a(int param0, int param1, bh param2) {
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
        db var7 = null;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          if (param1 >= -38) {
            return;
          }
          if (1 != param0) {
            if (param0 == 2) {
              var4_int = param2.d((byte) -99);
              this.field_v = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_v[var5] = param2.e(127);
              }
            } else if (param0 == 3) {
              var4_int = param2.d((byte) -99);
              this.field_y = new int[var4_int];
              this.field_z = new int[var4_int][];
              for (var5 = 0; var5 < var4_int; var5++) {
                var6 = param2.e(127);
                var7 = bj.a(0, var6);
                if (var7 != null) {
                  this.field_y[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_z[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_c; var8++) {
                    this.field_z[var5][var8] = param2.e(127);
                  }
                }
              }
            } else {
              if (4 != param0) {
                return;
              }
            }
          } else {
            this.field_w = hi.a(param2.g((byte) 81), '<', 783);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void a(bh param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          if (param1 != 15067) {
            return;
          }
          while (true) {
            var3_int = param0.d((byte) -99);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, -85, param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("j.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final String h(int param0) {
        int var3 = 0;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        int var4 = TetraLink.field_J;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_w == null) {
          return "";
        }
        StringBuilder discarded$14 = var5.append(this.field_w[0]);
        if (param0 > -10) {
          return (String) null;
        }
        for (var3 = 1; this.field_w.length > var3; var3++) {
          discarded$15 = var2.append("...");
          discarded$16 = var5.append(this.field_w[var3]);
        }
        return var2.toString();
    }

    j() {
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        if (param0 != 25271) {
          bh var4 = (bh) null;
          this.a(0, 67, (bh) null);
        }
        if (null != this.field_v) {
          for (var2 = 0; this.field_v.length > var2; var2++) {
            this.field_v[var2] = mc.a(this.field_v[var2], 32768);
          }
        }
    }

    static {
        field_t = "Offline";
    }
}
