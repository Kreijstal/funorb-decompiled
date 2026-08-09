/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static int field_c;
    static long field_e;
    static String field_b;
    static int[] field_d;
    static int field_a;

    final static void a(String[][] param0, String[] param1, byte param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            re.field_e = param1;
            lb.field_P = param0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= lb.field_P.length) {
                L2: {
                  if (param2 == -96) {
                    break L2;
                  } else {
                    stackIn_12_0 = (String) null;
                    field_b = stackIn_12_0;
                    break L2;
                  }
                }
                break L0;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= lb.field_P[var3_int].length) {
                    var3_int++;
                    continue L1;
                  } else {
                    L4: {
                      if (lb.field_P[var3_int][var4] != null) {
                        lb.field_P[var3_int][var4] = lb.field_P[var3_int][var4].toLowerCase();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (runtimeException);

            stackIn_16_1 = new StringBuilder().append("hf.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2;
        var2 = param0;
        if ((var2 ^ -1) == 0) {
          return jc.field_i;
        } else {
          if (var2 != 0) {
            if (1 == var2) {
              return dq.field_i;
            } else {
              if (var2 == 2) {
                return bc.field_c;
              } else {
                var2 = -97 % ((14 - param1) / 35);
                return null;
              }
            }
          } else {
            return v.field_a;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_d = (int[]) null;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_b = "Similar rating";
        field_a = 4800;
    }
}
