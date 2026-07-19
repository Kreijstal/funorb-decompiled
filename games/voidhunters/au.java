/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class au {
    private long field_b;
    private long field_d;
    private RandomAccessFile field_a;
    static int field_c;

    protected final void finalize() throws Throwable {
        if (null != this.field_a) {
            System.out.println("");
            this.a(false);
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        if (this.field_b < this.field_d + (long)param0) {
            this.field_a.seek(this.field_b);
            this.field_a.write(1);
            throw new EOFException();
        }
        this.field_a.write(param2, param3, param0);
        if (param1 != -14394) {
            return;
        }
        try {
            this.field_d = this.field_d + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "au.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(byte param0, int param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_a.read(param2, param3, param1);
              if (-1 > (var5_int ^ -1)) {
                this.field_d = this.field_d + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -60) {
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_4_0 = -39;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("au.E(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(boolean param0) throws IOException {
        if (this.field_a != null) {
            this.field_a.close();
            this.field_a = null;
            if (param0) {
                return;
            }
            return;
        }
        if (param0) {
            return;
        }
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_a.seek(param1);
        this.field_d = param1;
        if (param0 != -38) {
            field_c = -3;
            return;
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 1) {
            field_c = 127;
            return this.field_a.length();
        }
        return this.field_a.length();
    }

    au(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if ((param2 ^ -1L) == 0L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                discarded$0 = param0.delete();
            }
            this.field_a = new RandomAccessFile(param0, param1);
            this.field_b = param2;
            this.field_d = 0L;
            var5_int = this.field_a.read();
            if (-1 != var5_int) {
                if (!param1.equals("r")) {
                    this.field_a.seek(0L);
                    this.field_a.write(var5_int);
                }
            }
            this.field_a.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "au.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = 2;
    }
}
