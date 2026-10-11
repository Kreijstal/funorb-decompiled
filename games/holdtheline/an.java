/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class an {
    static qi field_e;
    static String field_d;
    static String[] field_c;
    private java.util.zip.Inflater field_b;
    static java.security.SecureRandom field_a;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ua.a((byte) 110, '_', param2, "");
          if (param0 != -127) {
            field_e = (qi) null;
          }
          var3 = hc.a(param2, (byte) -93);
          stackIn_7_0 = (param1.indexOf(param2) != -1) || (-1 != param1.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("an.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          var2_int = param0.length();
          var3 = param1;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = sj.a(113, param0.charAt(var4)) + ((var3 << 5) - var3);
          }
          stackIn_5_0 = var3;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("an.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public an() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, th param1, byte[] param2) {
        try {
          if (param1.field_i[param1.field_l] != 31 ||
            -117 != param1.field_i[1 + param1.field_l]) {
            throw new RuntimeException("");
          }
          if (this.field_b == null) {
            this.field_b = new java.util.zip.Inflater(true);
          }
          try {
            this.field_b.setInput(param1.field_i, 10 + param1.field_l, -8 + (-param1.field_l - 10 + param1.field_i.length));
            this.field_b.inflate(param2);
          } catch (Exception exception) {
            this.field_b.reset();
            throw new RuntimeException("");
          }
          if (param0 != -117) {
            return;
          }
          try {
            this.field_b.reset();
          } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "an.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != 40) {
          CharSequence var2 = (CharSequence) null;
          an.a((CharSequence) null, -23);
        }
        field_a = null;
        field_c = null;
    }

    private an(int param0, int param1, int param2) {
    }

    static {
        field_c = new String[16];
        field_d = "No highscores";
    }
}
