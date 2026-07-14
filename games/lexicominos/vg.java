/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static byte[][][] field_a;
    static sg[] field_d;
    static int field_b;
    static int[] field_c;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (!param0) {
                var4 = param1.getCodeBase();
                var3 = gf.a(3, var4, param1).getFile();
                Object discarded$6 = oa.a(param1, 22347, "updatelinks", new Object[2]);
                Object discarded$7 = oa.a(param1, 22347, "updatelinks", new Object[2]);
                Object discarded$8 = oa.a(param1, 22347, "updatelinks", new Object[2]);
                Object discarded$9 = oa.a(param1, 22347, "updatelinks", new Object[2]);
                Object discarded$10 = oa.a(param1, 22347, "updatelinks", new Object[2]);
                Object discarded$11 = oa.a(param1, 22347, "updatelinks", new Object[2]);
              } else {
                return;
              }
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

    public static void b(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_b = -79;
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(int param0) {
        ug.field_A.h(0);
        if (param0 > 100) {
          if (qj.field_fb == null) {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, (w) (Object) qj.field_fb);
            return;
          } else {
            ug.field_A.a(-14579, (w) (Object) qj.field_fb);
            return;
          }
        } else {
          field_b = 110;
          if (qj.field_fb != null) {
            ug.field_A.a(-14579, (w) (Object) qj.field_fb);
            return;
          } else {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, (w) (Object) qj.field_fb);
            return;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new sg[15];
        field_c = new int[8192];
        field_b = 0;
    }
}
