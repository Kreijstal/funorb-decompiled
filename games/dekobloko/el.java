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
        int discarded$2 = 0;
        if (this.field_z) {
          throw new RuntimeException();
        } else {
          if (param0 < 65) {
            discarded$2 = this.a(true);
            return this.field_H;
          } else {
            return this.field_H;
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
            eh stackIn_3_0 = null;
            wf stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            eh stackOut_2_0 = null;
            wf stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var4 = Class.forName("rj");
                  var5 = (eh) (var4.newInstance());
                  var5.a(param2, (byte) 83, param0, param3);
                  stackOut_2_0 = (eh) (var5);
                  stackIn_3_0 = stackOut_2_0;
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new wf();
                ((eh) ((Object) var5_ref)).a(param2, (byte) 83, param0, param3);
                stackOut_4_0 = (wf) (var5_ref);
                stackIn_5_0 = stackOut_4_0;
                return (eh) ((Object) stackIn_5_0);
              }
              return stackIn_3_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var4_ref2);
                stackOut_6_1 = new StringBuilder().append("el.E(").append(param0).append(',').append(120).append(',').append(param2).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param3 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
        if (this.field_z) {
            return 0;
        }
        if (param0) {
            field_I = (String) null;
            return 100;
        }
        return 100;
    }

    static {
        field_I = "The invitation has been withdrawn.";
    }
}
