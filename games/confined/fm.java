/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fm {
    private RandomAccessFile field_e;
    static ej field_a;
    private long field_d;
    private long field_c;
    static int field_b;

    final long a(byte param0) throws IOException {
        if (param0 != -115) {
            fm.a(-61, -87);
            return this.field_e.length();
        }
        return this.field_e.length();
    }

    final static void a(int param0, int param1) {
        hb var2 = vh.field_a;
        var2.b(true, param1);
        var2.f(87, 1);
        var2.f(115, 2);
        int var3 = 61 / ((param0 - 61) / 46);
    }

    final void a(int param0, long param1) throws IOException {
        this.field_e.seek(param1);
        int var4 = -33 / ((47 - param0) / 50);
        this.field_c = param1;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if ((this.field_c + (long)param1 ^ -1L) < (this.field_d ^ -1L)) {
            this.field_e.seek(this.field_d);
            this.field_e.write(1);
            throw new EOFException();
        }
        this.field_e.write(param2, param3, param1);
        if (param0 != -20832) {
            return;
        }
        try {
            this.field_c = this.field_c + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_e)) {
            System.out.println("");
            this.b(0);
        }
    }

    final void b(int param0) throws IOException {
        if (param0 != 0) {
          L0: {
            this.field_e = (RandomAccessFile) null;
            if (this.field_e != null) {
              this.field_e.close();
              this.field_e = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_e != null) {
              this.field_e.close();
              this.field_e = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(boolean param0, byte[] param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                fm.a(53);
                break L1;
              }
            }
            L2: {
              var5_int = this.field_e.read(param1, param2, param3);
              if (var5_int <= 0) {
                break L2;
              } else {
                this.field_c = this.field_c + (long)var5_int;
                break L2;
              }
            }
            stackIn_5_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("fm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    fm(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                param0.delete();
            }
            this.field_e = new RandomAccessFile(param0, param1);
            this.field_c = 0L;
            this.field_d = param2;
            var5_int = this.field_e.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_e.seek(0L);
                this.field_e.write(var5_int);
            }
            this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "fm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_a = (ej) null;
        }
    }

    static {
        field_a = new ej();
    }
}
