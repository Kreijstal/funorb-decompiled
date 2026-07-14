/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends sf {
    byte[] field_H;
    static char field_G;
    static String[] field_L;
    static long field_J;
    static String field_I;
    int field_F;
    kh field_K;

    final byte[] g(byte param0) {
        if (((el) this).field_z) {
          throw new RuntimeException();
        } else {
          if (param0 < 65) {
            int discarded$2 = ((el) this).a(true);
            return ((el) this).field_H;
          } else {
            return ((el) this).field_H;
          }
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        field_I = null;
        if (!param0) {
            Object var2 = null;
            eh discarded$0 = el.a(-15, (byte) 51, -90, (java.awt.Component) null);
        }
    }

    final static eh a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            eh var5 = null;
            wf var5_ref = null;
            Object stackIn_2_0 = null;
            eh stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            eh stackOut_3_0 = null;
            try {
              if (param1 >= 5) {
                return (eh) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var4 = Class.forName("rj");
              var5 = (eh) var4.newInstance();
              var5.a(param2, (byte) 83, param0, param3);
              stackOut_3_0 = (eh) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    el() {
    }

    final int a(boolean param0) {
        if (((el) this).field_z) {
            return 0;
        }
        if (param0) {
            field_I = null;
            return 100;
        }
        return 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "The invitation has been withdrawn.";
    }
}
