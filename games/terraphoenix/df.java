/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends eb {
    static fh field_K;
    static String field_M;
    static String field_L;

    final static void b(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            re.a(pb.field_b, (byte) -26, ok.field_j, hm.field_L, true, 0, param1);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= pb.field_b) {
                L2: {
                  re.a(pb.field_b + param1, (byte) -117, el.field_d, bd.field_a, false, param1, param1 + param1);
                  if (pb.field_b > param1) {
                    pb.field_b = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              } else {
                pf.field_b[var2_int - -param1] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "df.D(" + 0 + ',' + param1 + ')');
        }
    }

    public static void f() {
        field_L = null;
        field_M = null;
        field_K = null;
    }

    private df(String param0, cj param1, sc param2) {
        super(param0, param1, param2);
        try {
            ((df) this).field_l = vc.field_c.field_q;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    df(String param0, sc param1, boolean param2) {
        this(param0, param1);
        try {
            ((df) this).field_C = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private df(String param0, sc param1) {
        this(param0, vc.field_c.field_n, param1);
        try {
            ((df) this).field_l = vc.field_c.field_q;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((df) this).field_C = !((df) this).field_C ? true : false;
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "TAC-3";
    }
}
