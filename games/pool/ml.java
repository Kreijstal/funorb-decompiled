/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static String field_f;
    static int field_d;
    static String[] field_c;
    static vh field_e;
    static String field_g;
    private String field_i;
    static int[] field_l;
    static char field_b;
    static int[] field_k;
    static int field_j;
    static String field_a;
    static int[][] field_h;

    final static int b(int param0) {
        if (param0 < 6) {
          field_a = (String) null;
        }
        return -kk.field_z + gp.field_c;
    }

    final boolean a(String param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 46) {
            stackIn_4_0 = this.field_i.equals(param0);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ml.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(java.applet.Applet param0, boolean param1) {
        try {
          if (!param1) {
            field_a = (String) null;
          }
          nn.a(31536000L, (byte) -120, param0, this.field_i, "jagex-last-login-method");
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ml.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -26458) {
          ml.b(65);
        }
        field_k = null;
        field_g = null;
        field_e = null;
        field_h = (int[][]) null;
        field_f = null;
        field_l = null;
    }

    ml(String param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ml.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, dd param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        dd var21 = null;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = Pool.field_O;
        try {
          var6_int = (param5 - param0 << 8) / param4.field_w;
          var7 = (param0 << 8) + param4.field_G * var6_int;
          param2 = param2 + param4.field_G;
          param3 = param3 + param4.field_B;
          var8 = param2 + qh.field_l * param3;
          var9 = 0;
          var10 = param4.field_A;
          var11 = param4.field_z;
          var12 = qh.field_l - var11;
          var13 = 0;
          if (param3 < qh.field_c) {
            var14 = -param3 + qh.field_c;
            var8 = var8 + var14 * qh.field_l;
            var9 = var9 + var11 * var14;
            param3 = qh.field_c;
            var10 = var10 - var14;
          }
          if (var10 + param3 > qh.field_g) {
            var10 = var10 - (-qh.field_g + (var10 + param3));
          }
          if (param2 < qh.field_b) {
            var14Lifetime1 = -param2 + qh.field_b;
            param2 = qh.field_b;
            var8 = var8 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var7 = var7 + var6_int * var14Lifetime1;
            var12 = var12 + var14Lifetime1;
          }
          if (param2 + var11 > qh.field_j) {
            var14Lifetime2 = param2 + (var11 - qh.field_j);
            var12 = var12 + var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
          }
          if (0 < var11 &&
            var10 > 0) {
            if (param1 < 44) {
              var21 = (dd) null;
              ml.a(26, (byte) 106, -29, 66, (dd) null, 59);
            }
            for (param3 = -var10; param3 < 0; param3++) {
              var14Lifetime3 = var7;
              for (param2 = -var11; param2 < 0; param2++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 < 0) {
                  var9++;
                  var8++;
                } else {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param4.field_D[incrementValue$0];
                  if (0 != var17) {
                    if (var15 <= 255) {
                      var18 = qh.field_d[var8];
                      var19 = 16711935 & var16 * (var18 & 16711935) + (var17 & 16711935) * var15 >> 8;
                      qh.field_d[var8] = var19 + rb.b(65280, rb.b(var17, 65280) * var15 + var16 * rb.b(var18, 65280) >> 8);
                    } else {
                      qh.field_d[var8] = var17;
                    }
                  }
                  var8++;
                }
              }
              var9 = var9 + var13;
              var8 = var8 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_36_0 = var6;
          stackIn_36_1 = new StringBuilder().append("ml.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, oj param1, int param2) {
        ta.field_i.b((byte) -31, param1);
        if (param0 != 25756) {
          return;
        }
        try {
          ch.a(false, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ml.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_f = "Elapsed time";
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = "<%0>, would you like to <u>play</u> the next shot or <u>pass</u> and make your opponent play?";
        field_l = new int[12];
        field_k = new int[]{8};
        field_a = "Show";
        field_h = new int[][]{new int[]{1, 1, 2, 1}, new int[]{1, 1, 2, 2}, new int[]{1, 1, 2, 3}, new int[]{1, 1, 2, 4}, new int[]{1, 1, 2, 5}, new int[]{-1, 3, 1, 0}, new int[]{-1, 5, 1, 0}, new int[]{-1, 6, 1, 0}, new int[]{-1, 7, 1, 0}, new int[]{-1, 8, 1, 0}, new int[]{-1, 3, 1, 1}, new int[]{-1, 4, 1, 1}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}};
    }
}
