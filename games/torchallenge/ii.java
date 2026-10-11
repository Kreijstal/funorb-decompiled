/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String[] field_g;
    static boolean field_e;
    private w field_l;
    static boolean field_d;
    static int field_a;
    static ka[] field_h;
    static int field_i;
    static qe field_k;
    static int field_c;
    private w field_b;
    static int[][] field_j;
    static int[][] field_f;

    final int a(boolean param0) {
        int var2 = 0;
        w var3 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
          var2 = 0;
          var3 = this.field_l.field_k;
          while (this.field_l != var3) {
            var2++;
            var3 = var3.field_k;
          }
          return var2;
        }
        return -18;
    }

    final w a(int param0) {
        w var2 = this.field_l.field_k;
        if (param0 != 25777) {
          this.a(false);
          if (var2 == this.field_l) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_k;
          return var2;
        }
        if (var2 == this.field_l) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_k;
        return var2;
    }

    public static void b(int param0) {
        if (param0 == 16711680) {
          field_h = null;
          field_j = (int[][]) null;
          field_g = null;
          field_f = (int[][]) null;
          field_k = null;
          return;
        }
        ii.a(-113, -60, 120, -92, 0, 96);
        field_h = null;
        field_j = (int[][]) null;
        field_g = null;
        field_f = (int[][]) null;
        field_k = null;
    }

    final w c(int param0) {
        w var2 = this.field_l.field_k;
        if (var2 == this.field_l) {
          return null;
        }
        if (param0 == -1) {
          var2.a(12695);
          return var2;
        }
        field_f = (int[][]) null;
        var2.a(12695);
        return var2;
    }

    final w d(int param0) {
        w var2 = this.field_b;
        if (this.field_l == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_k;
        if (param0 >= 12) {
          return var2;
        }
        this.a(false);
        return var2;
    }

    final void a(w param0, int param1) {
        RuntimeException var3 = null;
        w var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_i != null) {
            param0.a(12695);
          }
          param0.field_i = this.field_l.field_i;
          param0.field_k = this.field_l;
          param0.field_i.field_k = param0;
          param0.field_k.field_i = param0;
          if (param1 == 3329) {
            return;
          }
          var4 = (w) null;
          this.a((w) null, 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ii.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          if (qg.field_a > param4) {
            param0 = param0 - (-param4 + qg.field_a);
            param4 = qg.field_a;
          }
          if (qg.field_k > param5) {
            param1 = param1 - (-param5 + qg.field_k);
            param5 = qg.field_k;
          }
          if (qg.field_c < param4 + param0) {
            param0 = -param4 + qg.field_c;
          }
          if (param1 + param5 > qg.field_l) {
            param1 = -param5 + qg.field_l;
          }
          if (0 < param0 &&
            0 < param1) {
            var6_int = param4 + param5 * qg.field_g;
            var7 = qg.field_g - param0;
            if (param3 != 4) {
              return;
            }
            for (param5 = -param1; param5 < 0; param5++) {
              for (param4 = -param0; 0 > param4; param4++) {
                var8 = qg.field_i[var6_int];
                if ((255 & var8 >> 8) > param2 &&
                  (var8 & 65280) >> 8 >= (var8 & 16711680) >> 16) {
                  var9 = ((var8 & 16711680) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & -(var10 >> 5) + (var10 >> 1);
                  var11 = 31 & var8 >> 3;
                  qg.field_i[var6_int] = p.a(p.a(var9 << 16, var10), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var6), "ii.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public ii() {
        this.field_l = new w();
        this.field_l.field_k = this.field_l;
        this.field_l.field_i = this.field_l;
    }

    static {
        field_g = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 0;
        field_d = false;
        field_j = new int[][]{new int[]{220, 139}, new int[]{239, 118}, new int[]{224, 136}};
        field_f = new int[4][];
    }
}
