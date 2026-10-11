/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends w {
    static int field_s;
    int[] field_x;
    static int[] field_C;
    static int[] field_q;
    private int[] field_t;
    private String[] field_z;
    static long field_u;
    static int[] field_p;
    private int[][] field_A;
    static int[][][][][] field_r;
    static int[] field_B;
    static k field_w;
    static ka field_v;
    static String field_y;

    final static int e(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          t.field_b.a(lk.field_g, false, nd.field_g, true);
          t.field_b.j(-91);
          while (kj.e((byte) -39)) {
            t.field_b.a(di.field_m, b.field_J, 104);
          }
          if (-1 != ri.field_i) {
            var1_int = ri.field_i;
            fk.a(true, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (hl.field_e) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (eh.field_p == qc.field_i) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!ji.field_k.b(param0)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (qc.field_i != gj.field_a) {
            stackIn_23_0 = -1;
            return stackIn_23_0;
          }
          stackIn_21_0 = 2;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "lh.F(" + param0 + ')');
        }
    }

    public static void g(int param0) {
        field_r = (int[][][][][]) null;
        field_y = null;
        field_q = null;
        field_C = null;
        field_p = null;
        field_v = null;
        field_w = null;
        if (param0 < 112) {
          return;
        }
        field_B = null;
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (null != this.field_x) {
          for (var2 = 0; this.field_x.length > var2; var2++) {
            this.field_x[var2] = p.a(this.field_x[var2], 32768);
          }
        }
        if (param0 != 0) {
          this.field_z = (String[]) null;
        }
    }

    final String b(boolean param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          lh.g(-86);
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_z) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_z[0]);
        for (var3 = 1; var3 < this.field_z.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_z[var3]);
        }
        return var2.toString();
    }

    lh() {
    }

    private final void a(int param0, uf param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        k stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        k var7 = null;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (1 != param0) {
            if (param0 == 2) {
              var4_int = param1.j(-95);
              this.field_x = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_x[var5] = param1.c(false);
              }
            } else {
              if (param0 == 3) {
                var4_int = param1.j(-87);
                this.field_t = new int[var4_int];
                this.field_A = new int[var4_int][];
                for (var5 = 0; var5 < var4_int; var5++) {
                  var6 = param1.c(false);
                  var7 = oh.a((byte) 123, var6);
                  if (var7 != null) {
                    this.field_t[var5] = var6;
                    array$0 = new int[var7.field_j];
                    this.field_A[var5] = array$0;
                    for (var8 = 0; var7.field_j > var8; var8++) {
                      this.field_A[var5][var8] = param1.c(false);
                    }
                  }
                }
              } else {
                if (param0 == 4) {
                }
              }
            }
          } else {
            this.field_z = dl.a(param1.b(false), '<', -33);
          }
          if (param2 != -817) {
            stackIn_19_0 = (k) null;
            field_w = stackIn_19_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("lh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void f(int param0) {
        if (param0 <= 44) {
          return;
        }
        o var1 = (o) (ve.field_c.c((byte) 116));
        if (var1 == null) {
          ob.b(-103);
          return;
        }
        pa var2 = id.field_b;
        var2.i(67);
        var2.i(54);
        var2.i(65);
        var2.i(56);
        var1.a(true);
    }

    final void a(uf param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 >= -97) {
            return;
          }
          while (true) {
            var3_int = param0.j(-118);
            if (0 == var3_int) {
              return;
            }
            this.a(var3_int, param0, -817);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lh.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_s = -1;
        field_C = new int[]{192, 192, 256};
        field_q = new int[]{192, 192, 256};
        field_B = new int[]{96, 96, 128};
        field_p = new int[]{128, 128, 144};
        field_y = "Please wait...";
        field_r = new int[][][][][]{new int[][][][]{new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[0] / 2, field_C[0] / 2, field_p[0]}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[0] / 2, field_C[0] / 2, field_p[0]}}, new int[][]{new int[]{-field_B[0] / 2, -field_q[0] / 2, field_B[0] / 2, field_q[0] / 2}, new int[]{0, -field_q[0] / 2, field_C[0] / 2, field_q[0] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[0] / 2, field_C[0] / 2, field_p[0]}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_B[0] / 2, -field_q[0] / 2, field_B[0] / 2, 96}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_C[0] / 2, -field_q[0] / 2, field_C[0] / 2, field_q[0] / 2}, new int[]{0, -field_q[0] / 2, field_B[0] / 2, field_q[0] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[0] / 2, field_C[0] / 2, field_p[0] / 2 + field_q[0] / 2}}, new int[][]{new int[]{-field_C[0] / 2, 0, field_C[0] / 2, field_q[0] / 2}, new int[]{0, 0, field_B[0] / 2, field_q[0] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}}, new int[][][][]{new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, -field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_C[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[1] / 2, field_C[1] / 2, field_p[1] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1] / 2}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -field_p[1] / 2, field_C[1] / 2, field_p[1] / 2}}}, new int[][][]{new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, -field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_C[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}, new int[][]{new int[]{-field_B[1] / 2, -field_p[1] / 2, field_B[1] / 2, field_p[1]}, new int[]{0, -field_p[1] / 2, field_B[1] / 2, field_p[1]}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}}, new int[][][][]{new int[][][]{new int[][]{new int[]{-128, -64, 128, 64}, new int[]{0, -128, 64, 128}}, new int[][]{new int[]{-128, 0, 128, 64}, new int[]{0, -128, 64, 128}}, new int[][]{new int[]{-128, -64, 128, 64}, new int[]{0, -96, 64, 96}}, new int[][]{new int[]{-64, -96, 64, 96}, new int[]{0, -64, 128, 64}}, new int[][]{new int[]{-96, -64, 96, 64}, new int[]{0, -64, 128, 64}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{-128, -64, 128, 64}, new int[]{0, -64, 32, 64}}, new int[][]{new int[]{-64, -96, 64, 96}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -96, 64, 96}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, -64, 128, 64}}, new int[][]{new int[]{-128, -64, 128, 64}, new int[]{0, -64, 128, 64}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}}, new int[][][]{new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}}, new int[][]{new int[]{-field_B[2] / 2, -field_p[2] / 2, field_B[2] / 2, field_p[2]}, new int[]{0, -field_p[2] / 2, field_B[2] / 2, field_p[2]}}, new int[][]{new int[]{-field_B[2] / 2, -field_p[2] / 2, field_B[2] / 2, field_p[2]}, new int[]{0, -field_p[2] / 2, field_B[2] / 2, field_p[2]}}, new int[][]{new int[]{-field_B[2] / 2, -field_p[2] / 2, field_B[2] / 2, field_p[2]}, new int[]{0, -field_p[2] / 2, field_B[2] / 2, field_p[2]}}}}};
        field_w = new k(4, 1, 1, 1);
    }
}
