/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static long field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, float param1, float param2, ei param3, ei param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = (int)param2;
            if (param0 == 2) {
              var6 = (int)param1;
              var7 = (float)(-var5_int) + param2;
              var8 = (float)(-var6) + param1;
              if (var6 == var5_int) {
                L1: {
                  if (var7 != var8) {
                    param4.a((Object) (Object) fk.a(1, var8, (vj) param3.field_b[var5_int], var7), (byte) 6);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                break L0;
              } else {
                if (var5_int >= var6) {
                  L2: {
                    if (0.0f >= var7) {
                      break L2;
                    } else {
                      param4.a((Object) (Object) td.a(150, var7, (vj) param3.field_b[var5_int]).c(false), (byte) 6);
                      break L2;
                    }
                  }
                  var9 = -1 + var5_int;
                  L3: while (true) {
                    if (var6 >= var9) {
                      param4.a((Object) (Object) ik.a(119, (vj) param3.field_b[var6], var8).c(false), (byte) 6);
                      return;
                    } else {
                      param4.a((Object) (Object) ((vj) param3.field_b[var9]).c(false), (byte) 6);
                      var9--;
                      continue L3;
                    }
                  }
                } else {
                  param4.a((Object) (Object) ik.a(92, (vj) param3.field_b[var5_int], var7), (byte) 6);
                  var9 = var5_int - -1;
                  L4: while (true) {
                    if (var6 <= var9) {
                      L5: {
                        if (var8 <= 0.0f) {
                          break L5;
                        } else {
                          param4.a((Object) (Object) td.a(param0 + 148, var8, (vj) param3.field_b[var6]), (byte) 6);
                          break L5;
                        }
                      }
                      return;
                    } else {
                      param4.a(param3.field_b[var9], (byte) 6);
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("fc.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        var5 = new int[2 * param2];
        var3 = var5;
        var4 = 0;
        L0: while (true) {
          if (param2 <= var4) {
            if (param0 > -1) {
              field_d = 35;
              return var5;
            } else {
              return var5;
            }
          } else {
            var5[var4 * 2] = var4;
            var5[2 * var4 + 1] = param1;
            var4++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -15;
        field_b = null;
    }

    final static bm a(boolean param0) {
        bm var1 = new bm(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], lk.field_e[0], dd.field_E);
        tk.a(false);
        return var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 20;
        field_b = "Not yet achieved";
    }
}
