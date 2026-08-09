/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static boolean field_b;
    static int field_d;
    static upa field_a;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
            int[] var2 = (int[]) null;
            sb.a(121, (int[]) null);
        }
    }

    final static int[] a(int param0, int[] param1) {
        int incrementValue$1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = new int[pd.a(param1, 2048)];
            var2 = var7;
            var3 = 0;
            var4 = param0;
            L1: while (true) {
              if (param1.length <= var4) {
                stackIn_14_0 = (int[]) (var7);
                break L0;
              } else {
                L2: {
                  if (param1[var4] != 0) {
                    var5 = 0;
                    L3: while (true) {
                      if (32 <= var5) {
                        break L2;
                      } else {
                        L4: {
                          if ((1 << var5 & param1[var4]) == 0) {
                            break L4;
                          } else {
                            incrementValue$1 = var3;
                            var3++;
                            var7[incrementValue$1] = fh.a(var5, var4 << -1533565403);
                            break L4;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("sb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(int param0, cn param1, cn param2, cn param3, cn param4) {
        try {
            bja.field_a = param4;
            qoa.field_b = param1;
            ua.field_a = param2;
            nj.field_v = param3;
            ns.field_j = new nda(qoa.field_b, nj.field_v);
            bia.field_J = new u[237];
            int var5_int = -51 % ((param0 - 32) / 59);
            fna.field_j = new qua[4];
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = null;
        field_c = "Accept <%0> into this game";
    }
}
