/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    private RandomAccessFile field_l;
    private long field_e;
    static String field_d;
    static String[] field_k;
    static int[] field_a;
    static int[] field_f;
    static byte[][] field_b;
    static dd field_c;
    static int[] field_i;
    private long field_h;
    static vh field_j;
    static p[] field_g;

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            var5_int = this.field_l.read(param0, param3, param2);
            if (param1 == 20859) {
              L1: {
                if (0 < var5_int) {
                  this.field_e = this.field_e + (long)var5_int;
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -91;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("v.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_l != null) {
            System.out.println("");
            this.c((byte) 122);
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 < 92) {
            v.a(-71);
        }
        if (this.field_l != null) {
            this.field_l.close();
            this.field_l = null;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -22444) {
            break L0;
          } else {
            v.b((byte) -109);
            break L0;
          }
        }
        L1: {
          if (wn.field_a == null) {
            break L1;
          } else {
            var1 = wn.field_a;
            synchronized (var1) {
              L2: {
                wn.field_a = null;
                break L2;
              }
            }
            break L1;
          }
        }
    }

    final void a(int param0, long param1) throws IOException {
        this.field_l.seek(param1);
        this.field_e = param1;
        if (param0 != -1) {
            v.b((byte) -63);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 125) {
            return;
        }
        field_b = (byte[][]) null;
        field_k = null;
        field_i = null;
        field_g = null;
        field_f = null;
        field_j = null;
        field_a = null;
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return -122L;
        }
        return this.field_l.length();
    }

    final static void b(byte param0) {
        String discarded$0 = null;
        ma.field_e = null;
        wn.field_g = null;
        be.field_L = null;
        vi.field_c = null;
        uq.field_D = null;
        if (!(oq.field_z == null)) {
            pa.field_J = oq.field_z;
            fj.field_j = lh.field_i;
            pa.field_J.field_K = -1;
            oq.field_z = null;
            pa.field_J.field_P = -1;
            lh.field_i = null;
        }
        if (param0 >= -59) {
            discarded$0 = v.a(-8, -59, 'ﾽ');
        }
        rg.field_p = true;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
            if ((this.field_h ^ -1L) > (this.field_e + (long)param2 ^ -1L)) {
                this.field_l.seek(this.field_h);
                this.field_l.write(1);
                throw new EOFException();
            }
            if (param1 != 25354) {
                v.a((byte) 3);
            }
            this.field_l.write(param3, param0, param2);
            this.field_e = this.field_e + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    v(File param0, String param1, long param2) throws IOException {
        boolean discarded$0 = false;
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
                discarded$0 = param0.delete();
            }
            this.field_l = new RandomAccessFile(param0, param1);
            this.field_e = 0L;
            this.field_h = param2;
            var5_int = this.field_l.read();
            if (0 != (var5_int ^ -1)) {
                if (!param1.equals("r")) {
                    this.field_l.seek(0L);
                    this.field_l.write(var5_int);
                }
            }
            this.field_l.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "v.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        char[] var5 = new char[param0];
        char[] var3 = var5;
        for (var4 = param1; var4 < param0; var4++) {
            var5[var4] = param2;
        }
        return new String(var5);
    }

    static {
        field_d = "Invite players";
        field_f = new int[]{12, 20, 21, 49, 5, 7};
        field_k = new String[]{"Nice shot!", "Well played!", "Good shot!"};
    }
}
