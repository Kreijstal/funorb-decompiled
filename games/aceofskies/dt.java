/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dt {
    static ap field_c;
    static String field_b;
    static int[] field_a;

    final static void a(int param0) {
        if (!(null == um.field_m)) {
            um.field_m.d();
        }
        if (param0 != 0) {
            field_b = (String) null;
        }
        if (!(null == da.field_a)) {
            da.field_a.d();
        }
    }

    final static al[][] a(gk param0, int param1, boolean[] param2, gk param3, String[][] param4) {
        al[] array$3 = null;
        al[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        al[][] var9 = null;
        al[][] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = new al[param4.length][];
              var5 = var9;
              var6 = 0;
              if (param1 == 19501) {
                break L1;
              } else {
                field_c = (ap) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6 >= var9.length) {
                stackIn_14_0 = (al[][]) (var5);
                break L0;
              } else {
                array$3 = new al[param4[var6].length];
                var5[var6] = array$3;
                var7 = 0;
                L3: while (true) {
                  if (var9[var6].length <= var7) {
                    var6++;
                    continue L2;
                  } else {
                    L4: {
                      L5: {
                        if (param2 == null) {
                          break L5;
                        } else {
                          if (param2[var6]) {
                            var9[var6][var7] = t.a(param0, "", param4[var6][var7]).a();
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9[var6][var7] = bj.a(param3, "", param4[var6][var7]).a();
                      break L4;
                    }
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5_ref);

            stackIn_17_1 = new StringBuilder().append("dt.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ')');
        }
        return stackIn_14_0;
    }

    public static void c(int param0) {
        field_c = null;
        if (param0 != 13748) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void b(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = hs.field_a;
              var1 = var5;
              var2 = 0;
              if (param0 == 8) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1_ref), "dt.D(" + param0 + ')');
        }
    }

    static {
        field_a = new int[8];
    }
}
