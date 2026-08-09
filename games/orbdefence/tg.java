/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static String field_d;
    static long field_a;
    static int[] field_b;
    static va field_c;

    final static ti a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ti var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ti stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (qb.field_a != null) {
              L1: {
                if (param1 == 256) {
                  break L1;
                } else {
                  field_c = (va) null;
                  break L1;
                }
              }
              L2: {
                var6 = (CharSequence) ((Object) param0);
                var2 = ua.a(-21, var6);
                if (var2 != null) {
                  break L2;
                } else {
                  var2 = param0;
                  break L2;
                }
              }
              var3 = (ti) ((Object) qb.field_a.a((byte) 109, (long)var2.hashCode()));
              L3: while (true) {
                if (var3 != null) {
                  L4: {
                    var7 = (CharSequence) ((Object) var3.field_db);
                    var4 = ua.a(param1 ^ 346, var7);
                    if (var4 == null) {
                      var4 = var3.field_db;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var4.equals(var2)) {
                    stackIn_17_0 = (ti) (var3);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = (ti) ((Object) qb.field_a.c((byte) -97));
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      stackIn_20_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("tg.B(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ti) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return (ti) ((Object) stackIn_20_0);
          }
        }
    }

    final static void a(int param0, int param1) {
        se var2;
        if (param0 >= -65) {
          return;
        } else {
          var2 = uk.field_b;
          var2.i(param1, 108);
          var2.a(1, -92);
          var2.a(2, -71);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_a = 118L;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        field_d = "EXCLUSIVE";
        field_b = new int[256];
    }
}
