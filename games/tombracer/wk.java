/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends vg {
    static boolean[] field_i;
    int field_f;
    boolean field_j;
    int field_l;
    int field_g;
    int field_h;
    static int field_n;
    int field_k;
    static int field_m;

    final static void a() {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                        cba.field_d = 1 + (int)(var3.longValue() / 1048576L);
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
                var1 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(en param0, int param1, int param2, cn param3) {
        try {
            int discarded$0 = 1188664449;
            gpa.field_b = param1 * aqa.a() / 1000;
            int discarded$13 = -101;
            ne.a(param3);
            int discarded$24 = 0;
            gja.a(param3);
            int discarded$30 = 20;
            jp.a(param3);
            if (param2 != 11861) {
                Object var5 = null;
                wk.a((en) null, 0, -42, (cn) null);
            }
            int discarded$31 = 85;
            mf.a();
            int discarded$32 = 16777215;
            ica.a();
            tl.field_r = -gpa.field_b;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b() {
        field_i = null;
    }

    wk() {
        ((wk) this).field_j = false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = -param1 + ((wk) this).field_g;
        if (param0 != 0) {
          return;
        } else {
          ((wk) this).field_l = var4 / 20;
          var5 = ((wk) this).field_k + -param2;
          ((wk) this).field_f = var5 / 20;
          ((wk) this).field_h = dfa.a(qva.a((byte) -100, var5, -var4) >> 2, 2048, -126);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new boolean[]{true, true, false, true, false, false, true, false, false};
        field_m = 0;
    }
}
