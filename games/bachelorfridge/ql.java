/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends td {
    static String field_q;
    static qha field_t;
    static int field_s;
    static String field_p;
    static String[] field_r;

    public static void c(byte param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        if (param0 > -65) {
            int[] var2 = (int[]) null;
            ql.a((int[]) null, -88, -52);
        }
        field_r = null;
    }

    final ii a(op param0, int param1) {
        ii stackIn_16_0 = null;
        uj stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        uj var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          L0: {
            var18 = this.field_h.a(59, param0);
            var4 = new uj(this.field_g, new nq(var18));
            var4.field_q = this.field_k;
            var4.field_t = this.field_n;
            var22 = var4.d(1);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> -1202196799;
            var9 = -1 + var7 >> 519325057;
            var10 = 0;
            L1: while (true) {
              if (var6 <= var10) {
                if (param1 == 3) {
                  stackIn_18_0 = (uj) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_16_0 = (ii) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= var7) {
                    var10++;
                    continue L1;
                  } else {
                    if (1 == var22[var10][var11]) {
                      var12 = var10 - (var8 - this.field_k);
                      var13 = this.field_n - var9 + var11;
                      if (param0.a(var12, var13, (byte) -48)) {
                        L3: {
                          var14 = param0.field_a[var12][var13];
                          var15 = var14.field_l;
                          if (var15 != null) {
                            var16 = new iv(new nq(var15), false, 1, 75, 0);
                            var4.field_o.a(var16, true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var11++;
                        continue L2;
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ql.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return (ii) ((Object) stackIn_18_0);
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              uma.field_P[param1] = new kga(param1, param0);
              if (param2 == 0) {
                break L1;
              } else {
                var4 = (int[]) null;
                ql.a((int[]) null, 60, -103);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ql.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    ql(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_k = param2;
            this.field_n = param3;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ql.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_p = "<%0> wants to join";
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_q = "Offensive account name";
    }
}
