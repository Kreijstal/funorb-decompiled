/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kb {
    static String[] field_c;
    private RandomAccessFile field_d;
    static String field_e;
    private long field_b;
    private long field_a;

    final void c(int param0) throws IOException {
        int var2 = -83 % ((param0 - 52) / 34);
        if (this.field_d != null) {
          this.field_d.close();
          this.field_d = null;
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = ArcanistsMulti.field_G ? 1 : 0;
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (param1 & 16736682) >> 16;
        int var5 = (param1 & param2) >> 8;
        int var6 = 255 & param1;
        int var7 = param0 >> 16 & 255;
        int var8 = (65494 & param0) >> 8;
        int var9 = param0 & 255;
        for (var10 = 0; 256 > var10; var10++) {
          var11 = 256 - var10;
          var13[var10] = (var9 * var11 >> 8) + ((var6 * var10 >> 8) + ((var10 * var4 >> 8) + (var11 * var7 >> 8) << 16) + ((var8 * var11 >> 8) + (var10 * var5 >> 8) << 8));
        }
        return var3;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (!oj.field_i) {
          return;
        }
        if (param2 != -32507) {
          return;
        }
        co.field_f.b(param0, (byte) 75);
        var4 = nn.field_q.f((byte) 93) ? 1 : 0;
        if (re.field_r != 0 &&
          var4 == 0) {
          param0 = false;
          uc.c(3);
        }
        if (!param0) {
          if (var4 == 0) {
            var5 = nn.field_q.f(0) + nn.field_q.field_V;
            if (var5 > 640) {
              ng.field_K = ng.field_K + 5;
              return;
            }
            if (var5 >= 635) {
              return;
            }
            if (ng.field_K <= 0) {
              return;
            }
            ng.field_K = ng.field_K - 5;
            return;
          }
          co.field_f.b(param0, (byte) 66);
        } else {
          nn.field_q.a(param1, -10284, param3);
          if (var4 != 0) {
            co.field_f.b(param0, (byte) 66);
          }
        }
        var5Lifetime1 = nn.field_q.f(0) + nn.field_q.field_V;
        if (var5Lifetime1 > 640) {
          ng.field_K = ng.field_K + 5;
          return;
        }
        if (var5Lifetime1 >= 635) {
          return;
        }
        if (ng.field_K <= 0) {
          return;
        }
        ng.field_K = ng.field_K - 5;
        return;
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = -50;
            return stackIn_2_0;
          }
          var5_int = this.field_d.read(param0, param3, param2);
          if (0 < var5_int) {
            this.field_a = this.field_a + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kb.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != -2775) {
          kb.a(true, 53, -119, -107);
          return this.field_d.length();
        }
        return this.field_d.length();
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_d.seek(param1);
        if (param0 == -123) {
          this.field_a = param1;
          return;
        }
        this.field_d = (RandomAccessFile) null;
        this.field_a = param1;
    }

    protected final void finalize() throws Throwable {
        if (this.field_d != null) {
          System.out.println("");
          this.c(87);
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        try {
          if (param0 != 1) {
            kb.a(86, -91, -113);
          }
          if (this.field_b < this.field_a + (long)param2) {
            this.field_d.seek(this.field_b);
            this.field_d.write(1);
            throw new EOFException();
          }
          this.field_d.write(param3, param1, param2);
          this.field_a = this.field_a + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    kb(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (-1L == param2) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_d = new RandomAccessFile(param0, param1);
          this.field_b = param2;
          this.field_a = 0L;
          var5_int = this.field_d.read();
          if (-1 != var5_int &&
            !param1.equals("r")) {
            this.field_d.seek(0L);
            this.field_d.write(var5_int);
          }
          this.field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        ee.a(17, (byte) 30);
        if (param0 != 28579) {
          field_e = (String) null;
        }
    }

    public static void d(int param0) {
        field_c = null;
        field_e = null;
        if (param0 != 255) {
          field_e = (String) null;
        }
    }

    static {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_e = "<%0> has entered a game.";
    }
}
