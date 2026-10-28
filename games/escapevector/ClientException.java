/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ClientException extends RuntimeException {
    Throwable cause;
    static int[] field_f;
    static int[] field_b;
    String context;
    static hf field_c;
    static int[] field_d;
    static int field_e;

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final static boolean a(int param0) {
        if (param0 != -31879) {
          ClientException.a(21, -45);
          if (TextLayout.field_c == null) {
            return false;
          }
          if (al.field_d.a((byte) 63)) {
            return true;
          }
          return false;
        }
        if (TextLayout.field_c == null) {
          return false;
        }
        if (al.field_d.a((byte) 63)) {
          return true;
        }
        return false;
    }

    ClientException(Throwable param0, String param1) {
        this.context = param1;
        this.cause = param0;
    }

    final static tk a(String param0, int param1) {
        tk var7 = null;
        String stackIn_22_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.length();
          if (var2_int == 0) {
            tk stackIn_4_0 = ResourceArchive.field_d;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            tk stackIn_7_0 = d.field_c;
            return stackIn_7_0;
          }
          String[] var3 = bb.a(-128, param0, '.');
          if (var3.length < 2) {
            tk stackIn_10_0 = ResourceArchive.field_d;
            return stackIn_10_0;
          }
          String[] var4 = var3;
          int var5 = param1;
          while (true) {
            if (var4.length <= var5) {
              tk stackIn_18_0 = co.a(var3[var3.length - 1], 0);
              return stackIn_18_0;
            }
            String var6 = var4[var5];
            var7 = vk.a(var6, param1 - 116);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          tk stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var2;
          StringBuilder stackIn_21_1 = new StringBuilder().append("rn.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          if (TextLayout.field_c != null && (0 > param0 ||
            al.field_d == ck.field_t)) {
            if (om.field_c.position == 0 &&
              (10000L + le.field_c) < td.b(128)) {
              om.field_c.writeCipheredOpcode(param0, true);
            }
            if (0 < om.field_c.position) {
              try {
                TextLayout.field_c.a(om.field_c.position, 0, om.field_c.payload, 5000);
                le.field_c = td.b(128);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                Throwable decompiledCaughtException = decompiledCaughtParameter0;
                IOException iOException = (IOException) (Object) decompiledCaughtException;
                nm.a(16);
              }
              om.field_c.position = 0;
            }
            if (param1 == 30785) {
              return;
            }
            ClientException.a(true);
            return;
          }
          om.field_c.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new int[]{29, 0, 0, -3, -3};
        field_f = new int[]{19, 0, -10, -5, -5};
        field_b = new int[17];
        int[] var1 = new int[]{29, 0, 0, -3, -3};
        int[] var0 = var1;
        qg.a(var0, 0, field_b, 0, var1.length);
        field_f = new int[17];
        int[] var2 = new int[]{19, 0, -10, -5, -5};
        var0 = var2;
        qg.a(var0, 0, field_f, 0, var2.length);
        field_c = new hf();
        field_d = new int[8192];
    }
}
