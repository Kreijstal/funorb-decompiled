/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BoundedRandomAccessFile {
    static int[] field_c;
    static long field_g;
    static ReverbPcmStream field_b;
    private RandomAccessFile file;
    private long position;
    private long maximumLength;
    static GameplaySession activeSession;

    final long c(int param0) throws IOException {
        if (param0 != -26510) {
          activeSession = (GameplaySession) null;
          return this.file.length();
        }
        return this.file.length();
    }

    final static void a(int param0, int param1, fd param2, int param3) {
        try {
          if (param0 != 25398) {
            fd var5 = (fd) null;
            BoundedRandomAccessFile.a(-36, 48, (fd) null, -113);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ma.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        String stackIn_10_2 = null;
        try {
          if (param1 <= 124) {
            BoundedRandomAccessFile.b(103);
          }
          int var5_int = this.file.read(param2, param3, param0);
          if (var5_int > 0) {
            this.position = this.position + (long)var5_int;
          }
          int stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ma.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 == 1) {
          this.file.seek(param0);
          this.position = param0;
          return;
        }
        this.position = -21L;
        this.file.seek(param0);
        this.position = param0;
    }

    final static PointCloudEffect a(int param0, boolean param1, int param2) {
        PointCloudEffect var3 = new PointCloudEffect(param0);
        var3.field_q = param1 ? true : false;
        if (param2 == 8) {
          return var3;
        }
        return (PointCloudEffect) null;
    }

    public static void b(int param0) {
        if (param0 == 1) {
          field_b = null;
          activeSession = null;
          field_c = null;
          return;
        }
        fd var2 = (fd) null;
        BoundedRandomAccessFile.a(-114, -57, (fd) null, 13);
        field_b = null;
        activeSession = null;
        field_c = null;
    }

    final static ee[] a(boolean param0) {
        if (!param0) {
          return new ee[]{kf.field_q, oh.field_n, qj.field_g};
        }
        field_b = (ReverbPcmStream) null;
        return new ee[]{kf.field_q, oh.field_n, qj.field_g};
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
          if (param3 != -15814) {
            field_c = (int[]) null;
          }
          if (this.maximumLength < this.position + (long)param1) {
            this.file.seek(this.maximumLength);
            this.file.write(1);
            throw new EOFException();
          }
          this.file.write(param0, param2, param1);
          this.position = this.position + (long)param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ma.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, ll param2) {
        CipherPacketBuffer var3 = om.field_c;
        var3.writeCipheredOpcode(param1, true);
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
        if (null != this.file) {
          this.file.close();
          this.file = null;
        }
    }

    BoundedRandomAccessFile(File param0, String param1, long param2) throws IOException {
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.file = new RandomAccessFile(param0, param1);
          this.maximumLength = param2;
          this.position = 0L;
          int var5_int = this.file.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (null != this.file) {
          System.out.println("");
          this.a(0);
        }
    }

    static {
        field_c = new int[]{5, 11, 8};
    }
}
