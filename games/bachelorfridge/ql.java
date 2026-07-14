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
            Object var2 = null;
            ql.a((int[]) null, -88, -52);
        }
        field_r = null;
    }

    final ii a(op param0, int param1) {
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
        var18 = ((ql) this).field_h.a(59, param0);
        var4 = new uj(((ql) this).field_g, new nq(var18));
        var4.field_q = ((ql) this).field_k;
        var4.field_t = ((ql) this).field_n;
        var22 = var4.d(1);
        var6 = 17;
        var7 = 17;
        var8 = -1 + var6 >> -1202196799;
        var9 = -1 + var7 >> 519325057;
        var10 = 0;
        L0: while (true) {
          if (var6 <= var10) {
            if (param1 == 3) {
              return (ii) (Object) var4;
            } else {
              return null;
            }
          } else {
            var11 = 0;
            L1: while (true) {
              if (var11 >= var7) {
                var10++;
                continue L0;
              } else {
                if (1 == var22[var10][var11]) {
                  var12 = var10 - (var8 - ((ql) this).field_k);
                  var13 = ((ql) this).field_n - var9 + var11;
                  if (param0.a(var12, var13, (byte) -48)) {
                    var14 = param0.field_a[var12][var13];
                    var15 = var14.field_l;
                    if (var15 != null) {
                      var16 = new iv(new nq(var15), false, 1, 75, 0);
                      var4.field_o.a((bw) (Object) var16, true);
                      var11++;
                      continue L1;
                    } else {
                      var11++;
                      continue L1;
                    }
                  } else {
                    var11++;
                    continue L1;
                  }
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        uma.field_P[param1] = new kga(param1, param0);
        if (param2 != 0) {
            Object var4 = null;
            ql.a((int[]) null, 60, -103);
        }
    }

    ql(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((ql) this).field_k = param2;
        ((ql) this).field_n = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<%0> wants to join";
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_q = "Offensive account name";
    }
}
