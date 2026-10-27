/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class im extends IOException {
    static int field_a;

    final static int a(int param0, int param1, int param2) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (param1 < param0) {
            int var3_int = param1;
            param1 = param0;
            param0 = var3_int;
          }
          while (param0 != 0) {
            int var3_intLifetime1 = param1 % param0;
            param1 = param0;
            param0 = var3_intLifetime1;
          }
          int var3_intLifetime2 = 59 % ((-4 - param2) / 49);
          int stackIn_6_0 = param1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "im.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (param0 <= 48) {
            field_a = 28;
          }
          cc var4 = (cc) (vn.field_e.first(false));
          while (var4 != null) {
            IntrusiveNode.a(-121, param1, var4);
            var4 = (cc) (vn.field_e.next((byte) 70));
          }
          dc var5 = (dc) (en.field_i.first(false));
          while (var5 != null) {
            oa.a(param1, var5, -755);
            var5 = (dc) (en.field_i.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "im.B(" + param0 + ',' + param1 + ')');
        }
    }

    im(String param0) {
        super(param0);
    }

    static {
    }
}
