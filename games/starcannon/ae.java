/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static int[] field_b;
    static String field_a;

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        var4 = StarCannon.field_A;
        var8 = jb.field_h;
        var7 = var8;
        var6 = var7;
        var1 = var6;
        var2 = 0;
        if (param0 != -5607) {
          var5 = null;
          ae.a((String) null, true, -70, true);
          var3 = var8.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L0;
            }
          }
        } else {
          var3 = var8.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        try {
            int var2_int = 0;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              var2_int = 31 / ((param1 - -46) / 45);
              Object discarded$1 = mb.a(new Object[1], ll.b(105), "resizing", -27504);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
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
        } else {
          wi.field_c = new rg(lc.field_hb, (String) null, tc.field_x, param1, param3);
          t.field_h = new lc(ti.field_b, (uj) (Object) wi.field_c);
          ti.field_b.a((byte) 102, (uj) (Object) t.field_h);
          return;
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
