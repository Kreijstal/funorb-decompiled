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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = ua.a((byte) 110, '_', param2, "");
              if (param0 == -127) {
                break L1;
              } else {
                field_e = (qi) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = hc.a(param2, (byte) -93);
                if (param1.indexOf(param2) != -1) {
                  break L3;
                } else {
                  if (-1 == param1.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("an.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static int a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0.length();
            var3 = param1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackIn_5_0 = var3;
                break L0;
              } else {
                var3 = sj.a(113, param0.charAt(var4)) + ((var3 << 997825349) + -var3);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("an.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    public an() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, th param1, byte[] param2) {
        try {
            if (-32 != (param1.field_i[param1.field_l] ^ -1) || -117 != param1.field_i[1 + param1.field_l]) {
                throw new RuntimeException("");
            }
            if (!(this.field_b != null)) {
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
