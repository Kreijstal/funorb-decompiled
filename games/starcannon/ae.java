/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static int[] field_b;
    static String field_a;

    final static void a(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var6 = jb.field_h;
              var1 = var6;
              var2 = 0;
              if (param0 == -5607) {
                break L1;
              } else {
                var5 = (String) null;
                ae.a((String) null, true, -70, true);
                break L1;
              }
            }
            var3 = var6.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "ae.B(" + param0 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            Throwable var2 = null;
            try {
              L0: {
                var2_int = 31 / ((param1 - -46) / 45);
                mb.a(new Object[]{new Integer(param0)}, ll.b(105), "resizing", -27504);
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
        int var1 = -55 % ((param0 - -17) / 41);
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        qb.b(-1);
        ti.field_b.l(26756);
        if (param2 != 0) {
            return;
        }
        try {
            wi.field_c = new rg(lc.field_hb, (String) null, tc.field_x, param1, param3);
            t.field_h = new lc(ti.field_b, wi.field_c);
            ti.field_b.a((byte) 102, (uj) (t.field_h));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ae.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_a = "Loading graphics";
    }
}
