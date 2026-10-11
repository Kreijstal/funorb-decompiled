/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wk {
    private long field_c;
    static long field_d;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_a.read(param1, param2, param0);
          if (~var5_int < param3) {
            this.field_b = this.field_b + (long)var5_int;
          }
          stackIn_4_0 = var5_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("wk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, long param1) {
        if (param1 <= 0L) {
          return;
        }
        if (param0 > -88) {
          return;
        }
        if (param1 % 10L != 0L) {
          ie.a((byte) 10, param1);
        } else {
          ie.a((byte) 10, param1 - 1L);
          ie.a((byte) 10, 1L);
          return;
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Main.field_T;
        try {
          var4_int = param2.length();
          var5 = param3.length();
          if (param1 <= 11) {
            wk.a(false);
          }
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var8_int++;
              var6 = var6 + var7;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param2.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$0 = var8.append(param2.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$1 = var8.append(param2.substring(var9, var10));
            discarded$2 = var8.append(param3);
            var9 = var10 + 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("wk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 11311) {
          return 27L;
        }
        return this.field_a.length();
    }

    protected final void finalize() throws Throwable {
        if (this.field_a != null) {
          System.out.println("");
          this.a((byte) 87);
        }
    }

    final static boolean b(byte param0) {
        if (param0 != -112) {
          return false;
        }
        if (null == cb.field_j) {
          return false;
        }
        if (!ra.field_b.c(0)) {
          return false;
        }
        return true;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
          return;
        }
        this.field_a.seek(param0);
        this.field_b = param0;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Main.field_T;
        try {
          if (!ia.a((byte) -79)) {
            if (null != gj.field_a &&
              gj.field_a.field_b) {
              ga.a(true);
              s.field_d.b(new ol(s.field_d, tk.field_b), (byte) -15);
            }
            return;
          }
          s.field_d.a((byte) -116, hk.field_b, e.field_c, true);
          s.field_d.l(-2054);
          if (param0) {
            return;
          }
          while (ge.b((byte) -114)) {
            s.field_d.a(fd.field_n, 34, tb.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "wk.H(" + param0 + ')');
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param2 != 0) {
          return;
        }
        try {
          if (this.field_b + (long)param3 > this.field_c) {
            this.field_a.seek(this.field_c);
            this.field_a.write(1);
            throw new EOFException();
          }
          this.field_a.write(param1, param0, param3);
          this.field_b = this.field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wk.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) throws IOException {
        if (null != this.field_a) {
          this.field_a.close();
          this.field_a = null;
          if (param0 <= 9) {
            wk.a((byte) -90, 9L);
            return;
          }
          return;
        }
        if (param0 <= 9) {
          wk.a((byte) -90, 9L);
          return;
        }
    }

    wk(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_a = new RandomAccessFile(param0, param1);
          this.field_b = 0L;
          this.field_c = param2;
          var5_int = this.field_a.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_a.seek(0L);
            this.field_a.write(var5_int);
          }
          this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
