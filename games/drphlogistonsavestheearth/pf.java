/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private long field_b;
    static he[] field_c;
    static long field_a;
    static int field_f;
    private long field_d;
    private RandomAccessFile field_e;

    final void c(int param0) throws IOException {
        if (null != this.field_e) {
          this.field_e.close();
          this.field_e = null;
        }
        int var2 = 18 / ((40 - param0) / 47);
    }

    protected final void finalize() throws Throwable {
        if (this.field_e != null) {
          System.out.println("");
          this.c(90);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 1536) {
          pf.b(127);
        }
        this.field_e.seek(param1);
        this.field_d = param1;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          if (param0 != 1) {
            field_f = 72;
          }
          var3_int = param2.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = rh.a(-72, param2);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!je.a(var4.charAt(0), 89) &&
              !je.a(var4.charAt(var4.length() - 1), 117)) {
              var5 = 0;
              for (var6 = 0; var6 < param2.length(); var6++) {
                var7 = param2.charAt(var6);
                if (je.a((char) var7, 107)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (2 <= var5 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_e.read(param0, param3, param1);
          if (~var5_int < param2) {
            this.field_d = this.field_d + (long)var5_int;
          }
          stackIn_4_0 = var5_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pf.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 > -73) {
          pf.a((byte) 42);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if ((this.field_d + (long)param1) > this.field_b) {
          this.field_e.seek(this.field_b);
          this.field_e.write(1);
          throw new EOFException();
        }
        if (param0 > -82) {
          return;
        }
        try {
          this.field_e.write(param3, param2, param1);
          this.field_d = this.field_d + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "pf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pf(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_e = new RandomAccessFile(param0, param1);
          this.field_b = param2;
          this.field_d = 0L;
          var5_int = this.field_e.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_e.seek(0L);
            this.field_e.write(var5_int);
          }
          this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 97) {
          field_c = (he[]) null;
        }
        return sh.field_e;
    }

    final long a(int param0) throws IOException {
        if (param0 >= -38) {
          return -62L;
        }
        return this.field_e.length();
    }

    static {
    }
}
