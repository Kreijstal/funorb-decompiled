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

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var3 = 18 % ((37 - param1) / 58);
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
                stackIn_6_0 = (RuntimeException) (var2_ref2);

                stackIn_6_1 = new StringBuilder().append("dk.A(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        bi var1;
        ld var2;
        var1 = (bi) ((Object) bb.field_a.b(param0 + -22211));
        if (var1 != null) {
          var2 = kj.field_a;
          var2.b((byte) 46);
          var2.b((byte) 19);
          var2.b((byte) 117);
          var2.b((byte) 49);
          if (param0 != 22288) {
            dk.b(-78);
            var1.b(param0 ^ 22322);
            return;
          } else {
            var1.b(param0 ^ 22322);
            return;
          }
        } else {
          si.a(param0 ^ -22307);
          return;
        }
    }

    public static void b(int param0) {
        if (param0 <= 69) {
          field_b = (ia) null;
          field_d = (byte[][][]) null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = (byte[][][]) null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = new ae();
        field_e = 0;
        field_a = new Random();
    }
}
