/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends uh {
    static String field_v;
    int[] field_D;
    private int[] field_E;
    private int[][] field_u;
    static vh field_A;
    private String[] field_z;
    static he[] field_y;
    static String field_w;
    static boolean field_B;
    static String field_x;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        ja.field_t[gg.field_b] = param3;
        bj.field_a[gg.field_b] = gg.field_b;
        rc.field_i[gg.field_b] = param2;
        if (!(param2 >= cc.field_B)) {
          ha.field_c = param2;
        }
        if (param2 > pf.field_f) {
          mh.field_b = param2;
        }
        fi.field_h[gg.field_b] = param0;
        kk.field_a[gg.field_b] = param4;
        qj.field_d[gg.field_b] = param5;
        int var6 = param4 + param0 + param5;
        if (param1 > -60) {
          ai.g(-61);
        }
        int var7 = 0 == var6 ? 0 : 1000 * param0 / var6;
        kf.field_c[gg.field_b] = var7;
        if (!(var7 <= mh.field_b)) {
          mh.field_b = var7;
        }
        gg.field_b = gg.field_b + 1;
        if (var7 < ha.field_c) {
          ha.field_c = var7;
        }
    }

    final String i(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (this.field_z == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_z[0]);
        for (var3 = 1; this.field_z.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_z[var3]);
        }
        if (param0 < 120) {
          this.a((byte) 20);
        }
        return var2.toString();
    }

    private final void a(od param0, int param1, int param2) {
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
        sa var7 = null;
        int var9 = 0;
        od var10 = null;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 != 1) {
            if (param2 == 2) {
              var4_int = param0.l(31760);
              this.field_D = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_D[var5] = param0.j(-788751192);
              }
            } else {
              if (param2 == 3) {
                var4_int = param0.l(31760);
                this.field_u = new int[var4_int][];
                this.field_E = new int[var4_int];
                for (var5 = 0; var4_int > var5; var5++) {
                  var6 = param0.j(-788751192);
                  var7 = m.a(var6, (byte) 46);
                  if (var7 != null) {
                    this.field_E[var5] = var6;
                    array$0 = new int[var7.field_a];
                    this.field_u[var5] = array$0;
                    for (var8 = 0; var7.field_a > var8; var8++) {
                      this.field_u[var5][var8] = param0.j(-788751192);
                    }
                  }
                }
              } else {
                if (4 == param2) {
                }
              }
            }
          } else {
            this.field_z = ki.a((byte) -123, '<', param0.b((byte) -56));
          }
          if (param1 >= -6) {
            var10 = (od) null;
            this.a((od) null, 90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ai.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ec g(int param0) {
        if (param0 != -29132) {
          ai.g(-85);
        }
        return ie.field_v;
    }

    final void a(byte param0) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = 83 % ((-66 - param0) / 46);
        if (this.field_D != null) {
          for (var3 = 0; this.field_D.length > var3; var3++) {
            this.field_D[var3] = li.a(this.field_D[var3], 32768);
          }
        }
    }

    public static void h(int param0) {
        field_x = null;
        field_A = null;
        if (param0 != -30463) {
          ai.a(0, (byte) -77, 16, -100, 52, 101);
        }
        field_w = null;
        field_v = null;
        field_y = null;
    }

    ai() {
    }

    final void a(od param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.l(31760);
            if (0 != var3_int) {
              this.a(param0, param1 ^ -61, var3_int);
              continue;
            }
            break;
          }
          if (param1 != 0) {
            this.a((byte) 112);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ai.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_v = "Create a free Account";
        field_w = "Create your own free Jagex account";
        field_A = new vh();
        field_x = "Unpacking music";
        field_B = false;
    }
}
