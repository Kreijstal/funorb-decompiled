/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends df {
    static int field_u;
    private int[] field_w;
    private String[] field_y;
    static bi field_s;
    int[] field_o;
    private int[][] field_q;
    static int field_v;
    static String[] field_x;
    static boolean field_t;
    static String field_p;
    static int field_r;

    final static void e(int param0) {
        cq.a(-50);
        if (param0 != -23771) {
            Object var2 = null;
            byte[] discarded$0 = dp.a((byte[]) null, -8, -126, -100);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 != -26131) {
            dp.f((byte) 115);
        }
        if (-1 <= (param3 ^ -1)) {
            var4 = param0;
        } else {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
                var8[var5_int] = param0[var5_int + param3];
            }
        }
        er var5 = new er();
        var5.b(param2 ^ 169946828);
        var5.a((byte) 36, (long)(param1 * 8), var4);
        byte[] var6 = new byte[64];
        var5.a(0, (byte) 111, var6);
        return var6;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((dp) this).field_o) {
            for (var2 = 0; var2 < ((dp) this).field_o.length; var2++) {
                ((dp) this).field_o[var2] = ee.a(((dp) this).field_o[var2], 32768);
            }
        }
        if (param0 >= -60) {
            ((dp) this).field_w = null;
        }
    }

    final void a(ob param0, int param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != 0) {
            return;
        }
        while (true) {
            var3 = param0.j(-126);
            if (0 == var3) {
                break;
            }
            this.a(1, var3, param0);
        }
    }

    private final void a(int param0, int param1, ob param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gq var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == param1) {
            ((dp) this).field_y = so.a(param2.e(-1), '<', 51);
            break L0;
          } else {
            if (param1 != 2) {
              if (-4 != (param1 ^ -1)) {
                if (4 != param1) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param2.j(-74);
                ((dp) this).field_w = new int[var4];
                ((dp) this).field_q = new int[var4][];
                var5 = 0;
                L1: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param2.f(-20976);
                    var7 = aq.a(var6, 0);
                    if (var7 != null) {
                      ((dp) this).field_w[var5] = var6;
                      ((dp) this).field_q[var5] = new int[var7.field_e];
                      var8 = 0;
                      L2: while (true) {
                        if (var7.field_e > var8) {
                          ((dp) this).field_q[var5][var8] = param2.f(-20976);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var4 = param2.j(-70);
              ((dp) this).field_o = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((dp) this).field_o[var5] = param2.f(param0 + -20977);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void f(byte param0) {
        field_p = null;
        field_x = null;
        field_s = null;
        if (param0 != -50) {
            boolean discarded$0 = dp.a(-94, -30, 68);
        }
    }

    final String f(int param0) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        StringBuilder var5 = new StringBuilder(param0);
        StringBuilder var2 = var5;
        if (!(null != ((dp) this).field_y)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((dp) this).field_y[0]);
        for (var3 = 1; ((dp) this).field_y.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((dp) this).field_y[var3]);
        }
        return var2.toString();
    }

    dp() {
    }

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          if (param0 < -84) {
            break L0;
          } else {
            dp.e(2);
            break L0;
          }
        }
        if (13 == oq.field_j) {
          eo.f(false);
          return true;
        } else {
          if (-103 != (oq.field_j ^ -1)) {
            L1: {
              L2: {
                if (null == mr.field_h) {
                  break L2;
                } else {
                  if (!mr.field_h.a(param1, false, param2)) {
                    break L2;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L1;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            return stackIn_11_0 != 0;
          } else {
            mr.field_h.h(0);
            return true;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int[] var9 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 != -1) {
            field_r = -13;
        }
        while (true) {
            param4--;
            if (-1 < (param4 ^ -1)) {
                break;
            }
            var9 = param1;
            int[] var5 = var9;
            var6 = param0;
            var7 = param3;
            var9[var6] = var7 + (we.a(var9[var6], 16711422) >> 132142945);
            param0++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 200;
        field_x = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_p = "Invalid password.";
        field_t = false;
    }
}
