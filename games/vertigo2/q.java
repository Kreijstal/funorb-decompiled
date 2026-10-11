/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends gp {
    static int field_y;
    int[] field_w;
    static int field_u;
    private int[][] field_A;
    static int field_x;
    private int[] field_C;
    static int field_v;
    static er[] field_z;
    private String[] field_t;

    public static void i(int param0) {
        field_z = null;
        if (param0 != 0) {
          field_z = (er[]) null;
        }
    }

    final String h(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 33) {
          field_v = -73;
        }
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

    final void a(ed param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        ed var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 >= -20) {
            var5 = (ed) null;
            this.a((ed) null, 11);
          }
          while (true) {
            var3_int = param0.h(-11);
            if (var3_int == 0) {
              return;
            }
            this.a(param0, 19291, var3_int);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("q.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (this.field_w != null) {
          for (var2 = 0; this.field_w.length > var2; var2++) {
            this.field_w[var2] = om.a(this.field_w[var2], 32768);
          }
        }
        if (param0 != 93) {
          this.a((byte) 117);
        }
    }

    private final void a(ed param0, int param1, int param2) {
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
        ve var7 = null;
        int var9 = 0;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param2 != 1) {
            if (2 == param2) {
              var4_int = param0.h(param1 - 19302);
              this.field_w = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_w[var5] = param0.a((byte) -11);
              }
            } else {
              if (3 == param2) {
                var4_int = param0.h(-11);
                this.field_C = new int[var4_int];
                this.field_A = new int[var4_int][];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param0.a((byte) -11);
                  var7 = li.a(var6, -72);
                  if (var7 != null) {
                    this.field_C[var5] = var6;
                    array$0 = new int[var7.field_c];
                    this.field_A[var5] = array$0;
                    for (var8 = 0; var8 < var7.field_c; var8++) {
                      this.field_A[var5][var8] = param0.a((byte) -11);
                    }
                  }
                }
              } else {
                if (4 == param2) {
                }
              }
            }
          } else {
            this.field_t = jr.a((byte) -9, '<', param0.f(128));
          }
          if (param1 != 19291) {
            this.a((byte) 72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("q.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    q() {
    }

    static {
        field_u = 33;
        field_v = 0;
    }
}
