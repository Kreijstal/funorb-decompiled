/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static int[] field_b;
    static String field_a;

    final static void a(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            var5 = jb.field_h;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1_ref, "ae.B(" + -5607 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
            int var2_int = 0;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2_int = 31;
                Object discarded$1 = mb.a(new Object[1], ll.b(105), "resizing", -27504);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        qb.b(-1);
        ti.field_b.l(26756);
        try {
            wi.field_c = new rg(lc.field_hb, (String) null, tc.field_x, param1, param3);
            t.field_h = new lc(ti.field_b, (uj) (Object) wi.field_c);
            ti.field_b.a((byte) 102, (uj) (Object) t.field_h);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ae.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + 0 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = "Loading graphics";
    }
}
