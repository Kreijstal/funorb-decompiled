/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb {
    static String field_e;
    private RandomAccessFile field_d;
    private long field_a;
    private long field_b;
    static String[] field_f;
    static String field_c;

    final void a(long param0, int param1) throws IOException {
        this.field_d.seek(param0);
        if (param1 != 2205) {
          this.field_a = -119L;
        }
        this.field_a = param0;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = stellarshard.field_B;
        try {
          de.a(0, 1, ta.field_q, fh.field_b, param0, true, oe.field_c);
          if (param1 < 7) {
            field_f = (String[]) null;
          }
          for (var2_int = 0; var2_int < fh.field_b; var2_int++) {
            fj.field_b[param0 + var2_int] = var2_int;
          }
          de.a(param0, 1, af.field_k, fh.field_b + param0, param0 + param0, false, ce.field_b);
          if (param0 < fh.field_b) {
            fh.field_b = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "kb.H(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.read(param2, param1, param0);
          if (var5_int > 0) {
            this.field_a = this.field_a + (long)var5_int;
          }
          if (param3 != 1) {
            kb.a(-29, -80);
          }
          stackIn_5_0 = var5_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_d) {
          System.out.println("");
          this.a(118);
        }
    }

    final void a(int param0) throws IOException {
        int var2 = -70 % ((49 - param0) / 40);
        if (this.field_d != null) {
          this.field_d.close();
          this.field_d = null;
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        try {
          if (this.field_b < this.field_a + (long)param3) {
            this.field_d.seek(this.field_b);
            this.field_d.write(1);
            throw new EOFException();
          }
          this.field_d.write(param0, param2, param3);
          if (param1) {
            kb.b((byte) -71);
          }
          this.field_a = this.field_a + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "kb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int b(byte param0) {
        int var1 = -119 % ((11 - param0) / 34);
        return fl.field_a;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != 37) {
          kb.a(-99, 9);
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var7 = stellarshard.field_B;
        var2 = 0;
        var3 = ni.field_d;
        if (var3 >= 5) {
          if (var3 >= 105) {
            if (var3 < 120) {
              var3 = 120 - var3;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            }
          } else {
            var2 = (-40960 + 16384 * var3) / 220;
          }
        } else {
          var2 = var3 * var3 * 8192 / 1100;
        }
        var5 = 106 / ((param1 + 55) / 41);
        var4 = 1;
        var6 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var6 = 1;
        }
        if (4 == param0) {
          var6 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var6 = 1;
          var4 = -1;
        }
        if (6 == param0) {
          var6 = -1;
          var4 = 1;
        }
        if (7 == param0 ||
          param0 == 8) {
          var6 = -1;
          var4 = -1;
        }
        if (11 == param0) {
          var4 = -1;
        }
        if (param0 == 12) {
          var6 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var6 = -1;
          var4 = 1;
        }
        if (param0 == 14) {
          var6 = 1;
          var4 = -1;
        }
        if (15 == param0) {
          var4 = 1;
          var6 = 1;
        }
        pd.field_u = nl.a(-119, var4 * var2, var6 * var2);
    }

    final long b(int param0) throws IOException {
        if (param0 != -106) {
          kb.a(50, 0);
        }
        return this.field_d.length();
    }

    kb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_a = 0L;
          this.field_b = param2;
          var5_int = this.field_d.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Connection restored.";
        field_f = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
