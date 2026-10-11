/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tl extends IOException {
    static boolean field_b;
    static int field_a;
    static int field_c;
    static volatile boolean field_d;

    tl(String param0) {
        super(param0);
    }

    final static boolean a(pf param0, byte param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.a(param3, 16, param2);
          var4 = var5;
          if (param1 != -5) {
            return true;
          }
          if (var5 == null) {
            return false;
          }
          mb.a(0, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("tl.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = false;
    }
}
