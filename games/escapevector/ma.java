/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ma {
    static int[] field_c;
    static long field_g;
    static wb field_b;
    private RandomAccessFile field_e;
    private long field_d;
    private long field_f;
    static oe field_a;

    final long c(int param0) throws IOException {
        if (param0 != -26510) {
            field_a = (oe) null;
            return this.field_e.length();
        }
        return this.field_e.length();
    }

    final static void a(int param0, int param1, fd param2, int param3) {
        try {
            if (param0 != 25398) {
                fd var5 = (fd) null;
                ma.a(-36, 48, (fd) null, -113);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 124) {
                break L1;
              } else {
                ma.b(103);
                break L1;
              }
            }
            L2: {
              var5_int = this.field_e.read(param2, param3, param0);
              if (-1 > (var5_int ^ -1)) {
                this.field_d = this.field_d + (long)var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = var5_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 1) {
          this.field_d = -21L;
          this.field_e.seek(param0);
          this.field_d = param0;
          return;
        } else {
          this.field_e.seek(param0);
          this.field_d = param0;
          return;
        }
    }

    final static oc a(int param0, boolean param1, int param2) {
        oc var3;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        L0: {
          var3 = new oc(param0);
          stackIn_2_0 = (oc) (var3);

          if (!param1) {
            stackIn_3_0 = (oc) ((Object) stackIn_2_0);
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = (oc) ((Object) stackIn_2_0);
            stackIn_3_1 = 1;
            break L0;
          }
        }
        stackIn_3_0.field_q = stackIn_3_1 != 0;
        if (param2 != 8) {
          return (oc) null;
        } else {
          return var3;
        }
    }

    public static void b(int param0) {
        fd var2;
        if (param0 != 1) {
          var2 = (fd) null;
          ma.a(-114, -57, (fd) null, 13);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static ee[] a(boolean param0) {
        if (param0) {
          field_b = (wb) null;
          return new ee[]{kf.field_q, oh.field_n, qj.field_g};
        } else {
          return new ee[]{kf.field_q, oh.field_n, qj.field_g};
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
            if (param3 != -15814) {
                field_c = (int[]) null;
            }
            if (this.field_f < this.field_d + (long)param1) {
                this.field_e.seek(this.field_f);
                this.field_e.write(1);
                throw new EOFException();
            }
            this.field_e.write(param0, param2, param1);
            this.field_d = this.field_d + (long)param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, ll param2) {
        c var3 = om.field_c;
        var3.a(param1, true);
        var3.f(param2.field_g, -123);
        if (param0 >= -42) {
            return;
        }
        try {
            var3.h(75, param2.field_i);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 0) {
            return;
        }
        if (!(null == this.field_e)) {
            this.field_e.close();
            this.field_e = null;
        }
    }

    ma(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if ((param2 ^ -1L) == 0L) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                param0.delete();
            }
            this.field_e = new RandomAccessFile(param0, param1);
            this.field_f = param2;
            this.field_d = 0L;
            var5_int = this.field_e.read();
            if (0 != (var5_int ^ -1) && !param1.equals("r")) {
                this.field_e.seek(0L);
                this.field_e.write(var5_int);
            }
            this.field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_e) {
            System.out.println("");
            this.a(0);
        }
    }

    static {
        field_c = new int[]{5, 11, 8};
    }
}
