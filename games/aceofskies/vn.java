/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vn extends vo {
    static String field_g;
    static lt field_f;
    static String field_e;

    final pt a(String param0, int param1) {
        String stackIn_16_2 = null;
        try {
          CharSequence var5 = (CharSequence) ((Object) param0);
          if (!vl.a(param1 ^ 8202, var5)) {
            pt stackIn_3_0 = bt.field_a;
            return stackIn_3_0;
          }
          if (param1 != 8192) {
            String var4 = (String) null;
            vn.a(63, (File) null, (String) null);
          }
          CharSequence var6 = (CharSequence) ((Object) param0);
          int var3_int = td.a(var6, (byte) 38);
          if (var3_int > 0 &&
            var3_int <= 130) {
            pt stackIn_12_0 = fd.field_a;
            return stackIn_12_0;
          }
          pt stackIn_10_0 = bt.field_a;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3;
          StringBuilder stackIn_15_1 = new StringBuilder().append("vn.DA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    vn(bm param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_g = null;
        field_e = null;
        field_f = null;
        if (param0 != 101) {
          String var2 = (String) null;
          vn.a(55, (File) null, (String) null);
        }
    }

    final static void a(int param0, File param1, String param2) {
        if (param0 != 0) {
          return;
        }
        try {
          vg.field_j.put(param2, param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vn.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        String stackIn_9_2 = null;
        try {
          if (param1 != 72) {
            String var4 = (String) null;
            vn.a(53, (File) null, (String) null);
          }
          if (this.a(param0, 8192) != bt.field_a) {
            return null;
          }
          String stackIn_5_0 = dg.field_L;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vn.EA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Your email address is used to identify this account";
        field_g = "Change display name";
    }
}
