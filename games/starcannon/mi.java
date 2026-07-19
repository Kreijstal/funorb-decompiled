/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mi extends uh {
    static long field_o;
    int field_p;
    static String field_n;

    abstract Object d(byte param0);

    abstract boolean e(int param0);

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            ve.field_d = true;
            if (param0 != 1048576) {
                mi.d(35);
            }
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            wg.a((byte) 111, var3, param1, var2, var4);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mi.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mi(int param0) {
        this.field_p = param0;
    }

    final static void e(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                        la.field_b = (int)(var3.longValue() / 1048576L) + 1;
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
                      if (param0 == -6) {
                        return;
                      } else {
                        field_n = (String) null;
                        return;
                      }
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
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            if (param0 != -6) {
              field_n = (String) null;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            return;
        }
        field_n = null;
    }

    static {
        field_n = "This game has been updated! Please reload this page.";
    }
}
