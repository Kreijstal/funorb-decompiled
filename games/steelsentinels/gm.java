/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_d;
    static String field_a;
    static gh field_c;
    static wk field_b;

    final static void a(byte param0) {
        if (param0 > -87) {
            field_d = (String) null;
            rg.field_d = new ul();
            return;
        }
        rg.field_d = new ul();
    }

    final static ef a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ef var5 = null;
        ef stackIn_6_0 = null;
        ef stackIn_9_0 = null;
        ef stackIn_12_0 = null;
        ef stackIn_14_0 = null;
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
              if (param0) {
                break L1;
              } else {
                gm.a(108);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() == 0) {
                  break L2;
                } else {
                  var2_int = param1.indexOf('@');
                  if (-1 != var2_int) {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int - -1);
                    var5 = bk.a(110, var3);
                    if (var5 == null) {
                      stackIn_14_0 = d.a(var4, false);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = (ef) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = ud.field_A;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_6_0 = qm.field_f;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("gm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -1) {
            return;
        }
        field_b = null;
    }

    static {
        field_d = "<%1> couldn't avoid the mighty enormo-laser";
        field_a = "C";
    }
}
