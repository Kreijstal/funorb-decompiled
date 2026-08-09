/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static long field_e;
    int field_d;
    int field_g;
    int field_f;
    static String field_a;
    int field_c;
    int field_b;

    public static void a(byte param0) {
        field_a = null;
        int var1 = -20 % ((param0 - -59) / 49);
    }

    final static void a(ei param0, boolean param1, ei param2, int param3, ei param4, ei param5) {
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ul.a((byte) -113);
                break L1;
              }
            }
            L2: {
              if (param3 != 1) {
                var6_int = 0;
                L3: while (true) {
                  if (param0.field_e <= var6_int) {
                    break L2;
                  } else {
                    var9 = var6_int + 2;
                    var7 = var9;
                    L4: while (true) {
                      L5: {
                        L6: {
                          L7: {
                            stackIn_17_0 = var9 ^ -1;

                            if (-1 != (var6_int ^ -1)) {
                              stackIn_18_0 = stackIn_17_0;
                              stackIn_18_1 = param0.field_e;
                              break L7;
                            } else {
                              stackIn_18_0 = stackIn_17_0;
                              stackIn_17_0 = stackIn_18_0;
                              stackIn_18_1 = param0.field_e - 1;

                              break L7;
                            }
                          }
                          if (stackIn_18_0 <= (stackIn_18_1 ^ -1)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        qf.a(param5, (vj) (param0.field_b[var6_int]), param3, -3, var6_int, (vj) (param0.field_b[var9]), var9, param2);
                        var9++;
                        continue L4;
                      }
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              } else {
                var6_int = 0;
                L8: while (true) {
                  if (param0.field_e <= var6_int) {
                    break L2;
                  } else {
                    var7 = 0;
                    L9: while (true) {
                      if (var7 >= param4.field_e) {
                        var6_int++;
                        continue L8;
                      } else {
                        qf.a(param5, (vj) (param0.field_b[var6_int]), param3, -3, var6_int, (vj) (param4.field_b[var7]), var7, param2);
                        var7++;
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var6);

            stackIn_24_1 = new StringBuilder().append("ul.B(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L13;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L13;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ')');
        }
    }

    ul(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = param1;
        this.field_c = param2;
        this.field_b = param0;
        this.field_g = param4;
        this.field_d = param3;
    }

    static {
        field_a = "Unpacking sound effects";
    }
}
