/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck extends IOException {
    static java.awt.Frame field_d;
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (cf.a(param0.charAt(var2_int), (byte) 78)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (cf.a(param0.charAt(var3 - 1), (byte) 78)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var5 = new StringBuilder(var4);
          if (param1 != -48) {
            field_d = (java.awt.Frame) null;
          }
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (vb.a((byte) -106, (char) var7)) {
              var8 = hh.a(125, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("ck.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    ck(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(param0, 0);
        var2.c(1, -1);
        var2.c(param1, -1);
    }

    final static void b(byte param0) {
        if (jc.field_b != null) {
          jc.field_b.b(58);
          jc.field_b = null;
        }
        if (param0 >= -25) {
          field_a = 22;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -18) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = 0;
        field_b = "Type your age in years";
        field_c = "Loading extra data";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$b$e683eeaaf5b5(int param0) {
        if (jc.field_b != null) {
          jc.field_b.b(58);
          jc.field_b = null;
        }
        if (param0 >= -25) {
          field_a = 22;
        }
    }
}
