/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static a field_f;
    private long field_e;
    static java.awt.Frame field_b;
    static String field_a;
    static int field_g;
    static hl field_h;
    private RandomAccessFile field_d;
    private long field_c;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
            if (!((this.field_c + (long)param3 ^ -1L) >= (this.field_e ^ -1L))) {
                this.field_d.seek(this.field_e);
                this.field_d.write(1);
                throw new EOFException();
            }
            int var5_int = -65 / ((-20 - param0) / 33);
            this.field_d.write(param2, param1, param3);
            this.field_c = this.field_c + (long)param3;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "sa.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String a(byte param0) {
        if (ll.field_C == ma.field_d) {
          return jl.field_c;
        } else {
          if (ll.field_C != pi.field_a) {
            if (!oa.field_y.c(false)) {
              return ak.field_b;
            } else {
              if (param0 >= -30) {
                field_a = (String) null;
                return mk.field_d;
              } else {
                return mk.field_d;
              }
            }
          } else {
            return ak.field_b;
          }
        }
    }

    final int a(int param0, int param1, byte[] param2, byte param3) throws IOException {
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
              var6 = -122 % ((-48 - param3) / 47);
              var5_int = this.field_d.read(param2, param1, param0);
              if (-1 <= (var5_int ^ -1)) {
                break L1;
              } else {
                this.field_c = this.field_c + (long)var5_int;
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
            stackOut_4_1 = new StringBuilder().append("sa.A(").append(param0).append(',').append(param1).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final void a(long param0, boolean param1) throws IOException {
        String discarded$0 = null;
        this.field_d.seek(param0);
        this.field_c = param0;
        if (param1) {
            discarded$0 = sa.a((byte) -89);
            return;
        }
    }

    final static void a(int param0, boolean param1) {
        L0: {
          ok.field_d = mh.field_c;
          im.field_e = uk.field_x;
          if (param1) {
            wk.field_s = uk.field_x;
            dg.field_j = mh.field_c;
            break L0;
          } else {
            break L0;
          }
        }
        cl.field_g = 2;
        if (param0 >= -53) {
          field_f = (a) null;
          return;
        } else {
          return;
        }
    }

    final void b(int param0) throws IOException {
        if (null == this.field_d) {
          if (param0 != 0) {
            this.field_d = (RandomAccessFile) null;
            return;
          } else {
            return;
          }
        } else {
          this.field_d.close();
          this.field_d = null;
          if (param0 == 0) {
            return;
          } else {
            this.field_d = (RandomAccessFile) null;
            return;
          }
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_b = null;
        if (param0 != -112) {
            return;
        }
        field_a = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_d == null)) {
            System.out.println("");
            this.b(0);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -1) {
            sa.b((byte) -82);
            return this.field_d.length();
        }
        return this.field_d.length();
    }

    sa(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                discarded$0 = param0.delete();
            }
            this.field_d = new RandomAccessFile(param0, param1);
            this.field_e = param2;
            this.field_c = 0L;
            var5_int = this.field_d.read();
            if (-1 != var5_int) {
                if (!param1.equals("r")) {
                    this.field_d.seek(0L);
                    this.field_d.write(var5_int);
                }
            }
            this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "sa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_g = 0;
        field_a = "If you are not, please change your password to something more obscure!";
        field_f = new a();
    }
}
