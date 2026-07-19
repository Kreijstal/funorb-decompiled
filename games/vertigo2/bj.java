/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj {
    private RandomAccessFile field_d;
    static int field_h;
    private long field_a;
    private long field_e;
    static tj field_f;
    static ve field_g;
    static fe field_j;
    static byte[] field_i;
    static la field_c;
    static String field_b;

    final static String a(int param0, char param1) {
        if (param0 != 0) {
            bj.a(true);
        }
        return String.valueOf(param1);
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        try {
            if (!((long)param0 + this.field_a <= this.field_e)) {
                this.field_d.seek(this.field_e);
                this.field_d.write(1);
                throw new EOFException();
            }
            this.field_d.write(param2, param1, param0);
            if (param3) {
                bj.a(true);
            }
            this.field_a = this.field_a + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "bj.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final long b(int param0) throws IOException {
        if (param0 != 0) {
            this.field_e = 50L;
        }
        return this.field_d.length();
    }

    protected final void finalize() throws Throwable {
        if (!(null == this.field_d)) {
            System.out.println("");
            this.a(0);
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 0) {
            field_g = (ve) null;
        }
        if (this.field_d != null) {
            this.field_d.close();
            this.field_d = null;
        }
    }

    bj(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (0L == (param2 ^ -1L)) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                discarded$0 = param0.delete();
            }
            this.field_d = new RandomAccessFile(param0, param1);
            this.field_e = param2;
            this.field_a = 0L;
            var5_int = this.field_d.read();
            if ((var5_int ^ -1) != 0) {
                if (!param1.equals("r")) {
                    this.field_d.seek(0L);
                    this.field_d.write(var5_int);
                }
            }
            this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "bj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var6 = 29 % ((param1 - 20) / 61);
              var5_int = this.field_d.read(param2, param3, param0);
              if (var5_int <= 0) {
                break L1;
              } else {
                this.field_a = this.field_a + (long)var5_int;
                break L1;
              }
            }
            stackOut_2_0 = var5_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("bj.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        if (param0) {
            field_c = (la) null;
        }
        field_j = null;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            return;
        }
        this.field_d.seek(param0);
        this.field_a = param0;
    }

    static {
        int var0 = 0;
        field_h = 0;
        field_f = new tj();
        field_g = new ve(10, 2, 2, 0);
        field_i = new byte[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_i[var0] = (byte)-56;
        }
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_c = new la(16);
    }
}
