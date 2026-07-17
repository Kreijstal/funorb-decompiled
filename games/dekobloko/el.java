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
    }

    final static eh a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            eh var5 = null;
            wf var5_ref = null;
            Object stackIn_2_0 = null;
            eh stackIn_4_0 = null;
            wf stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            eh stackOut_3_0 = null;
            Object stackOut_1_0 = null;
            wf stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              try {
                if (param1 >= 5) {
                  var4 = Class.forName("rj");
                  var5 = (eh) var4.newInstance();
                  var5.a(param2, (byte) 83, param0, param3);
                  stackOut_3_0 = (eh) var5;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                } else {
                  stackOut_1_0 = null;
                  stackIn_2_0 = stackOut_1_0;
                  return (eh) (Object) stackIn_2_0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new wf();
                ((eh) (Object) var5_ref).a(param2, (byte) 83, param0, param3);
                stackOut_5_0 = (wf) var5_ref;
                stackIn_6_0 = stackOut_5_0;
                return (eh) (Object) stackIn_6_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref2;
                stackOut_7_1 = new StringBuilder().append("el.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param3 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
