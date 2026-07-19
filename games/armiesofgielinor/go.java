/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go {
    static int[][][] field_f;
    private String field_b;
    static wk field_e;
    static String field_d;
    static String[] field_c;
    static wk field_g;
    int[] field_a;
    static String field_h;

    final int c(int param0) {
        if (param0 != 16648) {
            field_d = (String) null;
            return this.field_a.length;
        }
        return this.field_a.length;
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -85 / ((param0 - -50) / 45);
        if (am.field_z != null) {
          if (kl.field_k != ov.field_g) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, byte param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 <= -82) {
          var7 = this.field_a;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var4 < var7.length) {
              var5 = var7[var4];
              stackOut_5_0 = var5 ^ -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var6 == 0) {
                if (stackIn_7_0 == (param0 ^ -1)) {
                  return true;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return stackIn_6_0 != 0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void b(int param0) {
        boolean discarded$2 = false;
        field_g = null;
        field_d = null;
        if (param0 >= -15) {
          discarded$2 = go.a(62);
          field_c = null;
          field_e = null;
          field_h = null;
          field_f = (int[][][]) null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_h = null;
          field_f = (int[][][]) null;
          return;
        }
    }

    final void a(int param0, ha param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = this.field_a;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 >= var7.length) {
                    break L3;
                  } else {
                    var5 = var7[var4];
                    param1.b(param0 ^ 10002, var5, true);
                    var4++;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 3) {
                  break L2;
                } else {
                  field_g = (wk) null;
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("go.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final String d(int param0) {
        boolean discarded$0 = false;
        if (param0 != 3) {
            discarded$0 = this.a(-128, (byte) 1);
            return this.field_b;
        }
        return this.field_b;
    }

    go(String param0, int[] param1) {
        try {
            this.field_b = param0;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"Summon this unit", "Insufficient Mana", "Favour level too low", "Favour level too low and insufficient Mana", "You have not purchased this unit"};
        field_f = new int[][][]{new int[][]{new int[]{-1, 5, -1, -1}}, new int[][]{new int[]{-1, 3, -1, -1}}, new int[][]{new int[]{-1, -1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1, 1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3, -1}}, new int[][]{new int[]{-1, -1, -1, 1}}, new int[][]{new int[]{-1, 3, 3, 3, 3}, new int[]{3, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3, -1, -1, -1}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{-1, 3, 3, 3}}, new int[][]{new int[]{3, 3, 3}}, new int[][]{new int[]{-1, -1, -1, -1}}, new int[][]{new int[]{3, 3, 3, 3}}};
        field_d = "Please select an option in the '<%0>' row.";
        field_h = "Miracles";
    }
}
