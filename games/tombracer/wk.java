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

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 == -84) {
                L0: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref == null) {
                    break L0;
                  } else {
                    try {
                      var2_ref = Runtime.getRuntime();
                      var4 = null;
                      var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                      cba.field_d = 1 + (int)(var3.longValue() / 1048576L);
                    } catch (java.lang.Throwable decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                      return;
                    }
                    break L0;
                  }
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(en param0, int param1, int param2, cn param3) {
        Object var5 = null;
        gpa.field_b = param1 * aqa.a(1188664449) / 1000;
        ne.a(param3, -101);
        gja.a(param3, 0);
        jp.a(param3, (byte) 20);
        if (param2 != 11861) {
          var5 = null;
          wk.a((en) null, 0, -42, (cn) null);
          mf.a(85);
          ica.a(16777215);
          tl.field_r = 0 + -gpa.field_b;
          return;
        } else {
          mf.a(85);
          ica.a(16777215);
          tl.field_r = 0 + -gpa.field_b;
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 > -43) {
            return;
        }
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
          ((wk) this).field_h = dfa.a(qva.a((byte) -100, var5, -var4) >> -1607804798, 2048, -126);
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
