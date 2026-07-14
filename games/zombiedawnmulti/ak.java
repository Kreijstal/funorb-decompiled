/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static int[] field_a;
    static String field_c;
    static String field_d;
    static volatile int field_b;

    final static op a(int param0, byte param1, int param2, int param3) {
        op var4 = null;
        op var4_ref = null;
        Object var5 = null;
        if (param1 >= -35) {
          L0: {
            var5 = null;
            ak.a(88, (java.applet.Applet) null);
            var4 = (op) (Object) mi.field_Kb.g(72);
            if (var4 == null) {
              var4_ref = new op();
              break L0;
            } else {
              break L0;
            }
          }
          var4_ref.b(false, param2, param0, param3);
          return var4_ref;
        } else {
          L1: {
            var4 = (op) (Object) mi.field_Kb.g(72);
            if (var4 == null) {
              var4_ref = new op();
              break L1;
            } else {
              break L1;
            }
          }
          var4_ref.b(false, param2, param0, param3);
          return var4_ref;
        }
    }

    final static void a(byte param0) {
        if (param0 > -110) {
          L0: {
            field_b = 43;
            if (null != ki.field_h) {
              ki.field_h.c(-71);
              ki.field_h = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != ki.field_h) {
              ki.field_h.c(-71);
              ki.field_h = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        if (param1 != -5) {
            field_a = null;
            return lk.b(false);
        }
        return lk.b(false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param1.getCodeBase();
                var3 = gf.a(param1, true, var4).getFile();
                Object discarded$6 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
                Object discarded$7 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
                if (param0 == 14158) {
                  break L0;
                } else {
                  field_a = null;
                  break L0;
                }
              }
              Object discarded$8 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
              Object discarded$9 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
              Object discarded$10 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
              Object discarded$11 = fo.a(param1, "updatelinks", (byte) 23, new Object[2]);
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

    public static void a(int param0) {
        if (param0 != -5937) {
          field_a = null;
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        sj.field_j.h(param3, param4, param0);
        lm.field_fb.a(param3, param4, param1);
        vo.field_p.h(param3, -5 + param1 + param4, param0);
        tb.field_s.a(param0 + param3 + -5, param4, param1);
        rp.field_r[0].c(param3, param4);
        rp.field_r[1].c(param0 + param3 + -5, param4);
        rp.field_r[2].c(param3, param2 + param4 - -param1);
        rp.field_r[3].c(param3 + param0 - 5, -5 + param4 + param1);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[12];
        field_c = "Join";
        field_b = 0;
        field_d = "Offering rematch";
    }
}
