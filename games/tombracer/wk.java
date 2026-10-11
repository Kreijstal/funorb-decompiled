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
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            if (param0 != -84) {
              return;
            }
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (var1 != null) {
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                cba.field_d = 1 + (int)(var3.longValue() / 1048576L);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(en param0, int param1, int param2, cn param3) {
        try {
          gpa.field_b = param1 * aqa.a(1188664449) / 1000;
          ne.a(param3, -101);
          gja.a(param3, 0);
          jp.a(param3, (byte) 20);
          if (param2 != 11861) {
            cn var5 = (cn) null;
            wk.a((en) null, 0, -42, (cn) null);
          }
          mf.a(85);
          ica.a(16777215);
          tl.field_r = 0 - gpa.field_b;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 > -43) {
          return;
        }
        field_i = null;
    }

    wk() {
        this.field_j = false;
    }

    final void a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4 = -param1 + this.field_g;
        if (param0 == 0) {
          this.field_l = var4 / 20;
          var5 = this.field_k - param2;
          this.field_f = var5 / 20;
          this.field_h = dfa.a(qva.a((byte) -100, var5, -var4) >> 2, 2048, -126);
          return;
        }
    }

    static {
        field_i = new boolean[]{true, true, false, true, false, false, true, false, false};
        field_m = 0;
    }
}
