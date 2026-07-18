/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static oi field_d;
    static ae field_c;
    static String field_e;
    static wi field_b;
    static int field_a;

    final static void a(int param0, int param1, int param2) {
        id.field_c = param2;
        ii.field_a = param1;
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
            Exception var1_ref_Exception = null;
            int var1 = 0;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref_java_lang_reflect_Method == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref_java_lang_reflect_Method.invoke((Object) (Object) var2_ref, (Object[]) null);
                        jd.field_b = (int)(var3.longValue() / 1048576L) + 1;
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var1 = -100;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            var1 = -100;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new oi();
        field_c = new ae();
        field_e = "Fire stars";
    }
}
