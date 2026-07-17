/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dk {
    static ae field_c;
    static ia field_b;
    static byte[][][] field_d;
    static Random field_a;
    static int field_e;

    final static void a(java.applet.Applet param0) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var3 = 0;
                  var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                  param0.getAppletContext().showDocument(nn.a(110, param0, var2), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("dk.A(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -27 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        bi var1 = null;
        ld var2 = null;
        var1 = (bi) (Object) bb.field_a.b(77);
        if (var1 == null) {
          si.a(-51);
          return;
        } else {
          var2 = kj.field_a;
          int discarded$8 = var2.b((byte) 46);
          int discarded$9 = var2.b((byte) 19);
          int discarded$10 = var2.b((byte) 117);
          int discarded$11 = var2.b((byte) 49);
          var1.b(34);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 <= 69) {
          field_b = null;
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ae();
        field_e = 0;
        field_a = new Random();
    }
}
