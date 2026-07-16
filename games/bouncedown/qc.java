/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static int field_c;
    static he field_a;
    static String field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -78) {
            qc.b(112);
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            Exception exception = null;
            java.net.URL var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = ag.a(param0, var3, false);
                mg.a(true, param0, var3.toString(), true);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                exception = (Exception) (Object) decompiledCaughtException;
                exception.printStackTrace();
                break L1;
              }
            }
            if (param1 != 24) {
              qc.b(69);
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

    final static void a(int param0) {
        try {
            Exception var1 = null;
            Throwable decompiledCaughtException = null;
            if (null != gf.field_g) {
              try {
                L0: {
                  gf.field_g.a((byte) 57, 0L);
                  gf.field_g.a(0, jc.field_g.field_i, 24, jc.field_g.field_h);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (Exception) (Object) decompiledCaughtException;
                if (param0 != -17184) {
                  field_a = null;
                  jc.field_g.field_h = jc.field_g.field_h + 24;
                  return;
                } else {
                  jc.field_g.field_h = jc.field_g.field_h + 24;
                  return;
                }
              }
              L1: {
                if (param0 == -17184) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              jc.field_g.field_h = jc.field_g.field_h + 24;
              return;
            } else {
              L2: {
                if (param0 == -17184) {
                  break L2;
                } else {
                  field_a = null;
                  break L2;
                }
              }
              jc.field_g.field_h = jc.field_g.field_h + 24;
              return;
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

    static {
    }
}
