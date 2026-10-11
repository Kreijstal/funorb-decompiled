/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qp {
    static String field_c;
    private RandomAccessFile field_g;
    static String field_e;
    static cn field_a;
    private long field_d;
    private long field_b;
    static String[] field_f;

    final void a(int param0) throws IOException {
        if (this.field_g != null) {
          this.field_g.close();
          this.field_g = null;
        }
        if (param0 != 0) {
          this.field_g = (RandomAccessFile) null;
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        try {
          if ((this.field_b + (long)param3) > this.field_d) {
            this.field_g.seek(this.field_d);
            this.field_g.write(1);
            throw new EOFException();
          }
          this.field_g.write(param2, param0, param3);
          if (param1 < 36) {
            qp.a(true);
          }
          this.field_b = this.field_b + (long)param3;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "qp.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static cn a(boolean param0) {
        int var3 = 0;
        int var4 = 0;
        int var2;
        int var5;
        cn var6;
        int var2Lifetime1;
        var5 = DungeonAssault.field_K;
        var6 = new cn(20, 20);
        jh.a(var6);
        gf.b(0, 0, 20, 20, 16711680);
        gf.f(10, 10, 6, 0);
        if (!param0) {
          return (cn) null;
        }
        for (var2 = 0; var2 < 20; var2++) {
          gf.b(-var2 + 18, var2, 4, 16711680);
        }
        var2Lifetime1 = 0;
        for (var3 = 0; 20 > var3; var3++) {
          for (var4 = 0; var4 < 20; var4++) {
            if ((-10 + var3) * (var3 - 10) + (var4 - 10) * (var4 - 10) > 100) {
              var6.field_B[var2Lifetime1] = 0;
            }
            var2Lifetime1++;
          }
        }
        jh.b();
        return var6;
    }

    final long a(byte param0) throws IOException {
        if (param0 <= 46) {
          return -31L;
        }
        return this.field_g.length();
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 18) {
          this.field_g = (RandomAccessFile) null;
        }
        this.field_g.seek(param0);
        this.field_b = param0;
    }

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11274) {
            stackIn_2_0 = 73;
            return stackIn_2_0;
          }
          var5_int = this.field_g.read(param3, param0, param2);
          if (var5_int > 0) {
            this.field_b = this.field_b + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qp.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 56) {
          qp.a(false);
        }
        field_c = null;
        field_f = null;
        field_e = null;
    }

    protected final void finalize() throws Throwable {
        if (null != this.field_g) {
          System.out.println("");
          this.a(0);
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        if (param0 != -24) {
          field_c = (String) null;
        }
        if (param1 != -1) {
          bf.field_f[param1].a(param2);
        } else {
          tb.a(param2, 1);
        }
    }

    qp(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param2 < param0.length()) {
            param0.delete();
          }
          this.field_g = new RandomAccessFile(param0, param1);
          this.field_d = param2;
          this.field_b = 0L;
          var5_int = this.field_g.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_g.seek(0L);
            this.field_g.write(var5_int);
          }
          this.field_g.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "to return to the normal view.";
        field_c = "Create a free Account";
        field_f = new String[]{"Fire Immunity", "A creature of the lower planes, the <%0> cannot be harmed by any form of fire - such as that of a dragon."};
    }
}
