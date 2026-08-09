/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cd extends fl {
    static long field_t;
    static int[] field_q;
    static String field_r;
    static cn field_s;
    static String field_u;
    static int field_v;

    cd() {
    }

    public static void f(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -1) {
            field_q = (int[]) null;
            field_u = null;
            return;
        }
        field_u = null;
    }

    final static tk a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        tk var5 = null;
        tk stackIn_4_0 = null;
        tk stackIn_8_0 = null;
        tk stackIn_12_0 = null;
        tk stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() != 0) {
                  var2_int = param1.indexOf('@');
                  if (param0 == var2_int) {
                    stackIn_8_0 = mf.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = sf.a(var3, (byte) 119);
                    if (var5 != null) {
                      stackIn_12_0 = (tk) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_14_0 = rn.a(var4, param0 ^ -1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = ig.field_g;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("cd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    static {
        field_r = "Waiting for levels";
        field_u = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new cn();
        field_v = -1;
    }
}
