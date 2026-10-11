/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asa extends aa {
    static String field_d;
    static aba field_a;
    static long field_c;
    im field_b;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 20000000) {
          return;
        }
        field_a = null;
    }

    final static Object a(File param0, byte param1) {
        try {
          Object stackIn_2_0 = null;
          Object stackIn_5_0 = null;
          Object stackIn_7_0 = null;
          Object stackIn_11_0 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          FileInputStream var2 = null;
          IOException var2_ref = null;
          ClassNotFoundException var2_ref2 = null;
          RuntimeException var2_ref3 = null;
          ObjectInputStream var3 = null;
          Object var4 = null;
          try {
            if (!param0.exists()) {
              stackIn_2_0 = null;
              return stackIn_2_0;
            }
            try {
              var2 = new FileInputStream(param0);
              var3 = new ObjectInputStream((InputStream) ((Object) var2));
              var4 = var3.readObject();
              if (param1 > -42) {
                stackIn_5_0 = (Object) null;
                return stackIn_5_0;
              }
              var3.close();
              var2.close();
              stackIn_7_0 = var4;
              return stackIn_7_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (IOException) (Object) decompiledCaughtException;
            } catch (java.lang.ClassNotFoundException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (ClassNotFoundException) (Object) decompiledCaughtException;
            }
            stackIn_11_0 = null;
            return stackIn_11_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var2_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var2_ref3;
            stackIn_14_1 = new StringBuilder().append("asa.B(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private asa() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Data array";
        field_c = 20000000L;
        field_a = new aba();
        field_e = 128;
    }
}
